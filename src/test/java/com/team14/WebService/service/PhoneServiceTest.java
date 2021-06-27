package com.team14.WebService.service;

import com.team14.WebService.entity.Computer;
import com.team14.WebService.entity.Phone;
import com.team14.WebService.repository.PhoneRepository;
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
class PhoneServiceTest {
    @InjectMocks
    PhoneService phoneService;

    @Mock
    PhoneRepository phoneRepository;

    @Test
    void getAllPhone() throws InterruptedException {
        Phone phone1 = new Phone(1, "Model1", "Brand1", "11.1", "11GB", 1000, null, null);
        Phone phone2 = new Phone(2, "Model2", "Brand2", "22.2", "22GB", 2000, null, null);
        List<Phone> phones = new ArrayList<>();
        phones.add(phone1);
        phones.add(phone2);

        when(phoneRepository.findAll()).thenReturn(new ArrayList(phones));

        List<Phone> phoneList = phoneService.getAllPhone();
        Assertions.assertEquals(1, phoneList.get(0).getPhone_id());
        Assertions.assertEquals("Model1", phoneList.get(0).getPhone_model());
        Assertions.assertEquals("Brand1", phoneList.get(0).getPhone_brand());

        Assertions.assertEquals(2, phoneList.get(1).getPhone_id());
        Assertions.assertEquals("Model2", phoneList.get(1).getPhone_model());
        Assertions.assertEquals("Brand2", phoneList.get(1).getPhone_brand());

        Assertions.assertEquals(phone1, phoneList.get(0));
        Assertions.assertEquals(phone2, phoneList.get(1));
    }

    @Test
    void getPhone() throws InterruptedException {
        Phone phone1 = new Phone(1, "Model1", "Brand1", "11.1", "11GB", 1000, null, null);
        Phone phone2 = new Phone(2, "Model2", "Brand2", "22.2", "22GB", 2000, null, null);
        List<Phone> phones = new ArrayList<>();
        phones.add(phone1);
        phones.add(phone2);

        when(phoneRepository.findById(1)).thenReturn(java.util.Optional.ofNullable(phones.get(0)));
        Phone tempPhone = phoneService.getPhone(1);
        Assertions.assertEquals(tempPhone, phones.get(0));

        when(phoneRepository.findById(2)).thenReturn(java.util.Optional.ofNullable(phones.get(1)));
        Phone tempPhone2 = phoneService.getPhone(2);
        Assertions.assertEquals(tempPhone2, phones.get(1));
    }
}