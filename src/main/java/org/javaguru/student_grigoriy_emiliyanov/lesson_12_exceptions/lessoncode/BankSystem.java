package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.lessoncode;

import java.util.ArrayList;
import java.util.List;

class BankSystem {
    List<Client> clients = List.of(
            new Client("1234", "Ivan", "abcd"),
            new Client("5678", "Peter", "xyz"),
            new Client("9999", "Bob", "a1b2")
    );

    public Client findClientById(String id, String personalKey) throws WrongKeyException, NoSuchClientException {
        for (Client client : clients) {
            if (client.getId().equals(id)) {
                if (client.getKey().equals(personalKey)) {
                    return client;
                }
                throw new WrongKeyException("provided key: " + personalKey);
            }
        }
        throw new NoSuchClientException("provided client id: " + id);
    }
}
