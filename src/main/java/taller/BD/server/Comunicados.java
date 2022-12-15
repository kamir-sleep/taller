package taller.BD.server;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comunicados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descripc;
    private Date fech_inic;
    private Integer vigencia;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripc() {
        return descripc;
    }

    public void setDescripc(String descripc) {
        this.descripc = descripc;
    }

    public Date getFech_inic() {
        return fech_inic;
    }

    public void setFech_inic(Date fech_inic) {
        this.fech_inic = fech_inic;
    }

    public Integer getVigencia() {
        return vigencia;
    }

    public void setVigencia(Integer vigencia) {
        this.vigencia = vigencia;
    }

    public Comunicados() {
    }

    public Comunicados(Integer id, String descripc, Date fech_inic, Integer vigencia) {
        this.id = id;
        this.descripc = descripc;
        this.fech_inic = fech_inic;
        this.vigencia = vigencia;
    }

}
