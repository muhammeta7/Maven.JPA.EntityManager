package entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pokemons")
public class Pokemon {

    @Id
    private Integer id;
    private String name;
    private Integer primary_type;
    private Integer secondary_type;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "trainer_id")
    @OrderBy
    private List<PokemonTrainer> list;

    public Pokemon() {
    }

    public Pokemon(int id, String name, int primary_type, int secondary_type) {
        this.id = id;
        this.name = name;
        this.primary_type = primary_type;
        this.secondary_type = secondary_type;
        list = new ArrayList<>();
    }

    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "primary_type")
    public int getPrimary_type() {
        return primary_type;
    }

    public void setPrimary_type(int primary_type) {
        this.primary_type = primary_type;
    }

    @Column(name = "secondry_type")
    public int getSecondary_type() {
        return secondary_type;
    }

    public void setSecondary_type(int secondary_type) {
        this.secondary_type = secondary_type;
    }

    public List<PokemonTrainer> getList() {
        return list;
    }

    public void setList(List<PokemonTrainer> list) {
        this.list = list;
    }
}
