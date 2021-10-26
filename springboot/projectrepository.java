package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Project;

public interface ProjectRepo extends JpaRepository<Project,Integer> {

	//Project findByName(String name);

}
