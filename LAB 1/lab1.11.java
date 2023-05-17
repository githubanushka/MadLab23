class Main
{  
public static void main(String[] args)  
{  
int rows=4;  
for (int i= 0; i<= 4-1; i++)  
{  
for (int j=0; j<=i; j++)  
{  
System.out.print(" ");  
}  
for (int k=0; k<=4-1-i; k++)  
{  
System.out.print("*" + " ");  
}  
System.out.println();  
}  
}  
}