package com.zmiter.test.posters.controllers;

import com.zmiter.test.posters.entities.Status;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class StatusController {

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public Status getStatus() {
        return new Status("inactive");
    }

}
