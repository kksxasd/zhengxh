package com.test.controller;

import com.test.dao.ResponseInfoBody;
import com.test.service.AlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/6/2.
 */
@Controller
@RequestMapping(value="/main")
public class MainController {

    @RequestMapping("/goNext")
    public String nextPage(HttpServletRequest request,HttpServletResponse response){
        return "/nextPage";
    }
}
