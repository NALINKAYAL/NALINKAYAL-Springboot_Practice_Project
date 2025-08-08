package com.project1.p1.entity;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Message {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  int messageId;
	  int senderId;
	  int receiverId;
	  Date sentAt;
	  String messagesent;
	  public Message() {
		super();
		// TODO Auto-generated constructor stub
	  }
	  @Override
	public String toString() {
		return "Message [messageId=" + messageId + ", senderId=" + senderId + ", receiverId=" + receiverId + ", sentAt="
				+ sentAt + ", messagesent=" + messagesent + ", getMessageId()=" + getMessageId() + ", getSenderId()="
				+ getSenderId() + ", getReceiverId()=" + getReceiverId() + ", getSentAt()=" + getSentAt()
				+ ", getMessagesent()=" + getMessagesent() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	  public int getMessageId() {
		return messageId;
	}
	  public void setMessageId(int messageId) {
		  this.messageId = messageId;
	  }
	  public int getSenderId() {
		  return senderId;
	  }
	  public void setSenderId(int senderId) {
		  this.senderId = senderId;
	  }
	  public int getReceiverId() {
		  return receiverId;
	  }
	  public void setReceiverId(int receiverId) {
		  this.receiverId = receiverId;
	  }
	  public Date getSentAt() {
		  return sentAt;
	  }
	  public void setSentAt(Date sentAt) {
		  this.sentAt = sentAt;
	  }
	  public String getMessagesent() {
		  return messagesent;
	  }
	  public void setMessagesent(String messagesent) {
		  this.messagesent = messagesent;
	  }
	  public Message(int messageId, int senderId, int receiverId, Date sentAt, String messagesent) {
		super();
		this.messageId = messageId;
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.sentAt = sentAt;
		this.messagesent = messagesent;
	  }
}
