package com.example.BillGeneration.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_detail")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;

    @Column(name = "name")
    private String name;

    @Column(name = "mobile_number")
    private long mobileNumber;

    @Column(name = "email")
    private String email;

//    @OneToMany(mappedBy = "customer")
//    private List<OrderDetail> orders;

//    public List<OrderDetail> getOrders() {
//        return orders;
//    }
//
//    public void setOrders(List<OrderDetail> orders) {
//        this.orders = orders;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}