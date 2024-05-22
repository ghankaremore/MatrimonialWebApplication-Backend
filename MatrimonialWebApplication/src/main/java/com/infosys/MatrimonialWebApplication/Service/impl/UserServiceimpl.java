package com.infosys.MatrimonialWebApplication.Service.impl;

import com.infosys.MatrimonialWebApplication.Service.UserService;
import com.infosys.MatrimonialWebApplication.entitites.*;
import com.infosys.MatrimonialWebApplication.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public User createUser(User user) throws Exception {
       User local =  this.userRepository.findByEmail(user.getEmail());
       if(local!=null){
           System.out.println("User already present");
           throw new Exception("User already exists");
       }else{
          local =  this.userRepository.save(user);
       }
        return local;
    }

    @Override
    public User getUser(String email) {
        return this.userRepository.findByEmail(email);
    }

    @Override
    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);

    }

    @Override


    public List<User> getAllUser() {

        return this.userRepository.findAll();
    }
    }

