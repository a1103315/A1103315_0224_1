import java.util.*;

public class A1103315_0224_1{
    public static void main(String[] argv){
        Scanner input=new Scanner(System.in);

        System.out.print("請輸入一個整數:");
        int num = input.nextInt();

        if(num%2==0){
            System.out.println(num+"是偶數");
        }
        else{
            System.out.println(num+"是奇數");
        }
    }
}
    
