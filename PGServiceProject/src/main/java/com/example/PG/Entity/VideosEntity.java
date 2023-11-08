package com.example.PG.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
public class VideosEntity {
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    @Id
   private  int id ;

    private String videoLink ;

    private String  description ;

    private long Views  ;

   private long likes ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String  getDescription() {
        return description;
    }

    public void setDescription(String  description) {
        this.description = description;
    }

    public long getViews() {
        return Views;
    }

    public void setViews(long views) {
        Views = views;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public VideosEntity(int id, String videoLink, String  description, long views, long likes) {
        this.id = id;
        this.videoLink = videoLink;
        this.description = description;
        Views = views;
        this.likes = likes;
    }
}
