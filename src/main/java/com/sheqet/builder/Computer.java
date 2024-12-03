package com.sheqet.builder;

public class Computer {
    private String CPU;
    private int RAM;
    private String storage;
    private String GPU;

    public Computer(ComputerBuilder builder) {
        this.CPU = builder.getCPU();
        this.RAM = builder.getRAM();
        this.storage = builder.getStorage();
        this.GPU = builder.getGPU();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + "\n" +
                ", RAM=" + RAM + "GB \n" +
                ", storage=" + storage + "\n'" +
                ", GPU=" + GPU + "\n" +
                '}';
    }
}
