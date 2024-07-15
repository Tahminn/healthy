package com.healthy.services;

import com.healthy.repository.ClientFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientFormServices {

    @Autowired
    private ClientFormRepository clientFormRepository;

    @Autowired
    private CustomUserDetailsService  userService;



}
