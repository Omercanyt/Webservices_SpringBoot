package com.team14.WebService.service;

import com.team14.WebService.entity.Computer;
import com.team14.WebService.repository.ComputerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ComputerServiceTest {
    @InjectMocks
    ComputerService computerService;

    @Mock
    ComputerRepository computerRepository;

    @Test
    void getAllComputer() {
        Computer computer1 = new Computer(1, 1000, "11.1", "Model1", "Brand1", "111x111", "i1", "1GB", "11GB", null, null);
        Computer computer2 = new Computer(2, 2000, "22.2", "Model2", "Brand2", "222x222", "i2", "2GB", "22GB", null, null);

        List<Computer> computers = new ArrayList<>();
        computers.add(computer1);
        computers.add(computer2);

        when(computerRepository.findAll()).thenReturn(new ArrayList(computers));

        List<Computer> computerList = computerService.getAllComputer();
        //Assertions.assertEquals(computerList.size()+1, computerList.size());
        //Assertions.assertEquals("Jackson Will", computerList.get(computerList.size()-1).getComputerBrand());
        Assertions.assertEquals(1, computerList.get(0).getComputerID());
        Assertions.assertEquals("Model1", computerList.get(0).getComputerModel());
        Assertions.assertEquals("Brand1", computerList.get(0).getComputerBrand());

        Assertions.assertEquals(2, computerList.get(1).getComputerID());
        Assertions.assertEquals("Model2", computerList.get(1).getComputerModel());
        Assertions.assertEquals("Brand2", computerList.get(1).getComputerBrand());

        Assertions.assertEquals(computer1, computerList.get(0));
        Assertions.assertEquals(computer2, computerList.get(1));
    }

    @Test
    void getComputer() throws InterruptedException {
        Computer computer1 = new Computer(1, 1000, "11.1", "Model1", "Brand1", "111x111", "i1", "1GB", "11GB", null, null);
        Computer computer2 = new Computer(2, 2000, "22.2", "Model2", "Brand2", "222x222", "i2", "2GB", "22GB", null, null);

        List<Computer> computers = new ArrayList<>();
        computers.add(computer1);
        computers.add(computer2);

        when(computerRepository.findById(1)).thenReturn(java.util.Optional.ofNullable(computers.get(0)));
        Computer tempComputer = computerService.getComputer(1);
        Assertions.assertEquals(tempComputer, computers.get(0));

        when(computerRepository.findById(2)).thenReturn(java.util.Optional.ofNullable(computers.get(1)));
        Computer tempComputer2 = computerService.getComputer(2);
        Assertions.assertEquals(tempComputer2, computers.get(1));

    }

}