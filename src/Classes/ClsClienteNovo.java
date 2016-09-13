package Classes;

import java.io.Serializable;
import java.util.Date;

public class ClsClienteNovo implements Serializable {

    private String codigo;
    private Date vencimento;
    private int nro_licenca;
    private long id_cliente_novo;
    private ClsCliente cliente;

    public ClsClienteNovo() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public int getNro_licenca() {
        return nro_licenca;
    }

    public void setNro_licenca(int nro_licenca) {
        this.nro_licenca = nro_licenca;
    }

    public long getId_cliente_novo() {
        return id_cliente_novo;
    }

    public void setId_cliente_novo(long id_cliente_novo) {
        this.id_cliente_novo = id_cliente_novo;
    }

    public ClsCliente getCliente() {
        return cliente;
    }

    public void setCliente(ClsCliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.id_cliente_novo ^ (this.id_cliente_novo >>> 32));

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
        final ClsClienteNovo other = (ClsClienteNovo) obj;
        if (this.id_cliente_novo != other.id_cliente_novo) {
            return false;
        }
        return true;
    }

}
