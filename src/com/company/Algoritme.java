package com.company;

import java.util.ArrayList;

public class Algoritme {

    Port Jaw = new Port("Jaw" , -1000);
    Port Tan = new Port("Tan", -19000);
    Port Dar = new Port("Dar", -5000);

    Port Mom = new Port("Mom", 4500);
    Port Zan = new Port("Zan", 2000);
    Port Jeb = new Port("Jeb", 9500);
    Port Sal = new Port("Sal", 9000);

    ArrayList<Port> portMinusList = new ArrayList<>();
    ArrayList<Port> portPlusList = new ArrayList<>();



    public void addToPortMinusList(){
        portMinusList.add(Jaw);
        portMinusList.add(Tan);
        portMinusList.add(Dar);
    }

    public void addToPortPlusList(){
        portPlusList.add(Mom);
        portPlusList.add(Zan);
        portPlusList.add(Jeb);
        portPlusList.add(Sal);
    }

    public void printList(){
        addToPortMinusList();
        for(int i = 0; i < portMinusList.size(); i++) {
            System.out.println(portMinusList.get(i).getName() + " mangler: " + portMinusList.get(i).getContainerAntal());
        }

        addToPortPlusList();
        for(int i = 0; i < portPlusList.size(); i++) {
            System.out.println(portPlusList.get(i).getName() + " har for meget:  " + portPlusList.get(i).getContainerAntal());
        }

    }

}
