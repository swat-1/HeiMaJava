package 面向对象.对象练习1;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;


    //针对于每一个private的私有化的成员变量都要提供set和get方法
    //set方法:给成员变量赋值或限定范围
    //get方法:对外提供成员变量的值让外界能够调用这个变量

    //对外提供name属性的
    public String getName() {
        return name;
    }

    //name:
    //作用:给成员变量name进行赋值
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    //age:
    public void setAge(int a) {
        if (a >= 18 && a <= 50) {
            age = a;
        } else {
            System.out.println("非法参数");
        }
    }

    public String getGender() {
        return gender;
    }

    //gender:
    public void setGender(String g) {
        gender = g;
    }

    public void sleep() {
        System.out.println("在吃饭");
    }

    public void eat() {
        System.out.println("在睡觉");
    }
}
