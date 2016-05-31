package com.varentech.deploya_examples;

import com.varentech.deploya_examples.dao.DatabaseInterface;
import com.varentech.deploya_examples.entities.Entries;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Calendar;
import java.util.List;

public class EntriesJdbcTemplate implements DatabaseInterface {

  private DataSource dataSource;
  private JdbcTemplate jdbcTemplateObject;

  public void setDataSource(DataSource ds) {
    this.dataSource = dataSource;
    this.jdbcTemplateObject = new JdbcTemplate(dataSource);
  }

  //TODO: Find a way to insert into a SQLite database
  public void insert(String userName, String fileName, Calendar time, String pathToLocalFile, String pathToDestination, String unpackArguments, String executeArguments) {
  }

  public void createTable() {

  }

  //TODO:  Find a way to select everything from this table and print it out.
  public List<Entries> listEntries() {
    return null;
  }

  //TODO: Find a way to update the Entries table.
  public void update(Entries entries, int id) {

  }
}