package taller.BD.server;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Consumos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cons;
    @Column(name = "fecha_C")
    private Date fecha;
    private float lectura;
    @ManyToOne
    private Medidor med;

    public int getId_cons() {
        return id_cons;
    }

    public void setId_cons(int id_cons) {
        this.id_cons = id_cons;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getLectura() {
        return lectura;
    }

    public void setLectura(float lectura) {
        this.lectura = lectura;
    }

    public Consumos() {
    }

    public Consumos(int id_cons, Date fecha, float lectura) {
        this.id_cons = id_cons;
        this.fecha = fecha;
        this.lectura = lectura;
    }

}
