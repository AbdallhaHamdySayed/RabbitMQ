package com.example.RabbitMQ.Send.and.Receive.JSON.Messages.dto;

import lombok.Data;

@Data
public class User {
    private int id;
    private String firstName;
    private String lastName;
}