package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Project;
import com.example.project.repository.ProjectRepo;
@Service
public class ProjectService {
	@Autowired
	private ProjectRepo repository;

	public Project saveProject(Project project) {
		return repository.save(project);
	}

	public List<Project> saveProjects(List<Project> Projects) {
		return repository.saveAll(Projects);
	}

	public List<Project> getProjects() {
		return repository.findAll();
	}

	public Project getProjectById(int id) {
		return repository.findById(id).orElse(null);
	}

	//public Project getProjectByName(String name) {
	//return repository.findByName(name);
	//}

	public String deleteProject(int id) {
		repository.deleteById(id);
		return "Project removed !! " + id;
	}

	 public Project updateProject(Project Project) {
	        Project existingProject = repository.findById(Project.getEmployee_id()).orElse(null);
	        existingProject.setEmployee_id(Project.getEmployee_id());
	        existingProject.setEmployee_name(Project.getEmployee_name());
	        existingProject.setEmployee_age(Project.getEmployee_age());
	        existingProject.setEmployee_place(Project.getEmployee_place());
	        existingProject.setEmployee_salary(Project.getEmployee_salary());
	        return repository.save(existingProject);
	    }

}
