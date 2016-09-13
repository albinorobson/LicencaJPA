package Classes;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="cliente")
public class ClsCliente implements Serializable {
    SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    @Id
    @SequenceGenerator(name="cliente_id_cliente_seq",sequenceName = "cliente_id_cliente_seq",allocationSize = 1)
    @GeneratedValue(generator = "cliente_id_cliente_seq",strategy = GenerationType.IDENTITY)
    private long id_cliente;
    private String nome;
    @Column(name="serial_number_hd")
    private String serialnumberhd;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_last_verify")
    private String dtlastverify = dt.format(new Date());
    private boolean atualizado;
    private String cnpj;
    @Temporal(TemporalType.TIMESTAMP)
    private String datacriado = dt.format(new Date());
    @ManyToOne
    @JoinColumn(name="nome_parceiro",referencedColumnName = "nome_parceiro",nullable = false)
    @ForeignKey(name="cliente_nome_parceiro_fkey")
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
        return serialnumberhd;
    }

    public void setSerial_number_hd(String serial_number_hd) {
        this.serialnumberhd = serial_number_hd;
    }

    public String getDtlastverify() {
        return dtlastverify;
    }

    public void setDtlastverify(String dtlastverify) {
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

    public String getDatacriado() {
        return datacriado;
    }

    public void setDatacriado(String datacriado) {
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
