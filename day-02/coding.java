// /* Online Java Compiler and Editor */
// public class HelloWorld{

//      public static void main(String []args){
//         System.out.println("Hello, World!");
//         Student st = new Student();
//         st.setage(12);
//         int age = st.getage();
//         System.out.printf("%d", age);
        
//         st.setname("name1");
//         String name = st.getname();
//         System.out.println(name);
        
        
        
        
//      }
// }

// class Student{
//     int age; String name;
//     boolean passout;
//     long ERP;
//     float marks;
//     void setage(int age){
//         this.age = age;
        
//     }
//     int getage(){
//         return age;
//     }
    
//     void setname(String name){
//         this.name = name;
//     }
//     String getname(){
//         return name;
//     }
    
//     void setpassout(boolean passout){
//         this.passout = passout;
//     }
//     boolean getpassout(){
//         return passout;
//     }
    
//     void marks(float marks){
//         this.marks = marks;
//     }
    
//     float getmarks(){
//         return marks;
//     }
    
//     void seterp(long ERP){
//         this.ERP = ERP;
        
//     }
    
//     long geterp(){
//         return ERP;
//     }
    
    
    
    
// }




//recuression for fibonociss
/* Online Java Compiler and Editor */
// public class HelloWorld{

//      public static void main(String []args){
//         System.out.println("Hello, World!");
//         Recurssion rc = new Recurssion();
//         int res = rc.rec(10);
//         System.out.printf("%d", res);
//      }
// }

// class Recurssion{
//     int n;
//     int rec(int n){
//         if(n==0 || n==1){
//             return n;
//         }
//         else{
//             return (rec(n-1) + rec(n-2));
//         }
//     }
// }

// factorial
// /* Online Java Compiler and Editor */
// public class HelloWorld{

//      public static void main(String []args){
//         System.out.println("Hello, World!");
//         Factorial fc = new Factorial();
//         int res = fc.factorial(5);
//         System.out.println(res);
//      }
// }

// class Factorial{
//     int n;
//     int factorial(int n){
//             if (n==0 || n==1){
//                 return 1;
//             }
//             else {
//                 return (n * factorial(n-1));
//             }
        
//     }
// }

//finding HCF
/* Online Java Compiler and Editor */
// public class HelloWorld{

//      public static void main(String []args){
//         System.out.println("Hello, World!");
//         Hcf hcf = new Hcf();
//         int res = hcf.hcf(30,12);
//         System.out.println(res);
//      }
// }

// class Hcf{
//     int n;
//     int m;
    
//     int hcf(int n, int m){
//         if(m==0){
//             return n;
            
//         }
//         else{
//             return (hcf(m, (n%m)));
//         }
//     }
// }
