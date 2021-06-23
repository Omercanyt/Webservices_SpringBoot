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

    @GetMapping("/getComputerByBrand/{screenSize}")
    public List<Computer> getComputerByScreenSize(@PathVariable String screenSize){
        return computerService.getComputerByScreenSize(screenSize);
    }

    @GetMapping("/getComputerByBrand/{model}")
    public List<Computer> getComputerByModel(@PathVariable String model){
        return computerService.getComputerByModel(model);
    }

    @GetMapping("/getComputerByScreenResolution/{screenRes}")
    public List<Computer> getComputerByScreenResolution(@PathVariable String screenRes){
        return computerService.getComputerByScreenResolution(screenRes);
    }

    @GetMapping("/getComputerByProcessor/{processor}")
    public List<Computer> getComputerByProcessor(@PathVariable String processor){
        return computerService.getComputerByProcessor(processor);
    }

    @GetMapping("/getComputerByMemory/{memory}")
    public List<Computer> getComputerByMemory(@PathVariable String memory){
        return computerService.getComputerByMemory(memory);
    }

    @GetMapping("/SearchComputerByPorcessor_Memory_Capacity/{processor}/{memory}/{capacity}")
    public List<Computer> SearchComputerByPorcessor_Memory_Capacity(@PathVariable String processor,@PathVariable String memory,@PathVariable String capacity){
        return computerService.SearchComputerByPorcessor_Memory_Capacity(processor,memory,capacity);
    }


    @GetMapping("/getComputerByStorageCapacity/{storageCapacity}")
    public List<Computer> getComputerByStorageCapacity(@PathVariable String storageCapacity){
        return computerService.getComputerByStorageCapacity(storageCapacity);
    }


    @GetMapping("/SearchComputerByMaximumPriceAndBrand/{price}/{brand}")
    public List<Computer> SearchComputerByMaximumPriceAndBrand(@PathVariable float price,@PathVariable String brand){
        return computerService.SearchComputerByMaximumPriceAndBrand(price,brand);
    }
}