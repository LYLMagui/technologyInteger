package com.ukir.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Knife4j test")
@RequestMapping("/Knife4j")
public class Knife4jController {
    /**
     * ApiOperation注解，用在方法上，描述这个方法是做什么用的。该注解有 4 个属性：
     * value 操作的简单说明，长度为120个字母，60个汉字。
     * notes 对操作的详细说明。
     * httpMethod HTTP请求的动作名，可选值有："GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS" and "PATCH"。
     * code 默认为200，有效值必须符合标准的HTTP Status Code Definitions。
     */
    @ApiOperation("测试")
    @PostMapping("/test")
    public String test(){
        return "hello 李帅帅!";
    }
}
