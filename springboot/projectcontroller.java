package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Project;
import com.example.project.service.ProjectService;
@RestController
public class ProjectController {
@Autowired
private ProjectService service;

@PostMapping("/addProject")
public Project addProject(@RequestBody Project Project) {
    return service.saveProject(Project);
}

@PostMapping("/addProjects")
public List<Project> addProjects(@RequestBody List<Project> Projects) {
    return service.saveProjects(Projects);
}

@GetMapping("/Projects")
public List<Project> findAllProjects() {
    return service.getProjects();
}

@GetMapping("/ProjectById/{id}")
public Project findProjectById(@PathVariable int id) {
    return service.getProjectById(id);
}


@PutMapping("/update")
public Project updateProject(@RequestBody Project Project) {
    return service.updateProject(Project);
}

@DeleteMapping("/delete/{id}")
public String deleteProject(@PathVariable int id) {
    return service.deleteProject(id);
}

}
