package eleks.java.practice.mapper;

import eleks.java.practice.dto.AccountRequestDto;
import eleks.java.practice.dto.AccountResponseDto;
import eleks.java.practice.entity.AccountEntity;


public class AccountMapper {
    public AccountEntity accountRequestDtoToAccountEntity(AccountRequestDto accountRequestDto)
    {
        AccountEntity accountEntity = new AccountEntity();
        if (accountRequestDto == null)
        {
            throw new RuntimeException("AccountEntity is null");
        }
        accountEntity.setId(accountRequestDto.getId());
        accountEntity.setName(accountRequestDto.getName());
        accountEntity.setBank_id(accountRequestDto.getBank_id());
        return accountEntity;
    }
    public AccountResponseDto AccountEntityToAccountResponseDto(AccountEntity accountEntity)
    {
        AccountResponseDto accountResponseDto = new AccountResponseDto();
        if (accountResponseDto == null)
        {
            throw new RuntimeException("BankEntity is null");
        }
        accountResponseDto.setId(accountEntity.getId());
        accountResponseDto.setName(accountEntity.getName());
        accountResponseDto.setBank_id(accountEntity.getBank_id());
        return accountResponseDto;
    }
}
