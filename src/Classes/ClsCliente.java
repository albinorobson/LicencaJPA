package Classes;

import java.io.Serializable;
import java.util.Date;

public class ClsCliente implements Serializable {

    private long id_cliente;
    private String nome;
    private String serial_number_hd;
    private Date dtlastverify;
    private boolean atualizado;
    private String cnpj;
    private Date datacriado;
    private ClsParceiro parceiro;

    public ClsCliente() {
    }

    public long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerial_number_hd() {
        return serial_number_hd;
    }

    public void setSerial_number_hd(String serial_number_hd) {
        this.serial_number_hd = serial_number_hd;
    }

    public Date getDtlastverify() {
        return dtlastverify;
    }

    public void setDtlastverify(Date dtlastverify) {
        this.dtlastverify = dtlastverify;
    }

    public boolean isAtualizado() {
        return atualizado;
    }

    public void setAtualizado(boolean atualizado) {
        this.atualizado = atualizado;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Date getDatacriado() {
        return datacriado;
    }

    public void setDatacriado(Date datacriado) {
        this.datacriado = datacriado;
    }

    public ClsParceiro getParceiro() {
        return parceiro;
    }

    public void setParceiro(ClsParceiro parceiro) {
        this.parceiro = parceiro;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (int) (this.id_cliente ^ (this.id_cliente >>> 32));
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
        final ClsCliente other = (ClsCliente) obj;
        if (this.id_cliente != other.id_cliente) {
            return false;
        }
        return true;
    }
    
}
