package com.zmiter.test.posters.persistence;

import com.zmiter.test.posters.entity.Poster;

import java.util.List;

public interface PosterMapper {

    int insertPoster(Poster poster);
    Poster getPoster(Integer id);
    List<Poster> getAllPosters();

}
