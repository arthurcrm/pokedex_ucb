package com.ucb.pokedex;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    List<Treinador> treinadores = new ArrayList<>();
    Treinador treinador;
    List<Pokemon> pokemons = new ArrayList<>();
    Pokemon pk = new Pokemon();
    int opcao = -1;
    int id = 0;
    while (opcao != 0) {
      System.out.println("Menu");
      System.out.println("1- Pokemons");
      System.out.println("2- Treinadores");
      System.out.println("0- Encerrar Programa");
      opcao = scan.nextInt();
      switch (opcao) {
        case 1:
          while (opcao != 0) {
            System.out.println("----------Pokemons------------");
            System.out.println("1- Catalogar Pokemon");
            System.out.println("2- Listar Pokedex");
            System.out.println("3- Alterar Pokemon cadastrado");
            System.out.println("4- Excluir Pokemon");
            System.out.println("5- Buscar Pokemon");
            System.out.println("0- Retornar ao menu anterior");
            opcao = scan.nextInt();
            switch (opcao) {
              case 1:
                pk.criar();
                break;
              case 2:
                pk.listar();
                break;
              case 3:
                System.out.println("Alterar pokemon");
                System.out.println("Digite o ID do pokemon que deseja alterar");
                id = scan.nextInt();
                pk.alterar(id);
                break;
              case 4:
                System.out.println("Excluir pokemon");
                System.out.println("Digite o ID do pokemon que deseja excluir");
                id = scan.nextInt();
                pk.excluir(id);
                break;
              case 5:
                break;
              case 0:
                break;
              default:
                break;
            }

          }
          opcao = -1;
          break;
        case 2:
          while (opcao != 0) {
            System.out.println("--------Treinadores----------");
            System.out.println("1- Cadastrar Treinador");
            System.out.println("2- Listar Treinadores");
            System.out.println("3- Alterar Treinador");
            System.out.println("4- Excluir Treinador");
            System.out.println("5- Buscar Treinador");
            System.out.println("0- Retornar ao menu anterior");
            opcao = scan.nextInt();
            switch (opcao) {
              case 1:
                break;
              case 2:
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
                break;
              case 3:
                break;
              case 4:
                break;
              case 5:
                break;
              case 0:
                break;
              default:
                break;
            }

          }
          opcao = -1;
          break;
        case 0:
          break;
        default:
          System.out.println("Opcao invalida");
          break;
      }
    }
    scan.close();
  }
}
