package com.directi.training.dip.exercise_refactor;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    
  public void encode(IReader reader, IWriter writer) throws IOException {
      String data = reader.read();
      String encodedData = Base64.getEncoder().encodeToString(data.getBytes());
      writer.write(encodedData);
  }
}