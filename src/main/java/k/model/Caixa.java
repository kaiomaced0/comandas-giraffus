package k.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Caixa extends EntityClass {

    @Column(name = "nome_caixa")
    private String nome;

    @OneToMany
    @JoinColumn(name = "comanda_caixa")
    private List<Comanda> comandas;

    @OneToMany
    @JoinColumn(name = "pagamento_caixa")
    private List<Pagamento> pagamentos;

    private Double valorTotal;

    private LocalDate dataCaixa;

    private String comentario;

    private Boolean fechado;

    
    public Boolean getFechado() {
        return fechado;
    }

    public void setFechado(Boolean fechado) {
        this.fechado = fechado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public List<Comanda> getComandas() {
        return comandas;
    }

    public void setComandas(List<Comanda> comandas) {
        this.comandas = comandas;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getDataCaixa() {
        return dataCaixa;
    }

    public void setDataCaixa(LocalDate dataCaixa) {
        this.dataCaixa = dataCaixa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
