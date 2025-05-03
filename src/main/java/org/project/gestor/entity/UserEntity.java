package org.project.gestor.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.project.gestor.enums.Role;

@Getter
@Setter
@Entity(name="user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @Column(unique = true)
    private String email;
    private String password;
    private Role role;

}
