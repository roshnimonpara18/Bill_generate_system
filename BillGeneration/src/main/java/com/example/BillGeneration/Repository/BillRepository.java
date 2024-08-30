package com.example.BillGeneration.Repository;

import com.example.BillGeneration.Model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Long> {

}
