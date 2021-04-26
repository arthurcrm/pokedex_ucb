package pokedexo;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    List<Treinador> treinadores = new ArrayList<>();
	    Treinador treinador;
	    int opcao=-1;
	    while(opcao!=0){
		    System.out.println("Menu");
		    System.out.println("1- Pokemons");
		    System.out.println("2- Treinadores");
		    System.out.println("0- Encerrar Programa");
	    	opcao=scan.nextInt();
		    switch(opcao){
		        case 1:
		        	while(opcao!=0) {
			            System.out.println("----------Pokemons------------");
			            System.out.println("1- Catalogar Pokemon");
			            System.out.println("2- Listar Pokedex");
			            System.out.println("3- Alterar Pokemon cadastrado");
			            System.out.println("4- Excluir Pokemon");
			            System.out.println("5- Buscar Pokemon");
			            System.out.println("0- Retornar ao menu anterior");
			            opcao=scan.nextInt();
			            switch(opcao){
			            	case 1:
			            		break;
			            	case 2:
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
		        	opcao=-1;
		            break;
		        case 2:
		        	while(opcao!=0) {
			            System.out.println("--------Treinadores----------");
			            System.out.println("1- Cadastrar Treinador");
			            System.out.println("2- Listar Treinadores");
			            System.out.println("3- Alterar Treinador");
			            System.out.println("4- Excluir Treinador");
			            System.out.println("5- Buscar Treinador");
			            System.out.println("0- Retornar ao menu anterior");
			            opcao=scan.nextInt();
			            switch(opcao){
			            	case 1:
			            		break;
			            	case 2:
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
		        	opcao=-1;
		            break;
		        case 0:
		        	break;
		        default:
		        	System.out.println("Opção inválida");
		        	break;
		    }
	    }
	    scan.close();
	}
}

