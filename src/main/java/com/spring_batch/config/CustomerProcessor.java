package com.spring_batch.config;

import com.spring_batch.entity.Customer;
import com.spring_batch.entity.Customer_Profile;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer_Profile> {
    @Override
    public Customer_Profile process(Customer customer) {
        Customer_Profile customerProfile = new Customer_Profile();

        customerProfile.setId(customer.getId());
        customerProfile.setFirstName(customer.getFirstName());
        customerProfile.setLast_name(customer.getLast_name());
        customerProfile.setCountry(customer.getCountry());
        customerProfile.setContact_no(customer.getContact_no());
        customerProfile.setEmail(customer.getEmail());
        customerProfile.setDob(customer.getDob());

        return customerProfile;
    }
}
