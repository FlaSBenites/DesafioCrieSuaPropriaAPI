package com.br.santander.service;


import com.br.santander.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
