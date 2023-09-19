package com.example.m201_tp06;

public class Patient {
    private Double poids;
    private Double taille;

    //Accesseurs
    public Double getPoids() {
        return poids;
    }

    public Double getTaille() {
        return taille;
    }


    //Modificateurs


    public void setPoids(Double poids) {
        this.poids = poids;
    }

    public void setTaille(Double taille) {
        this.taille = taille;
    }

    //Constructeur

    public Patient(Double poids, Double taille) {
        this.poids = poids;
        this.taille = taille;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "poids=" + poids +
                ", taille=" + taille +
                '}';
    }

    public Double calculerIMC() {

        return poids/(taille*taille);
    }

}
