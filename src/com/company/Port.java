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