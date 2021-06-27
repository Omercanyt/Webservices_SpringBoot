package com.team14.WebService.service;

import com.team14.WebService.entity.computerComments;
import com.team14.WebService.entity.phoneComments;
import com.team14.WebService.repository.ComputerCommentRepository;
import com.team14.WebService.repository.PhoneCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class phoneCommentsService {
    @Autowired
    PhoneCommentRepository phoneCommentRepository;
    public phoneComments savePhoneComments (phoneComments phoneComments){ return phoneCommentRepository.save(phoneComments);}
    public phoneComments getPhoneComments (int id){ return phoneCommentRepository.findById(id).orElse(null);}
    public List<phoneComments> getAllPhoneComments() { return phoneCommentRepository.findAll(); }

    public List<phoneComments> getPhoneCommentsByPhoneID (int id) {
        //phoneComments temp = new phoneComments();
        List<phoneComments> pList1 = new ArrayList<>();
        List<phoneComments> pList2 = new ArrayList<>();
        pList1 = getAllPhoneComments();
        for(int i = 0; i<pList1.size();i++ ){
            if(pList1.get(i).getPhoneComments().getPhone_id() == id)
                pList2.add(pList1.get(i));
        }
        return pList2;
    }
}
