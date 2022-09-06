package com.plat.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
  @GetMapping("/info")
  public Object info() {
    return "ok";
  }

  @GetMapping("/login")
  public Object login() {
    return "ok";
  }

  @GetMapping("/register")
  public Object register() {
    return "register,ok,002";
  }
}
