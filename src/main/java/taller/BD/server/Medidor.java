package taller.BD.server;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Medidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_med")
    private Integer id_med;
    private String serial;
    private String marca;
    private float reg_ini;
    private Date fech_install;

    @ManyToOne
    private Persona soc;

    @OneToMany(mappedBy = "med")
    private Set<Consumos> lecturas;

    ///////////

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getReg_ini() {
        return reg_ini;
    }

    public void setReg_ini(float reg_ini) {
        this.reg_ini = reg_ini;
    }

    public Date getFech_install() {
        return fech_install;
    }

    public void setFech_install(Date fech_install) {
        this.fech_install = fech_install;
    }

    public Medidor() {
    }

    public Medidor(Integer id_medidor, String serial, String marca, float reg_ini, Date fech_install) {
        this.id_med = id_medidor;
        this.serial = serial;
        this.marca = marca;
        this.reg_ini = reg_ini;
        this.fech_install = fech_install;
    }

    public Integer getId_med() {
        return id_med;
    }

    public void setId_med(Integer id_med) {
        this.id_med = id_med;
    }

}
