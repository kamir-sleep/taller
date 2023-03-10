package taller.BD.server;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Roles {

    @Id
    @GeneratedValue
    private Integer id;
    private String codigo;
    private String descripcion;
    private Boolean activo;

   @ManyToMany
    Set<Usuario> users;
 
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

   /* public Set<Usuario> getUsers() {
        return users;
    }

    public void setUsers(Set<Usuario> users) {
        this.users = users;
    }
 */
    public Roles() {
        activo=true;
    }

    public Roles(Integer id, String codigo, String descripcion, Boolean activo/*, Set<Usuario> users*/) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.activo = activo;
       // this.users = users;
    }

}
