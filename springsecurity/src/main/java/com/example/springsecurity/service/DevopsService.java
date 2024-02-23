package com.example.springsecurity.service;

import com.example.springsecurity.entity.User;
import com.example.springsecurity.model.RequestDto;
import com.example.springsecurity.repository.DevopsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevopsService {

    @Autowired
    DevopsRepository devopsRepository;
    public String createNewUser(User requestDto) {
        devopsRepository.save(requestDto);
        return "data saved successfully";
    }
}
