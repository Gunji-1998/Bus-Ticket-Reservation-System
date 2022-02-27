package com.example.busticketreservation.service;

import org.springframework.security.core.userdetails.UserDetailsService;


import com.example.busticketreservation.dto.UserRegistrationDto;
import com.example.busticketreservation.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
