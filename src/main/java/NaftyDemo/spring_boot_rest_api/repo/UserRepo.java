package NaftyDemo.spring_boot_rest_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import NaftyDemo.spring_boot_rest_api.model.User;


public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);    
} 
