package com.project.app.service;

import com.project.app.model.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IUserService {

    Mono<User> findById(Integer userId);
    Mono<User> findByNickName(String nick_name);
    Flux<User> findAll();
}
