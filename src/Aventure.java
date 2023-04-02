import java.util.Scanner;
public class Aventure {
    String seuPokemon = "";
    String response = "";
    void initAdventure (String yourPokemon) {
        System.out.println("Voce encontra um Pidgey o que voce faz?");

        Scanner scanner = new Scanner(System.in);
        response = scanner.nextLine();
        seuPokemon = yourPokemon;

        if(response == seuPokemon) {
            System.out.println("Inicia batalha POKEMON!!!");
        } else {
            System.out.println("Resposta errada!!!");
        }




    }
}
