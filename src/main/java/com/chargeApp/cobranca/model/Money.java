package com.chargeApp.cobranca.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
public class Money {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotEmpty(message = "* Descrição é obrigatoria")
    @Size(max = 60, message = "* A descrição nao pode ter mais que 60 caracteres.")
    private String descricao;

    @NotNull(message = "* Valor nao pode ser nulo")
    @DecimalMin(value = "0.01", message = "* Valor nao pode ser menor que 0,01")
    @DecimalMax(value = "9999999999.99", message = "* Valor nao pode ser maior que 9.999.999.999,99")
    @NumberFormat(pattern = "#,##0.00")
    private BigDecimal money;


}
