/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Asus
 */
public class UserData {
    private int userId;
    private int password;
    private boolean isLoggedIn;

    public UserData(int usrId, int pass) {
        this.userId = usrId;
        this.password = pass;
        this.isLoggedIn = false;
    }

    public void login() throws LoginFailedException {
        String strUserid = String.valueOf(userId);
        String strPassword = String.valueOf(password);

        assert strUserid.length() == 4 && strPassword.length() == 4 : "Userid and password harus 4 digit!";

        if (password + userId == 10000) {
            isLoggedIn = true;
            System.out.println("Login success");
        } else {
            isLoggedIn = false;
            throw new LoginFailedException("Login user " + strUserid + " gagal, telah gagal login " + (LoginFailedException.getFailedCounter(userId) + 1) + " kali", userId);
        }
    }
}