/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Classes.ClsCliente;
import DAO.Conexao;
import javax.persistence.EntityManager;

/**
 *
 * @author Cervantes
 */
public class TestePersisteCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            EntityManager em = Conexao.getconexao();
            ClsCliente c = new ClsCliente();

            c.setNome("Teste");
            c.setCnpj("12345678912345");
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
            em.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
