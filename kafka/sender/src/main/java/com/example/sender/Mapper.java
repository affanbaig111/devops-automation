package com.example.sender;

import org.springframework.stereotype.Service;

@Service
public class Mapper {


    public  SenderModel maping(RequestSender requestSender) {

        SenderModel senderModel = new SenderModel();
        senderModel.setId(requestSender.getId());
        senderModel.setSender(requestSender.getSender());
        senderModel.setMessage(requestSender.getMessage());

        return senderModel;
    }
}
