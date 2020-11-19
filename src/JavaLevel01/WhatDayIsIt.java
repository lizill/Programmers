package JavaLevel01;

public class WhatDayIsIt {
    public String solution(int a, int b) {
        String answer = "";
        
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WEN"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int total = 0;
        
        // 2016년 윤년, 1월 1일 금요일
        for(int i=0; i<a-1; i++) {
        	total += month[i];
        }
        answer = week[(total+b)%7];
        return answer;
    }
}