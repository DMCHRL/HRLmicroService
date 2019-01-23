package com.hrl.mircoservice.repository;

import com.hrl.mircoservice.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2019/1/22.
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
