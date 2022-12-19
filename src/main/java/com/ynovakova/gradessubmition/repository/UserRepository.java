package com.ynovakova.gradessubmition.repository;

import com.ynovakova.gradessubmition.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
