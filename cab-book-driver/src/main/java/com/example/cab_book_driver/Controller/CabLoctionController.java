package com.example.cab_book_driver.Controller;

import com.example.cab_book_driver.service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")

public class CabLoctionController {





  @Autowired
   CabService cabService;



    @PutMapping
    public ResponseEntity updateCabLocation() throws InterruptedException {
        int range = 100;
        while (range > 0){
            cabService.updateCabLocation(Math.random()+" "+Math.random());
            Thread.sleep(1000);
            range --;
        }
        return  new ResponseEntity<>(Map.of("message","location"), HttpStatus.OK);
    }
}
