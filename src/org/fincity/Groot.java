package org.fincity;

import java.util.Scanner;

public class Groot {
   public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER THE ARRAY LENGTH");
	int len = s.nextInt();
	int b[]=new int[len];
	int num=0;
	while(num<len) {
		System.out.println("ENTER THE SWEETNESS OF PEES");
		int val = s.nextInt();
		b[num++]=val;
	}
	System.out.println("ENTER THE DESIRED SWEETNESS");
	int desiredno = s.nextInt();
	System.out.println("DESIRED SWEETNESS IS "+desiredno);
	for(int i=0;i<b.length;i++) {
		if(b[i]==desiredno) {
			System.out.println("pies groot to consume is ");
			System.out.println(i);
			System.out.println();
		}
		for(int j=0;j<b.length;j++) {
			if((b[i]+b[j])==desiredno) {
				System.out.println("pies groot to consume is ");
				System.out.println(i);
				System.out.println(j);
				System.out.println();
			}
		}
	}
}
}
