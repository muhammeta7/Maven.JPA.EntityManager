package services;

import entities.PokemonTrainer;

import javax.persistence.*;
import java.util.ArrayList;


public class PokemonTrainerServices {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-Entity-Lab");
    private static EntityManager em = emf.createEntityManager();
    private EntityTransaction et = em.getTransaction();

    public PokemonTrainer findPokemonTrainerById(Integer id){
        return em.find(PokemonTrainer.class,id);
    }

    public void persistTrainer(PokemonTrainer trainer){
        em.getTransaction().begin();
        em.persist(trainer);
        em.getTransaction().commit();

    }

    public void deleteTrainer(PokemonTrainer trainer){
        em.getTransaction().begin();
        em.remove(trainer);
        em.getTransaction().commit();
    }

    public void updateTrainerAttack(PokemonTrainer trainer,Integer newAttack){
        em.getTransaction().begin();
        trainer.setAttack(newAttack);
        em.getTransaction().commit();
    }

    public ArrayList<PokemonTrainer> findAllTrainers(){
        ArrayList<PokemonTrainer> result = new ArrayList<>();
        em.getTransaction().begin();
        result = (ArrayList<PokemonTrainer>) em.createQuery("SELECT a FROM PokemonTrainer a WHERE a.trainerId < 20 ",PokemonTrainer.class).getResultList();
        return result;
    }

}
