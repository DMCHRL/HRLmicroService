package com.hrl.mircoservice.rest;

import com.hrl.mircoservice.entities.Student;
import com.hrl.mircoservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/1/24.
 */
@RestController
public class showRest{

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/show/get")
    public String show(){
        Student student = studentService.get((long)1);
        return student+"============hello,i am show provider";
    }
}
