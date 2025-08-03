package org.javaguru.student_elena_tiutiunnikova.project_6_traders_and_transactions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {

    private static List<Transaction> getTransactions() {
        Trader mark = new Trader("Mark", "Minsk");
        Trader max = new Trader("Max","Cambridge");
        Trader karl = new Trader("Karl","Tokyo");
        Trader ivan = new Trader("Ivan","Moscow");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(mark, 2012, 300),
                new Transaction(max, 2013, 1000),
                new Transaction(max, 2011, 400),
                new Transaction(ivan, 2011, 710),
                new Transaction(karl, 2010, 700),
                new Transaction(ivan, 2013, 950),
                new Transaction(mark, 2012, 150),
                new Transaction(ivan, 2011, 250)
        );

        return transactions;
    }

    private TransactionAnalysisService dataTransactions = new TransactionAnalysisService();

    @Test
    void findTransaction2011yearTest() {
        List<Transaction> result2011 = dataTransactions.findTransaction2011year(getTransactions());
        assertEquals(3, result2011.size());
    }

    @Test
    void findTransactionsByYearTest() {
        List<Transaction> result2011 = dataTransactions.findTransactionsByYear(getTransactions(),2011);
        assertEquals(3, result2011.size());

        List<Transaction> result2015 = dataTransactions.findTransactionsByYear(getTransactions(),2015);
        assertEquals(0, result2015.size());

        List<Transaction> result2013 = dataTransactions.findTransactionsByYear(getTransactions(),2013);
        assertEquals(2, result2013.size());
    }

    @Test
    void sortedTransactionsFromLessToMostTest () {
        List<Transaction> result = dataTransactions.sortedTransactionsFromLessToMost(getTransactions());

        assertEquals(8, result.size());
        assertEquals(150, result.getFirst().getValue());
        assertEquals(1000, result.getLast().getValue());
        assertEquals(700, result.get(4).getValue());
    }

    @Test
    void sortedTransactionsFromMostToLessTest () {
        List<Transaction> result = dataTransactions.sortedTransactionsFromMostToLess(getTransactions());

        assertEquals(8, result.size());
        assertEquals(1000, result.getFirst().getValue());
        assertEquals(150, result.getLast().getValue());
        assertEquals(400, result.get(4).getValue());
    }

    @Test
    void sortedTransactions2011FromLessToMostTest () {
        List<Transaction> result = dataTransactions.sortedTransactions2011FromLessToMost(getTransactions(), 2011);

        assertEquals(3, result.size());
        assertEquals(250,result.getFirst().getValue());
        assertEquals(710, result.getLast().getValue());
    }

    @Test
    void findAllYearOfTransactionsTest () {
        List<Integer> result = dataTransactions.findAllYearOfTransactions(getTransactions());

        assertEquals(8, result.size());
        assertTrue(result.contains(2011));
        assertTrue(result.contains(2012));
        assertTrue(result.contains(2013));
        assertTrue(result.contains(2010));
        assertFalse(result.contains(2009));
    }

    @Test
    void findUniqueYearOfTransactionsTest () {
        Set<Integer> result = dataTransactions.findUniqueYearOfTransactions(getTransactions());

        assertEquals(4, result.size());
        assertFalse(result.contains(2016));
        assertTrue(result.contains(2011));
        assertTrue(result.contains(2012));
        assertTrue(result.contains(2013));
        assertTrue(result.contains(2010));
    }

    @Test
    void findUniqueNameOfTradersTest () {
        Set<String> result = dataTransactions.findUniqueNameOfTraders(getTransactions());

        assertEquals(4, result.size());
        assertTrue(result.contains("Ivan"));
        assertFalse(result.contains("Misha"));
    }

    @Test
    public void findUniqueCityOfTraders () {
        Set<String> result = dataTransactions.findUniqueCityOfTraders(getTransactions());

        assertEquals(4, result.size());
        assertTrue(result.contains("Tokyo"));
        assertFalse(result.contains("Miami"));
    }

    @Test
    public void findNameOfTradersFromCambridgeTest () {
        Set<String> result = dataTransactions.findNameOfTradersFromCambridge(getTransactions());

        assertEquals(1, result.size());
        assertTrue(result.contains("Max"));
    }

    @Test
    public void findNameOfTradersFromCity () {
        Set<String> result = dataTransactions.findNameOfTradersFromCity(getTransactions(), "Moscow");

        assertEquals(1, result.size());
        assertTrue(result.contains("Ivan"));
    }

    @Test
    public void valueOfAllTransactionPerYearTest () {
        int result = dataTransactions.valueOfAllTransactionPerYear(getTransactions(), 2012);
        assertEquals(450, result);
    }

    @Test
    public void numberOfAllTransactionPerYearTest () {
        long result2012 = dataTransactions.numberOfAllTransactionPerYear(getTransactions(), 2012);
        assertEquals(2, result2012);

        long result2011 = dataTransactions.numberOfAllTransactionPerYear(getTransactions(), 2011);
        assertEquals(3, result2011);

        long result2016 = dataTransactions.numberOfAllTransactionPerYear(getTransactions(), 2016);
        assertEquals(0, result2016);
    }

    @Test
    public void maxTransactionTest () {
        int result = dataTransactions.maxTransaction(getTransactions());
        assertEquals(1000, result);
    }

    @Test
    public void minTransactionTest () {
        int result = dataTransactions.minTransaction(getTransactions());
        assertEquals(150, result);
    }

    @Test
    public void averageValueOfAllTransactionsTest () {
        double result = dataTransactions.averageValueOfAllTransactions(getTransactions());
        assertEquals(557.5, result);
    }

    @Test
    public void nameOfTraderWithMaxNumberOfTransactionsTest () {
        String result = dataTransactions.nameOfTraderWithMaxNumberOfTransactions(getTransactions());
        assertTrue(result.equals("Ivan"));
        assertFalse(result.equals("Max"));
    }

    @Test
    public void nameOfTraderWithMaxValueOfTransactionsTest () {
        String result = dataTransactions.nameOfTraderWithMaxValueOfTransactions(getTransactions());
        assertTrue(result.equals("Ivan"));
        assertFalse(result.equals("Max"));
    }

}