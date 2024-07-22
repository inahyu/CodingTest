import java.util.HashSet;
import java.util.Scanner;

public class BAEKJOON25757 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        char gameType = input[1].charAt(0);

        HashSet<String> partner = new HashSet<>();

        for (int i = 0; i < N; i++) {
            partner.add(sc.nextLine());
        }

        GamePlayer gamePlayer = new GamePlayer(partner, gameType);

        int maxGames = gamePlayer.getMaxGames();
        System.out.println(maxGames);
    }
}

class GamePlayer{
    private HashSet<String> partner;
    private char gameType;

    public GamePlayer(HashSet<String> partner, char gameType){
        this.partner = partner;
        this.gameType = gameType;
    }
    public int getMaxGames(){
        int maxPlayers;
        if(gameType == 'Y'){
            maxPlayers =2;
        } else if (gameType == 'F'){
            maxPlayers = 3;
        } else {
            maxPlayers = 4;
        }
        int maxGames = (partner.size())/ (maxPlayers -1);
        return maxGames;
    }
}