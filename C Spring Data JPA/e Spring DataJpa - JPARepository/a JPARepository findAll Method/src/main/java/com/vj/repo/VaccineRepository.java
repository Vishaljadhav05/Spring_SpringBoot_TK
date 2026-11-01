package com.vj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vj.entity.Vaccine;

public interface VaccineRepository extends JpaRepository<Vaccine, Integer>
{

}
