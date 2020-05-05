package com.spring.controller;


import com.spring.entity.UserEntity;
import com.spring.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private testService test;

    //셀렉문 예시
    @RequestMapping(value = "/")
    public String test() {
    /*    List<UserEntity> testlist = test.getAllList();
        for(int i = 0; i < testlist.size();i++){
            System.out.println(i+"번째 출략");
            System.out.println(testlist.get(i).getId());
            System.out.println(testlist.get(i).getName());
            System.out.println(testlist.get(i).getPassword());
        }*/
        return "index";
    }

    //인서트문 예시
    @RequestMapping(value = "/test.do")
    public String test2() {
        UserEntity user = new UserEntity();
        user.setName("gooooood work");
        user.setPassword("nice job");
        test.insert(user);
        return "index";
    }
}