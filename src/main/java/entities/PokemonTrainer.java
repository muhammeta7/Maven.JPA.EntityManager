package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pokemon_trainer")
public class PokemonTrainer {

    @Id
    private Integer trainerId;
    private Integer pokeLevel;
    private Integer hp;
    private Integer maxhp;
    private Integer attack;
    private Integer defense;
    private Integer spatk;
    private Integer spdef;
    private Integer speed;
    private Integer pokemon_id;

    public PokemonTrainer() {
    }

    @Column(name = "trainerid")
    public Integer getTrainerId(){
        return trainerId;
    }

    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    @Column(name = "pokelevel")
    public Integer getPokeLevel() {
        return pokeLevel;
    }

    public void setPokeLevel(Integer pokeLevel) {
        this.pokeLevel = pokeLevel;
    }

    @Column(name = "hp")
    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    @Column(name = "maxhp")
    public Integer getMaxhp() {
        return maxhp;
    }

    public void setMaxhp(Integer maxhp) {
        this.maxhp = maxhp;
    }

    @Column(name = "attack")
    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    @Column(name = "defense")
    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    @Column(name = "spatk")
    public Integer getSpatk() {
        return spatk;
    }

    public void setSpatk(Integer spatk) {
        this.spatk = spatk;
    }

    @Column(name = "spdef")
    public Integer getSpdef() {
        return spdef;
    }

    public void setSpdef(Integer spdef) {
        this.spdef = spdef;
    }

    @Column(name = "speed")
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Column(name = "pokemon_id")
    public Integer getPokemon_id() {
        return pokemon_id;
    }

    public void setPokemon_id(Integer pokemon_id) {
        this.pokemon_id = pokemon_id;
    }



}
