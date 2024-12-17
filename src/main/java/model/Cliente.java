/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Camargo
 */
@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable{
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    //@Column(name = "cliente_id")
    private int cpf;
    
    @Column(nullable = false, length = 37)
    private String nome;
    
    @Column(nullable = false, length = 13)
    private String fone;
    
    @Column(nullable = false, length = 400)
    private String endereço;

    public Cliente() {
    }
    
    /*
    @OneToMany(mappedBy = "pessoa")
    private List<Alugamento> listaAlugamento;
    */
    
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }
    
            
    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    /*
    public Alugamento getAlugamento() {
        return alugamento;
    }

    public void setAlugamento(Alugamento alugamento) {
        this.alugamento = alugamento;
    }
    
    public void addAlugamento(Alugamento a){
        listaAlugamento.add(a);
    }
    
    public List<Alugamento> getListaAlugamento() {
        return listaAlugamento;
    }*/

    @Override
    public String toString() {
        return nome;
    }
    
    
    
}
