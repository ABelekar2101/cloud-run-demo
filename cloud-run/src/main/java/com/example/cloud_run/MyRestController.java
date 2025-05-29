package com.example.cloud_run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/check")
    public String getSampleData() {
        return "Hello check!";
    }
}
