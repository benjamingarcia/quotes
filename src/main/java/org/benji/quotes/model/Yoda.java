package org.benji.quotes.model;

/**
 * Project : quotes
 * Created by benjaming on 21/06/2016.
 */
public class Yoda {

    private String movie;

    private String quotes;

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }

    @Override
    public String toString() {
        return "YodaQuote{" +
                "movie='" + movie + '\'' +
                ", quotes='" + quotes + '\'' +
                '}';
    }
}
