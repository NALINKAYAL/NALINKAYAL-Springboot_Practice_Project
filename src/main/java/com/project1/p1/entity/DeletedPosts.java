package com.project1.p1.entity;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class DeletedPosts {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	int postId;
	int deleteBy;
	Date deletedAt;
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public int getDeleteBy() {
		return deleteBy;
	}
	public void setDeleteBy(int deleteBy) {
		this.deleteBy = deleteBy;
	}
	public Date getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}
	public DeletedPosts(int postId, int deleteBy, Date deletedAt) {
		super();
		this.postId = postId;
		this.deleteBy = deleteBy;
		this.deletedAt = deletedAt;
	}
	public DeletedPosts() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DeletedPosts [postId=" + postId + ", deleteBy=" + deleteBy + ", deletedAt=" + deletedAt + "]";
	}
	
}