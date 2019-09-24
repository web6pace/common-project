package com.yz.common.core.utils;/**
 * Created with IntelliJ IDEA.
 * User: conglj
 * Date: 2019/4/10
 * Time: 14:18
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName StringSort
 * @Description TODO
 * @Author cong
 * @Date 2019/4/10 14:18
 **/
public class StringSort {


    // 字符串按照整型排序比较器
    static class Str2IntComparator implements Comparator<String> {
        private boolean reverseOrder; // 是否倒序

        public Str2IntComparator(boolean reverseOrder) {
            this.reverseOrder = reverseOrder;
        }

        public int compare(String arg0, String arg1) {
            if (reverseOrder) {
                return Integer.parseInt(arg1) - Integer.parseInt(arg0);
            } else {
                return Integer.parseInt(arg0) - Integer.parseInt(arg1);
            }
        }
    }


    public static void main(String[] args) throws Exception {
        // 生成测试数据
        List<String> stringArrayList = new ArrayList<String>();
        int i =1;
        while (i<10000){
            stringArrayList.add("A0061"+(1+Math.random()*(10000-1+1)));
            i++;
        }


        List<String> stringLinkedList = new LinkedList<>();
        int n =1;
        while (n<10000){
            stringLinkedList.add("A0061"+(1+Math.random()*(10000-1+1)));
            n++;
        }



//
//        // 整型、字符串、日期都是类似的操作；下面只给出字符串的示范
//        System.out.println("当前顺序...");
//        System.out.println(list);
        long time = System.currentTimeMillis();

        Collections.sort(stringArrayList);
        System.out.println("stringArrayList time for quick sort is " + (System.currentTimeMillis() - time) + "ms");
        System.out.println("stringArrayList 默认排序后...");
//        System.out.println(list);

        time = System.currentTimeMillis();
        Collections.sort(stringLinkedList);
        System.out.println("stringLinkedList time for quick sort is " + (System.currentTimeMillis() - time) + "ms");
        System.out.println("stringLinkedList 默认排序后...");
//        System.out.println(linkedList);





//        Collections.sort(list, Collections.reverseOrder());
//        System.out.println("倒序后...");
//        System.out.println(list);



//
//
//        Collections.sort(list, new Str2IntComparator(false));
//        System.out.println("按整型排序后...");
//        System.out.println(list);
//
//        Collections.sort(list, new Str2IntComparator(true));
//        System.out.println("按整型倒序后...");
//        System.out.println(list);
    }

}
