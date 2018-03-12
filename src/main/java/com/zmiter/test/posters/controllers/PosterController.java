package com.zmiter.test.posters.controllers;

import com.zmiter.test.posters.entity.Poster;
import com.zmiter.test.posters.responses.FileUploadResult;
import com.zmiter.test.posters.service.PosterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin
@RequestMapping("/posters")
public class PosterController {

    @Autowired
    private PosterServiceImpl posterService;

    @PostMapping
    public FileUploadResult handleFileUpload(@RequestParam("file") MultipartFile file) {
        posterService.addPoster(new Poster(file.getOriginalFilename()));
        return new FileUploadResult(true, "File successfully uploaded");
    }

    @GetMapping("/{id}")
    public Poster getPoster(@PathVariable Integer id) {
        return posterService.getPoster(id);
    }





}
