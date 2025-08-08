package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.homework.bankapi;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        // если в credentials нет роли Role.CAN_SEARCH_CLIENTS
        // то метод должен кидать ошибку AccessDeniedException
        // иначе производить поиск клиента с указанным uid
        if (!credentials.contains(Role.CAN_SEARCH_CLIENTS)) throw new AccessDeniedException();
        return clients.stream().
                filter(client -> client.getUid().equals(uid))
                .findFirst();
    }
}

