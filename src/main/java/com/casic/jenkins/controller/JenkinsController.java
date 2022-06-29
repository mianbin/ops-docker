package com.casic.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName jenkins-docker
 * @Description TODO
 * @Author mianbin
 * @Date 2022/5/26 21:11
 * @Version 1.0
 **/
@RestController
@RequestMapping("v1")
public class JenkinsController {

    @GetMapping
    public String getV1() {
        return "这是一个ops的docker 部署项目 - version 1.0.0";
    }

}
