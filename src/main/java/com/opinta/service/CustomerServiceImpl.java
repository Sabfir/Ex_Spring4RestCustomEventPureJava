package com.opinta.service;

import com.opinta.dao.CustomerDao;
import com.opinta.model.Customer;
import com.opinta.publisher.SysLogPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private SysLogPublisher logPublisher;

    @Override
    @Transactional
    public List<Customer> getAll() {
        logPublisher.log("Getting all Customers");
        return customerDao.getAll();
    }

    @Override
    @Transactional
    public Customer getById(Long id) {
        logPublisher.log("Getting Customer by id " + id);
        return customerDao.getById(id);
    }

    @Override
    @Transactional
    public void save(Customer customer) {
        logPublisher.log("Saving customer " + customer);
        customerDao.save(customer);
    }

    @Override
    @Transactional
    public Customer update(Long id, Customer customer) {
        if (getById(id) == null) {
            logPublisher.log("Can't update customer. Customer doesn't exist " + id);
            return null;
        }
        customer.setId(id);
        logPublisher.log("Updating customer " + customer);
        customerDao.update(customer);
        return customer;
    }

    @Override
    @Transactional
    public boolean delete(Long id) {
        if (getById(id) == null) {
            logPublisher.log("Can't delete customer. Customer doesn't exist " + id);
            return false;
        }
        Customer customer = new Customer();
        customer.setId(id);
        logPublisher.log("Deleting customer " + customer);
        customerDao.delete(customer);
        return true;
    }
}
