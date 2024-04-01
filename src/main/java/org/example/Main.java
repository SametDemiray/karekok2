package org.example;

// Girilen bölüm sayısına göre kök 2 değerini hesaplayan program.
// Bu programın temel mantığı, Heron formülü veya Babylonian yöntemi olarak da bilinen bir yöntemi kullanarak kök 2 değerini
// hesaplamaktadır. Bu yöntemde, bir sayının karekökü yaklaşık olarak tekrar tekrar yeniden hesaplanarak bulunur.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      double t = 1;
      int n,i;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bölme Sayısı : ");
        n = scanner.nextInt();

        for (i=0; i<n; i++)
            t = 2+1/t;
        System.out.printf("Karekök(2) = %f \n",1+1/t);

    }
}