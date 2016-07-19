package by.bel.controller;

import by.bel.repo.CityRepositories;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by Barys_Shliaha on 18-Jul-16.
 */
@RestController
@RequestMapping(value = "db/", method = RequestMethod.GET)
public class DbController {

    private Resource dbImport = new ClassPathResource("/db-dump/dump.json");

    @Value("${spring.data.mongodb.database}")
    private String collection = "city-db1";

    public MongoTemplate getMongoTemplate() {
        return mongoTemplate;
    }

    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("rest")
    public String dbRestart() {
        DBCollection cityCollection = mongoTemplate.getDb().getCollection("");
        cityCollection.drop();
        try (Stream<String> stream = Files.lines(Paths.get(dbImport.getURI()))) {
            stream.forEach(s -> cityCollection.insert((DBObject) JSON.parse(s)));
        } catch (IOException e) {
            e.printStackTrace();
            return "Error import data!";
        }

        return "Import fine total city in db = " + cityCollection.count();
    }

    public Resource getDbImport() {
        return dbImport;
    }
}
