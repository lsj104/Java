package com.test.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q068 {
    public static void main(String[] args) {
        //배열 삭제

        //Integer [] arr = {5, 6, 1, 3, 2, 0, 0, 0, 0,0};
        Integer[] arr = {5, 6, 1, 3, 2, 8, 7, 4, 10, 9};
        int index = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("삭제 위치:");
        index = scanner.nextInt();

        System.out.print("원본: ");
        System.out.println(Arrays.toString(arr));

        List<Integer> list = new ArrayList<>(Arrays.asList(arr)); //배열 -> List변환
        list.remove(index); //List에 값 추가

        if (list.size() < 10) { //마지막 요소 0으로 채우기
            list.add(9, 0);
        }
        arr = list.toArray(arr); //List -> 배열 변환

        System.out.print("결과: ");
        System.out.println(Arrays.toString(arr));
    }
}
