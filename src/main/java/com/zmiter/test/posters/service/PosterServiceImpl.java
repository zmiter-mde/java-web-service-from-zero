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
        System.out.println("Adding a poster here!!!");
        // Invoke mybatis
    }

    public Poster getPoster(Integer id) {
        System.out.println("Fetching a poster with id = " + id);
        // Invoke mybatis
        return null;
    }

    public List<Poster> getAllPosters() {
        return posterMapper.getAllPosters();
    }

}
