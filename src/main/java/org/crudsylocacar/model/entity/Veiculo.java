package org.crudsylocacar.model.entity;

import java.util.Date;
import java.util.List;

public class Veiculo {
    private Long id;
    private String placa;
    private String chassi;
    private Date anoFabricacao;
    private String cor;
    private String status;
    private Marca marca;
    private Modelo modelo;
    private List<Manutencao> manutencaoList;
}
