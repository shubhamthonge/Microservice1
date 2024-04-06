package com.tech.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.Controller.Student;

@Repository
public interface studentrep  extends JpaRepository<Student, Integer>{

}
