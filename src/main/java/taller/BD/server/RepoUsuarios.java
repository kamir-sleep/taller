package taller.BD.server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RestResource(path = "usuarios", rel = "usuarios")
public interface RepoUsuarios extends CrudRepository<Usuario, String> {

}