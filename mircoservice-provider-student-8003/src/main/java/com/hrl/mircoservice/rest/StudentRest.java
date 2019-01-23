package com.hrl.mircoservice.rest;

import com.hrl.mircoservice.entities.Student;
import com.hrl.mircoservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2019/1/22.
 */
@RestController
public class StudentRest {

    @Autowired
    private StudentService service;

    @RequestMapping(value="/student/add",method= RequestMethod.POST)
    public Student add(@RequestBody Student student)
    {
        return service.save(student);
    }

    @RequestMapping(value="/student/get/{id}",method=RequestMethod.GET)
    public Student get(@PathVariable("id") Integer id)
    {
        return service.findOne(id);
    }

    @RequestMapping(value="/student/list",method=RequestMethod.GET)
    public List<Student> list()
    {
        return service.findAll();
    }

}
