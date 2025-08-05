package org.javaguru.student_grigoriy_emiliyanov.project_6_traders_and_transactions;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {
    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario", "Milan");
    Trader alan = new Trader("Alan", "Cambridge");
    Trader brian = new Trader("Brian", "Cambridge");

    @Test
    public void findByYearShouldReturnEmptyWhenNoTransaction() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        List<Transaction> inputTransactions = List.of();
        List<Transaction> expected = List.of();
        assertEquals(expected, service.findTransactionByYear(inputTransactions, 2011));
    }

    @Test
    public void findByYearShouldFindWhenManyTransactions() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        List<Transaction> inputTransactions = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        List<Transaction> expected = List.of(
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300)
        );
        assertEqualCollectionsIgnoreOrder(expected, service.findTransactionByYear(inputTransactions, 2011));
    }

    @Test
    public void findByYearShouldReturnEmptyWhenYearNotMatching() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        List<Transaction> inputTransactions = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        List<Transaction> expected = List.of();
        assertEquals(expected, service.findTransactionByYear(inputTransactions, 2010));
    }

    @Test
    public void findByYear2012() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        List<Transaction> inputTransactions = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        List<Transaction> expected = List.of(
                new Transaction(raoul, 2012, 1000),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950),
                new Transaction(mario, 2012, 710)
        );
        assertEqualCollectionsIgnoreOrder(expected, service.findTransactionByYear(inputTransactions, 2012));
    }

    @Test
    public void sortByTransactionValueASC() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        List<Transaction> inputTransactions = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        List<Transaction> expected = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 710),
                new Transaction(alan, 2012, 950),
                new Transaction(raoul, 2012, 1000)
        );
        assertEquals(expected, service.sortByValueACS(inputTransactions));
    }

    @Test
    public void sortByTransactionValueDSC() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        List<Transaction> inputTransactions = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        List<Transaction> expected = List.of(
                new Transaction(raoul, 2012, 1000),
                new Transaction(alan, 2012, 950),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300)
        );
        assertEquals(expected, service.sortByValueDSC(inputTransactions));
    }

    @Test
    public void findTransactions2011AndSortByTransactionValueASC() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        List<Transaction> inputTransactions = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        List<Transaction> expected = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        );
        assertEquals(expected, service.findTransactionsByYearSortedByValueASC(inputTransactions, 2011));
    }

    @Test
    public void findAllTransactionsYears() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        List<Transaction> inputTransactions = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        List<Integer> expected = List.of(
                2011,
                2012,
                2011,
                2012,
                2012,
                2012
        );
        assertEquals(expected, service.findAllTransactionsYears(inputTransactions));
    }

    @Test
    public void findAllUniqueTransactionsYears() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        List<Transaction> inputTransactions = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        List<Integer> expected = List.of(
                2011,
                2012
        );
        assertEqualCollectionsIgnoreOrder(expected, service.findAllUniqueTransactionsYears(inputTransactions));
    }

    @Test
    public void findAllUniqueTraders() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        List<Transaction> inputTransactions = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        Set<Trader> expected = Set.of(
                raoul,
                brian,
                mario,
                alan
        );
        assertEqualCollectionsIgnoreOrder(expected, service.findAllUniqueTraders(inputTransactions));
    }

    @Test
    public void findAllUniqueTradersCities() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        List<Transaction> inputTransactions = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        Set<String> expected = Set.of(
                "Milan",
                "Cambridge"
        );
        assertEqualCollectionsIgnoreOrder(expected, service.findAllUniqueTradersCities(inputTransactions));
    }

    @Test
    public void findAllTraderNamesFromCambridge() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        List<Transaction> inputTransactions = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        Set<String> expected = Set.of(
                "Alan",
                "Brian",
                "Raoul"
        );
        assertEqualCollectionsIgnoreOrder(expected, service.findAllUniqueTraderNamesFrom(inputTransactions, "Cambridge"));
    }

    @Test
    public void findTotalTransactionValuePerYear() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        List<Transaction> inputTransactions = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        int expected = 1000 + 710 + 700 + 950;
        assertEquals(expected, service.findTotalTransactionsValueForYear(inputTransactions, 2012));
    }

    @Test
    public void findNumberOfTransactionsForYear() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        List<Transaction> inputTransactions = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        int expected = 4;
        assertEquals(expected, service.findNumberOfTransactionsForYear(inputTransactions, 2012));
    }

    @Test
    public void findMinValueTransaction() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        List<Transaction> inputTransactions = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        Transaction expected = new Transaction(brian, 2011, 300);
        assertEquals(expected, service.findMinValueTransaction(inputTransactions));
    }

    @Test
    public void findMaxValueTransaction() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        List<Transaction> inputTransactions = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        Transaction expected = new Transaction(raoul, 2012, 1000);
        assertEquals(expected, service.findMaxValueTransaction(inputTransactions));
    }

    @Test
    public void findAverageTransactionsValue() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        List<Transaction> inputTransactions = List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        double expected = 676.666;
        assertEquals(expected, service.findAverageTransactionsValue(inputTransactions), 0.001);
    }

    private <T> void assertEqualCollectionsIgnoreOrder(Collection<T> list1, Collection<T> list2) {
        if (list1.size() != list2.size()) assertTrue(false);
        assertTrue(list1.containsAll(list2) && list2.containsAll(list1));
    }
}