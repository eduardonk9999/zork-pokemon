import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberPokemon = 0;

        System.out.println("Qual Pokemon voce quer escolher?");
        System.out.println("1 Squirtle, 2 Bulbasaur, 3 Charmander");

        Scanner scanner = new Scanner(System.in);
        numberPokemon = scanner.nextInt();

        int pokemonChosen = numberPokemon;

        switch (pokemonChosen) {
            case 1:
                Pokemon squirtle = new Squirtle("squirtle", "agua", "Jato D Agua");
                squirtle.renderPokemon();
                break;
            case 2:
                Pokemon bulbasaur = new Bulbasaur("Bulbasaur", "Planta", "Folhas Navalha");
                bulbasaur.renderPokemon();
                break;
            case 3:
                Pokemon charmander = new Charmander("Charmander", "Fogo", "Presas de Fogo");
                charmander.renderPokemon();
                break;
            default:
                System.out.println("Escolha errada...");
        }

    }
}