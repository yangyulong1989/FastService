package com.yangyulong1989.fastservice.repository;

import com.yangyulong1989.fastservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "user")
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);
}
