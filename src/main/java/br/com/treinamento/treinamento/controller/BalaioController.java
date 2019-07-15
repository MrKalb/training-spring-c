package br.com.treinamento.treinamento.controller;

import br.com.treinamento.treinamento.dto.BalaioDTO;
import br.com.treinamento.treinamento.services.BalaioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BalaioController {

    @Autowired
    private BalaioService service;

    @PostMapping("v1/balaio")
    public ResponseEntity<Void> createBalaio(@RequestBody BalaioDTO balio) {
        service.createBalaio(balio);
        return ResponseEntity.ok().build();
    }

}
