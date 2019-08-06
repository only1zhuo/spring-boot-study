package com.only1zhuo.demo.controller;

import com.only1zhuo.demo.model.Test;
import com.only1zhuo.demo.service.test01.intf.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuo
 * @date 2019/8/6 11:54
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private com.only1zhuo.demo.service.test02.intf.TestService testService2;

    @RequestMapping("aa")
    public String aa() {
        Test test = testService.selectByPrimaryKey(1);
        System.out.println(test);
        return "执行中";
    }

    @RequestMapping("bb")
    public String bb() {
        Test test = testService2.selectByPrimaryKey(1);
        System.out.println(test);
        return "执行中";
    }

}
