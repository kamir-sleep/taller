package taller.BD.server;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Facturas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String razonsocial;
    @Column(name = "NIT")
    private Long nit;
    private String periodo;
    private Double monto;
    private Boolean estado;

    @OneToOne(cascade = CascadeType.REMOVE, optional = true)
    private Persona pers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonsocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonsocial = razonSocial;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Facturas() {
    }

    public Facturas(Integer id, String razonSocial, Long nit, String periodo, Double monto, Boolean estado) {
        this.id = id;
        this.razonsocial = razonSocial;
        this.nit = nit;
        this.periodo = periodo;
        this.monto = monto;
        this.estado = estado;
    }

}
