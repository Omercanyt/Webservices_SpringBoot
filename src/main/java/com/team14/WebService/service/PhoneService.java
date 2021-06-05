package com.team14.WebService.service;

import com.team14.WebService.entity.Computer;
import com.team14.WebService.entity.Phone;
import com.team14.WebService.entity.phoneFeatures;
import com.team14.WebService.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhoneService {
    @Autowired
    PhoneRepository phoneRepository;

    public Phone savePhone(Phone p){
        return phoneRepository.save(p);
    }
    public Phone getPhone(int id){
        return phoneRepository.findById(id).orElse(null);
    }

    public List<Phone> getAllPhone(){
        return phoneRepository.findAll();
    }

    public List<Phone> getPhoneByBrand(String s){
        Phone temp = new Phone();
        List<Phone> phones = new ArrayList<>();
        List<Phone> phones2 = new ArrayList<>();
        phones=getAllPhone();
        for (Phone phone : phones) {
            if (phone.getPhone_brand().equals(s)) {
                temp = phone;
                phones2.add(temp);
            }
        }
        return phones2;
    }

    public List<Phone> getPhoneByModel(String s){
        Phone temp = new Phone();
        List<Phone> phones = new ArrayList<>();
        List<Phone> phones2 = new ArrayList<>();
        phones=getAllPhone();
        for (Phone phone : phones) {
            if (phone.getPhone_brand().equals(s)) {
                temp = phone;
                phones2.add(temp);
            }
        }
        return phones2;
    }

    public List<Phone> getPhoneByScreenSize(String s){
        Phone temp = new Phone();
        List<Phone> phones = new ArrayList<>();
        List<Phone> phones2 = new ArrayList<>();
        phones=getAllPhone();
        for (Phone phone : phones) {
            if (phone.getPhone_screenSize().equals(s)) {
                temp = phone;
                phones2.add(temp);
            }
        }
        return phones2;
    }

    public List<Phone> getPhoneByInternalMemory(String s){
        Phone temp = new Phone();
        List<Phone> phones = new ArrayList<>();
        List<Phone> phones2 = new ArrayList<>();
        phones=getAllPhone();
        for (Phone phone : phones) {
            if (phone.getPhone_internalMemory().equals(s)) {
                temp = phone;
                phones2.add(temp);
            }
        }
        return phones2;
    }

    public List<Phone> getPhoneByPrice(Float s){
        Phone temp = new Phone();
        List<Phone> phones = new ArrayList<>();
        List<Phone> phones2 = new ArrayList<>();
        phones=getAllPhone();
        for (Phone phone : phones) {
            if (phone.getPrice() == s) {
                temp = phone;
                phones2.add(temp);
            }
        }
        return phones2;
    }
}
