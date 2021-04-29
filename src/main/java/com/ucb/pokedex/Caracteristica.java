package com.ucb.pokedex;

//Superclasse
public class Caracteristica {
    private String nome;
    private int id;
    private double altura;
    private String genero;
    private String regiao;

    public int getId() {
        return id;
    }

    public int setId() {
        return this.id++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public void imprimir() {
        System.out.println("Nome:" + getNome());
        System.out.println("Altura:" + getAltura());
        System.out.println("Genero:" + getGenero());
        System.out.println("Regiao:" + getRegiao());
    }
}
