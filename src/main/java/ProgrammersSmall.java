public class ProgrammersSmall {
    public int solution(String t, String p){

        int answer = 0;

        int len = t.length() - p.length()+1;

        for (int i = 0; i < len; i++) {
            String num = t.substring(i, p.length()+i);
            if(Long.valueOf(num) <= Long.valueOf(p)){
                answer++;
            }
        }
        return answer;
    }
}
