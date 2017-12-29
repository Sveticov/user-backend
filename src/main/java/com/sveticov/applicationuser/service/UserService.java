package com.sveticov.applicationuser.service;

import com.sveticov.applicationuser.model.User;
import com.sveticov.applicationuser.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    private Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserRepository repository;
    User userLocal;

    public void saveUser(User user) {
        logger.info("user save :" + user);
        repository.save(user);
    }

    public List<User> findAllUser() {
        repository.findAll().stream().forEach(user -> logger.info(user.toString()));
        return repository.findAll();
    }




    public User findOneUser(long id) {
        userLocal = repository.findOne(id);
        logger.info(userLocal.toString());
        return repository.findOne(id);
    }

    public long nextUserId(){
     return    repository.count();
    }


    public void userDeleteId(long id){
        logger.info("user with id: "+id+" delete");
        repository.delete(id);
    }
}
