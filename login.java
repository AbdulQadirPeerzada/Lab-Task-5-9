  import java.util.Scanner;
    class login
    {
       public static void main(String[] args)
        {

           Scanner in=new Scanner(System.in);
           String username,password;
           System.out.println("Enter email");
           username=in.next();
           System.out.println("Enter password");
           password=in.next();


            if(username.equals("qadir778@gmail.com")
               &&password.equals("qadir908"))
            System.out.println("Login Success");

                else
                System.out.println("Wrong username or password");
         }
     }