package com.green.day27.noneioc;

import com.green.day27.*;

public class SamsungTv implements Tv {
    private Speaker speaker;
    public SamsungTv(){
//    public SamsungTv(Speaker speaker){
//        this.speaker = speaker;
//        this.speaker = new HarmanSpeaker();
        this.speaker = new JBLSpeaker();
        // speaker로 구현된 HarmanSpeaker였으므로 객체주소값을 넣는것이 가능
    }

    @Override
    public void sound() {
        System.out.println("Samsung Tv: 소리가 난다.");
        speaker.speakerSound();
    }
}
