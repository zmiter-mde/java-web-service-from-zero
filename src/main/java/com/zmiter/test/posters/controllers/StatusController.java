package com.zmiter.test.posters.controllers;

import com.zmiter.test.posters.entity.Poster;
import com.zmiter.test.posters.responses.Status;
import com.zmiter.test.posters.service.PosterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/status")
public class StatusController {

    @Autowired
    private PosterService posterService;

    @GetMapping(value = "/controller")
    public Status getStatus() {
        return new Status("active");
    }

    @GetMapping("/db")
    public Status checkDBStatus() {
        List<Poster> posters = posterService.getAllPosters();
        return new Status(posters != null && posters.size() > 0 ? "active" : "inactive");
    }

}
