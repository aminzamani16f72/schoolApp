package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private final BufferedReader bf;

    public Server(int port) throws IOException {

        try (ServerSocket ss=new ServerSocket(port)) {
            Socket s=ss.accept();
            InputStreamReader in = (new InputStreamReader(s.getInputStream()));
            bf=new BufferedReader(in);
        }
    }

    public String receive() throws IOException {
        return bf.readLine();
    }
}

