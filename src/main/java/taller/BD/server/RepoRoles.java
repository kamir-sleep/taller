package taller.BD.server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
@RestResource(path="roles",rel = "roles")
public interface RepoRoles extends CrudRepository<Roles,Integer>{
    
}
