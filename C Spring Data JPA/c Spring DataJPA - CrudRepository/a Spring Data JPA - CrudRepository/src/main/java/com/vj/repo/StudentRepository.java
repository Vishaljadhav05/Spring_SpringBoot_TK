package com.vj.repo;

import org.springframework.data.repository.CrudRepository;
// import org.springframework.stereotype.Repository;

import com.vj.entity.Student;

// @Repository
public interface StudentRepository extends CrudRepository<Student, Integer> 
{
	
}
