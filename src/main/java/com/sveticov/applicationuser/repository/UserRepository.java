package com.sveticov.applicationuser.repository;

import com.sveticov.applicationuser.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends MongoRepository<User,Long>{

}
