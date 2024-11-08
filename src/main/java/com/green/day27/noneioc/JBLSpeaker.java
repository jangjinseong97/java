package com.green.day27.noneioc;

import com.green.day27.*;

public class JBLSpeaker implements Speaker {
    private Woofer woofer;
    public JBLSpeaker(){
        this.woofer = new MartenWoofer();
    }

    @Override
    public void speakerSound() {
        System.out.println("JBL Speaker: 소리가 깔끔하다.");
        woofer.baseSound();
    }
}
