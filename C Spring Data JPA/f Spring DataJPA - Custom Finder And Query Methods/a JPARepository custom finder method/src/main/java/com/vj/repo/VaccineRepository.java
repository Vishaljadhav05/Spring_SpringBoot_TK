package com.vj.repo;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vj.entity.Vaccine;


public interface VaccineRepository extends JpaRepository<Vaccine, Integer>
{
	// findBy -> Property(field) Name -> Keywords
	
	public List<Vaccine> findByCost(double cost);
	public List<Vaccine> findByCostIs(double cost);  // Same as above
	public List<Vaccine> findByCostEquals(double cost); // Same as above
	
	public List<Vaccine> findByCostLessThanEqual(double cost);
	
	public List<Vaccine> findByCostBetween(double startCost,double endCost);
	
	public List<Vaccine> findByVaccineCompanyEquals(String name);
	
	public List<Vaccine> findByVaccineNameInAndCostBetween(Collection<String> names,double minCost,double maxCost);
}
