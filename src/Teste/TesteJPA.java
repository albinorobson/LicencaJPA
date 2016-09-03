/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Classes.ClsParceiro;
import DAO.ClsParceiroDAO;
import java.util.List;

/**
 *
 * @author robson
 */
public class TesteJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      

        ClsParceiroDAO dao = new ClsParceiroDAO();
        List<ClsParceiro> lista = dao.lista();
//        em.getTransaction().begin();
//        em.persist(p);
//        em.getTransaction().commit();
//        em.close(); 
        for (int i=0;i<lista.size();i++)
        {
            System.out.println(lista.get(i));
        }
        //System.out.println(p.getNome_parceiro());
    }
    
}
