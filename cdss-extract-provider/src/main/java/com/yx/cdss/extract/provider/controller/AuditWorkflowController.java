package com.yx.cdss.extract.provider.controller;

import com.alibaba.fastjson.JSON;
import com.yx.cdss.extract.model.entity.DictDrug;
import com.yx.cdss.extract.provider.bo.AuditContent;
import com.yx.cdss.extract.provider.bo.AuditDetailRecord;
import com.yx.cdss.extract.provider.bo.QueryDictDrugReq;
import com.yx.cdss.extract.provider.common.WResult;
import com.yx.cdss.extract.provider.common.WorkflowSeqUtil;
import com.yx.cdss.extract.provider.common.lock.LockThread1;
import com.yx.cdss.extract.provider.common.lock.LockThread2;
import com.yx.cdss.extract.provider.common.lock.MyResource;
import com.yx.cdss.extract.provider.serice.dict.DictionaryService;
import com.yx.cdss.extract.provider.serice.examine.AuditWorkflowService;
import com.yx.cdss.extract.provider.util.BeanCopyUtil;
import com.yx.cdss.extract.provider.util.DemoUtil;
import com.yx.cdss.extract.provider.util.SpringUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
public class AuditWorkflowController {
	


	@Resource
	private AuditWorkflowService auditWorkflowService;

	@Resource
	private WorkflowSeqUtil workflowSeqUtil;

	@ApiOperation(value = "工作流——审核流程" )
	@RequestMapping(value = "/workflow/audit", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public WResult<List<DictDrug>> addAuditContent(@RequestBody AuditContent auditContent) {
		System.out.println("访问线程："+Thread.currentThread().getId());
		WResult result = new WResult();
		System.out.println(">>>接收到参数："+ JSON.toJSON(auditContent));
		String contentId = auditWorkflowService.addAuditContent(auditContent);
		result.ok(contentId);
		return result;
	}

	
}
