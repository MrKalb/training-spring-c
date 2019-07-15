package br.com.treinamento.treinamento.services;

import br.com.treinamento.treinamento.dto.BalaioDTO;
import br.com.treinamento.treinamento.entities.Balaio;
import br.com.treinamento.treinamento.entities.MaterialEntity;
import br.com.treinamento.treinamento.repository.BalaioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class BalaioService {

    @Autowired
    private BalaioRepository repository;

    public void createBalaio(BalaioDTO balaio) {
        Balaio balaioEntity = new Balaio();
        createEntity(balaio, balaioEntity);
        repository.save(balaioEntity);
    }

    private void createEntity(BalaioDTO balaio, Balaio balaioEntity) {
        balaioEntity.setCor(balaio.getCor());
        balaioEntity.setComprimento(balaio.getComprimento());
        balaioEntity.setLargura(balaio.getLargura());
        balaioEntity.setTamanho(balaio.getTamanho());
        Double volume = balaio.getLargura() * balaio.getTamanho() * balaio.getComprimento();
        balaioEntity.setVolume(BigDecimal.valueOf(volume));
        MaterialEntity material = new MaterialEntity();
        material.setTipo(balaio.getMaterial().getTipo());
        balaioEntity.setMaterial(material);
    }

}
