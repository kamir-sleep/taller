package taller.BD.server;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Solicitudes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_s;
    private String detalle;
    private Date fecha_sol;
    private Boolean atendido;
    public Integer getId_s() {
        return id_s;
    }
    public void setId_s(Integer id_s) {
        this.id_s = id_s;
    }
    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    public Date getFecha_sol() {
        return fecha_sol;
    }
    public void setFecha_sol(Date fecha_sol) {
        this.fecha_sol = fecha_sol;
    }
    public Boolean getAtendido() {
        return atendido;
    }
    public void setAtendido(Boolean atendido) {
        this.atendido = atendido;
    }
    public Solicitudes() {
    }
    public Solicitudes(Integer id_s, String detalle, Date fecha_sol, Boolean atendido) {
        this.id_s = id_s;
        this.detalle = detalle;
        this.fecha_sol = fecha_sol;
        this.atendido = atendido;
    }

    
}
