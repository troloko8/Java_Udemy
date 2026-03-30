package NaftyDemo.spring_boot_rest_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import NaftyDemo.spring_boot_rest_api.model.User;
import NaftyDemo.spring_boot_rest_api.model.UserPrincipal;
import NaftyDemo.spring_boot_rest_api.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUsername(username);
        if (user == null) {
            System.err.println("User not found: " + username);
            throw new UsernameNotFoundException("User not found");
        }

        return new UserPrincipal(user);
    }
    
}
