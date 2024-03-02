package com.example.facebookapi.Repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.facebookapi.Entity.Comment;

public interface CommentRepo extends JpaRepository<Comment, UUID>{

	Comment save(Comment comment);
	
	ArrayList<Comment> findAllByPostID(UUID postID);
}
