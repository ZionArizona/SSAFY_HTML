package com.ssafy.day06.a_generic.wild;

import java.util.Calendar;

import com.ssafy.day06.a_generic.box.GenericBox;

public class WildTypeExercise {

    // TODO:GenericBox에 담긴 내용물을 확인하는 메서드를 작성해보자.
     public void printInfo(GenericBox box) {}

    // END

    // TODO: Number의 하위 타입을 가질 수 있는 두 개의 GenericBox를 파라미터로 받고 세번째 파라미터는 원하는 결과의 타입으로 I or D이다.
    //  파라미터에 따라 intValue, doubleValue의 합을 반환하는데 이외의 타입이 오면 '타입오류'라고 반환한다.
     public GenericBox addAll(GenericBox gb1, GenericBox gb2, char type) { return null;}

    // END

    public static void main(String[] args) {
        WildTypeExercise test = new WildTypeExercise();
        Object[] params = { 3.14, "Hello", Calendar.getInstance() };
        for (Object obj : params) {
            test.printInfo(new GenericBox<>(obj));
        }

        char[] types = { 'I', 'D', 'S' };
        for (char t : types) {
            // TODO: test.addAll을 호출해보자.
             GenericBox result = test.addAll(new GenericBox<>(1), new GenericBox<>(2.0), t);

            // END
            System.out.println(result);
        }

    }
}
