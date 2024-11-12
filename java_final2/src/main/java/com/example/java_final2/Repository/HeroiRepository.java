package com.example.java_final2.Repository;

import com.example.java_final2.Model.Heroi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroiRepository extends JpaRepository<Heroi, Long> {
    // Aqui podemos adicionar métodos personalizados, se necessário
}
