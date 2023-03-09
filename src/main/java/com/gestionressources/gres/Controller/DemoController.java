package com.gestionressources.gres.Controller;

import com.gestionressources.gres.Model.RegisterRequest;
import com.gestionressources.gres.Model.User;
import com.gestionressources.gres.Service.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin(origins = "http://localhost:3000")
public class DemoController {


  @Autowired
  private UserServices userServices;

//  @GetMapping
//  public ResponseEntity<String> sayHello() {
//    return ResponseEntity.ok("Hello from secured endpoint");
//  }

  @GetMapping
  public List<User> getAllUsers(){
    return userServices.getAllUsers();
  }

  @PostMapping
  public void register(@RequestBody RegisterRequest request){
      userServices.register(request);
  }

  @DeleteMapping("/{id}")
  public void deleteUser(@PathVariable int id){
    userServices.deleteUser(id);
  }
}
