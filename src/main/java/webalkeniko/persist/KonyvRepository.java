package webalkeniko.persist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import webalkeniko.model.Konyv;

@Repository
public interface KonyvRepository extends CrudRepository<Konyv, Integer> {

}
