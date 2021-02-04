package com.orangomango.magictriangle;

import java.io.*;

public class Main{
        public static void main(String[] args) throws IOException{
                if (args.length >= 1){
                  Triangle triangle = new Triangle(Integer.parseInt(args[0]));
                  triangle.makeTriangle();
                }
                else {
                  System.out.print("Enter triangle lines: ");
                  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                  Triangle triangle = new Triangle(Integer.parseInt(reader.readLine()));
                  triangle.makeTriangle();
                }    
        }
}
