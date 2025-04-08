package com.example.reciver.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RequestSender implements Serializable {
    private Integer id;

    private String message;
    private String sender;
}
