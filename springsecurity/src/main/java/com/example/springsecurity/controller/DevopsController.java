package com.example.springsecurity.controller;

import com.example.springsecurity.entity.User;
import com.example.springsecurity.model.RequestDto;
import com.example.springsecurity.service.DevopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/devops/")
public class DevopsController {

    @Autowired
    DevopsService devopsService;

    @GetMapping("welcome")
    public ResponseEntity<String> welcomeNotes(@RequestParam String message){
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @PostMapping("save")
    public ResponseEntity<String> save(@RequestBody User requestDto){
        String result = devopsService.createNewUser(requestDto);
        return new ResponseEntity<>(result,HttpStatus.CREATED);
    }
}
