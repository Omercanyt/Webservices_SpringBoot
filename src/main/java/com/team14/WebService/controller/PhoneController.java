package com.team14.WebService.controller;

import com.team14.WebService.entity.Computer;
import com.team14.WebService.entity.Phone;
import com.team14.WebService.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PhoneController {
    @Autowired
    PhoneService phoneService;

    @PostMapping("/addPhone")
    public Phone savePhone(@RequestBody Phone r){
        return phoneService.savePhone(r);
    }
    @GetMapping("/getPhone/{id}")
    public Phone getPhone(@PathVariable int id){
        return phoneService.getPhone(id);
    }
    @GetMapping("/getAllPhone")
    public List<Phone> getAllPhone(){
        return phoneService.getAllPhone();
    }

    @GetMapping("/getPhoneByBrand/{brand}")
    public List<Phone> getPhoneByBrand(@PathVariable String brand){
        return phoneService.getPhoneByBrand(brand);
    }

}
