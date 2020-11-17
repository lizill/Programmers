package JavaLevel01;

public class WhatDayIsIt {
    public String solution(int a, int b) {
        String answer = "";
        
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WEN"};
        int day;
        
        switch(a) {
	        case 1:
	        	// 1 8 15 22 29 TUE
	//        	if(day==1) answer = week[1];
	//        	else if(day==2) answer = week[2];
	//        	else if(day==3) answer = week[3];
	//        	else if(day==4) answer = week[4];
	//        	else if(day==5) answer = week[5];
	//        	else if(day==6) answer = week[6];
	//        	else if(day==0) answer = week[0];
//	        	b = b+0;
	        	day = b%7;
	        	for(int i=0; i<7; i++) {
	        		if(day==i) answer = week[i];
	        	}
	        	break;
	        case 2:
	        	b = b+3;
	        	day = b%7;
	        	for(int i=0; i<7; i++) {
	        		 if(day==i) answer = week[i];
	        	}
	        	break;
	        case 3:
	        	b = b+4;
	        	day = b%7;
	        	for(int i=0; i<7; i++) {
	        		 if(day==i) answer = week[i];
	        	}
	        	break;
	        case 4:
//	        	b = b+0;
	        	day = b%7;
	        	for(int i=0; i<7; i++) {
	        		 if(day==i) answer = week[i];
	        	}
	        	break;
	        case 5:
	        	b = b+2;
	        	day = b%7;
	        	for(int i=0; i<7; i++) {
	        		 if(day==i) answer = week[i];
	        	}
	        	break;
	        case 6:
	        	b = b+5;
	        	day = b%7;
	        	for(int i=0; i<7; i++) {
	        		 if(day==i) answer = week[i];
	        	}
	        	break;
	        case 7:
//	        	b = b+0;
	        	day = b%7;
	        	for(int i=0; i<7; i++) {
	        		 if(day==i) answer = week[i];
	        	}
	        	break;
	        case 8:
	        	b = b+3;
	        	day = b%7;
	        	for(int i=0; i<7; i++) {
	        		 if(day==i) answer = week[i];
	        	}
	        	break;
	        case 9:
	        	b = b+6;
	        	day = b%7;
	        	for(int i=0; i<7; i++) {
	        		 if(day==i) answer = week[i];
	        	}
	        	break;
	        case 10:
	        	b = b+8;
	        	day = b%7;
	        	for(int i=0; i<7; i++) {
	        		 if(day==i) answer = week[i];
	        	}
	        	break;
	        case 11:
	        	b = b+4;
	        	day = b%7;
	        	for(int i=0; i<7; i++) {
	        		 if(day==i) answer = week[i];
	        	}
	        	break;
	        case 12:
	        	b = b+6;
	        	day = b%7;
	        	for(int i=0; i<7; i++) {
	        		 if(day==i) answer = week[i];
	        	}
        }
        return answer;
    }
}