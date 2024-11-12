package com.example.java_final2.Model;

import jakarta.persistence.Entity;

@Entity
public class Guerreiro extends Heroi {
    public Guerreiro() {
        setClasse("Guerreiro");
        setDano(50);
        setVida(50);
        setVelocidade(50);
    }
}
