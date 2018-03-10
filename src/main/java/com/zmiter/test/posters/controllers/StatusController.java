package com.zmiter.test.posters.controllers;

import com.zmiter.test.posters.responses.Status;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class StatusController {

    @GetMapping(value = "/status")
    @CrossOrigin
    public Status getStatus() {
        return new Status("active");
    }

}
