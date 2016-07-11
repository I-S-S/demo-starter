package com.two.lights.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: isosa
 * Date: 7/10/16
 * Time: 1:20 PM
 * To change this template use File | Settings | File Templates.
 */

@RestController
public class DemoStarterController {

    @Value("${hello.var}") String hello;

    @RequestMapping("/hello")
    public String showLuckyWord() {
        return hello;
    }
}
