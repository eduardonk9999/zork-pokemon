public class Pokemon {
    String name;
    String type;
    String attack;

    Pokemon(String name, String type, String attack) {
        this.name = name;
        this.type = type;
        this.attack = attack;
    }

    void renderPokemon() {
        System.out.println("Seu Pokemon e " + name);
        System.out.println("Ele e do tipo: " + type);
        System.out.println("O ataque dele e: " + attack);
    }

}
