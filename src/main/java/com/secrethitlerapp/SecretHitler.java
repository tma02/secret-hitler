package com.secrethitlerapp;

import com.secrethitlerapp.game.GameSession;
import com.secrethitlerapp.ws.SecretHitlerWebSocketServer;
import com.spotify.apollo.Environment;
import com.spotify.apollo.httpservice.HttpService;
import com.spotify.apollo.httpservice.LoadingException;
import com.spotify.apollo.route.Route;
import org.java_websocket.drafts.Draft_6455;

public class SecretHitler {

    public static void main(String[] args) throws LoadingException {
        int port = 1933;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        }
        new SecretHitlerWebSocketServer(port, new Draft_6455()).start();
        // Might not even need HTTP
        HttpService.boot(SecretHitler::init, "secret-hitler-app-service", args);
    }

    public static void init(Environment environment) {
        // Dev
        GameSession session = new GameSession();
        // End dev
        environment.routingEngine()
                .registerAutoRoute(Route.sync("GET", "/", rc -> "Secret Hitler"));
    }

}
