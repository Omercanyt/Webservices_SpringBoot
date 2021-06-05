package com.team14.WebService.controller;

import com.team14.WebService.entity.Computer;
import com.team14.WebService.entity.Phone;
import com.team14.WebService.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComputerController {
    @Autowired
    ComputerService computerService;

    @PostMapping("/addComputer")
    public Computer saveComputer(@RequestBody Computer r){
        return computerService.saveComputer(r);
    }
    @GetMapping("/getComputer/{id}")
    public Computer getComputer(@PathVariable int id){
        return computerService.getComputer(id);
    }

    @GetMapping("/getAllComputer")
    public List<Computer> getAllComputer(){
        return computerService.getAllComputer();
    }

    @GetMapping("/getComputerByBrand/{brand}")
    public List<Computer> getComputerByBrand(@PathVariable String brand){
        return computerService.getComputerByBrand(brand);
    }

    @GetMapping("/getComputerByPrice/{price}")
    public List<Computer> getComputerByBrand(@PathVariable Float price){
        return computerService.getComputerByBPrice(price);
    }
}