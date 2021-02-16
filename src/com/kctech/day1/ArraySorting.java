package com.kctech.day1;
class Assending{
	void  arrayAssending(){
		int arr[]= {10,56,56,32,12,9,8};
		int l=arr.length;
		System.out.println("After sorting in Assending order");
		for(int i=0;i<=l-1;i++) {
			for(int j=i+1;j<=l-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=0;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
				}
			}
			System.out.println(arr[i]);
		}
		
		
	}
}
class Desending{
	void  arrayDesending(){
		int arr[]= {10,56,56,32,12,9,8};
		int l=arr.length;
		System.out.println("After sorting in Desending order");
		for(int i=0;i<=l-1;i++) {
			for(int j=i+1;j<=l-1;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=0;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
				}
			}
			System.out.println(arr[i]);
		}
		
		
	}
}

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assending a= new Assending();
		Desending d= new Desending();
		a.arrayAssending();
		d.arrayDesending();
	}

}
