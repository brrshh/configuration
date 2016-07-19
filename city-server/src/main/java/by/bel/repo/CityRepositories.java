package by.bel.repo;

import by.bel.domai.City;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Barys_Shliaha on 18-Jul-16.
 */

@RepositoryRestResource(path = "city")
public interface CityRepositories extends MongoRepository<City, Long> {
}
