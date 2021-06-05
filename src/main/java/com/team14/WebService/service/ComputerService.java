package com.team14.WebService.service;

import com.team14.WebService.entity.Computer;
import com.team14.WebService.entity.Phone;
import com.team14.WebService.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerService {
    @Autowired
    ComputerRepository computerRepository;

    public Computer saveComputer(Computer c){
        return computerRepository.save(c);
    }
    public Computer getComputer(int id){
        return computerRepository.findById(id).orElse(null);
    }
    public List<Computer> getAllComputer(){
        return computerRepository.findAll();
    }

    public List<Computer> getComputerByBrand(String s){
        Computer temp = new Computer();
        List<Computer> computers = new ArrayList<>();
        List<Computer> computers2 = new ArrayList<>();
        computers=getAllComputer();
        for (Computer computer : computers) {
            if (computer.getComputerBrand().equals(s)) {
                temp = computer;
                computers2.add(temp);
            }
        }
        return computers2;
    }

    public List<Computer> getComputerByBPrice(Float s){
        Computer temp = new Computer();
        List<Computer> computers = new ArrayList<>();
        List<Computer> computers2 = new ArrayList<>();
        computers=getAllComputer();
        for (Computer computer : computers) {
            if (computer.getComputerPrice()==s) {
                temp = computer;
                computers2.add(temp);
            }
        }
        return computers2;
    }

}
