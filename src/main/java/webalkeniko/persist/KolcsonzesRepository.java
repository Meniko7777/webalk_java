package webalkeniko.persist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import webalkeniko.model.Kolcsonzes;

@Repository
public interface KolcsonzesRepository extends CrudRepository<Kolcsonzes, Integer> {

}
