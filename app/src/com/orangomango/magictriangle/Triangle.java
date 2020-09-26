package com.orangomango.magictriangle;

public class Triangle{

        private int[][] triangle;
        
        public Triangle(int n){
                this.triangle = new int[(n == 0 ? 1 : n)][];
        }
        
        public int[] getLine(int n){
                return this.triangle[n];
        }
        
        public void makeTriangle(){
                this.triangle[0] = new int[]{1};
                
                for (int i = 1; i < this.triangle.length; i++){
                        this.triangle[i] = makeLine(this.triangle[i-1]);
                }
                
                printTriangle();
        }
        
        public int[] makeLine(int[] line){
                int[] newLine = new int[line.length+1];
                
                for (int i = 0; i < newLine.length; i++){
                        int left = (i == 0) ? 0 : line[i - 1];
                        int right = (i == line.length) ? 0 : line[i];
                        
                        newLine[i] = right+left;
                }
                
                return newLine;
        }
        
        public void printTriangle(){
                StringBuilder builder = new StringBuilder();
                
                for (int i = 0; i < this.triangle.length; i++){
                        for (int x = 0; x < this.triangle.length - i - 1; x ++){
                                builder.append(" ");
                        }
                        
                        for (int x = 0; x < this.getLine(i).length; x++){
                                builder.append(this.getLine(i)[x]).append(" ");
                        }
                        
                        builder.append("\n");
                }
                
                System.out.println(builder.toString());
        }

}
