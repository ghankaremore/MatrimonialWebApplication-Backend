package com.infosys.MatrimonialWebApplication.Service;

import com.infosys.MatrimonialWebApplication.entitites.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public  User createUser(User user) throws Exception;

    public User getUser(String email);

    public void deleteUser(Long id);
    public List<User> getAllUser() ;

}

