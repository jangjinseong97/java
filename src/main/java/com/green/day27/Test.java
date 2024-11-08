package com.green.day27;

import com.green.day27.ioc.BoseSpeaker;
import com.green.day27.ioc.LgTv;
import com.green.day27.noneioc.HarmanSpeaker;
import com.green.day27.noneioc.SamsungTv;

public class Test {
    public static void main(String[] args) {
        HarmanSpeaker a = new HarmanSpeaker();
//        a.speakerSound();
        SamsungTv b = new SamsungTv();
//        SamsungTv b = new SamsungTv(a);
        b.sound();

    }
}
