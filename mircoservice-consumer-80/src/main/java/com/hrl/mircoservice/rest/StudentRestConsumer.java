package com.hrl.mircoservice.rest;

import com.hrl.mircoservice.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Administrator on 2019/1/22.
 */
@RestController
public class StudentRestConsumer {

    //直接访问提供者
    //private static final String REST_URL_PREFIX = "http://localhost:8001";

    //通过eureka访问提供者
    private static final String REST_URL_PREFIX = "http://MIRCOSERVICE-STUDENT";


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/consumer/student/add")
    public Student add(Student student)
    {
        return restTemplate.postForObject(REST_URL_PREFIX+"/student/add", student, Student.class);
    }

    @RequestMapping(value="/consumer/student/get/{id}")
    public Student get(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(REST_URL_PREFIX+"/student/get/"+id, Student.class);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value="/consumer/student/list")
    public List<Student> list()
    {
        return restTemplate.getForObject(REST_URL_PREFIX+"/student/list", List.class);
    }

}
