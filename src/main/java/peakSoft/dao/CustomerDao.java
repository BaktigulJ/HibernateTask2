package peakSoft.dao;

import peakSoft.entities.Address;
import peakSoft.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {

    String saveCustomer(Customer customer);

    Optional<Customer> findCustomerById(Long id);

    String updateCustomerById(Long customerId, Customer newCustomer);

    void deleteCustomerById(Long id);

    List<Customer> getAllCustomers();

    void dropCustomerTable();
}
