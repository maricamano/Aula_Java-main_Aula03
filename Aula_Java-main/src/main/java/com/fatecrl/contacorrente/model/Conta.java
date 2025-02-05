package com.fatecrl.contacorrente.model;

import java.io.Serializable;

public class Conta implements Serializable {
    private Long id;
    private Integer agencia;
    private String numero;
    private String titular;
    private Double saldo;

    public Conta() {
    }

    public Conta(Long id) {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getAgencia() {
        return agencia;
    }
    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        result = prime * result + ((titular == null) ? 0 : titular.hashCode());
        result = prime * result + ((saldo == null) ? 0 : saldo.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Conta other = (Conta) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
            return true;
    }

}
