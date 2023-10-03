package tdd;

import java.util.Objects;

public class CustomerInfo {
    private String name;
    private String address;
    private String telephone;
    private String email;

    public CustomerInfo(String name, String address, String telephone, String email) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerInfo that = (CustomerInfo) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(telephone, that.telephone) && Objects.equals(email, that.email);
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, telephone, email);
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }
    public String getInfo(){
        return "Full Name: " + name + "\n" + "Address: " + address + "\n" + "PhoneNumber: " + telephone + "\n" + "Email: " + email;
    }
}
