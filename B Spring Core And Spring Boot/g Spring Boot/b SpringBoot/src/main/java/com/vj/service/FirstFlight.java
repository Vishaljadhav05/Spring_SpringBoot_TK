package com.vj.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class FirstFlight implements IDelivery
{

	public FirstFlight()
	{
		System.out.println("FirstFlight Bean Created >>>");
	}
	@Override
	public Boolean deliverTheProduct(Double amount) {
		
		System.out.println("Product with FirstFlight and Amount paid is :"+amount);
		return true;
	}
}
