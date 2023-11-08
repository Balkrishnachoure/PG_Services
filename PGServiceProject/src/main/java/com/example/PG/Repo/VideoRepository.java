package com.example.PG.Repo;

import com.example.PG.Entity.VideosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository  extends JpaRepository<VideosEntity,Integer> {
}
