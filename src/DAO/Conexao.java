/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author robson
 */
public class Conexao {

    private static EntityManagerFactory factory = null;
    private static EntityManager em = null;

    public static EntityManager getconexao() {

        if (factory == null) {
            factory = Persistence.createEntityManagerFactory("PostgresModelPU");
        }
        if (em == null) {
            em = factory.createEntityManager();
        }
        return em;
    }
}
