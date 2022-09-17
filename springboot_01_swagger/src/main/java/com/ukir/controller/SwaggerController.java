package com.ukir.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器类
 */
//将控制器标注为一个Swagger资源，改注解有三个属性
//tags：具有相同标签的AIP会被归在一组内展示 value：如果tags没有定义，value将作为API的tags使用 description：描述，已弃用
@Api(tags = "SwaggerTest")
@RestController
@RequestMapping("/swagger")
public class SwaggerController {
    /**
     * ApiOperation注解，用在方法上，描述这个方法是做什么用的。该注解有 4 个属性：
     * value 操作的简单说明，长度为120个字母，60个汉字。
     * notes 对操作的详细说明。
     * httpMethod HTTP请求的动作名，可选值有："GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS" and "PATCH"。
     * code 默认为200，有效值必须符合标准的HTTP Status Code Definitions。
     *
     */
    @ApiOperation("测试")
    @RequestMapping("/test")
    public String test(){
        return "hello 李帅帅!";
    }

}
