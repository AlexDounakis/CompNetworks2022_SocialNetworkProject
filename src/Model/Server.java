package Model;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

    private Address addr;
    private String Ip;
    private int port;

    private Socket socket;
    private ServerSocket serverSocket;

    // Constructor
    public Server(String Ip , int port){
        this.Ip = Ip;
        this.port = port;
        this.serverSocket = new ServerSocket(port);

        try {
            this.serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
        connect();

    }

    public static void main(String args[]) throws IOException{
        String IP = "127.0.0.1";
        int port = 80;

        new Server(IP , port);
    }

    // connect() ++ functions

    // creates server side socket and accepts connections
    // start thread for each connection
    // serverThread.start()
    public void connect(){

        try{

            while(true){

                Socket socket = serverSocket.accept();
                new serverThread = new Thread(new serverThread(socket))
                    .start();

            }

        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        } finally {
            try {
                // close socket connection
                serverSocket.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }


    }


}