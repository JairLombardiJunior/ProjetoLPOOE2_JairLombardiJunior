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
    private int idAlug;
    
    @Column(nullable = false, precision = 2)
    private double precoPorDia;
    
    @Column(nullable = false, length = 400)
    private String comentario;
    
    @Column(nullable = false, length = 20)
    private Calendar dataDeDevolucao;
    
    /*
    @OneToMany(mappedBy = "Alugamento")
    private List<Cd> cd;
    */
    @ManyToOne
    @JoinColumn(name = "adAlug")
    private Cd cd;
    
    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    public int getIdAlug() {
        return idAlug;
    }

    public void setIdAlug(int idAlug) {
        this.idAlug = idAlug;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Calendar getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public void setDataDeDevolucao(Calendar dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public Cd getCd() {
        return cd;
    }

    public void setCd(Cd cd) {
        this.cd = cd;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
