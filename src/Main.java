import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberPokemon = 0;
        String yourPokemon = "";

        System.out.println("Qual Pokemon voce quer escolher?");
        System.out.println("1 Squirtle, 2 Bulbasaur, 3 Charmander");

        Scanner scanner = new Scanner(System.in);
        numberPokemon = scanner.nextInt();

        int pokemonChosen = numberPokemon;

        switch (pokemonChosen) {
            case 1:
                Pokemon squirtle = new Squirtle("Squirtle", "agua", "Jato D Agua");
                yourPokemon = squirtle.name;
                squirtle.renderPokemon();
                break;
            case 2:
                Pokemon bulbasaur = new Bulbasaur("Bulbasaur", "Planta", "Folhas Navalha");
                yourPokemon = bulbasaur.name;
                bulbasaur.renderPokemon();
                break;
            case 3:
                Pokemon charmander = new Charmander("Charmander", "Fogo", "Presas de Fogo");
                yourPokemon = charmander.name;
                charmander.renderPokemon();
                break;
            default:
                System.out.println("Escolha errada...");
        }

        Adventure adventure = new Adventure();
        adventure.initAdventure(yourPokemon);
    }
}