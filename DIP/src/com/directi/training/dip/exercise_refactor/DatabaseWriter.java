package com.directi.training.dip.exercise_refactor;

import java.io.IOException;


public class DatabaseWriter implements IWriter {
  private final MyDatabase database;
  
  public DatabaseWriter(MyDatabase database) {
      this.database = database;
  }
  
  @Override
  public void write(String data) throws IOException {
      database.write(data);
  }
}
