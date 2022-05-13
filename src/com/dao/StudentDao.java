package com.dao;

import com.pojo.Student;

import java.util.List;

public interface StudentDao {

    int update();

    List<Student> select();

}
