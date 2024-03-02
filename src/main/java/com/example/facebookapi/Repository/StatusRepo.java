package com.example.facebookapi.Repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.facebookapi.Entity.Status;

public interface StatusRepo extends JpaRepository<Status, UUID> {

	Status save(Status status);
	ArrayList<Status> findAll();
}
