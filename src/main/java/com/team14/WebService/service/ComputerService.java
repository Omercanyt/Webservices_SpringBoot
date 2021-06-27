package com.team14.WebService.service;

import com.team14.WebService.entity.Computer;
import com.team14.WebService.entity.Phone;
import com.team14.WebService.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class ComputerService {
    @Autowired
    ComputerRepository computerRepository;
    Lock lock = new ReentrantLock();

    public Computer saveComputer(Computer c) throws InterruptedException{
        lock.lock();
        //Thread.sleep(10000);
        Computer temp = computerRepository.save(c);
        lock.unlock();
        return temp;
    }
    public Computer getComputer(int id) throws InterruptedException{
        lock.lock();
        Computer temp = computerRepository.findById(id).orElse(null);
        lock.unlock();
        return temp;
    }
    public List<Computer> getAllComputer(){
        lock.lock();
        List<Computer> tempComputerList = computerRepository.findAll();
        lock.unlock();
        return tempComputerList;
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

    public List<Computer> getComputerByScreenSize(String s){
        Computer temp = new Computer();
        List<Computer> computers = new ArrayList<>();
        List<Computer> computers2 = new ArrayList<>();
        computers=getAllComputer();
        for (Computer computer : computers) {
            if (computer.getComputerScreenSize().equals(s)) {
                temp = computer;
                computers2.add(temp);
            }
        }
        return computers2;
    }

    public List<Computer> getComputerByModel(String s){
        Computer temp = new Computer();
        List<Computer> computers = new ArrayList<>();
        List<Computer> computers2 = new ArrayList<>();
        computers=getAllComputer();
        for (Computer computer : computers) {
            if (computer.getComputerModel().equals(s)) {
                temp = computer;
                computers2.add(temp);
            }
        }
        return computers2;
    }

    public List<Computer> getComputerByScreenResolution(String s){
        Computer temp = new Computer();
        List<Computer> computers = new ArrayList<>();
        List<Computer> computers2 = new ArrayList<>();
        computers=getAllComputer();
        for (Computer computer : computers) {
            if (computer.getScreenResolution().equals(s)) {
                temp = computer;
                computers2.add(temp);
            }
        }
        return computers2;
    }

    public List<Computer> getComputerByProcessor(String s){
        Computer temp = new Computer();
        List<Computer> computers = new ArrayList<>();
        List<Computer> computers2 = new ArrayList<>();
        computers=getAllComputer();
        for (Computer computer : computers) {
            if (computer.getProcessor().equals(s)) {
                temp = computer;
                computers2.add(temp);
            }
        }
        return computers2;
    }

    public List<Computer> getComputerByMemory(String s){
        Computer temp = new Computer();
        List<Computer> computers = new ArrayList<>();
        List<Computer> computers2 = new ArrayList<>();
        computers=getAllComputer();
        for (Computer computer : computers) {
            if (computer.getMemory().equals(s)) {
                temp = computer;
                computers2.add(temp);
            }
        }
        return computers2;
    }

    public List<Computer> getComputerByStorageCapacity(String s){
        Computer temp = new Computer();
        List<Computer> computers = new ArrayList<>();
        List<Computer> computers2 = new ArrayList<>();
        computers=getAllComputer();
        for (Computer computer : computers) {
            if (computer.getStorageCapacity().equals(s)) {
                temp = computer;
                computers2.add(temp);
            }
        }
        return computers2;
    }

    public List<Computer> SearchComputerByMaximumPriceAndBrand(float price,String brand){
        Computer temp = new Computer();
        List<Computer> computers = new ArrayList<>();
        List<Computer> computers2 = new ArrayList<>();
        computers=getAllComputer();


        for (Computer computer : computers) {
            if(price<=computer.getComputerPrice() && brand.equals(computer.getComputerBrand())) {
                temp = computer;
                computers2.add(temp);
            }

        }
        return computers2;
    }

    public List<Computer> SearchComputerByPorcessor_Memory_Capacity(String  proces,String memory, String capacity){
        Computer temp = new Computer();
        List<Computer> computers = new ArrayList<>();
        List<Computer> computers2 = new ArrayList<>();
        computers=getAllComputer();


        for (Computer computer : computers) {
            if(memory.equals(computer.getMemory()) && proces.equals(computer.getProcessor()) && capacity.equals(computer.getStorageCapacity())) {
                temp = computer;
                computers2.add(temp);
            }

        }
        return computers2;
    }




}
