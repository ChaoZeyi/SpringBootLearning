package com.spring.controller;

import com.spring.prefixProperties.GirlProperties;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cherry
 * @date 2017/12/15 21:09
 */
@RestController
@RequestMapping(value = "/hello")
@Api(value = "测试swagger2是否成功")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @Value("${info}")
    private String info;

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    @ApiOperation(value="say hello", notes="")
    public String hello()
    {
        return girlProperties.getHeight();
    }
}
