package by.bel.controller;

import by.bel.config.CityServerMain;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Barys_Shliaha on 18-Jul-16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(CityServerMain.class)
@WebIntegrationTest({"spring.cloud.config.failFast=false", "spring.data.mongodb.database=0"})
public class DbControllerTest {


    @Autowired
    DbController dbController;

    @Before
    public void bef() {
        this.dbController.setMongoTemplate(Mockito.mock(MongoTemplate.class));
    }


    @Test
    public void dbRestart() throws Exception {
        assertNotNull(dbController.getDbImport());
        assertTrue(dbController.getDbImport().exists());
    }

    @Test
    public void dbRestTest() {
        DB db = (Mockito.when(dbController.getMongoTemplate().getDb()).thenReturn(Mockito.mock(DB.class))).getMock();
        DBCollection col = (Mockito.when(db.getCollection(Mockito.anyString())).thenReturn(Mockito.mock(DBCollection.class))).getMock();
        assertTrue(dbController.dbRestart().contains("Import fine total city in db ="));
    }
}