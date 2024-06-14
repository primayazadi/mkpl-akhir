/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Driver;

import Class.LoginFailedException;
import Class.UserData;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class TP_MOD12_1302210049_NabielPrayogaBudiana {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input User ID: ");
            int userid = scanner.nextInt();

            System.out.print("Input Password: ");
            int password = scanner.nextInt();

            UserData userData = new UserData(userid, password);
            try {
                userData.login();
            } catch (LoginFailedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("");
        }
    }
}
