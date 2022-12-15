package taller.BD.server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RestResource(path = "consumos", rel = "consumos")
public interface RepoConsumo extends CrudRepository<Consumos, Integer> {

}
