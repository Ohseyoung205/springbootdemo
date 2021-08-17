package com.spring.demo.controller;


import com.spring.demo.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    //@Autowired
    //SampleService sampleService;

//curl -I -k --http2 https://localhost:70/hello
    //curl -I -k https://localhost:8443/hello

    @GetMapping("/helloTest")
    public String hello(){
        return "hello " + "seyoung";
    }



    @GetMapping("/helloThymeleaf")
    public String helloThymeleaf(Model model){
        model.addAttribute("name","seyoung");
        return "hello";
    }

    @CrossOrigin
    @GetMapping("/error")
    public String exception(){
        throw  new SampleException();

    }
    //@ExceptionHandler(SampleException.class)

}
