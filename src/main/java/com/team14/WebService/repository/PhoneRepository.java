package com.team14.WebService.repository;

import com.team14.WebService.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository  extends JpaRepository<Phone, Integer> {
}
