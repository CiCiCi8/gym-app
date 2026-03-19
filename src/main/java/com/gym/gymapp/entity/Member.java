package com.gym.gymapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;

    @ManyToOne
    private Membership membership;

    @ManyToMany
    private List<WorkoutPlan> plans;

    @ManyToMany
    private List<GroupClass> classes;
}