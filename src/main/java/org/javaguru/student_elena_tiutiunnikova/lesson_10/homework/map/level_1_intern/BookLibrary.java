package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BookLibrary {

    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new СountByUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new FindUniqueAuthorsUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new FindUniqueTitlesUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new FindUniqueBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(12, new FindBookUIAction(bookDatabase));
        menuNumberToActionMap.put(13, new СontainsUIAction(bookDatabase));
        menuNumberToActionMap.put(14, new GetAuthorToBooksMapUIAction(bookDatabase));
        menuNumberToActionMap.put(15, new GetEachAuthorBookCountUIAction(bookDatabase));
    }

    public void printMenu () {
        System.out.println();
        System.out.println("Program menu: ");
        System.out.println("1. Add mark");
        System.out.println("2. Find book by ID");
        System.out.println("3. Find books by author");
        System.out.println("4. Find books by title");
        System.out.println("5. Delete book by ID");
        System.out.println("6. Count all books in library");
        System.out.println("7. Delete books by author");
        System.out.println("8. Delete books by title");
        System.out.println("9. Find unique authors");
        System.out.println("10. Find unique titles");
        System.out.println("11. Find unique books");
        System.out.println("12. Find books by criterias");
        System.out.println("13. Find book in library");
        System.out.println("14. Get Author To Books Map");
        System.out.println("15. Get Each Author Book Count");
        System.out.println("16. Exit");
        System.out.println();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter menu number: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good by!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }

}

