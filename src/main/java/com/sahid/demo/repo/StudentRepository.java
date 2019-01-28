package com.sahid.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.sahid.demo.model.Student;

public interface StudentRepository extends CrudRepository<Student,Long> {

}
