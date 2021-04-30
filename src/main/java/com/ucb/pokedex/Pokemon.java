package com.ucb.pokedex;

import java.io.*;
import java.util.*;

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

  public void criar() {
    Scanner scan = new Scanner(System.in);

    String nomePokemon = "";
    String tipoPokemon = "";
    String habilidadePokemon = "";
    Double pesoPokemon = 0.0;

    System.out.println("----------------Catalogar pokemons--------------");
    System.out.println("Digite o nome do pokemon que deseja catalogar");
    scan.nextLine();
    nomePokemon = scan.nextLine();
    this.setNome(nomePokemon);
    //
    System.out.println("Digite o tipo desse pokemon");
    tipoPokemon = scan.nextLine();
    this.setTipo(tipoPokemon);
    //
    System.out.println("Digite a habilidade desse pokemon");
    habilidadePokemon = scan.nextLine();
    this.setHabilidade(habilidadePokemon);
    //
    System.out.println("Digite o peso desse pokemon");
    pesoPokemon = scan.nextDouble();
    this.setPeso(pesoPokemon);
    this.setId();
    this.salvar(this);
    scan.close();
  }

  public void listar() {
    System.out.println("Lista de pokemons");
    File f = new File("src/main/java/com/ucb/pokedex/database/pokemon.txt");
    try {
      BufferedReader br = new BufferedReader(new FileReader(f));
      String st;
      while ((st = br.readLine()) != null)
        System.out.println(st);
      br.close();
    } catch (Exception error) {
      System.out.println("O arquivo nao existe.");
    }
  }

  public void alterar(int id) {
    Scanner pkScan = new Scanner(System.in);

    String novoNomePokemon = "";
    String novoTipoPokemon = "";
    String novaHabilidadePokemon = "";
    Double novoPesoPokemon = 0.0;

    Pokemon newPk = new Pokemon();

    System.out.println("Digite o novo nome desse pokemon");
    novoNomePokemon = pkScan.nextLine();
    newPk.setNome(novoNomePokemon);
    System.out.println("Digite o novo tipo desse pokemon");
    novoTipoPokemon = pkScan.nextLine();
    newPk.setTipo(novoTipoPokemon);
    System.out.println("Digite a nova habilidade desse pokemon");
    novaHabilidadePokemon = pkScan.nextLine();
    newPk.setHabilidade(novaHabilidadePokemon);
    System.out.println("Digite o novo peso desse pokemon");
    novoPesoPokemon = pkScan.nextDouble();
    newPk.setPeso(novoPesoPokemon);
    pkScan.close();

  }

  // public void buscar(int id) {
  // File f = new File("src/main/java/com/ucb/pokedex/database/pokemon.txt");
  // try {

  // FileReader fr = new FileReader(f);
  // BufferedReader br = new BufferedReader(fr);
  // String s;
  // int count = 0;

  // String line = null;

  // while ((line = br.readLine()) != null) {

  // if (!line.trim().equals("" + id)) {
  // System.out.println(Pokemon);
  // }
  // }

  // if (count != 0) // Check for count not equal to zero
  // {
  // System.out.println("The given word is present for " + count + " Times in the
  // file");
  // } else {
  // System.out.println("The given word is not present in the file");
  // }

  // fr.close();
  // br.close();
  // } catch (Exception err) {
  // System.out.println(err.toString());
  // }
  // }

  public Pokemon() {
    super();
  }

}
