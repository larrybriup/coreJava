package com.briup.ch04;
public class MultiArray{
public static void main(String[] args){

//int[][] array = new int[3][4];
	int[][] array = //new int[][]
	{{1,2},{3,33,333},{4,5,6}};
for(int i=0;i<array.length;i++){
//array[i] = new int[i+2];
for(int j=0;j<array[i].length;j++){
//array[i][j] = i + j;
System.out.println("array["+i+"]["+j+"]="+array[i][j]);

}
}int[][][] iArray = new int[2][][];

iArray[0] = new int[2][];

iArray[0][0] = new int[2];
iArray[0][1] = new int[3];
iArray[0][1][0] = 100;

System.out.println(iArray[0][0][0]+" "+iArray[0][1][0]);
}




}
