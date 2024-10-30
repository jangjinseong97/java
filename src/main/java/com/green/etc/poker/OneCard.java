package com.green.etc.poker;

public class OneCard {
    private String pattern;
    private String dem;
    private String joker="";
    OneCard(String pattern, String dem){
        this.pattern=pattern;
//        this.dem=dem;
        this.dem = dem != null ? dem : "";
    }
    OneCard(String joker){
        this.joker=joker;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDem() {
        return dem;
    }
    public String getJoker(){
        return joker;
    }
    public String toString(){
        if(joker.equals("")){
            return String.format("%s(%s)", pattern,dem);
        } else {
            return String.format("%s",joker);
        }
    }
}
