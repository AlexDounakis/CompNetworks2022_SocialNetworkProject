package Threads;

import java.io.*;
import java.net.*;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;
import org.graalvm.compiler.core.GraalCompiler.Request;
import org.graalvm.compiler.nodes.memory.address.AddressNode.Address;


public class serverThread() extends Thread {

    // DTO -- serializable obj to pass through the other side
    //private Request req;
    // public PublisherHandler(Request _req){
    //            this.req = _req;
    //        }
    public serverThread(){}

    @Override
    public void run(){
        ObjectInputStream service_in;
        ObjectOutputStream servicse_out;

        try{
            Socket se



        }catch(IOException e){
            e.printStackTrace();
        }
    }

}