package eleks.java.practice.repository;

import eleks.java.practice.entity.AccountEntity;

import java.util.ArrayList;
import java.util.List;

public class AccountRepositoryImpl implements AccountRepository {
    public final List<AccountEntity> AccountEntityList = new ArrayList<>();

    @Override
    public void add(AccountEntity accountEntity) {
        AccountEntityList.add(accountEntity);
    }
    @Override
    public final List<AccountEntity> getAllAccounts() {
        return AccountEntityList;
    }


    @Override
    public int getAccountById(int id) {
        AccountEntity accountEntity = new AccountEntity();
        for (var i : getAllAccounts()) {
            if (i.getId() == id) accountEntity = i;
        }
        return 0;
    }

    @Override
    public void deleteById(int id) {
        AccountEntity accountEntity = new AccountEntity();
        for (var i : getAllAccounts()
        ) {
            if (i.getId() == id) accountEntity = i;
        }
        AccountEntityList.remove(accountEntity);
    }

    public void PrintBank() {

    }
}
