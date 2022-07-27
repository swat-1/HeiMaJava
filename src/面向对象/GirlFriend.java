package 面向对象;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;


    //针对于每一个private的私有化的成员变量都要提供set和get方法
    //set方法:给成员变量赋值或限定范围
    //get方法:对外提供成员变量的值让外界能够调用这个变量

    //name:
    //作用:给成员变量name进行赋值
    public void setName(String s) {
        name = s;
    }
    //对外提供name属性的
    public String getName() {
        return name;
    }
    //age:
    public void setAge(int a) {
        if (a >= 18 && a <= 50) {
            age = a;
        } else {
            System.out.println("非法参数");
        }
    }
    public int getAge() {
        return age;
    }
    //gender:
    public void setGender(String g) {
        gender = g;
    }
    public String getGender() {
        return gender;
    }

    public void sleep() {
        System.out.println("在吃饭");
    }

    public void eat() {
        System.out.println("在睡觉");
    }
}
