package com.directi.training.dip.exercise_refactor;

import java.io.IOException;

public class EncodingModuleClient {
  public static void main(String[] args) throws IOException {
      EncodingModule encodingModule = new EncodingModule();
      
      // File encoding scenario
      IReader fileReader = new FileReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
      IWriter fileWriter = new FileWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
      encodingModule.encode(fileReader, fileWriter);
      
      // Network and database scenario
      IReader networkReader = new NetworkReader("http", "myfirstappwith.appspot.com", "/index.html");
      IWriter databaseWriter = new DatabaseWriter(new MyDatabase());
      encodingModule.encode(networkReader, databaseWriter);
  }

}