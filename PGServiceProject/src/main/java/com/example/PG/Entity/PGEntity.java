package com.example.PG.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PGEntity {
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Id
	private int id ;
	private String name ;
	private String category ;
	private String imageLink;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PG_id", referencedColumnName = "id")
    List<VideosEntity>  video = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public List<VideosEntity> getVideo() {
		return video;
	}

	public void setVideo(List<VideosEntity> video) {
		this.video = video;
	}


	

}
