package com.briup.ch04;
public class YangHui{

public static void main(String[] args){

int[][] Array = new int[7][];
for(int i=0;i<Array.length;i++){
	for(int x=Array.length;x>=i;x--){
    System.out.print(" ");
	}
	Array[i] = new int[i+1]; 
	for(int j=0;j<=i;j++){
        if(j==0||i==j){

          Array[i][j] = 1;

         }else{
    Array[i][j] = Array[i-1][j]+Array[i-1][j-1];

  }

System.out.print(Array[i][j]+" ");
}



System.out.println();
}



}

}
