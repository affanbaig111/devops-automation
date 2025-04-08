package com.example.sender;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/sender")
@RequiredArgsConstructor
public class Controller {

    private final SenderRepo senderRepo;
    private final Mapper mapper;
    private final KafkaTemplate<String,SenderModel> kafkaTemplate;


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public String save(@RequestBody RequestSender requestSender) {

    SenderModel  senderModel =  mapper.maping(requestSender);
    kafkaTemplate.send("sender",senderModel);



      senderRepo.save(senderModel);
      return senderModel.getId().toString();
    }


}
