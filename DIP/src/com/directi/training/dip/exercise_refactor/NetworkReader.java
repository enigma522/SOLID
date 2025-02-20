package com.directi.training.dip.exercise_refactor;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkReader implements IReader {
    private final String protocol;
    private final String host;
    private final String file;
    
    public NetworkReader(String protocol, String host, String file) {
        this.protocol = protocol;
        this.host = host;
        this.file = file;
    }
    
    @Override
    public String read() throws IOException {
        URL url = new URL(protocol, host, file);
        StringBuilder content = new StringBuilder();
        try (InputStream in = url.openStream();
             InputStreamReader reader = new InputStreamReader(in)) {
            int c;
            while ((c = reader.read()) != -1) {
                content.append((char) c);
            }
        }
        return content.toString();
    }
}