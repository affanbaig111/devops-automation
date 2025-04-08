package com.example.cab_book_driver.service;

import com.example.cab_book_driver.AppConst;
import com.example.cab_book_driver.config.KafkaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabService {
    @Autowired
   private KafkaTemplate<String, Object> kafkaTemplate;
    public boolean updateCabLocation(String location) {
        kafkaTemplate.send(AppConst.CAB_LOCATION,location);
        return true;
    }
}
