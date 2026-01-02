package com.example.productivitysystem.repository;

import com.example.productivitysystem.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
