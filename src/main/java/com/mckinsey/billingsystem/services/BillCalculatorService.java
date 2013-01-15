package com.mckinsey.billingsystem.services;

import java.util.List;
import com.mckinsey.billingsystem.domain.Customer;
import com.mckinsey.billingsystem.domain.Item;

public interface BillCalculatorService {
	
	double calculateTotalPayableAmount(Customer customer, List<Item> items);

}
