package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pokemon_trainer")
public class PokemonTrainer {

    @Id
    private Integer trainerId;
    private Integer pokelevel;
    private Integer hp;
    private Integer maxhp;
    private Integer attack;
    private Integer defense;
    private Integer spatk;
    private Integer spdef;
    private Integer speed;
    private Integer pokemon_id;

    public PokemonTrainer(){

    }

    public PokemonTrainer(int trainerId, int pokelevel, int hp, int maxhp, int attack, int defense, int spatk, int spdef, int speed, int pokemon_id) {
        this.trainerId = trainerId;
        this.pokelevel = pokelevel;
        this.hp = hp;
        this.maxhp = maxhp;
        this.attack = attack;
        this.defense = defense;
        this.spatk = spatk;
        this.spdef = spdef;
        this.speed = speed;
        this.pokemon_id = pokemon_id;
    }



}
