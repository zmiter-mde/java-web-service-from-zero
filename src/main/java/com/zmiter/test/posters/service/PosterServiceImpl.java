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

    public Poster addPoster(Poster poster) {
        System.out.println("Id before insert: " + poster.getId());
        int rowsAffected = posterMapper.insertPoster(poster);
        System.out.println("Rows affected: " + rowsAffected);
        System.out.println("Id after insert: " + poster.getId());
        return poster;

    }

    public Poster getPoster(Integer id) {
        return posterMapper.getPoster(id);
    }

    public List<Poster> getAllPosters() {
        return posterMapper.getAllPosters();
    }

}
