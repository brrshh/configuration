package by.bel.init;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import by.bel.domain.City;
import by.bel.repo.CityRepositories;

@Component
public class DBInitialaizer {

  private final static org.slf4j.Logger log = LoggerFactory.getLogger(DBInitialaizer.class);

  @Autowired
  private CityRepositories cityRepositories;

  @Value("${init.db}")
  private String init;

  @Value("${dump.file.path}")
  private String dumpPath;

  @Autowired
  Environment env;

  public void initDB() throws URISyntaxException, IOException {
    log.info(getClass().getSimpleName() + " initialize = " + init + ", dump path =" + dumpPath);
    long counter = cityRepositories.count();
    if (0L >= cityRepositories.count()) {
      Path path = Paths.get(getClass().getClassLoader().getResource(dumpPath).toURI());
      log.info("File exist = " + Paths.get(getClass().getClassLoader().getResource(dumpPath).toURI()).toFile().exists());

      Stream<String> lines = Files.lines(path, Charset.forName("UTF-8"));
      ObjectMapper m = new ObjectMapper();

      long citySaverCounter = lines.map(line -> StringUtils.remove(line, "_"))
          .map(line -> {
            try {
              return m.readValue(line, City.class);
            } catch (IOException e) {
              throw new RuntimeException("Error parsing value;-|" + line + "|-");
            }
          }).peek(cityRepositories::save)
          .count();

      log.info("||||||||___ DB init finish succes, saved objects counter =" + counter);

    } else {
      log.info("Database already init");
    }
  }
}
