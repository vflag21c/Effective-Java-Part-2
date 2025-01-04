package example.chapter05.item26.genericdao;

import example.chaptor05.item26.genericdao.Account;
import example.chaptor05.item26.genericdao.AccountRepository;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class AccountRepositoryTest {

    @Test
    void findById() {
        AccountRepository accountRepository = new AccountRepository();
        Account account = new Account(1L, "whiteship");
        accountRepository.add(account);

        Optional<Account> byId = accountRepository.findById(1L);
        assertTrue(byId.isPresent());
    }

}