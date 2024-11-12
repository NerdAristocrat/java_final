package com.example.java_final2.Model;

import jakarta.persistence.Entity;

@Entity
public class Gigante extends Heroi {
    public Gigante() {
        setClasse("Gigante");
        setDano(65);
        setVida(65);
        setVelocidade(20);
    }
}
