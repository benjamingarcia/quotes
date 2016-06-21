package org.benji.quotes.repositories;

import org.benji.quotes.model.Yoda;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Project : quotes
 * Created by benjaming on 21/06/2016.
 */
@Repository
public interface YodaRepositories extends MongoRepository<Yoda, String> {

    List<Yoda> findByMovie(String movie, Pageable pageable);
}
