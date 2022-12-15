package taller.BD.server;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Multas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_m")
    private Integer id_multa;
    private Date fech_vigencia;
    private Float monto;

    public Integer getId_multa() {
        return id_multa;
    }

    public void setId_multa(Integer id_multa) {
        this.id_multa = id_multa;
    }

    public Date getFech_vigencia() {
        return fech_vigencia;
    }

    public void setFech_vigencia(Date fech_vigencia) {
        this.fech_vigencia = fech_vigencia;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public Multas(Integer id_multa, Date fech_vigencia, Float monto) {
        this.id_multa = id_multa;
        this.fech_vigencia = fech_vigencia;
        this.monto = monto;
    }

    public Multas() {
    }

}
