package miu.edu.aopdemo.controller;

import miu.edu.aopdemo.aspect.annotation.ExecutionTime;
import miu.edu.aopdemo.aspect.annotation.LogMe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @ExecutionTime
    @LogMe
    @GetMapping
    public void getAll(){
        System.out.println("GetAaa is called ....");
    }
}
