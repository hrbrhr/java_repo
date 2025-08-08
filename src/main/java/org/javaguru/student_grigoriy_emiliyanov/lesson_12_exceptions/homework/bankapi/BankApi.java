package org.javaguru.student_grigoriy_emiliyanov.lesson_12_exceptions.homework.bankapi;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}
