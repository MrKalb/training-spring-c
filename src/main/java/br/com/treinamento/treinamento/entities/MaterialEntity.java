package br.com.treinamento.treinamento.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "MATERIAL")
public class MaterialEntity implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "MATERIAL_ID_SEQ")
    @SequenceGenerator(name = "MATERIAL_ID_SEQ", sequenceName = "MATERIAL_ID_SEQ",allocationSize=1)
    private Long id;

    @Column(name = "TIPO")
    private String tipo;

}
