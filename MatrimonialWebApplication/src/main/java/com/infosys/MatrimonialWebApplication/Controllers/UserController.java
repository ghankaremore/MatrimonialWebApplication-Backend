package com.infosys.MatrimonialWebApplication.Controllers;


import com.infosys.MatrimonialWebApplication.Service.UserService;
import com.infosys.MatrimonialWebApplication.entitites.Personal;
import com.infosys.MatrimonialWebApplication.entitites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

        @PostMapping("/")
        public User createUser(@RequestBody User user) throws Exception {
            return this.userService.createUser(user);

        }

        @GetMapping("/{email}")
    public User getUser(@PathVariable("email") String email){
            return this.userService.getUser(email);
        }

        @DeleteMapping("/{id}")
        public void deleteUser(@PathVariable("id") Long id){
            this.userService.deleteUser(id);

        }

    @GetMapping("/users")
    public List<User> getAllUser() {
        return this.userService.getAllUser();
    }


}
