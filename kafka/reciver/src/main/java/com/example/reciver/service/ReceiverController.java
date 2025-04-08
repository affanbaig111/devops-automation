package com.example.reciver.service;

import com.example.reciver.event.RequestSender;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ReceiverController {

    @KafkaListener(topics = "sender", groupId = "receiver")
    public void receive(RequestSender requestSender) {
        System.out.println("Received request: " + requestSender.getMessage()
                + " from sender: " + requestSender.getSender());
    }
}