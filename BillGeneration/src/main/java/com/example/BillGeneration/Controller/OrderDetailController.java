package com.example.BillGeneration.Controller;


import com.example.BillGeneration.Model.OrderDetail;
import com.example.BillGeneration.Model.ResponseDTO;
import com.example.BillGeneration.Repository.OrderDetailRepository;
import com.example.BillGeneration.Service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("orders")
    public class OrderDetailController {

        @Autowired
        private OrderDetailService orderDetailService;

        @Autowired
        private OrderDetailRepository orderDetail;

        @PostMapping("placeOrder")
        public ResponseDTO<OrderDetail> placeOrder(@RequestBody OrderDetail orderDetail) {
            return orderDetailService.placeOrder(orderDetail);
        }

        @GetMapping("getAll")
        public List<OrderDetail> getAllOrders() {
            return orderDetail.findAll();
        }

    }
