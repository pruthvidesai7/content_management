package com.cms.Models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity(name="favourites")
@Getter @Setter @NoArgsConstructor
public class Favourite {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="blog_id")
	private Blog blog;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;

	public Favourite(Blog blog, User user) {
		super();
		this.blog = blog;
		this.user = user;
	}
		
}