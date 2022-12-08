package login;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        String userName , password , answer , newPassword;

        Scanner i = new Scanner(System.in);

        System.out.print("Enter username : ");
        
        userName = i.nextLine();

        System.out.print("Enter password : ");

        password = i.nextLine();

        if((userName.equals("patika")) && (password.equals("java1234")) ) {

            System.out.println("Login Successs!!!");

        }
        else{
            System.out.print("Wrong username and password  forgot your password (Yes/No) : ");
             
            answer = i.nextLine();

            if (answer.equals("Yes")){
                
                System.out.print("Enter a new password : ");
                
                newPassword = i.nextLine();
                 
                i.close();

                if (!newPassword.equals("java1234")){
                    
                    System.out.println("Password Changed ");

                } else{
                    System.out.println("Your new password must be different from current password.");
                }




            }

        }

    }
    
}
 

                  // Hakan Çoban

                  // https://app.patika.dev/hknxx