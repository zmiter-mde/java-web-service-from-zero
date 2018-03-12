package com.zmiter.test.posters.service;

import com.zmiter.test.posters.entity.Poster;

import java.util.List;

public interface PosterService {

    Poster addPoster(Poster poster);

    Poster getPoster(Integer id);

    List<Poster> getAllPosters();

}
