  import java.util.*;
   class menu
    {
      public static void main(String args[])
       {
         Scanner sc=new Scanner(System.in);


         int price;
         int a=1,b=2,h=3,d=4,e=5,x=6,y=7,z=8,g=9,t=10;

         System.out.println("Menu");
         System.out.println("1. Burger");
         System.out.println("2. pizza");
         System.out.println("3. Roll");
         System.out.println("4. Chicken");   
         System.out.println("5. mutton");
         System.out.println("6. Kebab");
         System.out.println("7. Brust");
         System.out.println("8. potato chips");
         System.out.println("9. Bryani ");
         System.out.println("10. Cold drink");

         System.out.println("Enter Choices(1-10):");
         price=sc.nextInt();

         switch(price)
         {
         case 1:
         System.out.println("250 Rupees");
         break;

         case 2:
         System.out.println("600 Rupees:");
         break;

         case 3:
         System.out.println("50 Rupees:");
         break;

         case 4:
         System.out.println("1400 Rupees:");
         break;

         case 5:
         System.out.println("3000 Rupees:");
         break;

         case 6:
         System.out.println("400 Rupees:");
         break;

         case 7:
         System.out.println("450 Rupees:");
         break;

         case 8:
         System.out.println("50 Rupees:");
         break;

         case 9:
         System.out.println("150 Rupees:");
         break;

         case 10:
         System.out.println("150 Rupees:");
         break;

         default:
         System.out.println("Please Enter Correct choice");

         }




  }


}