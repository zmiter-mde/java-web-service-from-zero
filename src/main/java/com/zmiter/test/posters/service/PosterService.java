package com.zmiter.test.posters.service;

import com.zmiter.test.posters.entity.Poster;

import java.util.List;

public interface PosterService {

    void addPoster(Poster poster);

    Poster getPoster(Integer id);

    List<Poster> getAllPosters();

}
