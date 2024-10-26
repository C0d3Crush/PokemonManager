package uni.hd.isw.pokemon;

public class PokemonTest {
    public static void main(String[] args) {

        Pokemon charmander = new Pokemon("Charmander", Type.FIRE);
        Trainer trainer = new Trainer("Ash", "Ketchum");

        // Test of getter of name
        System.out.println();
        System.out.println("Testen von getName");
        System.out.println("Name von Pokemon Charmander:");
        System.out.println(charmander.getName());

        // Test of getter of type
        System.out.println();
        System.out.println("Testen von getType");
        System.out.println("Type von Pokemon Charmander:");
        System.out.println(charmander.getType());

        // Test of setter of toString method
        System.out.println();
        System.out.println("Testen von toString");
        System.out.println(charmander.toString());

        // Test of linkPokemom method
        System.out.println();
        System.out.println("Testen von linkPokemom");
        System.out.println("Linken Pokemon charmander zu Trainer Ash Ketchum");
        trainer.linkPokemon(charmander);

        // Test of listPokemon method
        System.out.println();
        System.out.println("Testen von listPokemon");
        trainer.listPokemon();

        // Test of listPokemons of Type
        System.out.println();
        System.out.println("Testen von listPokemons of Type Fire");
        trainer.listPokemeonType(Type.FIRE);

        System.out.println();
        System.out.println("Testen von showPokemon with index 0");
        trainer.showPokemon(0);
    }
}
