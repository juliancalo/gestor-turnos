package org.project.gestor.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.project.gestor.enums.Category;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class LocalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Category category;
    private String address;
    private String email;
    private String phone;
    private LocalDateTime officeHours;

    @ManyToOne
    private UserEntity user;
}