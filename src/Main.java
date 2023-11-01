import cls.User;
import exceptions.LengthException;
import exceptions.NotEqualException;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    /*

        בנו מחלקה המקבלת שם משתמש, סיסמא וסיסמא לבדיקה
                                              התנאים הם:
                               שם המשתמש בין 5-15 אותיות
    הסיסמא מעל 3 אותיות
    הסיסמא והסיסמאת בדיקה צריכים להיות תואמות

    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in your User Name:");
        String username = scanner.nextLine();
        System.out.println("Please type in your Password:");
        String password = scanner.nextLine();
        System.out.println("Please type in Password again:");
        String checkPassword = scanner.nextLine();

        User myUser = null;
        try {
            myUser = new User(username, password,checkPassword);
        } catch (LengthException | NotEqualException ex) {
            System.out.println(ex.getMessage());
        } finally {
            scanner.close();
        }

        if(null != myUser) {
            System.out.println("Welcome to my world " + myUser.getUserName() + "!!!");
        }
    }
}