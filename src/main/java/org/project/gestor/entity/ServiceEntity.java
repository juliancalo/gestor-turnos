package org.project.gestor.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "services")
public class ServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer duration; // en minutos

    private String description; // opcional

    @ManyToOne
    private ProfessionalEntity professional; // referencia al profesional que ofrece el servicio

}
