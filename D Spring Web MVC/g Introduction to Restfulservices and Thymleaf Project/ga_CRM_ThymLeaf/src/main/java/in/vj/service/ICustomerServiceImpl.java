package in.vj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vj.model.Customer;
import in.vj.repository.ICustomerRepo;

@Service
public class ICustomerServiceImpl implements ICustomerService 
{
	@Autowired
	private ICustomerRepo repo;

	@Override
	public List<Customer> getCustomerInfo() 
	{
		
		return (List<Customer>) repo.findAll();
	}

	@Override
	public void registerCustomer(Customer customer) 
	{
		repo.save(customer);

	}

	@Override
	public Customer fetchCxById(Integer id)
	{
		Optional<Customer> optional = repo.findById(id);
		
		return optional.get();
	}

	@Override
	public void deleteCxRecord(Integer id) {
		repo.deleteById(id);
		
	}

}
