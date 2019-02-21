package stringmanagement.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

//My Changes
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
       /* main();
        main1();
        heapDemo();
        test();
        spring();
       constructorDemo();*/
       methodDemo();

        Test t1=new Test(20);
        Test t2=t1.modify(100);
        Test t3=t1.modify(20);

        System.out.println(t1==t2);
        System.out.println(t1==t3);

    }
    /*
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
    }*/

    public static void constructorDemo(){
        StringBuffer bf=new StringBuffer("pankaj");
        String s=new String(bf);
        System.out.println(s);

        char ch[]={'p','a','n','k','a','j'};
        System.out.println(ch.hashCode());
        String str=new String(ch);
        System.out.println(str.hashCode());
        System.out.println(str);
        String str1="pankaj";
        System.out.println(str.hashCode()+"<====>"+str1.hashCode());
        System.out.println(str==str1);

        String str2=new String("pankaj");
        System.out.println(str==str2);

        byte b[]={112,97,110,107,97,106};
        String b1=new String(b);
        System.out.println(b1);
        System.out.println(str2==b1);
        System.out.println(str2.equals(b1));
        System.out.println(bf.equals(b1));

    }

    public static void methodDemo(){
        String str=new String("pankaj");
        str+="Kshirsagar";
        System.out.println(str);

        System.out.println(str.charAt(6)+"=="+str.charAt(1));

        String s1="durga";
        String s2=s1.toString();
        String s3=s1.toLowerCase();
        String s4=s1.toUpperCase();

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);

        System.out.println("===================");

        String k="A";
        k=k.concat("B");
        String kb="C";
        k=k.concat(kb);
        k.replace('C','D');
        k=k.concat(kb);
        System.out.println(k);


        StringBuffer buffer=new StringBuffer("Pankaj");
        buffer.append("Kshirsagar");
        System.out.println(buffer);

        buffer=new StringBuffer("pkk");
        System.out.println(buffer);
        System.out.println("===================");






        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your city name.....");
        String city=sc.nextLine().toLowerCase().trim();

        if(city.equals("nashik")){
            System.out.println("ram ram nashik kr.....");
        }
        else if(city.equals("nagar")){
            System.out.println("ram ram nagar kr");
        }
        else if(city.equals("nnb")){
            System.out.println("ram ram nandurbar kr");
        }
        else{
            System.out.println("plz enter valid city");
        }
    }

}

final class Test{
    private int a;

    public Test(int a){//20
        this.a=a;//20
    }

    public Test modify(int a){
        if(this.a==a){
            return this;
        }
        else{
            return new Test(a);
        }

    }
}
