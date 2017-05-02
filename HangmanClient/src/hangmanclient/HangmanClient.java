/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanclient;

    import java.io.*;
    import java.net.*;
    import java.util.*;
import jdk.management.resource.ResourceType;

/**
 *
 * @author Lollodan
 */
public class HangmanClient {


    

     
    
    public static void main(String argv[]) {
    BufferedReader in = null;
    PrintStream out = null;
    Socket socket = null;
    String outputline = null;
    String message;
    try
    {
    java.io.BufferedReader console = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
    // open a socket connection
    socket = new Socket("10.87.130.152", 5000);
    // Apre i canali I/O
    in = new BufferedReader(
    new InputStreamReader(socket.getInputStream()));
    out = new PrintStream(socket.getOutputStream(), true);
    
    while ((message = console.readLine()) != null) {
        out.println(message);
    }
    out.close();
    in.close();
    }
    catch(Exception e) { System.out.println(e.getMessage());}
    }
    }

    
    

