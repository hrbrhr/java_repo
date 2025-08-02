package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class FindBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите критерии для поиска книги: ");
        System.out.println();
        System.out.println("1 - По автору и названию");
        System.out.println("2 - По автору и году выпуска");
        System.out.println("3 - По автору, названию или году");

        String choice = scanner.nextLine();

        SearchCriteria criteria = null;

        switch (choice) {
            case "1":
                System.out.print("Введите имя автора: ");
                String author1 = scanner.nextLine().trim();
                System.out.print("Введите название книги: ");
                String title1 = scanner.nextLine().trim();
                criteria = new AndSearchCriteria(
                        new AuthorSearchCriteria(author1),
                        new TitleSearchCriteria(title1)
                );
                break;
            case "2":
                System.out.print("Введите имя автора: ");
                String author2 = scanner.nextLine().trim();
                System.out.print("Введите год выпуска: ");
                String year2 = scanner.nextLine().trim();
                criteria = new AndSearchCriteria(
                        new AuthorSearchCriteria(author2),
                        new YearOfIssueSearchCriteria(year2)
                );
                break;
            case "3":
                System.out.print("Введите имя автора: ");
                String author3 = scanner.nextLine().trim();
                System.out.print("Введите название книги: ");
                String title3 = scanner.nextLine().trim();
                System.out.print("Введите год выпуска: ");
                String year3 = scanner.nextLine().trim();
                criteria = new OrSearchCriteria(
                        new OrSearchCriteria(
                                new AuthorSearchCriteria(author3),
                                new TitleSearchCriteria(title3)
                        ),
                        new YearOfIssueSearchCriteria(year3)
                );
                break;
            default:
                System.out.println("Некорректный выбор.");
                return;
        }

        System.out.print("Хотите отсортировать результат по автору? (+/-): ");
        String useSorting = scanner.nextLine().trim();

        Comparator<Book> sortingComparator = null;
        if (useSorting.equals("+")) {
            sortingComparator = Comparator.comparing(Book::getAuthor);
        }

        System.out.print("Хотите использовать пагинацию? (+/-): ");
        String usePaging = scanner.nextLine();

        Paging paging = null;
        if (usePaging.equals("+")) {
            try {
                System.out.print("Введите номер страницы: ");
                int pageNumber = Integer.parseInt(scanner.nextLine().trim());

                System.out.print("Введите размер страницы (кол-во книг на странице): ");
                int pageSize = Integer.parseInt(scanner.nextLine().trim());

                paging = new Paging(pageNumber, pageSize);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод номера страницы или размера. Пагинация не будет применена.");
            }
        }

        if (sortingComparator != null || paging != null) {
            criteria = new SortingPagingSearchCriteria(criteria, paging, sortingComparator);
        }

        List<Book> books = bookDatabase.find(criteria);

            if (books.isEmpty()) {
            System.out.println("Книги по заданным критериям не найдены.");
        } else {
                for (Book book : books) {
                System.out.println("ID: " + book.getId());
                System.out.println("Автор: " + book.getAuthor());
                System.out.println("Название: " + book.getTitle());
                System.out.println("Год выпуска: " + book.getYearOfIssue());
                System.out.println();
            }
        }

    }
}
