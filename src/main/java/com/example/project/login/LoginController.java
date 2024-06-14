package com.example.project.login;


import java.math.BigInteger;
import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
    private LoginService service;

    @Autowired
    public LoginController(LoginService service) {
        this.service = service;
    }




    @GetMapping("/login")
    public String login() {
        return "login/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("id") String id, @RequestParam("pass") String pass) {
        System.out.println(id);
        System.out.println(pass);
        System.out.println("gkgk");
        return "redirect:/main";
    }

    @GetMapping("/signUp")
    public String signUp() {
        return "register/register";
    }

    @PostMapping("/register")
    public String register(@RequestParam("loginId") String loginId, @RequestParam("loginPw") String loginPw,
                           @RequestParam("loginPwConfirm") String loginPwConfirm, @RequestParam("name") String name
            , @RequestParam("nickname") String nickname,
                           @RequestParam("cellphoneNo") String cellphoneNo) {
        System.out.println("loginId: " + loginId + ", loginPw: " + loginPw +
                ", loginPwConfirm: " + loginPwConfirm + ", name: " + name +
                ", nickname: " + nickname +
                ", cellphoneNo: " + cellphoneNo);

        service.register(new UserEntity(loginId,loginPw,name,nickname,"1",cellphoneNo));
        System.out.println("회원가입 완료!!!");

        return "redirect:/main";
    }


    // CSRF 방지를 위한 상태 토큰 생성 메서드
    private String generateState() {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);
    }

    @GetMapping("/naver")
    public String loginTest() {

        return "/test/naverlogin";
    }

    @GetMapping("/naver_login")
    public String logintest2() {
        return "redirect:/main";
    }


}
