package com.zxh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016-09-29.
 */
@Controller
@RequestMapping("/game")
public class GameController {

    @RequestMapping("/gobang")
    public String gobang(HttpServletRequest request, HttpServletResponse response){
        int a=1;
        return "/jsp/gobang";
    }

    @RequestMapping
    public void gobang1(HttpServletRequest request, HttpServletResponse response){
        int a=1;
    }
}
