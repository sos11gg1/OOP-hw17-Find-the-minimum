package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�п�J5�ӼƦr:");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();
        int arr[]={A,B,C,D,E};
        int MIN=arr[0];
        for(int i=1;i<5;i++){
            if (arr[i]<MIN){
                MIN=arr[i];
            }
        }
        System.out.print("�̤p�Ȭ�"+MIN);
    }
}
