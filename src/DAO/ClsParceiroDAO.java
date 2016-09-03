/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.ClsParceiro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author robson
 */
public class ClsParceiroDAO {
    
    
    private final EntityManager em = Conexao.getconexao();
    
    public List<ClsParceiro> lista(){
        ClsParceiro p = new ClsParceiro();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<ClsParceiro> c = builder.createQuery(ClsParceiro.class);
        Root r =  c.from(ClsParceiro.class);
        c.select(r);
        c.orderBy(builder.asc(r.get("id_parceiro")));
        return em.createQuery(c).getResultList();
        
       
    }
    
}
