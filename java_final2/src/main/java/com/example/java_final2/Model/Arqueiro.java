package com.example.java_final2.Model;

import jakarta.persistence.Entity;

@Entity
public class Arqueiro extends Heroi {
    public Arqueiro() {
        setClasse("Arqueiro");
        setDano(65);
        setVida(35);
        setVelocidade(50);
    }
}
