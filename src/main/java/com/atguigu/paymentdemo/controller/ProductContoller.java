package com.atguigu.paymentdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*添加swagger设置*/
@Api(tags = "商品管理")


@RestController
@RequestMapping("/api/product")
public class ProductContoller {
    @ApiOperation("测试接口")
    @GetMapping("/test")
    public String test() {
        System.out.println("测试");
        return "hello";
    }
}
