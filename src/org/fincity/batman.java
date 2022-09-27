package org.fincity;

import java.util.Scanner;

public class batman {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("ENTER NO OF PATIENT ESCAPED");
	int no = s.nextInt();
	System.out.println("NUMBER OF PATIENT ESCAPED IS "+no);
	System.out.println("ENTER AT WHAT STEP BATMAN CAUGHT PATIENT");
	int sno = s.nextInt();
		int a=no*sno;	
	System.out.println("NUMBER OF STEP REQUIRED IS "+a);
	}
}

