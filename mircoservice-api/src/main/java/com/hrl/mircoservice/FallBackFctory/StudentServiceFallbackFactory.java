package com.hrl.mircoservice.FallBackFctory;

import com.hrl.mircoservice.entities.Student;
import com.hrl.mircoservice.service.StudentService;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2019/1/24.
 */
@Component//不要忘记添加，不要忘记添加
public class StudentServiceFallbackFactory implements FallbackFactory<StudentService>
{
    @Override
    public StudentService create(Throwable throwable) {
        return new StudentService() {

            @Override
            public Student add(Student student) {
                return null;
            }

            @Override
            public Student get(Long id) {
                return new Student().setName("该Id"+id+" 不存在学生。");
            }

            @Override
            public List<Student> list() {
                return null;
            }
        };
    }
}
