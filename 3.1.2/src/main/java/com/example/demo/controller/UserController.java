package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



    @Controller

    public class UserController {
        private UserService userService;

        public UserController(UserService userService) {
            this.userService = userService;
        }


        @GetMapping(value = "/users")
        public String viewUsers(Model model){
            model.addAttribute("users",userService.getUsersList());
            return "users";
        }

        @GetMapping("/new")
        public String getNewUserForm(Model model) {
            model.addAttribute("user", new User());
            return "new";
        }

        @PostMapping("/new")
        public String addNewUser(@ModelAttribute("user") User user){
            userService.addUser(user);
            return "redirect:/users";
        }

        @GetMapping("/users/{id}")
        public String getFormUserUpdate(Model model,@PathVariable("id") int id){
            model.addAttribute("user",userService.getUserById(id));
            return "edit";
        }

        @PatchMapping("/users/{id}")
        public String updateUser (@ModelAttribute("user") User user,@PathVariable("id")int id){
            userService.updateUser(id,user);
            return "redirect:/users";
        }

        @DeleteMapping("/users/{id}")
        public String deleteUser(@PathVariable("id") int id){
            userService.deleteUser(id);
            return "redirect:/users";
        }
}
