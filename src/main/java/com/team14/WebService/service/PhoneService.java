package com.team14.WebService.service;

import com.team14.WebService.entity.Computer;
import com.team14.WebService.entity.Phone;
import com.team14.WebService.entity.phoneFeatures;
import com.team14.WebService.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class PhoneService {
    @Autowired
    PhoneRepository phoneRepository;
    Lock lock = new ReentrantLock();

    public Phone savePhone(Phone p) throws InterruptedException{
        lock.lock();
        //Thread.sleep(10000);
        Phone temp = phoneRepository.save(p);
        lock.unlock();
        return temp;
    }
    public Phone getPhone(int id) throws InterruptedException{
        lock.lock();
        Phone temp = phoneRepository.findById(id).orElse(null);
        lock.unlock();
        return temp;
    }

    public List<Phone> getAllPhone() throws InterruptedException{
        lock.lock();
        List<Phone> tempPhoneList = phoneRepository.findAll();
        lock.unlock();
        return tempPhoneList;
    }

    public List<Phone> getPhoneByBrand(String s) throws InterruptedException {
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

    public List<Phone> getPhoneByModel(String s) throws InterruptedException {
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

    public List<Phone> getPhoneByScreenSize(String s) throws InterruptedException {
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

    public List<Phone> getPhoneByInternalMemory(String s) throws InterruptedException {
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

    public List<Phone> getPhoneByPrice(float s) throws InterruptedException {
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

    public List<Phone> SearchPhoneByModelAndBrand(String  model,String brand) throws InterruptedException {
        Phone temp = new Phone();
        List<Phone> phones = new ArrayList<>();
        List<Phone> phones2 = new ArrayList<>();
        phones=getAllPhone();

        for (Phone phone : phones) {
            if(model.equals(phone.getPhone_model()) && brand.equals(phone.getPhone_brand())) {
                temp = phone;
                phones2.add(temp);
            }

        }
        return phones2;
    }

    public List<Phone> SearchPhoneByScreenSize_MemoryAndBrand(String  screen,String memory,String  brand ) throws InterruptedException {
        Phone temp = new Phone();
        List<Phone> phones = new ArrayList<>();
        List<Phone> phones2 = new ArrayList<>();
        phones=getAllPhone();

        for (Phone phone : phones) {
            if(screen.equals(phone.getPhone_screenSize()) && memory.equals(phone.getPhone_internalMemory()) && brand.equals(phone.getPhone_brand())) {
                temp = phone;
                phones2.add(temp);
            }

        }
        return phones2;
    }
}
