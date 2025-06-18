package ch15;

import java.util.ArrayList;

/*
    The ArrayList is a dynamic array implementation in Java that provides flexible size,
    type safety, and convenient methods for data manipulation. Unlike traditional arrays with fixed sizes,
    ArrayLists dynamically expand and shrink as elements are added or removed,
    providing more flexibility for data manipulation.

   => arraylist는 자바에서 자동으로 움직이는?조절되는 뭐시기 배열.
      배열보다 더 쉽게 데이터를 다룰수 있음
      원래 배열은 크기가 fix되어 있는데, arrayslist는 요소를 추가하거나 삭제할떄 크기가 자동으로 맞춰준다.
      또, 타입을 선택할수 있고 데이터를 다루는 편리한 메서드를 준다.
*/
public class MyArrayListExample {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        int length = list.size();
        list.checkValues();
        System.out.println("length: " + length);
        list.add("가");
        list.checkValues();
        list.add("나");
        list.checkValues();

        String str = list.get(0);
        System.out.println("str: " + str);
        System.out.println("list.get(1): " + list.get(1));
        list.add("다");
        list.add("라");
        list.checkValues();
        list.add(1, "크");
        list.checkValues();

        String str2 = list.remove();
        System.out.println("str2: " + str2); // 라
        list.checkValues(); // [가,크,나,다]

        String str3 = list.remove(1);
        System.out.println("str3: " + str3);// 크
        list.checkValues();//[가,나,다]

    }
}
