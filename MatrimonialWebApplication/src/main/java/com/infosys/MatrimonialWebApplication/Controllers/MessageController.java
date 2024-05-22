package com.infosys.MatrimonialWebApplication.Controllers;


import com.infosys.MatrimonialWebApplication.Service.MessageService;
import com.infosys.MatrimonialWebApplication.entitites.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/message")
@CrossOrigin("*")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/")
    public Optional<Message> createMessage(@RequestBody Message message) throws Exception {
        return this.messageService.createMessage(message);

    }

    @GetMapping("/{id}")
    public Optional<Message> getMessage(@PathVariable("id") Long id){
        return this.messageService.getMessage(id);
    }

    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable("id") Long id){
        this.messageService.deleteMessage(id);

    }


}
