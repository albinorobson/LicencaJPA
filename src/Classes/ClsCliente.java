
package Classes;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Check;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author robson
 */
@Entity
@Table(name="cliente")
public class ClsCliente implements Serializable{
    
//  id_cliente bigint NOT NULL DEFAULT nextval('cliente_id_cliente_seq'::regclass),
//  nome character varying NOT NULL,
//  serial_number_hd character varying,
//  dt_last_verify timestamp without time zone,
//  atualizado boolean NOT NULL DEFAULT true,
//  cnpj cnpj,
//  data_criado timestamp without time zone NOT NULL DEFAULT now(),
//  nome_parceiro character varying,
//  CONSTRAINT cliente_pkey PRIMARY KEY (id_cliente),
//  CONSTRAINT cliente_nome_parceiro_fkey FOREIGN KEY (nome_parceiro)
//  REFERENCES public.parceiro (nome_parceiro) MATCH SIMPLE
//  ON UPDATE CASCADE ON DELETE RESTRICT,
//  CONSTRAINT cliente_serial_number_hd_check CHECK (length(serial_number_hd::text) > 10)
    @Id
    @SequenceGenerator(name = "cliente_id_cliente_seq", sequenceName = "cliente_id_cliente_seq", allocationSize = 1)
    @GeneratedValue(generator = "cliente_id_cliente_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_cliente", nullable = false, columnDefinition = "bigint NOT NULL DEFAULT nextval('cliente_id_cliente_seq'::regclass)")
    @PrimaryKeyJoinColumn(name = "cliente_pkey", referencedColumnName = "id_parceiro")
    private long id_cliente;
    @Column(columnDefinition = "character varying",nullable = false)
    private String nome;
    @Column(columnDefinition = "character varying")
    @Check(constraints = "cliente_serial_number_hd_check CHECK (length(serial_number_hd::text) > 10)")
    String serial_number_hd;
    @Column(columnDefinition = "timestamp without time zone")
    private Calendar dt_last_verify;
    @Column(columnDefinition = "boolean NOT NULL DEFAULT true",nullable = false)
    private boolean atualizado;
    @Column(columnDefinition = "cnpj")
    private String cnpj;
    @Column(columnDefinition = "timestamp without time zone DEFAULT now()")
    private Calendar data_criado;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "nome_parceiro",referencedColumnName = "nome_parceiro",nullable = true,insertable = true) 
    @ForeignKey(name = "cliente_nome_parceiro_fkey")
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

    public Calendar getDt_last_verify() {
        return dt_last_verify;
    }

    public void setDt_last_verify(Calendar dt_last_verify) {
        this.dt_last_verify = dt_last_verify;
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

    public Calendar getData_criado() {
        return data_criado;
    }

    public void setData_criado(Calendar data_criado) {
        this.data_criado = data_criado;
    }

    public ClsParceiro getParceiro() {
        return parceiro;
    }

    public void setParceiro(ClsParceiro parceiro) {
        this.parceiro = parceiro;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (this.id_cliente ^ (this.id_cliente >>> 32));
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

    @Override
    public String toString() {
        return "Cls_cliente{" + "id_cliente=" + id_cliente + ", nome=" + nome + ", dt_last_verify=" + dt_last_verify + ", atualizado=" + atualizado + ", cnpj=" + cnpj + ", data_criado=" + data_criado + ", parceiro=" + parceiro + '}';
    }
    
    
    
}
