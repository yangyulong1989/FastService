package com.yangyulong1989.fastservice.api;

import com.yangyulong1989.fastservice.entity.User;
import com.yangyulong1989.fastservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(value = "http://127.0.0.1:4200")
@RestController
public class HelloController {
    @Autowired
    private UserService userService;

    @GetMapping("users")
    public List<User> list() {
        return userService.findAll();
    }

    @GetMapping("user")
    public List<User> hello(@RequestParam String name) {
        return userService.findByName(name);
    }
}
