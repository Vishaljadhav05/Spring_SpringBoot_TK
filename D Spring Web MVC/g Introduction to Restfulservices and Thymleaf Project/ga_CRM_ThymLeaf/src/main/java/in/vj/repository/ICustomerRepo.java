package in.vj.repository;

import org.springframework.data.repository.CrudRepository;

import in.vj.model.Customer;

public interface ICustomerRepo extends CrudRepository<Customer, Integer> 
{

}
