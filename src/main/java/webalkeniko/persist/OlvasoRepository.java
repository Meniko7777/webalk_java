package webalkeniko.persist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import webalkeniko.model.Olvaso;

@Repository
public interface OlvasoRepository extends CrudRepository<Olvaso, Integer> {

}
