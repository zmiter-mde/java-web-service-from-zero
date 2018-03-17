package com.zmiter.test.posters.controllers;

import com.zmiter.test.posters.entity.Poster;
import com.zmiter.test.posters.responses.FileUploadResult;
import com.zmiter.test.posters.service.PosterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@CrossOrigin
@RequestMapping("/posters")
public class PosterController {

    @Autowired
    private PosterServiceImpl posterService;

    @PostMapping
    public FileUploadResult handleFileUpload(@RequestParam("file") MultipartFile file) throws IOException {
        byte[] picture = file.getBytes();
        Poster newPoster = new Poster(file.getOriginalFilename(), picture);
        Poster insertedPoster = posterService.addPoster(newPoster);
        return new FileUploadResult(insertedPoster.getId(), true, "File successfully uploaded");
    }

    @GetMapping("/{id}")
    public Poster getPoster(@PathVariable Integer id) {
        return posterService.getPoster(id);
    }

    @RequestMapping(value = "/image/{id}", method = RequestMethod.GET)
    public void showImage(@PathVariable Integer id, HttpServletResponse response, HttpServletRequest request)
            throws ServletException, IOException {

        Poster poster = posterService.getPoster(id);
        response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
        response.getOutputStream().write(poster.getImage());

        response.getOutputStream().close();
    }

}
