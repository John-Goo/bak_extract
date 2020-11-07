/******************************************************************************
 * Copyright (C) 2017  ShenZhen INNOPRO Co.,Ltd
 * All Rights Reserved.
 * 本软件为精华隆智慧感知科技（深圳）股份有限公司开发研制。未经本公司正式书面同意，其他任何个人、团体
 * 不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.yx.cdss.extract.provider.controller;

import com.yx.cdss.extract.provider.bo.Res;
import com.yx.cdss.extract.provider.common.WResult;
import com.yx.cdss.extract.provider.test.Person;
import com.yx.cdss.extract.provider.test.Student;
import com.yx.cdss.extract.provider.util.WFile;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: CustomerController
 * @version 2.0
 * @Desc: 客户信息业务处理
 * @author Jack
 * @date 2019年1月25日上午11:02:10
 * @history v2.0
 *
 */
@RestController
public class FileOperateController {

	@Autowired
    private RedisTemplate redisTemplate;


	@PostMapping("/recv")
	public WResult<Person> recv(@RequestBody Student student){
		Map<String,Student> stuMap = new HashMap<>();
		stuMap.put("name1",new Student("90018001","John1"));
		stuMap.put("name2",new Student("90018002","John2"));
		System.out.println(">>>　接收到参数："+student);
		System.out.println("-------  入库操作 ---------");
		Person person = new Person("411528198709015894","谷海江",21,"深圳");
		WResult result = WResult.newInstance();
		HashOperations hps = redisTemplate.opsForHash();
		hps.putAll("stu",stuMap);
		System.out.println("h1:"+hps.get("stu","name1"));
		hps.put("stu","name3",new Student("90018003","John3"));
		System.out.println("h3:"+hps.get("stu","name3"));
		Student stu = (Student) hps.get("stu","name4");
		System.out.println(stu);
		result.ok(person);
		return result;
	}




	@PostMapping("/upload")
	public Res upload(@RequestParam(name = "file", required = false) MultipartFile  file)  {
		String prefixPath = "f1/f2/";
		Res res = new Res();
		res.setCode(500);
		if (file == null ) {
			res.setMessage("上传文件不能为空");
			return res;
		}
		String fileUrl = null;
		try {
			InputStream in = file.getInputStream();
			fileUrl = WFile.builder()
					.orgType("company")
					.orgCode("10086")
					.userId("1000")
					.moduleDir("activity/part")
					.originFileName(file.getOriginalFilename())
					.post(in)
					.result();

		} catch (IOException e) {
			e.printStackTrace();
		}

		Map<String, Object> data = new HashMap<String, Object>();
		data.put("bucketName", "company");
		data.put("fileName", fileUrl);
		res.setCode(200);
		res.setMessage("上传成功");
		res.setData(data);
		return res;
	}



	@PostMapping("/upload1")
	public Res upload1(@RequestParam(name = "file", required = false) MultipartFile[] file) throws IOException {
		String prefixPath = "f1/f2/";
		Res res = new Res();
		res.setCode(500);
		if (file == null || file.length == 0) {
			res.setMessage("上传文件不能为空");
			return res;
		}
		List<InputStream> streamList = new ArrayList<InputStream>(file.length);
		for (MultipartFile multipartFile : file) {
			BufferedImage sourceImage = ImageIO.read(multipartFile.getInputStream());
			sourceImage.getWidth();
			sourceImage.getHeight();
			String orgfileName = multipartFile.getOriginalFilename();
			orgfileName = prefixPath + orgfileName;
			InputStream in = null;
			try {
				in = multipartFile.getInputStream();
				streamList.add(in);
			} catch (Exception e) {
				res.setMessage("上传失败");
				return res;
			}finally {
				if(in !=null){
					//in.close();
				}
			}
		}
		doPost("http://localhost:8080/upload1/file",streamList);
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("bucketName", "BUCKETNAME");
		//data.put("fileName", orgfileNameList);
		res.setCode(200);
		res.setMessage("上传成功");
		res.setData(data);
		return res;
	}


	public static String doPost(String url,List<InputStream> isList) {
		try {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost post = new HttpPost(url);
			MultipartEntityBuilder builder = MultipartEntityBuilder.create();
			for (InputStream in : isList) {
				builder.addBinaryBody("file", in);
			}
			HttpEntity multipart = builder.build();
			post.setEntity(multipart);
			CloseableHttpResponse response = httpClient.execute(post);
			HttpEntity responseEntity = response.getEntity();
			String sResponse = EntityUtils.toString(responseEntity, "UTF-8");
			System.out.println("Post 返回结果" + sResponse);
		}catch (Exception e){
			e.printStackTrace();

		}finally {
			for (InputStream in : isList) {
				if(in !=null){
					try {
						in.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

		return null;
	}

	/**
	 * post请求（用于请求file传输）
	 * @param url
	 * @param in
	 * @return
	 */
	public static String doPost(String url, InputStream in) throws Exception {

		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);// 创建httpPost
		//httpPost.setHeader("Accept", "application/octet-stream");
		//httpPost.setHeader("Content-Type", "application/octet-stream");
		//String charSet = "UTF-8";
		CloseableHttpResponse response = null;
		httpPost.setEntity(new InputStreamEntity(in));
		try {
			response = httpclient.execute(httpPost);
			StatusLine status = response.getStatusLine();
			int state = status.getStatusCode();
			if (state == 200) {
				HttpEntity responseEntity = response.getEntity();
				String jsonString = EntityUtils.toString(responseEntity);
				return jsonString;
			}
			else{
				//logger.error("请求返回:"+state+"("+url+")");
			}
		}
		finally {
			if (response != null) {
				try {
					response.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public void show(String url,InputStream in) throws IOException {
		String sURL="http://172.16.101.46:14401/editorialincre";

		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost uploadFile = new HttpPost(sURL);

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		builder.addBinaryBody("file",in);
		builder.addBinaryBody("file",in);

		HttpEntity multipart = builder.build();
		uploadFile.setEntity(multipart);
		CloseableHttpResponse response = httpClient.execute(uploadFile);
		HttpEntity responseEntity = response.getEntity();
		//String sResponse=EntityUtils.toString(responseEntity, "UTF-8");
		//System.out.println("Post 返回结果"+sResponse);
	}
	

}
