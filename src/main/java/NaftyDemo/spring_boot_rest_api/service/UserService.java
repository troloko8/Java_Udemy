package NaftyDemo.spring_boot_rest_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import NaftyDemo.spring_boot_rest_api.model.User;
import NaftyDemo.spring_boot_rest_api.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User save(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        System.err.println(user.getPassword());
        
        repo.save(user);
        return user;
    }
}
