package com.project1.p1.entity;
import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Posts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int postId;
	int postStatus;
	Date createdAt;
	int Numberoflikes;
	int postedBy;
	public Posts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Posts(int postId, int postStatus, Date createdAt, int numberoflikes, int postedBy) {
		super();
		this.postId = postId;
		this.postStatus = postStatus;
		this.createdAt = createdAt;
		Numberoflikes = numberoflikes;
		this.postedBy = postedBy;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public int getPostStatus() {
		return postStatus;
	}
	public void setPostStatus(int postStatus) {
		this.postStatus = postStatus;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public int getNumberoflikes() {
		return Numberoflikes;
	}
	public void setNumberoflikes(int numberoflikes) {
		Numberoflikes = numberoflikes;
	}
	public int getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(int postedBy) {
		this.postedBy = postedBy;
	}
	@Override
	public String toString() {
		return "Posts [postId=" + postId + ", postStatus=" + postStatus + ", createdAt=" + createdAt
				+ ", Numberoflikes=" + Numberoflikes + ", postedBy=" + postedBy + ", getPostId()=" + getPostId()
				+ ", getPostStatus()=" + getPostStatus() + ", getCreatedAt()=" + getCreatedAt()
				+ ", getNumberoflikes()=" + getNumberoflikes() + ", getPostedBy()=" + getPostedBy() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
