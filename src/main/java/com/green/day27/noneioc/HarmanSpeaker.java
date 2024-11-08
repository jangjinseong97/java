package com.green.day27.noneioc;

import com.green.day27.HanilWoofer;
import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class HarmanSpeaker implements Speaker {
    private Woofer woofer;// null인 상태였어서 에러가 터졌던것
    // 생성자로 어떤 woofer인지 넣어줬어야 됬다.

    public HarmanSpeaker(){
        this.woofer= new HanilWoofer();
        // 구현된 클래스이므로 public이 필수
    }

    @Override
    public void speakerSound() {
        System.out.println("HarmanSpeaker: 소리가 웅장하다,");
        woofer.baseSound();
    }
}
