package com.secrethitlerapp.ws;

import org.java_websocket.WebSocket;
import org.java_websocket.drafts.Draft;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;
import java.util.Collections;

public class SecretHitlerWebSocketServer extends WebSocketServer {

    public SecretHitlerWebSocketServer(int port, Draft draft) {
        super (new InetSocketAddress(port), Collections.singletonList(draft));
    }

    @Override
    public void onOpen(WebSocket webSocket, ClientHandshake clientHandshake) {
        // Connections will probably drop and reconnect since people will be playing on phones
        // Send a unique token to each player on first auth so they can reconnect and rejoin the session
    }

    @Override
    public void onClose(WebSocket webSocket, int code, String reason, boolean remote) {

    }

    @Override
    public void onMessage(WebSocket webSocket, String message) {

    }

    @Override
    public void onError(WebSocket webSocket, Exception exception) {

    }

    @Override
    public void onStart() {

    }

}
