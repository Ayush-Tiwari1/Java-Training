public class ExceptionPropogation{
   void method1()
      int arr[] = {10,20,30};
      System.out.println(arr[7]);
   }
   void method2()
      method1();
   }
   void method3() 
      try {
         method2();
      } catch(ArrayIndexOutOfBoundsException ae) {
         System.out.println("Exception is caught");
      }
   }
   public static void main(String args[]) {
      Example obj = new Example();
      obj.method3();
   }
}