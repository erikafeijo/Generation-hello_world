package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Meus Objetivos da Semana")
public class MeusObjetivosdaSemanaController {
	
	@GetMapping
    public String MeusObejtivosdaSemana() {
        return "Meus objetivos para essa semana são: <br><br>"
                + "<br><li>Concluir JAVA com meu grupo de estudo<br><li>"
                + "<br><li>Organizar meus estudos de inglês<br><br>"
                + "<li>Ficar mais com minhas filhas<br><li>"
                + "<br><li>Organizar meu currículo<br><li>";
	}
}
