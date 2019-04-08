package com.project.app.service;

import com.project.app.model.dao.IUserRepository;
import com.project.app.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public Mono<User> findById(Integer userId) {
        return userRepository
                .findById(userId)
                .get();
    }

    @Override
    public Mono<User> findByNickName(String nickName) {
        return userRepository.findByNickName(nickName);
    }

    @Override
    public Flux<User> findAll() {
        return Flux.mergeSequential(userRepository.findAll());
    }
}
