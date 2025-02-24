//package com.example.controller;
//
//import com.example.model.Message;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.stereotype.Controller;
//
//@Controller
//public class MessageController {
//    @MessageMapping("/sendMessage")
//    @SendTo("/topic/messages")
//    public Message sendMessage(Message message) {
//        message.setTimestamp(System.currentTimeMillis());
//        // Сохранение в базе данных (добавьте сервис и репозиторий в реальном проекте)
//        return message;
//    }
//}