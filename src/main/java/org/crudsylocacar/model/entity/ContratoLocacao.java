package org.crudsylocacar.model.entity;

import java.util.Date;
import java.util.List;

public class ContratoLocacao {
    private Long id;
    private Date dataLocacao;
    private float dataDevolucao;
    private float valorCaucao;
    private float valorTotal;
    private String status;
    private List<Ocorrencia> ocorrenciaList;
    private List<Veiculo> veiculoList;
}
