import java.util.Scanner;
class Reverse{
    public static void main(String args[]){
        int reverse=0;
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
int num=s.nextInt();
while(num>0){
        int last=num%10;
    reverse=(reverse*10)+last;
    num=num/10;
  }
  System.out.println("reverse of a number is"+reverse);
}
}

    
