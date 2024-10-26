package uni.hd.isw.pokemon;

import java.util.ArrayList;

public class Trainer {

    private String firstName;
    private String lastName;

    ArrayList<Pokemon> pokemeonList = new ArrayList<>();

    public Trainer(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void linkPokemon(Pokemon pokemon) {
        if (pokemon.getTrainer() != null) {
            pokemon.getTrainer().pokemeonList.remove(pokemon);
        }
        pokemon.setTrainer(this);
        pokemeonList.add(pokemon);
    }

    public void listPokemon(){
        for (Pokemon pokemon : pokemeonList) {
            System.out.println(pokemon.getName());
        }
    }

    public void listPokemeonType(Type type){
        for (Pokemon pokemon : pokemeonList){
            if (pokemon.getType().equals(type)) {
                System.out.println(pokemon.getName());
            }
        }
    }

    public void showPokemon(int i){
        if (i < pokemeonList.size()) {
            System.out.println(pokemeonList.get(i).getName());
        } else {
            System.out.println("No pokemon with that index");
        }
    }
}
