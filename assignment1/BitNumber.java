package com.assignment1;
import java.util.*;

public class BitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = scanner.nextInt();
        
        System.out.print("Enter the bit position to check: ");
        n = scanner.nextInt();
        
        if ((num & (1 << n)) != 0) {
            System.out.println("The " + n + "th bit of " + num + " is set (1).");
        } else {
            System.out.println("The " + n + "th bit of " + num + " is not set (0).");
        }

    }

	}
