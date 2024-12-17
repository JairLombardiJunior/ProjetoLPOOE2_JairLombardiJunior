
import br.edu.ifsul.cc.lpoo.projetolpooe1_locadora.dao.PersistenciaJPA;
import java.util.Calendar;
//import java.util.HashSet;
//import java.util.Set;
import model.Cd;
import model.Cliente;
import model.Alugamento;
//import model.Filme;
//import model.Genero_Filme;
//import model.TipoProduto;
//import model.Jogo;
//import model.Pessoa;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Camargo
 */
public class TestePersistenciaLocadora {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistenciaLocadora(){
    }
    
    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testePersistenciaLocadora() {
        Cd c = new Cd();
        c.setTitulo("Friday 14th");
        c.setFaixa_etaria("proibido para menores de 14 anos");
        c.setTipo("Horror");
        
        Cliente cl = new Cliente();
        cl.setNome("Jair");
        cl.setFone("99996666");
        cl.setEndereço("Rua tal, numero 24, A");
        
        Alugamento a = new Alugamento();
        a.setDescricao("Alugamento por duas semanas");
        a.setPreco(5.55f);
        
        a.setCliente(cl);
        a.setCd(c);
        
        
        try{
            jpa.persist(cl);
            jpa.persist(c);
            jpa.persist(a);
            
            jpa.remover(a);
            
        } catch(Exception e){
            System.err.println("Erro ao persistir modelo: "+a);
        }
        
        /*
        Filme f = new Filme();
        f.setDescricao("Filme sobre Corridas illegais no submundo da sociedade");
        f.setGenero_filme(Genero_Filme.ACAO);
        f.setNome("Need for Speed 4");
        f.setDataDeLancamento(Calendar.getInstance());
        f.setPreco(29.50);
        
        
        Jogo j = new Jogo();
        j.setDescricao("Batalha maritima em uma grade de 50x50 blocos");
        j.setGenero_jogo(Genero_Jogo.ESTRATEGIA);
        j.setNome("Batalha Naval");
        j.setDataDeLancamento(Calendar.getInstance());
        j.setPreco(29.50);
        
        
        
        Cd c1 = new Cd();
        c1.setNome("Need for Speed 4");
        c1.setDataDeLancamento(Calendar.getInstance());
        c1.setPreco(29.50);
        //c1.setFilme(f);
        
//      
        
        Cd c2 = new Cd();
        c2.setNome("Batalha Naval");
        c2.setDataDeLancamento(Calendar.getInstance());
        c2.setPreco(29.50);
        //c2.setJogo(j);
        
//        
        Pessoa p = new Pessoa();
        p.setNome("Jonas");
        p.setFone("9966668888");
        p.setEndereço("down the street 9");
        
        Alugamento a = new Alugamento();
        a.setPrecoPorDia(3.99);
        a.setComentario("Alugue aberto do Filme"+ f.getNome()+ "e "+j.getNome());
        a.setDataDeDevolucao(Calendar.getInstance());
        a.setCd(f);
        //a.setCd(j);
        a.setPessoa(p);
        
    
        try{
            jpa.persist(f);
            jpa.persist(j);
            //jpa.persist(c1);
            //jpa.persist(c2);
            jpa.persist(p);
            jpa.persist(a);
            
            
        } catch(Exception e){
            System.err.println("Erro ao persistir entidades");
        }
        */
    }
}
