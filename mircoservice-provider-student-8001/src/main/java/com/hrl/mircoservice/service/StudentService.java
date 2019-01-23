package com.hrl.mircoservice.service;

import com.hrl.mircoservice.entities.Student;

import java.util.List;

/**
 * Created by Administrator on 2019/1/22.
 */
public interface StudentService {

    Student save(Student student);

    Student findOne(Integer id);

    List<Student> findAll();
    
    void delete(Integer id);
}

