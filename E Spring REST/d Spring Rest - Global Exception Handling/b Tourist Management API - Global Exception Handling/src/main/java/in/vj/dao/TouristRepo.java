package in.vj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vj.model.Tourist;

public interface TouristRepo extends JpaRepository<Tourist, Integer>
{

}
