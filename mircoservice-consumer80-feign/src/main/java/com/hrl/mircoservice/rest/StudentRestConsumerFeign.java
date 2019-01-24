package com.hrl.mircoservice.rest;

import com.hrl.mircoservice.entities.Student;
import com.hrl.mircoservice.service.ShowService;
import com.hrl.mircoservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2019/1/22.
 */
@RestController
public class StudentRestConsumerFeign {

    //直接访问提供者
    //private static final String REST_URL_PREFIX = "http://localhost:8001";

    /*//通过eureka访问提供者
    private static final String REST_URL_PREFIX = "http://MIRCOSERVICE-STUDENT";*/

    //Fegin调用
    @Autowired
    private StudentService studentService = null;

    @Autowired
    private ShowService showService = null;

    @RequestMapping(value="/consumer/student/add")
    public Student add(Student student)
    {
        return studentService.add(student);
    }

    @RequestMapping(value="/consumer/student/get/{id}")
    public Student get(@PathVariable("id") Long id)
    {
        return studentService.get(id);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value="/consumer/student/list")
    public List<Student> list()
    {
        return studentService.list();
    }

    @RequestMapping(value="/consumer/show/get")
    public String showGet()
    {
        return showService.get();
    }

}
