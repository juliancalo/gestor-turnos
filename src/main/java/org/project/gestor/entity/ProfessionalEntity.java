package org.project.gestor.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "professionals")
public class ProfessionalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @OneToMany(mappedBy = "professional", cascade = CascadeType.ALL)
    private List<ServiceEntity> serviceList;

    private String availableDays; // Días disponibles en formato "Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo"
}
