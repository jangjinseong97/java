package com.green.day27.ioc;

import com.green.day27.HanilWoofer;
import com.green.day27.Speaker;
import com.green.day27.Tv;
import com.green.day27.Woofer;

public class IocTest {
    public static void main(String[] args) {
        Woofer hw = new HanilWoofer();
        Speaker bs = new BoseSpeaker(hw);
        LgTv lt = new LgTv(bs);
        lt.sound();

        LgTv lt2 = new LgTv(new BoseSpeaker(new HanilWoofer()));
    }
}

class IocTest2{
    public static void main(String[] args) {
        TvFactory tvFactory = TvFactory.getInstance();
        TvFactory tvFactory2 = TvFactory.getInstance();
        TvFactory tvFactory3 = TvFactory.getInstance();

        System.out.println(tvFactory == tvFactory2);
        System.out.println(tvFactory2 == tvFactory3);
        System.out.println(tvFactory);
        System.out.println(tvFactory2);
        System.out.println(tvFactory3);
    }
}

class IocTest3{
    public static void main(String[] args) {
        System.out.println("--Ioc Test --");
        TvFactory tvFactory = TvFactory.getInstance();
        Tv tv = tvFactory.factory(args[0], args[1], args[2]);
        tv.sound();
    }
}