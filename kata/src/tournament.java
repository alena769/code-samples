import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class tournament {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<String> competition1 = new ArrayList<>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0, 0, 1));

        System.out.println(tournamentWinner(competitions, results));
    }

    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        String currentWinner = "";
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put(currentWinner, 0);

        for (int i = 0; i < results.size(); i++) {
            if(results.get(i) == 0){
                for (int j = 0; j < competitions.size(); j++) {
                    currentWinner = competitions.get(j).toString();
                    for (int k = 0; k < competitions.get(j).size(); k++) {
                        currentWinner = competitions.get(k).toString();
                    }
                }
            }



        }

        return "";
    }

    public static void updateScore(String team, int points, HashMap<String, Integer> scores) {
        if(!scores.containsKey(team)){
            scores.put(team, 0);
        }else {
            scores.put(team, scores.get(team) + points);
        }
    }
}
