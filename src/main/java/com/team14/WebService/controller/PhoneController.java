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

    @GetMapping("/getPhoneByModel/{model}")
    public List<Phone> getPhoneByModel(@PathVariable String model){
        return phoneService.getPhoneByBrand(model);
    }

    @GetMapping("/getPhoneByScreenSize/{screenSize}")
    public List<Phone> getPhoneByScreenSize(@PathVariable String screenSize){
        return phoneService.getPhoneByScreenSize(screenSize);
    }

    @GetMapping("/getPhoneByInternalMemory/{internalMemory}")
    public List<Phone> getPhoneByInternalMemory(@PathVariable String internalMemory){
        return phoneService.getPhoneByInternalMemory(internalMemory);
    }

    @GetMapping("/getPhoneByPrice/{price}")
    public List<Phone> getPhoneByPrice(@PathVariable float price){
        return phoneService.getPhoneByPrice(price);
    }


    @GetMapping("/SearchPhoneByModelAndBrand/{model}/{brand}")
    public List<Phone> SearchPhoneByModelAndBrand(@PathVariable String  model,@PathVariable String brand){
        return phoneService.SearchPhoneByModelAndBrand(model,brand);
    }

    @GetMapping("/SearchPhoneByScreenSize_MemoryAndBrand/{screen}/{memory}/{brand}")
    public List<Phone> SearchPhoneByScreenSize_MemoryAndBrand(@PathVariable String  screen,@PathVariable String  memory,@PathVariable String brand){
        return phoneService.SearchPhoneByScreenSize_MemoryAndBrand(screen,memory,brand);
    }
}
