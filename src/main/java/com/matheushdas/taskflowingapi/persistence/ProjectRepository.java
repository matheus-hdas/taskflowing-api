package com.matheushdas.taskflowingapi.persistence;

import com.matheushdas.taskflowingapi.model.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProjectRepository extends JpaRepository<Project, UUID> {}
