package org.benji.quotes.service;

import org.benji.quotes.model.Yoda;
import org.benji.quotes.repositories.YodaRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * Project : quotes
 * Created by benjaming on 21/06/2016.
 */

@Service
public class YodaService {

    @Autowired
    private YodaRepositories repositories;

    public Yoda getOneQuote() {
        long count = repositories.count();
        Random rand = new Random();
        int n = rand.nextInt(Math.toIntExact(count)) + 1;
        List<Yoda> quotes = repositories.findAll();
        return quotes.get(n);
    }


    public List<Yoda> getFromMovie(String movie, Pageable pageable) {
        return repositories.findByMovie(movie, pageable);
    }
}
