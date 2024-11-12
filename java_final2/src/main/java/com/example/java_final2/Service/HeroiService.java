package com.example.java_final2.Service;

import com.example.java_final2.Model.Heroi;
import com.example.java_final2.Repository.HeroiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HeroiService {

    @Autowired
    private HeroiRepository heroiRepository;

    public Heroi findById(Long id) {
        Optional<Heroi> heroi = heroiRepository.findById(id);
        return heroi.orElse(null);
    }

    public Heroi updateHeroi(Long id, int usoXp, String atributo) {
        Heroi heroi = findById(id);
        if (heroi == null) return null;

        switch (atributo.toLowerCase()) {
            case "dano":
                heroi.addDano(usoXp);
                break;
            case "vida":
                heroi.addVida(usoXp);
                break;
            case "velocidade":
                heroi.addVelocidade(usoXp);
                break;
            default:
                return null;
        }

        return heroiRepository.save(heroi);
    }
}
