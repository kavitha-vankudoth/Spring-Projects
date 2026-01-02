package com.example.productivitysystem.service;

import com.example.productivitysystem.model.Task;
import com.example.productivitysystem.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task assignTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task taskDetails) {
        Task task = taskRepository.findById(id).orElseThrow();
        task.setTaskName(taskDetails.getTaskName());
        task.setDescription(taskDetails.getDescription());
        task.setStartTime(taskDetails.getStartTime());
        task.setEndTime(taskDetails.getEndTime());
        task.setStatus(taskDetails.getStatus());
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
