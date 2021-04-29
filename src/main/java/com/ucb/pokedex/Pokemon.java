package com.ucb.pokedex;

import java.io.*;

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

    public void excluir(int id) {
        File inputFile = new File("src/main/java/com/ucb/pokedex/database/pokemon.txt");
        File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

            String line = null;

            while ((line = br.readLine()) != null) {

                if (!line.trim().equals("" + id)) {
                    pw.println(line);
                    pw.flush();
                }
            }
            br.close();
            pw.close();

            if (!inputFile.delete()) {
                System.out.println("Nao foi possivel deletar o arquivo, cheque as permissoes.");
                return;
            }

            if (!tempFile.renameTo(inputFile))
                System.out.println("Nao foi possivel renomear o arquivo, cheque as permissoes.");
        } catch (Exception err) {
            System.out.println(err.toString());
        }

    }

    public Pokemon() {
        super();
    }

}
