package org.crudsylocacar.model.entity;

import java.util.Date;

public class Pagamento {
    private Long id;
    private Date data;
    private float valorPago;
    private String formaPagamento;
    private ContratoLocacao contratoLocacao;
}
