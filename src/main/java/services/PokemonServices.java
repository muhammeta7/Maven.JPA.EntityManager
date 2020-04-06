package services;


import entities.Pokemon;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class PokemonServices {

    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAlab");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();
    private EntityTransaction entityTransaction = entityManager.getTransaction();

    public Pokemon createPokemon(Pokemon p){
        entityTransaction.begin();
        entityManager.persist(p);
        entityTransaction.commit();
        return p;
    }

    public Pokemon findById(Integer id){
        return entityManager.find(Pokemon.class, id);
    }

    public List<Pokemon> findAll(){
        entityTransaction.begin();
        return entityManager.createQuery("SELECT h FROM Pokemon h", Pokemon.class).getResultList();
    }

    public void updatePokemonName(Pokemon poke, String name){
        poke = findById(poke.getId());
        if(poke != null){
            entityTransaction.begin();
            poke.setName(name);
            entityTransaction.commit();
        }
    }

    public void deletePokemon(Integer id){
        Pokemon poke = entityManager.find(Pokemon.class, id);
        if(poke != null){
            entityTransaction.begin();
            entityManager.remove(poke);
            entityTransaction.commit();
        }
    }

    
}
