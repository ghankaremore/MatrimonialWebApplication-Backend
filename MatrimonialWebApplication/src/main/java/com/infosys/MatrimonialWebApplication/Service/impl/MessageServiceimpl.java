package com.infosys.MatrimonialWebApplication.Service.impl;

import com.infosys.MatrimonialWebApplication.Service.MessageService;
import com.infosys.MatrimonialWebApplication.entitites.*;
import com.infosys.MatrimonialWebApplication.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MessageServiceimpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public Optional<Message> createMessage(Message message) throws Exception {
        Optional<Message> local =  this.messageRepository.findById(message.getId());
//        if(local!=null){
//            System.out.println("User already present");
//            throw new Exception("User already exists");

        local = Optional.of(this.messageRepository.save(message));

        return local;
    }


    @Override
    public Optional<Message> getMessage(Long id) {
        return this.messageRepository.findById(id);
    }

    @Override
    public void deleteMessage(Long id) {
        this.messageRepository.deleteById(id);
    }
}

