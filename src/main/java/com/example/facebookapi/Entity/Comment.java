package com.example.facebookapi.Entity;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID commentID;

	private UUID postID;
	private String userID;

	private String userImage;
	private String userName;

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	private String comment;
	private Timestamp timestamp;

	public Comment() {
		super();
	}

	public Comment(UUID commentID, UUID postID, String userID, String userImage, String userName, String comment,
			Timestamp timestamp) {
		super();
		this.commentID = commentID;
		this.postID = postID;
		this.userID = userID;
		this.userImage = userImage;
		this.userName = userName;
		this.comment = comment;
		this.timestamp = timestamp;
	}

	public UUID getCommentID() {
		return commentID;
	}

	public void setCommentID(UUID commentID) {
		this.commentID = commentID;
	}

	public UUID getPostID() {
		return postID;
	}

	public void setPostID(UUID postID) {
		this.postID = postID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

}
