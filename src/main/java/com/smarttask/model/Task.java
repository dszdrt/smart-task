package com.smarttask.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor



public class Task {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String title;
private String description;
private String status;

@ManyToOne (fetch = FetchType.LAZY)
@JoinColumn(name = "user_id")
private User user;
}
