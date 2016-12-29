package com.shawearn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Shawearn on 2016/12/30.
 */
@Controller
public class MyController {

    /**
     * 简单的 Controller 示例；
     *
     * @return
     */
    @RequestMapping("/sayHello")
    public String hello() {
        return "/hello";
    }

    /**
     * 带参数的 Controller 示例；
     *
     * @param name
     * @param modelMap
     * @return
     */
    @RequestMapping("/hello/{name}")
    public String helloName(@PathVariable("name") String name, ModelMap modelMap) {
        modelMap.put("name", name);
        return "/helloName";
    }
}
