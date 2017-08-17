package by.bel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

import by.bel.init.DBInitialaizer;
import by.bel.repo.CityRepositories;

@RestController
@RequestMapping("/init")
public class InitController {

  @Autowired
  public CityRepositories cityRepositories;

  @Autowired
  DBInitialaizer dbInitialaizer;

  @RequestMapping(method = RequestMethod.POST)
  public String initDB() throws IOException, URISyntaxException {
    dbInitialaizer.initDB();
    return "succes";
  }

  @RequestMapping(method = RequestMethod.GET)
  public String testDBController() throws IOException, URISyntaxException {
    dbInitialaizer.initDB();
    return "ping ok" + new Date();
  }

}
