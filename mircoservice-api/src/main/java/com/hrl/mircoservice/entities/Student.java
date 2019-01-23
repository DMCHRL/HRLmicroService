package com.hrl.mircoservice.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Administrator on 2019/1/22.
 */
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
@Entity(name="t_student")
public class Student implements Serializable {

    @Id
    private int id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String comment;


}
