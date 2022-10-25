package com.company;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //   MatrixGraph directedG=createDirected();
        // directedG.PrintGraph();

        System.out.println("chris");

        AdjacencyGraph adjDirectedG = createDirectedAdj();
        adjDirectedG.PrintGraph();

        int[] saldo = new int[adjDirectedG.Vertices.size()];
        String[] names = new String[adjDirectedG.Vertices.size()];

        for (Vertex v : adjDirectedG.Vertices) {
            for (Edge e : v.OutEdge) {
                Vertex f = e.from;
                Vertex t = e.to;
                int w = e.weight;

                int idxf = adjDirectedG.Vertices.indexOf(f);
                int idxt = adjDirectedG.Vertices.indexOf(t);
                //System.out.println("before from: "+ saldo[idxf]+" "+"to: "+ saldo[idxt] );
                saldo[idxf] -= w;
                saldo[idxt] += w;
                names[idxf] = v.toString();
                //System.out.println("after from: "+ saldo[idxf]+" "+"to: "+ saldo[idxt] );
                //   System.out.println(v + " " + e.weight);

                //System.out.println(t + " " + saldo[idxt]);
                System.out.println();

            }
        }

        for (int i = 0; i < saldo.length; i++) {
            System.out.println("port: " + names[i] + " surplus: " + saldo[i]);
        }

        //Opgave med minimum cost
        //int [] saldo1 = new int [adjDirectedG.Vertices.size()];
        int[] sPlus = new int[adjDirectedG.Vertices.size()];
        int[] sMinus = new int[adjDirectedG.Vertices.size()];
        int diffPlus;
        int diffMinus;

        for (int i = 0; i < saldo.length; i++) {
            if (saldo[i] > 0) {
                //int [] saldoPlus = new int[saldo[i]];
                sPlus[i] = saldo[i];
                System.out.println(names[i] + " Saldo større end 0: " + sPlus[i]);

                //System.out.println(names[i] + " Saldo større end 0: " + saldo[i]);
                //continue;
                //diffPlus = sPlus[i] - sPlus[i];
                //System.out.println("DIFF: " + diffPlus);
            }

            if (saldo[i] < 0) {
                sMinus[i] = saldo[i];
                System.out.println(names[i] + " Saldo mindre end 0: " + sMinus[i]);
                //System.out.println(names[i] + " Saldo er mindre end 0: " + saldo[i]);
                //diffMinus = sMinus[i] - sMinus[i];
                //System.out.println("DIFF: " + diffMinus);
            }

            if (saldo[i] == 0) {
                System.out.println(names[i] + " Saldo er 0: " + saldo[i]);
            }

         //   System.out.println("sPlus: " + sPlus[i]);

        while (sPlus.length >0 ){
            if (sPlus[i] > sMinus[i]){
                System.out.println("test");
            }
        }

            for (int j = 0; j < sPlus.length; j++) {

                if (sPlus[i] > sMinus[i]) {
                    //while skal kører så længe begge to er ikke 0
                    // mens den ene index er mindre end så lang den kan være og mens den anden....
                    // tjek på den længeste
                    //mens i er mindre end længden af listen
                    //if statemens der kun incrementer når det er
                    // while i < plus.size
                    //if statements

                }
            }




            //while (diff > 0){
            //int diff = sMinus[i]-sMinus[i];
            //System.out.println("DIFF: " + diff);
            //while (sPlus[i] > 0 || sMinus[i]<0){


            //}


        }




        //if (sMinus[i] > sPlus[i]) {
        //    sMinus[i] = sMinus[i] - sPlus[i];
        //    System.out.println("test: " + sMinus[i]);
        //}



            //System.out.println("Saldo større end 0: " + sMinus[i]);
    }

      /*  for (int sminus : sMinus) {
            System.out.println(sminus);

        }
        for (int splus : sPlus) {
            System.out.println(splus);
        }*/


/*
        for (int i = 0; i<saldo.length; i++){
            for (int j = 0; j<saldo.length; j++){
                if(saldo[i] < 0){
                   //System.out.println("TEST" + saldo[i]);

                }
            }

        }
*/




      //  Algoritme algoritme = new Algoritme();
        /*
        Port Jaw = new Port("Jaw" , -1000);
        Port Tan = new Port("Tan", -19000);
        Port Dar = new Port("Dar", -5000);

        Port Mom = new Port("Mom", 4500);
        Port Zan = new Port("Zan", 2000);
        Port Jeb = new Port("Jeb", 9500);
        Port Sala = new Port("Sal", 9000);


        algoritme.portMinusList.add(Jaw);
        algoritme.portMinusList.add(Tan);*/
        //algoritme.printList();



/*
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
        }*/
   



    public static AdjacencyGraph createDirectedAdj(){
        AdjacencyGraph newG=new AdjacencyGraph();

        //Laver en ny Vertex med navn
        Vertex Jaw =new Vertex("Jaw" );
        Vertex Tan =new Vertex("Tan" );
        Vertex Dar =new Vertex("Dar" );
        Vertex Mom =new Vertex("Mom" );
        Vertex Jeb =new Vertex("Jeb" );
        Vertex Zan =new Vertex("Zan" );
        Vertex Sal =new Vertex("Sal" );

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
       // newG.addEdge(Jaw, Jaw , 0);

        //Fra havn Tan
        newG.addEdge(Tan,Mom,5000);
        newG.addEdge(Tan,Jeb,7000);
        newG.addEdge(Tan,Dar,3000);
        newG.addEdge(Tan,Zan,2000);
        newG.addEdge(Tan,Sal,7000);
      //  newG.addEdge(Tan,Tan,0);

        //Fra havn Dar
        newG.addEdge(Dar,Jaw,3000);
        newG.addEdge(Dar,Jeb,2000);
        newG.addEdge(Dar,Tan,5000);
       // newG.addEdge(Dar,Dar,0);

        //Fra havn Mom
        newG.addEdge(Mom,Jeb,500);
        newG.addEdge(Mom,Sal, 2000);
       // newG.addEdge(Mom,Mom, 0);


        newG.addEdge(Jeb,Jeb,0);
        newG.addEdge(Zan,Zan,0);
        newG.addEdge(Sal,Sal,0);



        return newG;
    }




    
}
