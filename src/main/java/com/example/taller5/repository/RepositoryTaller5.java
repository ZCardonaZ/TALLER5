package com.example.taller5.repository;

import com.example.taller5.model.Persona;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTaller5 extends JpaRepository<Persona, Long> {

    @Query( value = "SELECT n_ejemplo(:num_ventas) FROM dual", nativeQuery = true)
    String comision( int num_ventas );

    @Query( value = "SELECT asignar_ranking(:puntuacion) FROM dual", nativeQuery = true)
    String rankear(String puntuacion);

}
