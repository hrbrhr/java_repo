package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.homework.bankapi;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankApiImplTest {
    @Test
    public void shouldThrowExceptionWhenNoCredentials() {
        List<BankClient> clients = List.of(
                new BankClient("1234", "Ivan"),
                new BankClient("5678", "Peter"),
                new BankClient("9999", "Bob")
        );
        BankApiImpl bankApi = new BankApiImpl(clients);
        UserCredentials userCredentials = new UserCredentials(List.of());
        assertThrows(AccessDeniedException.class, () -> bankApi.findByUid(userCredentials, "1234"));
    }

    @Test
    public void shouldReturnWhenAccessGiven() {
        List<BankClient> clients = List.of(
                new BankClient("1234", "Ivan"),
                new BankClient("5678", "Peter"),
                new BankClient("9999", "Bob")
        );
        BankApiImpl bankApi = new BankApiImpl(clients);
        UserCredentials userCredentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));
        assertDoesNotThrow(() -> bankApi.findByUid(userCredentials, "1234"));
    }
}