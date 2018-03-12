package com.zmiter.test.posters.persistence;

import com.zmiter.test.posters.entity.Poster;

import java.util.List;

public interface PosterMapper {

    List<Poster> getAllPosters();
    int insertPoster(Poster poster);
}
