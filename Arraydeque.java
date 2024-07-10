package com.array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Arraydeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> deque = new ArrayDeque<>();
		Scanner sc = new Scanner(System.in);
		deque.add(2);
		deque.add(4);
		deque.add(6);
		deque.add(8);
		deque.add(10);
		deque.add(12);
		System.out.println();
		//System.out.println(deque);
		for(int i : deque) {
			System.out.print(( i ) + " ");
			
		}
		System.out.println();

		System.out.println("Enter Element you are removing: ");
		int remEle = sc.nextInt();
		deque.remove(Integer.valueOf(remEle));
		System.out.println("After Removing "+ remEle + " From list of Element " );
		
		for(int i : deque) {
			System.out.print(( i ) + " ");
			

	}
	}
}
