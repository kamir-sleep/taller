package taller.BD.server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RestResource(path = "solicitudes", rel = "solicitudes")
public interface RepoSolicitudes extends CrudRepository<Solicitudes, Integer> {

}
