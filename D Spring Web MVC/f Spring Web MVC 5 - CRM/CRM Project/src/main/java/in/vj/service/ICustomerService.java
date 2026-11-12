package in.vj.service;

import java.util.List;

import in.vj.model.Customer;

public interface ICustomerService 
{
	public List<Customer> getCustomerInfo();
	public void registerCustomer(Customer customer);
	public Customer fetchCxById(Integer id);
	
	public void deleteCxRecord(Integer id);
	
}
