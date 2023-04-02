import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pokemon squirtle = new Squirtle("squirtle", "agua", "Jato D Agua");
        squirtle.renderPokemon();

        Pokemon bulbasaur = new Bulbasaur("Bulbasaur", "Planta", "Folhas Navalha");
        bulbasaur.renderPokemon();

        Pokemon charmander = new Charmander("Charmander", "Fogo", "Presas de Fogo");
        charmander.renderPokemon();
    }
}