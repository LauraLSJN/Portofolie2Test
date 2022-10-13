package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
     //   MatrixGraph directedG=createDirected();
       // directedG.PrintGraph();

        AdjacencyGraph adjDirectedG = createDirectedAdj();
        adjDirectedG.PrintGraph();

               //D... (Shortest Path) Algoritme
               int n = adjDirectedG.Vertices.size();
               ArrayList<Vertex> vlist = adjDirectedG.Vertices;
               boolean[] done = new boolean[n];
               Vertex[] prev = new Vertex[n];
               int [] weight = new int[n];

               Arrays.fill(weight,100000);
               Arrays.fill(done,false);
               weight[0] = 0;
               prev[0] = adjDirectedG.Vertices.get(0);

               Vertex current = null;
               int vægt = 100000;
            for (int i = 0; i <n ; i++) {
             if (weight[i] < vægt &&! done[i] ){
                 current = adjDirectedG.Vertices.get(i);
                 vægt = weight[i];
             }
                //System.out.println("current: " + current);
            }
        System.out.println("current: " + current);

        for (int i = 0; i <n ; i++) {
            System.out.println(i + "  " + done[i] + " " + prev[i] + " " + weight[i]);
        }
    }



    public static AdjacencyGraph createDirectedAdj(){
        AdjacencyGraph newG=new AdjacencyGraph();

        //Laver en ny Vertex med navn
        Vertex Jaw =new Vertex("Jaw");
        Vertex Tan =new Vertex("Tan");
        Vertex Dar =new Vertex("Dar");
        Vertex Mom =new Vertex("Mom");
        Vertex Jeb =new Vertex("Jeb");
        Vertex Zan =new Vertex("Zan");
        Vertex Sal =new Vertex("Sal");

        //tilføjer Vertex til arrayliste
        newG.addVertex(Jaw);
        newG.addVertex(Tan);
        newG.addVertex(Dar);
        newG.addVertex(Mom);
        newG.addVertex(Jeb);
        newG.addVertex(Zan);
        newG.addVertex(Sal);

        //Fra en destination til en anden -> hvor mange containers der bliver flyttet
        //Fra havn Jaw
        newG.addEdge(Jaw,Dar,2000);
        newG.addEdge(Jaw,Mom,2000);

        //Fra havn Tan
        newG.addEdge(Tan,Mom,5000);
        newG.addEdge(Tan,Jeb,7000);
        newG.addEdge(Tan,Dar,3000);
        newG.addEdge(Tan,Zan,2000);
        newG.addEdge(Tan,Sal,7000);

        //Fra havn Dar
        newG.addEdge(Dar,Jaw,3000);
        newG.addEdge(Dar,Jeb,2000);
        newG.addEdge(Dar,Tan,5000);

        //Fra havn Mom
        newG.addEdge(Mom,Jeb,500);
        newG.addEdge(Mom,Sal, 2000);


        newG.addEdge(Jeb,Jeb,0);
        newG.addEdge(Zan,Zan,0);
        newG.addEdge(Sal,Sal,0);

        return newG;
    }

    
}
