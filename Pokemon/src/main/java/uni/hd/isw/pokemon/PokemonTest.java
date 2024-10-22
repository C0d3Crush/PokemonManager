package uni.hd.isw.pokemon;

public class PokemonTest {
    public static void main(String[] args) {

        Pokemon Charmander = new Pokemon("Charmander", Type.FIRE);

        // Test of getter of name
        System.out.println();
        System.out.println("Testen von getName");
        System.out.println("Name von Pokemon Charmander:");
        System.out.println(Charmander.getName());

        // Test of getter of type
        System.out.println();
        System.out.println("Testen von getType");
        System.out.println("Type von Pokemon Charmander:");
        System.out.println(Charmander.getType());

        // Test of setter of toString method
        System.out.println();
        System.out.println("Testen von toString");
        System.out.println(Charmander.toString());
    }
}
