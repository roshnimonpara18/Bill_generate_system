package com.example.BillGeneration.Repository;

import com.example.BillGeneration.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ProductRepository extends JpaRepository <Product,Long> {
}
