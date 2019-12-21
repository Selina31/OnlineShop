package onlineShop.dao;

import onlineShop.model.Customer;

//Data Access Object

public interface CustomerDao {
    //add
    void addCustomer(Customer customer);
    
    //retrieve: get target by user name
    Customer getCustomerByUserName(String userName);
}
