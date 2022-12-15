package taller.BD.server;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Reclamos {

    @Id
    @Column(name = "fech_atencion")
    private Date fech_at;
    @Column(length = 50)
    private String result;

    public Date getFech_at() {
        return fech_at;
    }

    public void setFech_at(Date fech_at) {
        this.fech_at = fech_at;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Reclamos() {
    }

    public Reclamos(Date fech_at, String result) {
        this.fech_at = fech_at;
        this.result = result;
    }

}
