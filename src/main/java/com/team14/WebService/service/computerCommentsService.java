package com.team14.WebService.service;

import com.team14.WebService.entity.computerComments;
import com.team14.WebService.entity.computerFeatures;
import com.team14.WebService.repository.ComputerCommentRepository;
import com.team14.WebService.repository.ComputerFeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class computerCommentsService {
    @Autowired
    ComputerCommentRepository computerCommentRepository;
    public computerComments saveComputerComments (computerComments compComments){ return computerCommentRepository.save(compComments);}
    public computerComments getComputerComments (int id){ return computerCommentRepository.findById(id).orElse(null);}
    public List<computerComments> getAllComputerComments() { return computerCommentRepository.findAll(); }

    public List<computerComments> getAllComputerByComputerID(int id){
        List<computerComments> pList1 = new ArrayList<>();
        List<computerComments> pList2 = new ArrayList<>();
        pList1 = getAllComputerComments();
        for(int i = 0; i<pList1.size();i++ ){
            if(pList1.get(i).getComputerComments().getComputerID() == id)
                pList2.add(pList1.get(i));
        }
        return pList2;

    }

}
