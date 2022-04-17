package com.sokiyo.RestApiMySql.Service;

import com.sokiyo.RestApiMySql.Model.User;
import com.sokiyo.RestApiMySql.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private Repo repo;

    public List<User> listAllUser() {
        return repo.findAll();
    }

    public void saveUser(User user) {
        repo.save(user);
    }

    public User getUser(Integer id) {
        return repo.findById(id).get();
    }

    public void deleteUser(Integer id) {
        repo.deleteById(id);
    }
}
