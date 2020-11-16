package JavaLevel01;

public class Marathon {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
    	
        for(int i=0; i<participant.length; i++) {
            for(int j=0; j<completion.length; j++) {
                if(participant[i].equals(completion[j])) {
                	participant[i] = "";
                    completion[j] = "";
                }
            }
        }
        
        for(int i=0; i<participant.length; i++) {
            if(!(participant[i].equals(""))) {
            	answer = participant[i];
            }
        }
        
        return answer;
    }
}