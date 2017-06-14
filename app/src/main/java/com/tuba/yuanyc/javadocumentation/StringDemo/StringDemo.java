package com.tuba.yuanyc.javadocumentation.StringDemo;

/**
 * Author ：yuanyc
 * Time ：2017/6/14
 * Description ：String类说明：
 * <p>1、是被final修饰不可继承</p>
 * <p>2、实现了Comparable接口：此接口强行对实现它的每个类的对象进行整体排序。这种排序被称为类的自然排序，类的 compareTo 方法被称为它的自然比较方法。比较此对象与指定对象的顺序。如果该对象小于、等于或大于指定对象，则分别返回负整数、零或正整数。</p>
 * <p>3、实现了CharSequence接口：实现了此接口中的charAt：返回指定索引的 char 值，length：返回此字符序列的长度等方法</p>
 * <p>4、实现了Serializable接口：让其可序列化</p>
 */

public class StringDemo {
    private String test = "abcdefg0123456";
    private String test_concat = "abc";
    private char[] chars = {'p','p'};
    private char[] targetChars;
    public void method_1(){
        System.out.println("codePointAt方法测试:"+test.codePointAt(1));
        System.out.println("codePointBefore方法测试:"+test.codePointBefore(4));
        System.out.println("codePointCount方法测试:"+test.codePointCount(0,5));
        System.out.println("concat方法测试:"+test.concat(test_concat));
        System.out.println("contentEquals方法测试:"+test.contentEquals(test_concat));
        System.out.println("contentEquals方法测试:"+test.contentEquals(test));
        System.out.println("copyValueOf方法测试:"+String.copyValueOf(chars));
        System.out.println(String.format("Hi,%s:%s.%s", "王南","王力","王张"));
        //将字符从此字符串复制到目标字符数组
        targetChars = new char[test.length()];
        //要复制的第一个字符位于索引 srcBegin 处；要复制的最后一个字符位于索引 srcEnd-1 处（因此要复制的字符总数是 srcEnd-srcBegin）
        test.getChars(0,test.length(),targetChars,0);
        System.out.println(targetChars);
        //返回字符串对象的规范化表示形式
        System.out.println("intern方法测试:"+test.intern());
        boolean regionMatches = test.regionMatches(true, 0, test_concat, 0, 3);
        System.out.println("regionMatches方法测试:"+regionMatches);
        String replace = test.replace("a", "m");
        System.out.println("replace:"+replace);
        String replace1 = test.replace("a", "hhh");
        System.out.println("replace1:"+replace1);
        String replaceAll = test.replaceAll("\\d", "");
        System.out.println("replaceAll:"+replaceAll);


    }
}
