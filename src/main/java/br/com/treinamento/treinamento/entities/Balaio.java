package br.com.treinamento.treinamento.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "BALAIO")
public class Balaio implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "BALAIO_ID_SEQ")
    @SequenceGenerator(name = "BALAIO_ID_SEQ", sequenceName = "BALAIO_ID_SEQ",allocationSize=1)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private MaterialEntity material;

    @Column(name = "COR")
    private String cor;

    @Column(name = "TAMANHO")
    private Double tamanho;

    @Column(name = "LARGURA")
    private Double largura;

    @Column(name = "COMPRIMENTO")
    private Double comprimento;

    @Column(name = "VOLUME")
    private BigDecimal volume;

}
