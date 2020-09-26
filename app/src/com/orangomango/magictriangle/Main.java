package com.orangomango.magictriangle;

import java.io.*;

public class Main{
        public static void main(String[] args) throws IOException{
                System.out.print("Enter triangle lines: ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
                Triangle triangle = new Triangle(Integer.parseInt(reader.readLine()));
                
                triangle.makeTriangle();
        }
}
