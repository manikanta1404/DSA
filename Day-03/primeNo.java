// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    boolean prime(int n){
       if(n>=2){
            for (int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
       }
       return false;
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        int n = sc.nextInt();
       for(int i=1;i<=n;i++){
            boolean res = obj.prime(i);
        if(res){
            System.out.println(i+" is prime");
        }
        else{
            System.out.println(i + " is not prime");
        }
       }
        
    }
}
