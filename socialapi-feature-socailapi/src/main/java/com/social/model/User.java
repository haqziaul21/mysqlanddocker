package com.social.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Size(min = 2, message = "Atleast must be of two character")
	private String name;

	@NotNull
	@PastOrPresent(message = "Future LocalDate is not allowed")
	private LocalDate birtDate;
	@OneToMany(mappedBy = "user")
	private List<Post> posts = new ArrayList<Post>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirtDate() {
		return birtDate;
	}
	public void setBirtDate(LocalDate birtDate) {
		this.birtDate = birtDate;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birtDate=" + birtDate + ", posts=" + posts + "]";
	}
}
