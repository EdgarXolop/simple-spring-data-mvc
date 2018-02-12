package com.xolop.examples.datamvc.repository;

import com.xolop.examples.datamvc.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long>{
    
}