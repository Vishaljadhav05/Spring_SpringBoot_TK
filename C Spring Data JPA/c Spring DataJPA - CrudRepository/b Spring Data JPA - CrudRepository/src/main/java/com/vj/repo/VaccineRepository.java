package com.vj.repo;

import org.springframework.data.repository.CrudRepository;

import com.vj.entity.Vaccine;

public interface VaccineRepository extends CrudRepository<Vaccine, Integer> 
{

}
