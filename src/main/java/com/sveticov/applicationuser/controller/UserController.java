package com.sveticov.applicationuser.controller;

import com.sveticov.applicationuser.model.User;
import com.sveticov.applicationuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService service;

    @PostMapping("app/find/one/user")
    @ResponseBody
    public User showOneUser(@RequestBody long id) {//long id

        return service.findOneUser(id);
    }

    //
    @PostMapping("app/save/user")
    public void saveNewUser(@RequestBody User user) {
        User user2 = user;
        user2.setId(service.nextUserId());
        service.saveUser(user2);
    }

    @GetMapping("app/find/all/user")
    @ResponseBody
    public List<User> findAllUser() {
        return service.findAllUser();
    }


    @PostMapping("app/delete/user")
    public void userDelete(@RequestBody long id){
        service.userDeleteId(id);
    }

    @PostMapping("app/update/user")
    public void userUpdate(@RequestBody User user){
        long id_local=user.getId();
        User user_local=service.findOneUser(id_local);

        if(user_local.equals(user)!=true){
            service.userDeleteId(id_local);

            service.saveUser(user);
        }
    }
}
