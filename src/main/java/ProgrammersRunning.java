import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class ProgrammersRunning {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        ProgrammersRunning sol = new ProgrammersRunning();
        System.out.println(Arrays.toString(sol.solution(players, callings)));
    }
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }

        for(int i=0; i<callings.length; i++) {
            int rank = map.get(callings[i]);
            String name = answer[rank-1];

            answer[rank-1] = answer[rank];
            answer[rank] = name;
            map.put(answer[rank-1], rank-1);
            map.put(answer[rank], rank);
        }

        return answer;
    }

}