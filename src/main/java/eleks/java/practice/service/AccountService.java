package eleks.java.practice.service;
import eleks.java.practice.dto.AccountRequestDto;
import eleks.java.practice.dto.AccountResponseDto;

import java.util.List;

public interface AccountService {
    void createAccount(AccountRequestDto accountRequestDto);

    List<AccountResponseDto> getAllAccounts();

    AccountResponseDto getById(int id);


    void deleteById(int id);

}
