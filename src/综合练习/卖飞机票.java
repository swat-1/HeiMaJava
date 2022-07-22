package 综合练习;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class 卖飞机票 {
    //机票价格按淡季旺季收费(5-10旺季)
    //1.键盘录入机票原价
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入原价机票价格");
        int ticket = sc.nextInt();
        //2.月份
        System.out.println("输入月份");
        int mouth = sc.nextInt();
        //3.头等舱或经济舱
        System.out.println("请输入座舱 0=头等舱 ,1=经济舱");
        int seat = sc.nextInt();
        if (mouth >= 5 && mouth <= 10) {
            //表示进入了旺季
            //判断头等舱或经济舱
            /*if (seat == 0) {
                //头等舱
                ticket = (int) (ticket * 0.9);
            } else if (seat == 1) {
                //经济舱
                ticket = (int) (ticket * 0.85);
            } else {
                System.out.println("没有这个舱位");
            }*/
            ticket = getTicket(ticket,seat,0.9,0.85);//调用方法
        } else if ((mouth >= 1 && mouth <= 4) || (mouth >= 11 && mouth <= 12)) {
            //表示进入了淡季
           /* if (seat == 0) {
                //头等舱
                ticket = (int) (ticket * 0.7);
            } else if (seat == 1) {
                //经济舱
                ticket = (int) (ticket * 0.65);
            } else {
                System.out.println("没有这个舱位");
            }*/
            ticket = getTicket(ticket,seat,0.7,0.65);
        } else {
            System.out.println("键盘录入月份错误");
        }

        //4.根据实际情况计算机票价格
        System.out.println("机票价格:" + ticket);
    }
        //1.我要干嘛?此处写了getTicket方法,根据舱位和折扣计算机票价格
        //2.我需要什么?需要机票原价,舱位,头等舱折扣,经济舱折扣
        //3.需不要返回最后的值?需要返回并输出打印最终的折扣价格
        //4.ctrl + alt + M 是一键生成方法,不咋好用...
    public static int getTicket(int ticket, int seat, double V0, double V1) {
        if (seat == 0) {
            //头等舱
            ticket = (int) (ticket * V0);
        } else if (seat == 1) {
            //经济舱
            ticket = (int) (ticket * V1);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }

}
