package org.external.client;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException, InterruptedException {
        Client c = new Client(new URI("ws://localhost:8887"));
        c.connect();
        Thread.sleep(5000);
        c.send("Peter Peterson");
        Thread.sleep(5000);
        c.close();
    }
}
