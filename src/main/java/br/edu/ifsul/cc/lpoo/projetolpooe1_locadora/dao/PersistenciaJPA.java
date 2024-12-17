/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.projetolpooe1_locadora.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import model.Alugamento;
import model.Cd;
import model.Cliente;

/**
 *
 * @author Camargo
 */
public class PersistenciaJPA implements InterfaceBD{
    EntityManager entity;
    EntityManagerFactory factory;

    public PersistenciaJPA() {
        //parametro: é o nome da unidade de persistencia (Persistence Unit)
        factory
                = Persistence.createEntityManagerFactory("pu_lpoo_locadora");
        //conecta no bd e executa a estratégia de geração.
        entity = factory.createEntityManager();
    }

    @Override
    public Boolean conexaoAberta() {

        return entity.isOpen();
    }

    @Override
    public void fecharConexao() {
        entity.close();
    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void persist(Object o) throws Exception {
        entity = getEntityManager();
        try {
            entity.getTransaction().begin();
            entity.persist(o);
            entity.getTransaction().commit();
        } catch (Exception e) {
            if (entity.getTransaction().isActive()) {
                entity.getTransaction().rollback();
            }
        }
    }

    @Override
    public void remover(Object o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /*
    Todos os métodos agora chamam getEntityManager() 
    para garantir que o EntityManager esteja sempre aberto e 
    pronto para uso.
     */
    public EntityManager getEntityManager() {
        if (entity == null || !entity.isOpen()) {
            entity = factory.createEntityManager();
        }
        return entity;
    }
    
    // funções para listar dados 
    public List<Alugamento> getAlugamentos() {
        entity = getEntityManager();

        try {
            TypedQuery<Alugamento> query
                    = entity.createQuery("Select a from Alugamento a", Alugamento.class);
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar Pessoas: " + e);
            return null;
        }

    }
    
    
    public List<Cliente> getClientes() {
        entity = getEntityManager();

        try {
            TypedQuery<Cliente> query
                    = entity.createQuery("Select cl from Cliente cl", Cliente.class);
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar Clientes: " + e);
            return null;
        }

    }
    
    public List<Cliente> getClientes(String nome) {
        entity = getEntityManager();

        try {
            TypedQuery<Cliente> query
                    = entity.createQuery("Select cl from Cliente cl where lower(cl.nome) LIKE :n",
                            Cliente.class);
            query.setParameter("n", "%" + nome.toLowerCase() + "%");
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar Clientes: " + e);
            return null;
        }

    }
    
    public List<Cd> getCds() {
        entity = getEntityManager();

        try {
            TypedQuery<Cd> query
                    = entity.createQuery("Select cd from Cd cd", Cd.class);
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar Pessoas: " + e);
            return null;
        }

    }
    /* ??? 
    public List<Cd> getCds(String titulo) {
        entity = getEntityManager();

        try {
            TypedQuery<Cd> query
                    = entity.createQuery("Select cd from Cd cd where lower(cd.titulo) LIKE :n",
                            Cliente.class);
            query.setParameter("n", "%" + titulo.toLowerCase() + "%");
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar Clientes: " + e);
            return null;
        }

    }*/
    
    /*
    public List<Cd> getCds() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Cd> query
                    = em.createQuery("SELECT cd FROM Cd cd", Cd.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    
    }*/
    
}
