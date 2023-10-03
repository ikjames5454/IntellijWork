package tdd;

import java.util.ArrayList;
import java.util.Objects;

public class PeopleInfoCapture {
    private final String password;
    private String name;


    private ArrayList<CustomerInfo> customers;

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }


    private boolean isLockEntry;
    public PeopleInfoCapture(String name,String password) {
        this.password = password;
        this.name = name;
        customers = new ArrayList<>();

    }

    public void lockEntry() {
        isLockEntry = true;
    }

    public boolean isLockEntry() {
        return isLockEntry;
    }

    public void unLockEntry(String password) {

            if (!Objects.equals(this.password, password)) {
                throw new NullPointerException("invalid password");
            }
        isLockEntry = false;
    }

    public void createEntry(String name, String address, String number, String mail) {
        CustomerInfo customer = new CustomerInfo(name,address,number,mail);
        customers.add(customer);

    }
    public CustomerInfo findEntry(String username){
        for (CustomerInfo customer : customers){
            if (customer.getName().equals(username)){
                return customer;
            }
        }
        throw new NullPointerException("wrong username");
    }
    public void deleteEntry(String username){
        if (findEntry(username) != null){
            customers.remove(findEntry(username));
        }

    }

    public void updateEntry(String name, String address, String number, String mail) {
            CustomerInfo update = findEntry(name);
            update.setName(name);
            update.setAddress(address);
            update.setTelephone(number);
            update.setEmail(mail);
    }
    public String returnUserName(){
        return name;
    }
}
