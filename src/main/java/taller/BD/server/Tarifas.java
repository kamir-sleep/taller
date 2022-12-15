package taller.BD.server;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tarifas {
    @Id
    @GeneratedValue
    private Long id;
    private Date fechaInic;
    private Integer consumoMax;
    private Float costoUnit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaInic() {
        return fechaInic;
    }

    public void setFechaInic(Date fechaInic) {
        this.fechaInic = fechaInic;
    }

    public Integer getConsumoMax() {
        return consumoMax;
    }

    public void setConsumoMax(Integer consumoMax) {
        this.consumoMax = consumoMax;
    }

    public Float getCostoUnit() {
        return costoUnit;
    }

    public void setCostoUnit(Float costoUnit) {
        this.costoUnit = costoUnit;
    }

    public Tarifas(Long id, Date fechaInic, Integer consumoMax, Float costoUnit) {
        this.id = id;
        this.fechaInic = fechaInic;
        this.consumoMax = consumoMax;
        this.costoUnit = costoUnit;
    }

    public Tarifas() {
    }

}
