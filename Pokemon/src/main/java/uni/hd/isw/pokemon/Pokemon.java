package uni.hd.isw.pokemon;

public class Pokemon {

    public String name;
    private Type type;

    int number;
    static int nextNumber = 1;

    Pokemon(String n, Type t){
        name = n;
        type = t;
        number = nextNumber;
        nextNumber++;
    };

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    // das 'this'-keyword wird verwendet um die Übergabe-parameter
    // von den lokalen Paramentern im Objekt zu zu unterscheiden.
    public void setName(String name) {
        this.name = name;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public String toString() {
        return "Name: " + name + " Type: " + type + " Number: " + number;
    }
}


