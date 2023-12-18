package app.web.controller;

import app.web.model.User;
import app.web.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/create")
    public String addUser(Model model) {
        model.addAttribute("create", new User());
        return "create";
    }

    @PostMapping("/user/update")
    public void updateUser(User user1, User user2) {
        userService.updateUser(user1, user2);
    }

    @GetMapping("/")
    public String listUsers(Model model) {
        List<User> users = userService.listUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/user/find")
    public void findById(Long id) {
        userService.findById(id);
    }

    @GetMapping("/user/delete")
    public void removeUser(User user) {
        userService.removeUser(user);
    }

}
