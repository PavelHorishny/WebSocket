package org.external.server;

import org.external.server.data.PersonRepository;
import org.java_websocket.WebSocket;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Collections;

public class WebsocketApi extends WebSocketServer {
    public static void main(String[] args) throws UnknownHostException {
        int port = 8887;
        WebsocketApi ws = new WebsocketApi(port);
        ws.start();
        System.out.println("Server started on port: " + ws.getPort());

    }
    public WebsocketApi(int port) throws UnknownHostException {
        super(new InetSocketAddress(port));
    }

    public WebsocketApi(InetSocketAddress address) {
        super(address);
    }

    public WebsocketApi(int port, Draft_6455 draft) {
        super(new InetSocketAddress(port), Collections.<Draft>singletonList(draft));
    }
    @Override
    public void onOpen(WebSocket webSocket, ClientHandshake clientHandshake) {
        webSocket.send("Welcome to the external WebSocket API server!");

        System.out.println(
                webSocket.getRemoteSocketAddress().getAddress().getHostAddress() + " connected to server");
    }

    @Override
    public void onClose(WebSocket webSocket, int i, String s, boolean b) {
        System.out.println(webSocket + " has disconnected from server!");
    }

    @Override
    public void onMessage(WebSocket webSocket, String s) {
        System.out.println(webSocket + ": " + s);
        //webSocket.send("server responce:"+s);
        PersonRepository pr = new PersonRepository();
        webSocket.send(pr.findPerson(s).toString());

    }

    @Override
    public void onError(WebSocket webSocket, Exception e) {

    }

    @Override
    public void onStart() {
        System.out.println("Server started!");
        setConnectionLostTimeout(0);
        setConnectionLostTimeout(100);
    }
}
