package com.gestionressources.gres.Controller;


import com.gestionressources.gres.Model.AuthenticationRequest;
import com.gestionressources.gres.Model.AuthenticationResponse;
import com.gestionressources.gres.Model.RegisterRequest;
import com.gestionressources.gres.Service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
//@CrossOrigin(origins = "chrome-extension://aejoelaoggembcahagimdiliamlcdmfm")
public class AuthenticationController {

  private final AuthenticationService service;

  @PostMapping("/register")
  public ResponseEntity<AuthenticationResponse> register(
      @RequestBody RegisterRequest request
  ) {
    return ResponseEntity.ok(service.register(request));
  }
  @PostMapping("/authenticate")
  public ResponseEntity<AuthenticationResponse> authenticate(
      @RequestBody AuthenticationRequest request
  ) {
    System.out.println("Hello world");
    return ResponseEntity.ok(service.authenticate(request));
  }

  @GetMapping("/authenticate")

  public String getHello(){
    System.out.println("Send Hello");
    return "Hello,World!";
  }


}
