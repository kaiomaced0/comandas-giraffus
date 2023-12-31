package k.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Comanda extends EntityClass {

    private String nome;

    @OneToMany
    @JoinColumn(name = "lista_pedido_comanda")
    private List<Pedido> pedidos;

    private Double preco;

    private Boolean finalizada;

    @OneToOne
    @JoinColumn(name = "comanda_pagamento")
    private Pagamento pagamento;

    @ManyToOne
    @JoinColumn(name = "atendente_comanda")
    private Usuario atendente;

    private Boolean taxaServico;

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Boolean getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(Boolean taxaServico) {
        this.taxaServico = taxaServico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Boolean getFinalizada() {
        return finalizada;
    }

    public void setFinalizada(Boolean finalizada) {
        this.finalizada = finalizada;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Usuario getAtendente() {
        return atendente;
    }

    public void setAtendente(Usuario atendente) {
        this.atendente = atendente;
    }
}
