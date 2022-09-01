package com.test.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q067 {
    public static void main(String[] args) {
        //배열:삽입

        //Integer[] arr = {5, 6, 1, 3, 2, 0, 0, 0, 0,0};
        Integer[] arr = {5, 6, 1, 3, 2, 8, 7, 4, 10, 9};
        int index = 0;
        int value = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("삽입 위치:");
        index = scanner.nextInt();
        System.out.print("값:");
        value = scanner.nextInt();

        System.out.print("원본: ");
        System.out.println(Arrays.toString(arr));

        List<Integer> list = new ArrayList<>(Arrays.asList(arr)); //배열 -> List변환
        list.add(index, value); //List에 값 추가

        arr = list.toArray(arr); //List -> 배열 변환


        System.out.print("결과: ");
        if (arr.length > 10) { //배열 길이가 10을 넘어가면 마지막요소 삭제
            Integer[] arr1 = Arrays.copyOfRange(arr, 0, 10);
            System.out.println(Arrays.toString(arr1));
        } else {
            System.out.println(Arrays.toString(arr));
        }


    }
}
