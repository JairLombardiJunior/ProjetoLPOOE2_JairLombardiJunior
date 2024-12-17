/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Calendar;
//import java.util.Date;
import javax.persistence.Column;
//import javax.persistence.DiscriminatorColumn;
//import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Camargo
 */
@Entity
@Table(name = "tb_cd")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "tipo_cd", discriminatorType = DiscriminatorType.STRING)
public class Cd implements Serializable{
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int id;
    
    @Column(nullable = false, length = 50)
    private String titulo;
    
    @Column(nullable = false, length = 400)
    private String faixa_etaria;
    
    @Column(nullable = false, length = 200)
    private String tipo;

    public Cd() {
    }
    
    /*
    @Column(nullable = false, precision = 2)
    private double preco;
    
    @ManyToOne
    @JoinColumn(name = "jogo_id")
    private Jogo jogo;
    
    @ManyToOne
    @JoinColumn(name = "filme_id")
    private Filme filme;
    */
    public int getId_commercial() {
        return id;
    }

    public void setId_commercial(int id_commercial) {
        this.id = id_commercial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFaixa_etaria() {
        return faixa_etaria;
    }

    public void setFaixa_etaria(String faixa_etaria) {
        this.faixa_etaria = faixa_etaria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    /*
    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }*/

    @Override
    public String toString() {
        return titulo;
    }
    
    
}
