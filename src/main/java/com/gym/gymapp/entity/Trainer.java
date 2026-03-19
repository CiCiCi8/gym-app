package com.gym.gymapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String specialization;

    @OneToMany
    private List<WorkoutPlan> workoutPlans;

    @OneToMany
    private List<GroupClass> groupClasses;
}