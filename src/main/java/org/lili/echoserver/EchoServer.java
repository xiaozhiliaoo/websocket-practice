package org.lili.echoserver;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/echoserver/echo")
public class EchoServer {
    @OnMessage
    public String echo(String incomingMessage) {
        return "I got this (" + incomingMessage + ")" + " so I am sending it back !";
    }
}
