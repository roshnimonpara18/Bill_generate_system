package com.example.BillGeneration.Service;

import com.example.BillGeneration.Model.Customer;
import com.example.BillGeneration.Model.ResponseDTO;
import com.example.BillGeneration.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {


    @Autowired
    private CustomerRepository customerRepository;

    public ResponseDTO<List<Customer>> saveProduct(List<Customer> customers) {
        try {
            return new ResponseDTO<>(customerRepository.saveAll(customers), HttpStatus.OK, "save customer successfully");
        } catch (Exception e) {
            return new ResponseDTO<>(null, HttpStatus.INTERNAL_SERVER_ERROR, "failed to save");
        }
    }
}
