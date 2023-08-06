package Util;

public class MenuUtil {
    public static int entryMenu() {
        System.out.println ("---------------------- Book Management System ----------------------" + "\n" +
                "[1].Display Books" + "\n" +
                "[2].Search Book" + "\n" +
                "[3].Add Book" + "\n" +
                "[4].Update Book" + "\n" +
                "[5].Remove Book" + "\n" +
                "[0].Exit Program!" + "\n" +
                "-------------------------------------------------------------------"
        );
        return InputUtil.InputRequiredInt("Choose an option: ");
    }

    public static String updateMenu() {

        System.out.print("--------------------------" + "\n" +
                           "[1].Name" + "\n" +
                           "[2].Description" + "\n" +
                           "[3].Author" + "\n" +
                           "--------------------------\n");
        return InputUtil.InputRequiredString("Choose an option: ");
    }
}
