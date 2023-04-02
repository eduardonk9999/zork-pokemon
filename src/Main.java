import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String yourPokemon = "";
        int numberPokemon = 0;


        System.out.println("Qual Pokemon voce quer escolher?");
        System.out.println("1 Squirtle, 2 Bulbasaur, 3 Charmander");


        Scanner scanner = new Scanner(System.in);
        numberPokemon = scanner.nextInt();


        if(numberPokemon == 1){
            Pokemon agua = new Pokemon();
            agua.name = "Squirtle";
            yourPokemon = agua.name;
            agua.ataque = "Jato D'Agua";
            agua.type = "Agua";
            agua.renderPokemon();
        } else if (numberPokemon == 2) {
            Pokemon planta = new Pokemon();
            planta.name = "Bulbasaur";
            yourPokemon = planta.name;
            planta.ataque = "Folhas Navalha";
            planta.type = "Planta";
            planta.renderPokemon();
        } else {
            Pokemon fogo = new Pokemon();
            fogo.name = "Charmander";
            yourPokemon = fogo.name;
            fogo.ataque = "Presas de Fogo";
            fogo.type = "Fogo";
            fogo.renderPokemon();
        };

        Aventure aventura = new Aventure();
        aventura.initAdventure(yourPokemon);

    }
}