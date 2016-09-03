/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author robson
 */
@Entity
@Table(name = "parceiro")
public class ClsParceiro implements Serializable {

    //<editor-fold defaultstate="collapsed" desc="Definição das colunas e atributos">
    @Id
    @SequenceGenerator(name = "parceiro_id_parceiro_seq", sequenceName = "parceiro_id_parceiro_seq", allocationSize = 1)
    @GeneratedValue(generator = "parceiro_id_parceiro_seq", strategy = GenerationType.IDENTITY)
    @Column(name = "id_parceiro", nullable = false, columnDefinition = "bigint NOT NULL DEFAULT nextval('parceiro_id_parceiro_seq'::regclass)")
    @PrimaryKeyJoinColumn(name = "parceiro_pkey", referencedColumnName = "id_parceiro")
    private long id_parceiro;
    @Column(name = "nome_parceiro", nullable = false, unique = true, columnDefinition = "character varying")
    private String nome_parceiro;
//</editor-fold>

    public ClsParceiro() {
    }

    /**
     * @return the id_parceiro
     */
    public long getId_parceiro() {
        return id_parceiro;
    }

    /**
     * @param id_parceiro the id_parceiro to set
     */
    public void setId_parceiro(long id_parceiro) {
        this.id_parceiro = id_parceiro;
    }

    /**
     * @return the nome_parceiro
     */
    public String getNome_parceiro() {
        return nome_parceiro;
    }

    /**
     * @param nome_parceiro the nome_parceiro to set
     */
    public void setNome_parceiro(String nome_parceiro) {
        this.nome_parceiro = nome_parceiro;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (int) (this.id_parceiro ^ (this.id_parceiro >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClsParceiro other = (ClsParceiro) obj;
        if (this.id_parceiro != other.id_parceiro) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClsParceiro{" + "id_parceiro=" + id_parceiro + ", nome_parceiro=" + nome_parceiro + '}';
    }

    

}
