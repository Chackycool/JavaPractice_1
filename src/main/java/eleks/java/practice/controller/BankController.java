package eleks.java.practice.controller;
import eleks.java.practice.dto.BankRequestDto;
import eleks.java.practice.dto.BankResponseDto;
import eleks.java.practice.service.BankService;
import eleks.java.practice.service.BankServiceImpl;

import java.util.List;
public class BankController
{
    private final BankService bankService = new BankServiceImpl();

    public void create(BankRequestDto bankRequestDto)
    {
        bankService.createBank(bankRequestDto);
    }

    public List<BankResponseDto> getAllBanks()
    {
        return bankService.getAllBanks();
    }

    public BankResponseDto getBankById(int id)
    {
        return bankService.getById(id);
    }

    public void deleteBankById(int id){
        bankService.deleteById(id);
    }
}
