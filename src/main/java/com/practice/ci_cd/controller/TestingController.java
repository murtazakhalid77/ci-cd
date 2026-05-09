package com.practice.ci_cd.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController

@RequestMapping("/api/v1/testing")
public class TestingController {

    @GetMapping("/testing")
    public ResponseEntity<?> testingMyApi() throws Exception {
        HashMap<String, String> response = new HashMap<>();
        response.put("message", "API is working fine");
        return ResponseEntity.ok(response);
    }
}
