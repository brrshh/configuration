package by.bel.repo;

import by.bel.domain.City;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Barys_Shliaha on 18-Jul-16.
 */

@RepositoryRestResource(path = "cities")
public interface CityRepositories extends MongoRepository<City, Long> {
}
