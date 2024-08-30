package com.example.BillGeneration.Repository;

import com.example.BillGeneration.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Customer,Long> {
}
