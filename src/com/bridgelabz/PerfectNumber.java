package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
	int n,sum=0;
	Scanner Scan = new Scanner(System.in);
	System.out.println("Enter the no:");
	 n=Scan.nextInt();
	   int i =1;
		while(i<=n/2) {
		  if(n % i == 0) {
			sum = sum+i;
	}
		i++;
}
	if(sum==n) {
	 for(i=1;i<=n/2;i++) {
		if(n%i==0 && i!=n/2)
	System.out.print(i+" + ");
	else {
      if(n%i==0 && i==n/2)
	System.out.println(i);
     }
   }
  }
}	

		

	}

}
