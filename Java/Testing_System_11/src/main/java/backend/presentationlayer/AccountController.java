package backend.presentationlayer;

import backend.businesslayer.AccountService;
import entity.Account;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class AccountController {
    private AccountService accountService;

    public AccountController() throws IOException {
        accountService = new AccountService();
    }

    public List<Account> getAccountList() throws SQLException, IOException, ClassNotFoundException{
        return accountService.getListAccount();
    }
}
