package com.team14.WebService.controller;

import com.team14.WebService.entity.computerComments;
import com.team14.WebService.entity.computerFeatures;
import com.team14.WebService.service.computerCommentsService;
import com.team14.WebService.service.computerFeaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class computerCommentsController {
    @Autowired
    computerCommentsService computerCommentsServiceObj;

    @PostMapping("/addComputerComments")
    public computerComments saveComputerComments(@RequestBody computerComments cc) { return computerCommentsServiceObj.saveComputerComments(cc);}
    @GetMapping("/getComputerComments/{id}")
    public computerComments getComputerComments(@PathVariable int id) { return computerCommentsServiceObj.getComputerComments(id); }
    @GetMapping("/getAllComputerComments")
    public List<computerComments> getAllComputerComments() { return computerCommentsServiceObj.getAllComputerComments();}

    @GetMapping("/getAllComputerByComputerID/{id}")
    public List<computerComments> getAllComputerByComputerID(@PathVariable int id){return computerCommentsServiceObj.getAllComputerByComputerID(id);}
}
