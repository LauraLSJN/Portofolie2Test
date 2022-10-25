package com.company;

public class Port {

    private String name;
    private int containerAntal;

    public Port(String name, int containerAntal) {
        this.name = name;
        this.containerAntal = containerAntal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContainerAntal() {
        return containerAntal;
    }

    public void setContainerAntal(int containerAntal) {
        this.containerAntal = containerAntal;
    }
}


/*  if(sPlus[4] == 9500){
                    System.out.println("index 4 virker: " + sPlus[4]);
                   //sPlus[4] = sPlus[4] - sPlus[4];
                    System.out.println("nu index 4: " + sPlus[4]);
                    if (sMinus[0] < 0){
                        sMinus[0] = sMinus[0] + sPlus[4];
                        System.out.println("test: " + sMinus[0]);
                    }


                }


                //System.out.println(names[i] + " Saldo større end 0: " + saldo[i]);
                //continue;
                //diffPlus = sPlus[i] - sPlus[i];
                //System.out.println("DIFF: " + diffPlus);

               */