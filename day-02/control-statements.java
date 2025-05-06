//Fibonacci serie
class main{

     public static void main(String []args){
        System.out.println("Hello, World!");
        int a = 0, b = 1, res = 0;
        int n = 10;
        if (n < 2){
            System.out.println(n);
            
        }
        else{
            for (int i=2; i<=n;i++){
            temp = a + b;
            a = b;
            b = temp;
            
        }
        System.out.println(res);
        }
        
     }
}

