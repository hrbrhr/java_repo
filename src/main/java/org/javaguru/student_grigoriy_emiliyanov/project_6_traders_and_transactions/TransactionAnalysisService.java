package org.javaguru.student_grigoriy_emiliyanov.project_6_traders_and_transactions;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    private Predicate<Transaction> transactionInYear(int year) {
        return transaction -> transaction.getYear() == year;
    }

    private Predicate<Trader> traderFrom(String city) {
        return trader -> trader.getCity().equalsIgnoreCase(city);
    }

    List<Transaction> findTransactionByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transactionInYear(year))
                .toList();
    }

    public List<Transaction> sortByValueACS(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .toList();
    }

    public List<Transaction> sortByValueDSC(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .toList();
    }

    public List<Transaction> findTransactionsByYearSortedByValueASC(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transactionInYear(year))
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .toList();
    }

    public List<Integer> findAllTransactionsYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .toList();
    }

    public Set<Integer> findAllUniqueTransactionsYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
    }

    public Set<Trader> findAllUniqueTraders(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .collect(Collectors.toSet());
    }

    public Set<String> findAllUniqueTradersCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(Collectors.toSet());
    }

    public Set<String> findAllUniqueTraderNamesFrom(List<Transaction> transactions, String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(traderFrom(city))
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public int findTotalTransactionsValueForYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transactionInYear(year))
                .mapToInt(Transaction::getValue)
                .sum();
    }

    public int findNumberOfTransactionsForYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transactionInYear(year))
                .toList().size();
    }

    public Transaction findMinValueTransaction(List<Transaction> transactions) {
        return transactions.stream()
                .min(Comparator.comparingInt(Transaction::getValue))
                .orElseThrow(NoSuchElementException::new);
    }
    public Transaction findMaxValueTransaction(List<Transaction> transactions) {
        return transactions.stream()
                .max(Comparator.comparing(Transaction::getValue))
                .orElseThrow(NoSuchElementException::new);
    }

    public double findAverageTransactionsValue(List<Transaction> transactions) {
        return transactions.stream()
                .mapToInt(Transaction::getValue)
                .average()
                .orElse(0.0);
    }
}
