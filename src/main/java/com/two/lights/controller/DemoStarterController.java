package com.two.lights.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: isosa
 * Date: 7/10/16
 * Time: 1:20 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class DemoStarterController {

    @RequestMapping("/")
    public String showLuckyWord() {
        return "hello";
    }
}
