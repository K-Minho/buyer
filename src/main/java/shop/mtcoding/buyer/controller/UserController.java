package shop.mtcoding.buyer.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.buyer.model.User;
import shop.mtcoding.buyer.model.UserRepository;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private HttpSession session;

    @GetMapping(value = "joinForm")
    public String joinForm() {
        return "user/joinForm";
    }

    @PostMapping(value = "/join")
    public String join(String username, String password, String email) {
        int result = userRepository.insert(username, password, email);
        if (result == 1) {
            return "user/loginForm";
        } else {
            return "user/joinForm";
        }
    }

    @GetMapping(value = "/loginForm")
    public String login() {
        return "user/loginForm";
    }

    @PostMapping(value = "/login")
    public String login(String username, String password) {
        User user = userRepository.findUserFindByUsernameAndPassword(username, password);
        if (user == null) {
            return "redirect:/loginForm";
        } else {
            session.setAttribute("principal", user); // principal - 인증 주체
            return "redirect:/";
        }
    }

}
