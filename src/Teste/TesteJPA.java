/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Classes.ClsParceiro;
import DAO.Conexao;
import javax.persistence.EntityManager;

/**
 *
 * @author robson
 */
public class TesteJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        EntityManager em = Conexao.getconexao();
        ClsParceiro p = new ClsParceiro();
        p.setNome_parceiro("Teste");
        //p.setIso("CHI");
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close(); 
    }
    
}
