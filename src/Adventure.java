import java.util.Scanner;
public class Adventure {
    String currentPokemon = "";
    String response = "";
    void initAdventure (String yourPokemon) {
        System.out.println("Voce encontra um Pidgey o que voce faz?");

        Scanner scanner = new Scanner(System.in);
        response = scanner.nextLine();
        currentPokemon = yourPokemon;

        Pokemon pidgey = new Pidgey("Pidgey", "passaro", "Ataque de Asa");
        pidgey.renderPokemon();

        if(response == currentPokemon) {
            System.out.println("Inicia batalha POKEMON!!!");
        } else {
            System.out.println("Resposta errada!!!");
        }




    }
}
