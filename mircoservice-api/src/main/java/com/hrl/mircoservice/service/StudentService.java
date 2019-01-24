package com.hrl.mircoservice.service;

import com.hrl.mircoservice.FallBackFctory.StudentServiceFallbackFactory;
import com.hrl.mircoservice.entities.Student;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2019/1/24.
 */
@FeignClient(value = "MIRCOSERVICE-STUDENT",fallbackFactory=StudentServiceFallbackFactory.class)
public interface StudentService
{
    @RequestMapping(value="/student/add")
    public Student add(Student student);

    @RequestMapping(value="/student/get/{id}")
    public Student get(@PathVariable("id") Long id);

    @SuppressWarnings("unchecked")
    @RequestMapping(value="/student/list")
    public List<Student> list();
}
