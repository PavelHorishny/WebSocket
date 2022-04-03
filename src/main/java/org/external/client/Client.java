package org.external.client;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;

public class Client extends WebSocketClient {
    public Client(URI serverUri) {
        super(serverUri);

    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
        System.out.println("connected :"+getURI());
    }

    @Override
    public void onMessage(String s) {
        System.out.println("Server answered :"+s);

    }

    @Override
    public void onClose(int i, String s, boolean b) {

    }

    @Override
    public void onError(Exception e) {

    }

}
