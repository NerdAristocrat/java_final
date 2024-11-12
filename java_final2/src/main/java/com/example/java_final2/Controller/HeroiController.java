package com.example.java_final2.Controller;

import com.example.java_final2.Model.Heroi;
import com.example.java_final2.Service.HeroiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/herois")
public class HeroiController {

    @Autowired
    private HeroiService heroiService;

    @GetMapping("/{id}")
    public Heroi getHeroi(@PathVariable Long id) {
        return heroiService.findById(id);
    }

    @PutMapping("/{id}")
    public Heroi updateHeroi(@PathVariable Long id, @RequestParam int usoXp, @RequestParam String atributo) {
        return heroiService.updateHeroi(id, usoXp, atributo);
    }
}
