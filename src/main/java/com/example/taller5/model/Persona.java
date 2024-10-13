package com.example.taller5.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;

    @Column
    @Getter
    @Setter
    private String nombre;

    @Column(name="tel")
    @Getter
    @Setter
    private String telefono;

}
