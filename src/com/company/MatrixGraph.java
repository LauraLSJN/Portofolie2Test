package com.company;

import java.util.Arrays;

public class MatrixGraph {
    //boolean[][] EdgeMatrix;
    int[][]  WeightMatrix;
    String[][] EdgeMatrix2;

    public MatrixGraph(String Vertices){
        /*EdgeMatrix=new boolean[Vertices][Vertices];
        for(int i=0;i<Vertices;i++)
            Arrays.fill(EdgeMatrix[i],false);
        WeightMatrix=new int[Vertices][Vertices];
        for(int i=0;i<Vertices;i++)
            Arrays.fill(WeightMatrix[i],-1);*/

       // EdgeMatrix2=new String[Vertices][Vertices];
    }

    public void addEdge(String from,String to, int weight){
        //EdgeMatrix[from][to]=true;
       // WeightMatrix[from][to]=weight;
    }

    /*public void addUnDirectedEdge(int from,int to, int weight){
        EdgeMatrix[from][to]=true;
        WeightMatrix[from][to]=weight;
        EdgeMatrix[to][from]=true;
        WeightMatrix[to][from]=weight;
    }*/
    public void PrintGraph(){
        for(int i =0; i<10;i++) {
            System.out.println(" Vertex " + i + " is connect to : ");
            for (int j=0;j<10;j++){
                System.out.println(j+" with weight: "+ WeightMatrix[i][j]);

                /*if(EdgeMatrix2[i][j])
                    System.out.println(j+" with weight: "+ WeightMatrix[i][j]);*/
            }
        }
    }
}