package com.green.day09.ch13;

public class EnhancedForInst {
    public static void main(String[] args) {
        Product[] arr = new Product[4];
        arr[0] = new Product("Coffee", 5000);
        arr[1] = new Product("Computer", 1_000_000);
        arr[2] = new Product("Apple", 7_000);
        arr[3] = new Product("Dress", 400_000);
        // new xxx >> 생성자
        // 정수열에서 _는 없는처리 쓰는 이유는 단위를 쉽게 알아보기 위하여
        System.out.println(arr[0]); // 제품명 coffee, 가격 5000이 나오도록
        System.out.println(arr[0].toString()); // 객체들은 ln에 들어갈때 toString()
        System.out.println(arr[1]);
        /*
        enhanced-for문을 사용하여 제품명, 가격을 콘솔에 출력, 모든제품의 가격을 더한 값 출력
         */
        int sum = 0;
//        for(int i=0;i<4;i++) {
//            sum +=arr[i].getPrice();
//        }

        for(Product item : arr){
            System.out.println(item);
        }
        // arr의 타입이 가장위에서 Product로 정해졌으므로 Product가 앞에 들어갔어야 됬다.
        for(Product item : arr){
            sum +=item.getPrice();
        }
        // sum +=arr[].getPrice();이 이미 틀린 부분이였다는것

        // Product item에서 이미 arr[0]~ arr[3]을 사용한다는 의미를 내포했으므로
        System.out.println(sum);

        // 배열에서 제품명이 Apple 인것만 찾아서 콘솔에 출력
        for(Product ite : arr){
            if(ite.getName().equals("Apple")) {
                System.out.println(ite);
            }
        }
        // 여기서도 item은 변수명인것이라 바뀔 수 있다.
        for(Product item:arr) {
            if (item.getName() == "Apple") {
                System.out.println(item);
            }
        }
        // 이것도 나오긴 하지만 올바르지 않은 방법같은데
        // 같은 공간이라 위의 ==이 true가 찍히는것 다른공간이면 String이 되어 비교될 가능성이 높아서
        // .equals를 쓰는것이 확실한 방법
    }
}

class Product {
    private String name;
    private int price;

    Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    // 생성자 (()안이 빈것이 아니라 기본 생성자는 아님)
    // private를 앞에 붙이면 중괄호 밖에서는 활동 못하게 되므로 실제론 생성자가 없는 취급이 되어버림
    // private 알아보기

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    @Override // 애노테이션, 실수방지 기능 이걸 사용한 상태서 아래의 toString의 g를 빼면 에러발생
    public String toString(){
        //return "제품명:" + name +", 가격:"+ price;
        return String.format("제품명: %s, 가격: %,d원", name, price);
    }
    // 해당 부분이 없다면 단순 주소값만 반환한다.
    // 오버라이딩

    // private에 값을 넣어줄 방법은 this와 setter(메소드 사용)뿐
//    String name(){
//        this.name = name;
//        return name;
//    }
//    int price(){
//        this.price = price;
//        return price;
//    }

}
