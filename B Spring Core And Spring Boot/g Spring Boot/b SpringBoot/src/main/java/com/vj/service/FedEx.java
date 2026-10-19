package com.vj.service;

import org.springframework.stereotype.Service;

@Service
public class FedEx implements IDelivery 
{

	public FedEx()
	{
		System.out.println("FedEx Bean Created >>>");
	}
	@Override
	public Boolean deliverTheProduct(Double amount) {
		
		System.out.println("Product with FedEx and Amount paid is :"+amount);
		return true;
	}
	
}
