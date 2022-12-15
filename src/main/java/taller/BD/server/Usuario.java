package taller.BD.server;

import javax.persistence.Entity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Usuario {

    @Id
    @Column(length = 10)
    public String usr;
    @Column(length = 150)
    public String clave;
    @ManyToMany(mappedBy = "users", fetch = FetchType.EAGER)
    Set<Roles> roles;

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

   public Set<Roles> getRoles() {
        return roles;
    }

   public void setRoles(Set<Roles> roles) {
        this.roles = roles;
    }
 
    public Usuario() {
    }

    public Usuario(String usr, String clave , Set<Roles> roles ) {
        this.usr = usr;
        this.clave = clave;
       this.roles = roles;
    }
    @PrePersist
    public void nuevo(){
        clave=new BCryptPasswordEncoder().encode(clave);
        System.out.println("nuevo "+usr+""+clave);
    }
    @PreUpdate
    public void actualizado(){
        clave=new BCryptPasswordEncoder().encode(clave);
        System.out.println("actualizando"+clave+" "+usr);
    }


}
