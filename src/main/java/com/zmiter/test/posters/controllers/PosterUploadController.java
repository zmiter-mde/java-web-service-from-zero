package com.zmiter.test.posters.controllers;

import com.zmiter.test.posters.responses.FileUploadResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController()
public class PosterUploadController {

    @PostMapping("/upload")
    @CrossOrigin
    public FileUploadResult handleFileUpload(@RequestParam("file") MultipartFile file) {

        // storageService.store(file); // store file
        System.out.println("File persisted!!!");
        System.out.println(file.getOriginalFilename());

        return new FileUploadResult(true, "File successfully uploaded");
    }

}
