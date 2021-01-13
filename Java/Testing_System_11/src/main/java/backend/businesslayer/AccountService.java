package backend.businesslayer;

import backend.datalayer.AccountRepository;
import entity.Account;

import java.io.IOException;
import java.util.List;

public class AccountService {
    private AccountRepository accountRepository;

    public AccountService() throws IOException {
        accountRepository = new AccountRepository();
    }

    public List<Account> getListAccount(){
        return accountRepository.
    }
}
