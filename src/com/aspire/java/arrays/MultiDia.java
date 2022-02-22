package com.aspire.java.arrays;

public class MultiDia
{
	public static void main(String[] args) 
	{
		int[][] a= {{0,1,2},{5,6,7,8,9,20},{10,11,12,13,14},{15,16,17,18,19}};	
		int[][] g={{0,1,2,3,4},{5,6,7,8,9},{10,11,12,13,14},{15,16,17,18,19}};
		int[][] f= new int[2][3];
		f[0][0]=0;
		f[0][1]=1;
		f[0][2]=2;
		//f[0][3]=3;	//extra
		//f[0][4]=4;	//extra
		f[1][0]=5;
		f[1][1]=6;
		f[1][2]=7;
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<g[i].length;j++)
			{
				System.out.print(g[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(f[i][j]+" ");
			}
			System.out.println();
		}
	}

}
