package com.tech.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.Controller.Student;
import java.util.List;


@Repository
public interface StudentDao  extends JpaRepository<Student, Integer>{
 
	List<Student> findByName(String name);
}
