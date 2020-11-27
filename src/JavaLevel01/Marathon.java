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
                if(!(participant[i].equals(""))) {
                	answer = participant[i];
                	break;
                }
            }
        }
        
        return answer;
    }
    
    public String solution2(String[] participant, String[] completion) {
        String answer = "";
    	
        for(int i=0; i<participant.length; i++) {
        	boolean found = false;
            for(int j=0; j<completion.length; j++) {
                if(participant[i].equals(completion[j])) {
                	found = true;
                	completion[j] = "";
                	break;
                }
                if(found == false) {
                	answer = participant[i];
                	break;
                }
            }
        }
        
        return answer;
    }
}