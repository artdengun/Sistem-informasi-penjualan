package com.kpa.springbootcrudmysql.service;

import com.kpa.springbootcrudmysql.model.User;
import com.kpa.springbootcrudmysql.model.UserPrincipal;
import com.kpa.springbootcrudmysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("User Tidak ada! Silahkan Register");
        }
            return new UserPrincipal(user);
    }
}