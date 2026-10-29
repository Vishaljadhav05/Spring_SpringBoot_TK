package com.vj.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.vj.entity.Vaccine;

public interface VaccineRepository extends PagingAndSortingRepository<Vaccine, Integer>
{

}
