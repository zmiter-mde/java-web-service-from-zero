package com.zmiter.test.posters.controllers;

import com.zmiter.test.posters.entity.Poster;
import com.zmiter.test.posters.responses.FileUploadResult;
import com.zmiter.test.posters.responses.Status;
import com.zmiter.test.posters.service.PosterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController()
public class PosterUploadController {

    @Autowired
    private PosterServiceImpl posterService;

    @PostMapping("/upload")
    @CrossOrigin
    public FileUploadResult handleFileUpload(@RequestParam("file") MultipartFile file) {
        posterService.addPoster(new Poster("new poster"));
        System.out.println("File persisted!!!");
        System.out.println(file.getOriginalFilename());

        return new FileUploadResult(true, "File successfully uploaded");
    }

    @GetMapping("/dbStatus")
    @CrossOrigin
    public Status checkDBStatus() {
        List<Poster> posters = posterService.getAllPosters();
        return new Status(posters != null && posters.size() > 0 ? "active" : "inactive");
    }

}
