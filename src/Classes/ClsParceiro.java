
package Classes;

import java.io.Serializable;

public class ClsParceiro implements Serializable {

    private long id_parceiro;
    private String nomeparceiro;

    public ClsParceiro() {
    }

    public long getId_parceiro() {
        return id_parceiro;
    }

    public void setId_parceiro(long id_parceiro) {
        this.id_parceiro = id_parceiro;
    }

    public String getNomeparceiro() {
        return nomeparceiro;
    }

    public void setNomeparceiro(String nomeparceiro) {
        this.nomeparceiro = nomeparceiro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.id_parceiro ^ (this.id_parceiro >>> 32));
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
    
}
