package com.yx.cdss.extract.provider.controller;

import com.yx.cdss.extract.provider.bo.CalcRequestBo;
import com.yx.cdss.extract.provider.bo.JStu;
import com.yx.cdss.extract.provider.common.WResult;
import com.yx.cdss.extract.provider.filter.WAuth;
import com.yx.cdss.extract.provider.filter.WAuthEnum;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TraceClassLoadingController {



    @WAuth(required = WAuthEnum.TRUE,value = WAuthEnum.ADMIN)
    @ApiOperation(value = "演示class 加载过程" )
    @RequestMapping(value = "/classloading", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public WResult classLoad(@RequestBody CalcRequestBo requestBo) {
        System.out.println("接收到参数===>"+requestBo);
        List<JStu> stuLsit = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            JStu jStu = new JStu();
            stuLsit.add(jStu);
        }
        return new WResult();
    }



}
