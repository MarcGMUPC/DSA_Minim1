package edu.upc.dsa.models;

public class Product {
    //Atributs
    String id;
    double preu;
    int ventas;



    //Métodes
    public Product(String id, double preu, int ventas) {
        this.setId(id);
        this.setPreu(preu);
        this.setVentas(ventas);
    }



    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public double getPreu() {
        return preu;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public int getVentas() {
        return ventas;
    }

    @Override
    public String toString() {
        return "Track [id="+id+", preu=" + preu + ", ventas=" + ventas +"]";
    }
}
