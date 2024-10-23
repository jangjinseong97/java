package com.green.etc.antherblackjack;

public class Card1 {
    public static void main(String[] args) {
        String [] a = {"H", "D", "C", "S"};
        String [] b = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String [][] c = new String[a.length][b.length];
        for(int i=0;i<c.length;i++){
            for(int n=0;n<c[0].length;n++){
                c[i][n] = b[n];
                c[i][n] = a[i];
            }
        }

    }
    private final String pattern;
    private final int denomi;

    Card1(String pattern, int denomi){
        this.pattern=pattern;
        this.denomi=denomi;
    }

    public String getPattern() {
        return pattern;
    }

    public int getDenomi() {
        return denomi;
    }
}
