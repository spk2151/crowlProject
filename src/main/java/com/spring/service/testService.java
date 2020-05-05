package com.spring.service;

import com.spring.entity.UserEntity;
import com.spring.repository.testRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class testService {
    @Autowired
    private testRepository test;

    public List<UserEntity> getAllList(){
        return test.findAll();
    }

    public void insert(UserEntity user){
        test.save(user);
    }

    public void delete(UserEntity user){
        test.delete(user);
    }
}
