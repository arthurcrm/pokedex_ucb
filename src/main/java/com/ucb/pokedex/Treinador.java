package com.ucb.pokedex;

import java.util.List;

public class Treinador extends Caracteristica {
    private List<Pokemon> pokemons;

    public Treinador(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public Treinador() {
        super();
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

}
