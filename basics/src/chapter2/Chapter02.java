package chapter2;

/**
 * @author : liulinzhi
 *  * @date: 2020/04/03/11:40
 *  * @description:
 *  第二章：java自动拆箱和装箱
 *  8   32       32    16    64     64             16bit unicode
 *Byte Integer Float Short Double Long Boolean Character.MAX_VALUE/MIN_VALUE
 *
 */
public class Chapter02 {
    public static void main(String[] args){
        //test MAX_VALUE MIN_VALUE
        int i_max = Integer.MAX_VALUE;
        int i_min = Integer.MIN_VALUE;
        System.out.println(i_min);

        //自动装箱
        Integer inte = 10;//其实调用了ValueOf
        //自动拆箱
        int i = inte;//其实用了intValue（）
        /*Integer source code
        *
        * */
        //再double和Double来验证一下
        Double doub = 12.40;
        double d = doub;//用了ValueOf

//        Integer a1 = 1;
//        Integer a2 = 1;
//        Integer a3 = 129;
//        Integer a4 = 129;
//        Integer a5 = new Integer(1);
//        System.out.println(a1 == a2);//true
//        System.out.println(a3 == a4);//false
//        System.out.println(a1 == a5);//false
        Integer a1 = 128;
        Integer a2 = -128;
        Integer a3 = -128;
        Integer a4 = 128;
        System.out.println(a1 == a4);
        System.out.println(a2 == a3);
        Byte b1 = 127;
        Byte b2 = 127;
        Byte b3 = -128;
        Byte b4 = -128;
        //byte都是相等的，因为范围就在-128到127之间
        System.out.println(b1 == b2);
        System.out.println(b3 == b4);

        //
        Long c1 = 128L;
        Long c2 = 128L;
        Long c3 = -128L;
        Long c4 = -128L;
        System.out.println(c1 == c2);
        System.out.println(c3 == c4);

        //char没有负值
        //发现char也是在0到127之间自动拆箱
        Character d1 = 128;
        Character d2 = 128;
        Character d3 = 127;
        Character d4 = 127;
        System.out.println(d1 == d2);
        System.out.println(d3 == d4);

        String s = new String("1");//"1" in String pool
        s.intern();//find "1"
        String s2 = "1";//point "1" in String pool
        System.out.println(s == s2);//false
        String s3 = new String("1") + new String("1");//1 in String pool
        s3.intern();//have not find "11",gengerate 引用s3 address
        String s4 = "11";//point s3
        System.out.println(s3 == s4);//true




    }
}
