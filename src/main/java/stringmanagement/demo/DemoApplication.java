package stringmanagement.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//My Changes
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        main();
        main1();
        heapDemo();
        test();
        spring();
    }
    public static void main(){
        //String.......
        System.out.println("String operation.....");
        String str=new String("pankaj");
        System.out.println(str +"-->"+str.hashCode());

        String str2=new String("pankaj");
        System.out.println(str2 +"-->"+str2.hashCode());

        System.out.println(str==str2);
        System.out.println(str.equals(str2));

        String s=new String("pk");
        String s1=s;
        System.out.println(s.hashCode()+" s<-->s1 "+s1.hashCode());
        System.out.println(s==s1);
        System.out.println(s.equals(s1));


    }
    public static void main1(){
        //StringBuffer......
        System.out.println("StringBuffer opration ..........");
        StringBuffer sb=new StringBuffer("pankaj");
        System.out.println(sb+"-->"+sb.hashCode());
        //str.append("Kshirsagar");
        //System.out.println(str);
        StringBuffer sb1=new StringBuffer("pankaj");
        System.out.println(sb1+"-->"+sb1.hashCode());

        System.out.println(sb==sb1);
        System.out.println(sb.equals(sb1));

        //StringBuffer...........

    }

    public static void heapDemo(){
        String str=new String("syn");
        System.out.println(str.hashCode());
        str.concat("ic");
        System.out.println(str.hashCode());
        str=str.concat("s");
        System.out.println(str);
        System.out.println(str.hashCode());

        System.out.println("=========================");
        String a=new String("Spring");
        System.out.println(a.hashCode());
        a.concat("fall");
        System.out.println(a.hashCode());
        String a1=a.concat("winter");
        System.out.println(a1.hashCode()+"<===>"+a.hashCode());
        a1.concat("summer");
        System.out.println(a1.hashCode());
        System.out.println(a);
        System.out.println(a1);
    }

    public static void test(){
        System.out.println("=====test===========");

        String s1=new String("You cannot change me");
        System.out.println("s1==>"+s1.hashCode());
        String s2=new String("You cannot change me");
        System.out.println("s2==>"+s2.hashCode());
        System.out.println(s1==s2);//false

        String s3="You cannot change me";
//        System.out.println("s3==>"+s3.hashCode());
        System.out.println(s1==s3);//false

        String s4="You cannot change me";
  //      System.out.println("s4==>"+s4.hashCode());
        System.out.println(s3==s4);//true


        String s5="You cannot"+"change me";
    //    System.out.println("s5==>"+s5.hashCode());
        System.out.println(s4==s5);//f

        String s6="You cannot";
      //  System.out.println("s6==>"+s6.hashCode());

        String s7=s6+"change me";
        //System.out.println("s7==>"+s7.hashCode());
        System.out.println(s4==s7);

        String s8="You cannot";
        //System.out.println("s8==>"+s8.hashCode());
        //System.out.println(s4==s9);

        String s9=s8+"change me";
        //System.out.println("s9==>"+s9.hashCode());
        System.out.println(s4==s9);


    }

    public static void spring(){
        System.out.println("========spring============");
        String s1=new String("Hello java");
        String s2=new String("Hello java");

        String s3="Hello";

        String s4=s3+"java";
        System.out.println(s2==s4);
        String s5="Hello"+"java";
        System.out.println(s4==s5);

    }

}
