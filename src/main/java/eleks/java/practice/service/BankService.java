package eleks.java.practice.service;
import eleks.java.practice.dto.BankRequestDto;
import eleks.java.practice.dto.BankResponseDto;
import java.util.List;

public interface BankService
{
    void createBank(BankRequestDto bankRequestDto);

    List<BankResponseDto> getAllBanks();

    BankResponseDto getById(int id);

    void deleteById(int id);
}
