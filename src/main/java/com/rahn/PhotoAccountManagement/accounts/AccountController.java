package com.rahn.PhotoAccountManagement.accounts;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final Environment env;

    public AccountController(Environment env) {
        this.env = env;
    }

    @GetMapping("/status/check")
    public String status() {
        return "Account Management running... on port:" + env.getProperty("local.server.port");
    }
}
