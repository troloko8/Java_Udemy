package Nathan.spring_security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Nathan.spring_security.dao.UserRepo;
import Nathan.spring_security.model.User;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public User save(User user) {
        repo.save(user);
        return user;
    }
}
