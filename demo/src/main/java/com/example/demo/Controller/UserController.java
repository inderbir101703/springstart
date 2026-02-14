package com.example.demo.Controller;


import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
@Autowired
    UserRepository repo;

@PostMapping
   public Users save(@RequestBody Users rusher){
    System.out.println(rusher);
    return repo.save(rusher);

   }
   @GetMapping
    public List<Users> getAll(){
    return repo.findAll();
   }
}
