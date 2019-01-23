package com.hrl.mircoservice.repository;

import com.hrl.mircoservice.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by Administrator on 2019/1/22.
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {

   /* @Modifying
    @Query(value = "INSERT INTO t_student (name,age,comment)  VALUES (,?1, ?2)", nativeQuery=true)
    public Student addStudent(Student student);*/

   @Query(value = "select DATABASE();",nativeQuery = true)
   public String getDataBaseName();
}
