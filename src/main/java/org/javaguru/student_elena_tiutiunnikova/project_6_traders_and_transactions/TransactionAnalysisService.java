package org.javaguru.student_elena_tiutiunnikova.project_6_traders_and_transactions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class TransactionAnalysisService {

//    Напишите в классе TransactionAnalysisService метод,
//    который принимает на вход список транзакций
//    и находит все транзакции совершённые в 2011 году.
//    Реализацию этого метода напишите с использованием Stream API.

    public List<Transaction> findTransaction2011year (List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactionsByYear (List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

//    Ваше задание: в классе TransactionAnalysisService
//    напишите метод, который принимает на вход список транзакций
//    и сортирует их по параметру value от меньшего к большему.
//    Реализацию этого метода напишите с использованием Stream API.

    public List<Transaction> sortedTransactionsFromLessToMost (List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

//    Ваше задание: в классе TransactionAnalysisService
//    напишите метод, который принимает на вход список транзакций
//    и сортирует их по параметру value от большего к меньшему.
//    Реализацию этого метода напишите с использованием Stream API.

    public List<Transaction> sortedTransactionsFromMostToLess (List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

//    напишите метод, который принимает на вход список транзакций
//    и находит все транзакции совершённые в 2011 году
//    и сортирует найденные транзакции по параметру value от меньшего к большему.

    public List<Transaction> sortedTransactions2011FromLessToMost (List<Transaction> transactions, int year) {
        return findTransactionsByYear(transactions, 2011).stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

//    напишите метод, который принимает на вход список транзакций
//    и находит все года, в которых были совершены транзакции (года могут повторяться).

    public List<Integer> findAllYearOfTransactions (List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

//    Ваша задача: найти из всех транзакций уникальные года в которые
//    они были совершены.
//
//    Реализацию этого метода напишите с использованием Stream API.

    public Set<Integer> findUniqueYearOfTransactions (List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
    }

//    Ваша задача: напишите метод, который принимает на вход список транзакций
//    и находит имена всех трейдеры (имена не должны повторяться).

    public Set<String> findUniqueNameOfTraders (List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

//    Ваша задача: напишите метод, который принимает на вход список транзакций
//    и находит все уникальные города в которых работают трейдеры.

    public Set<String> findUniqueCityOfTraders (List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(Collectors.toSet());
    }

//    Ваша задача: напишите метод, который принимает на вход список транзакций
//    и находит имена всех трейдеров из города Cambridge..

    public Set<String> findNameOfTradersFromCambridge (List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public Set<String> findNameOfTradersFromCity (List<Transaction> transactions, String city) {
        return transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals(city))
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

//    Дополнительные задания:
//- посчитайте общий объём транзакций (value) за конкретный год;

    public int valueOfAllTransactionPerYear (List<Transaction> transactions, int year) {
        return findTransactionsByYear(transactions, year).stream()
                .mapToInt(Transaction::getValue)
                .sum();
    }

//- посчитайте количество транзакций за конкретный год;

    public long numberOfAllTransactionPerYear (List<Transaction> transactions, int year) {
        return findTransactionsByYear(transactions, year).stream()
                .mapToInt(Transaction::getValue)
                .count();
    }

//- кто из трейдеров совершил наибольшее количество транзакций;

    public String nameOfTraderWithMaxNumberOfTransactions (List<Transaction> transactions) {
        return transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getTrader, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).get().getName();
    }

//- кто из трейдеров наторговал наибольший объём (value) транзакций;

    public String nameOfTraderWithMaxValueOfTransactions (List<Transaction> transactions) {
        return transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getTrader, Collectors.summingInt(Transaction::getValue)))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).get().getName();
    }

//- найдите транзакцию с наименьшим объёмом;

    public int minTransaction (List<Transaction> transactions) {
        return transactions.stream()
                .mapToInt(Transaction::getValue)
                .min()
                .orElseThrow();
    }

//- найдите транзакцию с наибольшим объёмом;

    public int maxTransaction (List<Transaction> transactions) {
        return transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .orElseThrow();
    }

//- вычислите средний объём среди всех транзакций.

    public double averageValueOfAllTransactions (List<Transaction> transactions) {
        int sum = transactions.stream()
                .mapToInt(Transaction::getValue)
                .sum();
        int count = transactions.size();
        double average = (double) sum / count;
        return average;
    }
}
