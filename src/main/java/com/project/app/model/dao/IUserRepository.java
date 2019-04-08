package com.project.app.model.dao;

import com.project.app.model.entity.User;
import org.springframework.data.repository.CrudRepository;
import reactor.core.publisher.Mono;

public interface IUserRepository extends CrudRepository<Mono<User>, Integer> {
    Mono<User> findByNickName(String nickName);
}
