package com.example.demo.services;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public Optional<User> findById(long id){
        return repository.findById(id);
    }

    public User save(User user) {
        return repository.save(user);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}
