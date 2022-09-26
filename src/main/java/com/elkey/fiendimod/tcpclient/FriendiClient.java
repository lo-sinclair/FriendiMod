package com.elkey.fiendimod.tcpclient;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;

import java.io.*;
import java.net.Socket;

public class FriendiClient {
    private final String IP = "127.0.0.1";
    private final int PORT = 8801;
    private Socket socket;
    private BufferedReader input;
    private BufferedWriter output;

    public FriendiClient(){}

    public void start(){
        new FriendiClient();
        new Thread(()-> {
            try {
                socket = new Socket("127.0.0.1", 8801);
                input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                String msg;
                while ( (msg = input.readLine()) != null ) {
                    System.out.println(msg + "\r\n");
                    if(Minecraft.getInstance().player != null)
                        Minecraft.getInstance().player.displayClientMessage(Component.literal(msg), true);
                }

            }catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    /*public FriendiClient getInstance() {
        return instance;
    }*/
}
