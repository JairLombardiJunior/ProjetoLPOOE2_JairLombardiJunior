/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Camargo
 */
@Entity
@Table(name = "tb_alugamento")
public class Alugamento implements Serializable{
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int certificacao;
    
    @Column(nullable = false, length = 400)
    private String descricao;
    
    @Column(nullable = false, precision = 2)
    private float preco;

    @JoinColumn(name = "Alugamento_cliente", nullable = true)
    private Cliente cliente;
    
    @JoinColumn(name = "Alugamento_cd", nullable = true)
    private Cd cd;
    
    public Alugamento() {
    }
    /*
    @OneToMany(mappedBy = "Alugamento")
    private List<Cd> cd;
    
    @ManyToOne
    @JoinColumn(name = "adAlug")
    private Cd cd;
    
    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;
    */

    public int getCertificacao() {
        return certificacao;
    }

    public void setCertificacao(int certificacao) {
        this.certificacao = certificacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Cd getCd() {
        return cd;
    }

    public void setVinculoPessoa(Cd cd) {
        this.cd = cd;
    }
    
}
