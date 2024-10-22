package com.green.day11.ch16;

public class MyFriends2 {
    public static void main(String[] args) {
        UnivFriend2[] arr = new UnivFriend2[3];
        CompFriend2[] arr2 = new CompFriend2[3];
        // 다형성: 다양한 형태가 될 수 있는 성절 >> 변수타입과 객체 다른데 저장할 수 있다.
        UnivFriend2 b = new UnivFriend2("a","b","c");
        Friend f1 = b; //Friend와 UnivFriend2 의 변수타입과 객체는 다른데 저장이 되는 모습
        Friend f2 = new UnivFriend2("다","향","성");
        // 이는 상속관계에서만 가능하다. 이를 다형성이라고 부른다.
        // 기존이라면 Friend f2는 Friend의 객체 주소값을 담을 수 있는 f2 레퍼런스 변수인데
        // 상속관계라면 상속받는 객체의 주소값도 담을 수 있다.
        Friend[] arr3 = new Friend[10];
        arr3[0] = b;
        arr3[1] = f2;
        arr3[2] = new CompFriend2("Y", "R&B1", "1231");
        // Friend[] 만 저장되어야 되지만 Friend를 상속받는 CompFriend2도 저장이 되는 모습
        arr3[3] = new CompFriend2("P", "R&B2", "3122");

        arr3[0].showInfo();
        for(int i=0;i<arr3.length;i++){
            if(arr3[i] == null){
                break;
            }
            arr3[i].showInfo();
            System.out.println("-------");
        }
        // 이러면은 null이 되는 순간 break 가 나므로 뒤에꺼가 null이 아닌 경우 문제가 생김

        for(int i=0;i<arr3.length;i++){
            // Friend a = arr3[i]; 로 따로 지정 해줬으면 아래에서 연산을 덜했을 것
            if(arr3[i] != null){
                arr3[i].showInfo();
                System.out.println("---------");
            }
        }

    }
}
class Friend{
    protected String name;
    protected String phone;
//    Friend(){
//
//    }
    Friend(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
    public void showInfo(){

        System.out.println("이름: " + name);
        System.out.println("전화: " + phone);
    }
}

class UnivFriend2 extends Friend{
    // 부모의 기본 생성자가 없어서 밑줄이 나왔던것. 혹은 super(); 에 위의 생성자에 맞게 값을 넣어주면 된다.
    private String major;
    UnivFriend2(String name, String major, String phone){
//        super("a","b");
        super(name, phone); // super위치는 무조건 여기ㅇ여야 되는가?
        this.major=major;
    }
    @Override
    public void showInfo(){
//        Friend a = new Friend();
//        a.showInfo();
        // 위에서 void 였는데 다른 값이 없는 변수를 지정하여 보낸걸로 showInfo(); 해서 name과 phone의 값이 없어진것
        super.showInfo();
        // super.로 부모의 메소드를 호출한 것 이러면 이름이 겹쳐도 괜찮다
        System.out.println("전공: "+major);
    }

    public String getMajor() {
        return major;
    }
}

class CompFriend2 extends Friend{
    private String  department;
    CompFriend2(String name, String department, String phone){
        super(name, phone);
        this.department=department;
    }
    public String getDepartment(){
        return department;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("부서: " + department);
    }
}

//CompFriend와 UnivFriend는 같은 부모를 가지지만 두개의 연관성은 없다( 형제의 개념이 없음 )