package JavaLevel01;

public class Suica {
    public String solution(int n) {
        String answer = "";
        int count = 1;
        
        for(int i = 0; i < n; i++) {
            if(count == 1) {
               answer += "수";
               count *= -1;
            } else {
               answer += "박";
               count *= -1;
            }
        }
        
        return answer;
    }
}