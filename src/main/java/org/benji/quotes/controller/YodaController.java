package org.benji.quotes.controller;

import org.benji.quotes.model.Yoda;
import org.benji.quotes.service.YodaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Project : quotes
 * Created by benjaming on 21/06/2016.
 */
@RestController
public class YodaController {

    @Autowired
    private YodaService service;

    @RequestMapping(value = "/yoda/random")
    public Yoda getrandomYodaQuote() {
        return service.getOneQuote();
    }

    @RequestMapping(value = "/yoda/{movie}")
    public List<Yoda> getYodaQuoteFromMovie(@PathVariable String movie, Pageable pageable) {
        return service.getFromMovie(movie.toLowerCase(), pageable);
    }
}
