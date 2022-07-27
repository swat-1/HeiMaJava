package 面向对象.对象练习1;


public class GirlFriendTest {
    public static void main(String[] args) {
        //创建对象
        GirlFriend gf1 = new GirlFriend();
        //对成员变量进行赋值
        gf1.setName("呵呵");
        gf1.setAge(18);
        gf1.setGender("女");

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.eat();
        gf1.sleep();

    }

}
