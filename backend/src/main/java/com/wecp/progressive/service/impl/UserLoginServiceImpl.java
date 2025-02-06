package com.wecp.progressive.service.impl;

import com.wecp.progressive.entity.User;
<<<<<<< HEAD
import com.wecp.progressive.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserLoginServiceImpl implements UserDetailsService {

    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder;
    
    @Autowired
    public UserLoginServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Integer userId) {
        return userRepository.findById(userId);
    }

    public User createUser(User user) throws Exception{
        User oldUser = userRepository.findByUsername(user.getUsername());
        User emailExists = userRepository.findByEmail(user.getEmail());
        if(oldUser != null){
            throw new Exception("User name is Unavailable: " + user.getUsername());
        }
        if(emailExists != null){
            throw new Exception("User already exists with the given email: "+user.getEmail());
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
=======
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public class UserLoginServiceImpl implements UserDetailsService {

    public List<User> getAllUsers() {
        return null;
    }

    public Optional<User> getUserById(Integer userId) {
        return null;
    }

    public User createUser(User user) {
        return null;
    }

    public User updateUser(User user) {
        return null;
    }

    public void deleteUser(Integer id) {
    }

    public User getUserByUsername(String username) {
        return null;
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
<<<<<<< HEAD
        User user = userRepository.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("User not found");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), new ArrayList<>());
=======
        return null;
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
    }
}