package com.project1.p1.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Likes {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  int likeId;
	  int postId;
	  int likedBy;
	  public Likes() {
		  super();
		  // TODO Auto-generated constructor stub
	  }
	  public Likes(int likeId, int postId, int likedBy) {
		super();
		this.likeId = likeId;
		this.postId = postId;
		this.likedBy = likedBy;
	}
	  @Override
	public String toString() {
		return "Likes [likeId=" + likeId + ", postId=" + postId + ", likedBy=" + likedBy + ", getLikeId()="
				+ getLikeId() + ", getPostId()=" + getPostId() + ", getLikedBy()=" + getLikedBy() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	  public int getLikeId() {
		return likeId;
	}
	  public void setLikeId(int likeId) {
		  this.likeId = likeId;
	  }
	  public int getPostId() {
		  return postId;
	  }
	  public void setPostId(int postId) {
		  this.postId = postId;
	  }
	  public int getLikedBy() {
		  return likedBy;
	  }
	  public void setLikedBy(int likedBy) {
		  this.likedBy = likedBy;
	  }
}
