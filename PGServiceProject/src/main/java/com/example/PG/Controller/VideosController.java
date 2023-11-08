package com.example.PG.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/videos")
public class VideosController {

    //Task
    //GetVideos link by name
    // One to many mapping in pgentity and videos
    // apply pagination of 10 videos at a time
    // download videos
    // get likes or dislike  and views
    //get description
    // get random 10 viedeos for homw screen by sql "Select * from pgdb.videos_entity order by rand() limit 2;"

}
