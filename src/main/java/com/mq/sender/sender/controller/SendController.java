package com.mq.sender.sender.controller;

import com.mq.sender.sender.config.SenderConfig;
import com.mq.sender.sender.dto.People;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SendController {

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/addPeople")
    public String sendPeople(@RequestBody People people){
        template.convertAndSend(SenderConfig.EXCHANGE, SenderConfig.ROUTING_KEY,people);
        return "People add with success";
    }

    @GetMapping("/test")
    public String getTest(){
        return "sucess !!!!";
    }

}
