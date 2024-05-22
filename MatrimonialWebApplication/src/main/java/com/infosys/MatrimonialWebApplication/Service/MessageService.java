package com.infosys.MatrimonialWebApplication.Service;

import com.infosys.MatrimonialWebApplication.entitites.*;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface MessageService {
    public Optional<Message> createMessage(Message message) throws Exception;

    public Optional<Message> getMessage(Long id);

    public void deleteMessage(Long id);

}

