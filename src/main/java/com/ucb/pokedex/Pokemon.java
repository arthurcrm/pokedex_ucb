package com.ucb.pokedex;

import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Pokemon extends Caracteristica {

    private String tipo;
    private String habilidade;
    private Double peso;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void salvar(Pokemon pokemon) {
        try {
            FileWriter fw = new FileWriter("src/main/java/com/ucb/pokedex/database/pokemon.txt");
            fw.close();
        } catch (Exception error) {
            System.out.println("Error: " + error.toString());
        }
    }

    public Pokemon() {
        super();
    }

}
