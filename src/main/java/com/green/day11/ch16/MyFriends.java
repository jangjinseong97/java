package com.green.day11.ch16;

public class MyFriends {
    public static void main(String[] args) {

    }
}

// 아래의 두 클래스는 중복된 내용이 있고 둘다 사람의 정보를 저장함
// 그래서 중복된 내용을 상속으로 처리하면 코드가줄어듬
class UnivFriend{
    private String name;
    private String major;
    private String phone;

    UnivFriend(String name, String major, String phone){
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getPhone() {
        return phone;
    }
}

class CompFriend {
    private String name;
    private String department; // 부서
    private String phone;

    CompFriend(String name, String dm, String phone){
        this.name = name;
        department = dm;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getPhone() {
        return phone;
    }
}