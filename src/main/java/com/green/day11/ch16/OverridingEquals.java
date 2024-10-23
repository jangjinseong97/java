package com.green.day11.ch16;

import com.green.day07.ch10.StaticImport;

public class OverridingEquals {
    public static void main(String[] args) {
        String s1 = "10";
        String s2 = "10";
        NumBox n1 = new NumBox(10);
        NumBox n2 = new NumBox(10);
        NumBox n3 = new NumBox(13);

        System.out.println("n1: " + n1);
        // 아래 override로 인해 나오게 되는것
        // 해두지 않았을때 파일의 주소가 나오는것은 NumBox의 toString()으로 인해 나오게 되는것
        System.out.println("n2: " + n2);
        System.out.println(s1.equals(s2));
        System.out.println("n1 == n2 " +(n1 == n2));
        // 주소값이 달라서 > n1으로 생성한 객체와 n2로 생성한 객체는 다른 객체이므로
        // 생성자를 2번 호출했는데 그때마다 객체가 만들어짐 > 같은곳에 만들어 질 수는 없으므로 두개는 달라지는것
        System.out.println("n1.equals(n2) " + (n1.equals(n2)));
        System.out.println(s1.equals(s2));

        System.out.println(n1.equals(s1)); // false
        System.out.println(n1.equals(n2)); // true 뜨게
        System.out.println(n1.equals(n3)); // false 뜨게
        // 똑같이 상속받아서 NumBox의 변수지만 equals를 쓸수 있는것
        // 여기서 false가 뜨는 이유는 Object의 equals는 == 비교랑 같은것이므로
        // String을 사용할때 true가 나오는것은 Stirng에서 equals를 오버라이딩 해둔것이므로 Object에서 쓰는것과 달라서
    }
}

class NumBox {
    private int num;

    NumBox(int num){
        this.num=num;
    }
    @Override
    public String toString(){
        return String.valueOf(num);
        // 위로 알수 있는것 메소드 뒤에 ()가 들어갔기에, static(new 선언없이 만들었기에)
        // , 리턴타입(String), 파라미터(int)
    }
    @Override
    public boolean equals(Object object){
        if(!(object instanceof NumBox)){
            // 일단 다른타입이면 비교하는데 의미가 없으니까
                return false;
        }
        NumBox nb = (NumBox)object;
        return num == nb.getNum();
//        return num == nb.num; // 같은 NumBox라서 가능함
        // n1.equals(n3); 이니까 NumBox의 n1을 equals 로 n3값을 보내 비교한것이므로
        // 즉 n1의 10이 num 저장되어 있는 상황이고 그 값과
        // 새로받은 object의 n3 의 NumBox 판별 > 형변환 > 그 형변환한 n3(기준)에서 num획득 이후 비교
    }
    int getNum(){
        return num;
    }
    // 문자열로도 해결가능 하지만 성능이 별로(속도가 느릴 가능성이 높음)
    public boolean equals2(Object object){
        if(!(object instanceof NumBox)){
            // 일단 다른타입이면 비교하는데 의미가 없으니까
            return false;
        }
            return toString().equals(object.toString());
    }
}
