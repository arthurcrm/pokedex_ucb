
package pokedexo;
//Superclasse
public class Caracteristica {
    private String nome;
    private double altura;
    private String genero;
    private String regiao;

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
    public void imprimir(){
        System.out.println("Nome:"+ getNome());
        System.out.println("Altura:"+ getAltura());
        System.out.println("Gênero:"+ getGenero());
        System.out.println("Região:"+ getRegiao());
    }
}
