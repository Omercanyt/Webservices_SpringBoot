package com.team14.WebService.repository;

import com.team14.WebService.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository  extends JpaRepository<Computer, Integer> {
}
