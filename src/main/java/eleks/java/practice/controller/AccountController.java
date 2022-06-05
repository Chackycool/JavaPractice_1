package eleks.java.practice.controller;
import eleks.java.practice.dto.AccountRequestDto;
import eleks.java.practice.dto.AccountResponseDto;
import eleks.java.practice.service.AccountServiceImpl;

import java.util.List;

public class AccountController {
    private final AccountServiceImpl accountServiceImpl = new AccountServiceImpl();

    public void create(AccountRequestDto accountRequestDto)
    {
        accountServiceImpl.createAccount(accountRequestDto);
    }

    public List<AccountResponseDto> getAllAccounts()
    {
        return accountServiceImpl.getAllAccounts();
    }

    public AccountResponseDto getAccountById(int id)
    {
        return accountServiceImpl.getById(id);
    }

    public void deleteAccountById(int id){
        accountServiceImpl.deleteById(id);
    }
}
