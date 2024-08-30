package com.example.BillGeneration.Controller;


import com.example.BillGeneration.Model.Product;
import com.example.BillGeneration.Model.ResponseDTO;
import com.example.BillGeneration.Service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("product")
    public class ProductController {

        @Autowired
        private ProductServices productService;

        @PostMapping("saveProduct")
        public ResponseDTO<List<Product>> saveProduct(@RequestBody List<Product> products) {
            return productService.saveProduct(products);
        }

    }

