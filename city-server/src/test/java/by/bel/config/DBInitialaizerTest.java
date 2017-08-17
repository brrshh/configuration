package by.bel.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import by.bel.domain.City;
import by.bel.init.DBInitialaizer;
import by.bel.repo.CityRepositories;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
//@SpringBootTest(properties = {"init.db=true", "dump.file.path=db-dump/dump.json"}, webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ContextConfiguration
@TestPropertySource(properties = {"init.db:true", "dump.file.path:db-dump/dump.json"})
public class DBInitialaizerTest {

  @Autowired
  DBInitialaizer initialaizer;

  @Autowired
  CityRepositories cityRepositories;

  @Test
  public void initDB() throws Exception {
    Mockito.verify(cityRepositories, Mockito.atLeastOnce()).save(Mockito.any(City.class));
  }

//  @Test
//  public void skipInitDB() throws Exception {
//    Mockito.doReturn(1L).when(cityRepositories).count();
//    Mockito.verify(cityRepositories, Mockito.never()).save(Mockito.any(City.class));
//  }

  @TestConfiguration
  static class DBInitialaizerTestConfiguration {

    @MockBean
    CityRepositories cityRepositories;

    @Bean
    public DBInitialaizer i() {
      return new DBInitialaizer();
    }
  }
}