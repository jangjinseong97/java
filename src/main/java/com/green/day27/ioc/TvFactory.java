package com.green.day27.ioc;

import com.green.day27.*;

public class TvFactory {
    //SingleTon 패턴, 싱글톤 패턴
    // 객체는 딱 하나만 만들어서 돌려쓴다.

    private static TvFactory tvFactory;
    public static TvFactory getInstance(){
        if(tvFactory == null){
            tvFactory = new TvFactory();
        }
        return tvFactory;
        // tvF이 null이면 새로운 TvF주소값을 tvF에 넣고 그값을 반환
        // 즉 null이 아니라면 이미 들어와 있는 값을 그대로 반환
    }

    private TvFactory() {
    } // 생성자에 private를 붙여서 외부에서는 생성자로는 값에 접근이 안되게

    public Tv factory(String tvName, String speakerName, String wooferName){
        Woofer woofer = switch (wooferName){
            case "hanil" -> new HanilWoofer();
            case "marten"-> new MartenWoofer();
            default -> null;
        };

        Speaker speaker = switch (speakerName){
            case "bose" -> new BoseSpeaker(woofer);
            case "genelec" -> new GenelecSpeaker(woofer);
            default -> null;
        };

        return switch (tvName){
            case "lg" -> new LgTv(speaker);
            default -> null;
        };
    }
}
