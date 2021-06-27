package com.team14.WebService.controller;

import com.team14.WebService.entity.computerComments;
import com.team14.WebService.entity.phoneComments;
import com.team14.WebService.service.phoneCommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class phoneCommentsController {
    @Autowired
    phoneCommentsService phoneCommentsServiceObj;
    @PostMapping("/addPhoneComments")
    public phoneComments savePhoneComments(@RequestBody phoneComments pc) { return phoneCommentsServiceObj.savePhoneComments(pc);}
    @GetMapping("/getPhoneComments/{id}")
    public phoneComments getPhoneComments(@PathVariable int id) { return phoneCommentsServiceObj.getPhoneComments(id); }
    @GetMapping("/getAllPhoneComments")
    public List<phoneComments> getAllPhoneComments() { return phoneCommentsServiceObj.getAllPhoneComments();}
    @GetMapping("/getPhoneCommentsByPhoneID{id}")
    public List<phoneComments> getPhoneCommentsByPhoneID(@PathVariable int id) { return phoneCommentsServiceObj.getPhoneCommentsByPhoneID(id); }


}
