package com.example.resptapimdb.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("movies")
public class Movie
{
    @Id
    private String id;
    private String title;
    private String year;
    private String rent;
    private String buy;
    private String poster ;
    private String overview;
    private String backdrop_path;


    public Movie() {
    }

    public Movie(String id, String title, String year, String rent, String buy, String poster, String overview, String backdrop_path) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.rent = rent;
        this.buy = buy;
        this.poster = poster;
        this.overview = overview;
        this.backdrop_path = backdrop_path;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    public String getBuy() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", rent='" + rent + '\'' +
                ", buy='" + buy + '\'' +
                ", poster='" + poster + '\'' +
                ", overview='" + overview + '\'' +
                ", backdrop_path='" + backdrop_path + '\'' +
                '}';
    }
}
