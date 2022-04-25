package Exesice;

public class twoDimentionalArray {
	public static void main (String args[]){
		int Table[][]=new int[10][10];
		int row=1,column=1;
		for(int i=0; i<Table.length; i++){
		   for(int j=0; j<Table[i].length; j++){
		     Table[i][j]=row*column;
		     column=column+1;
		}
		row=row+1;
		column=1;
		}
		for(int i=0; i<Table.length; i++){
		   for(int j=0; j<Table[i].length; j++){
		     System.out.print(" "+Table[i][j]+"\t| ");
		}
		System.out.print("\n");

		}
		}
	}
	
	
	