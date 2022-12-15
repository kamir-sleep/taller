package taller.BD.server;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = " Socios")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 15)
    private String nombre;
    @Column(name = "Ap1", length = 15)
    private String apellidos;
    @Column(name = "Cel", length = 15)
    private String celular;
    @Column(name = "Email")
    private String correo;
    private boolean activo;
    private byte[] foto;
    @Column(name = "fech_nac")
    private Date fech_nacimiento;
    @Column(name = "fech_reg")
    private Date fech_registro;
    private String direccion;

    @OneToOne(cascade = CascadeType.REMOVE, optional = true)
    private Usuario usr;

    @OneToMany(mappedBy = "soc")
    private Set<Medidor> medidor;

    /*
     * @OneToMany(mappedBy = "sol")
     * private Set<Solicitudes> solicitudes;
     */
    ////////////////
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Usuario getUsr() {
        return usr;
    }

    public void setUsr(Usuario usr) {
        this.usr = usr;
    }

    public Set<Medidor> getMedidor() {
        return medidor;
    }

    public void setMedidor(Set<Medidor> medidor) {
        this.medidor = medidor;
    }

    public Date getFech_nacimiento() {
        return fech_nacimiento;
    }

    public void setFech_nacimiento(Date fech_nacimiento) {
        this.fech_nacimiento = fech_nacimiento;
    }

    public Date getFech_registro() {
        return fech_registro;
    }

    public void setFech_registro(Date fech_registro) {
        this.fech_registro = fech_registro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Persona(Integer id, String nombre, String apellidos, String celular, String correo, boolean activo,
            String foto, Date fech_nacimiento, Date fech_registro, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.correo = correo;
        this.activo = activo;

        this.fech_nacimiento = fech_nacimiento;
        this.fech_registro = fech_registro;
        this.direccion = direccion;
    }

    public Persona() {
    }

}
