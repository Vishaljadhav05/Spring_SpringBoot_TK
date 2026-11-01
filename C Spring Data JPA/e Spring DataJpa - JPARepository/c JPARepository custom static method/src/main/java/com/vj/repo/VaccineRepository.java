package com.vj.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vj.entity.Vaccine;
import com.vj.view.ResultView;

public interface VaccineRepository extends JpaRepository<Vaccine, Integer>
{
	// findby-propertyname-keyword
	public List<ResultView> findByCostLessThan(Double cost);
}
