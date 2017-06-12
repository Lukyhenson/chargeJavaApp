package com.chargeApp.cobranca.model;

<<<<<<< Updated upstream
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Titulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String descricao;

    @Temporal(TemporalType.DATE)
    private Date dataVencimento;

    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    private StatusTitulo titulo;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public StatusTitulo getTitulo() {
        return titulo;
    }

    public void setTitulo(StatusTitulo titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Titulo titulo = (Titulo) o;

        return codigo.equals(titulo.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }
=======
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Titulo {
    private Long codigo;
    private String descricao;
    private BigDecimal valor;
    private Stat
>>>>>>> Stashed changes
}
