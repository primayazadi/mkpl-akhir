/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.HashMap;

public class LoginFailedException extends Exception {
    private static HashMap<Integer, Integer> failedcount = new HashMap<>();
    private int userId;

    public LoginFailedException(String msg, int user) {
        super(msg);
        this.userId = user;

        if (!failedcount.containsKey(userId)) {
            failedcount.put(userId, 1);
        } else {
            int count = failedcount.get(userId);
            failedcount.put(userId, count + 1);
        }
    }

    public int getUserid() {
        return userId;
    }

    public static int getFailedCounter(int user) {
        if (failedcount.containsKey(user)) {
            return failedcount.get(user);
        }
        return 0;
    }
}