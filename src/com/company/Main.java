package com.company;

public class Main {

    public static void main(String[] args) {
     //   MatrixGraph directedG=createDirected();
       // directedG.PrintGraph();

        AdjacencyGraph adjDirectedG=createDirectedAdj();
        adjDirectedG.PrintGraph();

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
