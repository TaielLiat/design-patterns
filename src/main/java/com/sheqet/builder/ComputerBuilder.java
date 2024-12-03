package com.sheqet.builder;

/**
 * Esta clase hace de intermediaria con Computer para permitir que se vayan
 * ejecutando las tareas (asignando los valores en este caso) paso por paso.
 *
 * Por eso los setters se devuelven a sí mismos, para que se puedan encadenar
 * llamadas.
 * Y los getters se usan finalmente en la clase Computer para obtener los
 * valores que se asignaron al final.
 */
public class ComputerBuilder {
    private String CPU;
    private int RAM;
    private String storage;
    private String GPU;


    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public ComputerBuilder setRAM(int RAM) {
        this.RAM = RAM;
        return this;
    }

    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    public String getCPU() {
        return CPU;
    }

    public Integer getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public String getGPU() {
        return GPU;
    }

    public Computer build() {
        return new Computer(this);
    }
}
