package com.https.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getMe")
public class HttpsController {
	@GetMapping
    public String hello() {
        return "Amlan Mahapatra";
    }

}
