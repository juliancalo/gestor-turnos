package org.project.gestor.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.project.gestor.enums.Status;

@Entity
@Getter
@Setter
public class AppointmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String date;
    private String time;
    private Status status;

    @ManyToOne
    private UserEntity user;

    @ManyToOne
    private ProfessionalEntity professional;

    @ManyToOne
    private ServiceEntity service;
}
