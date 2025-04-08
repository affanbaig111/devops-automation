package com.example.user_book_driver.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @KafkaListener(topics = "cab-location",groupId = "user-group")
    public void calLocation(String location){
        System.out.println(location);

    }
}
