package services;


import entities.Pokemon;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

public class PokemonServicesTest {

    PokemonServices ps = new PokemonServices();
    Pokemon poke = new Pokemon(657, "Moe", 1 ,2);
    Pokemon poke1 = new Pokemon(658, "John", 1 ,3);

    @Test
    public void createPokemonTest(){
        ps.createPokemon(poke);
        ps.createPokemon(poke1);
        assertNotNull(poke);
        assertNotNull(poke1);
    }


    @Test
    public void findById(){
        Pokemon actual = ps.findById(657);
    }

    @Test
    public void updatePokemonNameTest(){
        Pokemon poke2 = new Pokemon(659, "Bob", 1 ,3);
        String expected = "George";
        ps.updatePokemonName(poke2, expected);
    }

    @Test
    public void deletePokemonTest(){
        ps.deletePokemon(poke1.getId());
        assertNotNull(poke1);
    }

    @Test
    public void findAll(){
        List<Pokemon> list = ps.findAll();
        list.stream().forEach(System.out::println);
    }

}
