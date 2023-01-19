package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(1, "Sam", LocalDate.now().minusYears(20)));
        users.add(new User(1, "Alice", LocalDate.now().minusYears(35)));
    }
}
