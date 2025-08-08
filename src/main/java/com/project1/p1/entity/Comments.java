package com.project1.p1.entity;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int commentId;
	int postId;
	Date createdAt;
	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comments(int commentId, int postId, Date createdAt) {
		super();
		this.commentId = commentId;
		this.postId = postId;
		this.createdAt = createdAt;
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Comments [commentId=" + commentId + ", postId=" + postId + ", createdAt=" + createdAt
				+ ", getCommentId()=" + getCommentId() + ", getPostId()=" + getPostId() + ", getCreatedAt()="
				+ getCreatedAt() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
