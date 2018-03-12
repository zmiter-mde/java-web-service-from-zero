package com.zmiter.test.posters.service;

import com.zmiter.test.posters.entity.Poster;
import com.zmiter.test.posters.persistence.PosterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PosterServiceImpl implements PosterService {

    @Autowired
    private PosterMapper posterMapper;

    public void addPoster(Poster poster) {
        posterMapper.insertPoster(poster);
    }

    public Poster getPoster(Integer id) {
        return posterMapper.getPoster(id);
    }

    public List<Poster> getAllPosters() {
        return posterMapper.getAllPosters();
    }

}
