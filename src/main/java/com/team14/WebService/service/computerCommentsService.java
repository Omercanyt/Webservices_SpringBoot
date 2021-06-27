package com.team14.WebService.service;

import com.team14.WebService.entity.computerComments;
import com.team14.WebService.entity.computerFeatures;
import com.team14.WebService.repository.ComputerCommentRepository;
import com.team14.WebService.repository.ComputerFeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class computerCommentsService {
    @Autowired
    ComputerCommentRepository computerCommentRepository;
    public computerComments saveComputerComments (computerComments compComments){ return computerCommentRepository.save(compComments);}
    public computerComments getComputerComments (int id){ return computerCommentRepository.findById(id).orElse(null);}
    public List<computerComments> getAllComputerComments() { return computerCommentRepository.findAll(); }

}
