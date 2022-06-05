package eleks.java.practice.service;
import eleks.java.practice.dto.AccountRequestDto;
import eleks.java.practice.dto.AccountResponseDto;
import eleks.java.practice.mapper.AccountMapper;
import eleks.java.practice.repository.AccountRepositoryImpl;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    private final AccountRepositoryImpl accountRepositoryImpl = new AccountRepositoryImpl();

    private final AccountMapper accountMapper = new AccountMapper();

    @Override
    public void createAccount(AccountRequestDto accountRequestDto)
    {
        //TODO add check unique object
        accountRepositoryImpl.add(accountMapper.accountRequestDtoToAccountEntity(accountRequestDto));
    }

    @Override
    public List<AccountResponseDto> getAllAccounts()
    {
        return accountRepositoryImpl.getAllAccounts()
                .stream()
                .map(accountMapper::AccountEntityToAccountResponseDto)
                .toList();
    }

    @Override
    public AccountResponseDto getById(int id)
    {
        AccountResponseDto accountResponseDto1=new AccountResponseDto();
        for (var i: getAllAccounts()
        ) {
            if (i.getId() == id) accountResponseDto1=i;
        }
        return accountResponseDto1;
    }

    @Override
    public void deleteById(int id)
    {
        accountRepositoryImpl.deleteById(id);
    }
}
