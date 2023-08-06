package Service;


import Util.InputUtil;
import Util.MenuUtil;

public class ManagementService {
    public static void bookManage() {
        BookService bookService = new BookService();

        while (true) {
            int option = MenuUtil.entryMenu();
            switch (option) {
                case 0:
                    System.out.println("Bye!");
                    System.exit(-1);
                case 1:
                    bookService.displayBook();
                    break;
                case 2:
                    bookService.searchBook();
                    break;
                case 3:
                    bookService.addBook();
                    break;
                case 4:
                    bookService.updateBook();
                    break;
                case 5:
                    bookService.removeBook();
                    break;
                default:
                    System.out.println("Invalid Option!");
            }
        }
    }
}
