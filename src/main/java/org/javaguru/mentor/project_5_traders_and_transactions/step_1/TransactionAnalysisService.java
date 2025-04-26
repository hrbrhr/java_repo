package org.javaguru.mentor.project_5_traders_and_transactions.step_1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    public List<Transaction> findTransactionsIn2011(List<Transaction> transactions) {
        // Stream API
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactionsByYear2011(List<Transaction> transactions,
                                                        int year) {
        // Stream API
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactionsIn2011AndSort(List<Transaction> transactions) {
        // Stream API
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }


    public List<String> findUniqueTraderNames(List<Transaction> transactions) {
        // Stream API
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .map(trader -> trader.getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<String> findUniqueTraderNamesV2(List<Transaction> transactions) {
        // Stream API
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }


    public boolean isTraderExist(List<Transaction> transactions,
                                 String traderName) {
        // Stream API
        return transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(trader -> trader.getName().equals(traderName));
    }

    public Optional<Trader> findTrader(List<Transaction> transactions,
                                       String traderName) {
        // Stream API
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getName().equals(traderName))
                .findFirst();
    }


}
