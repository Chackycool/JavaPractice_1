package eleks.java.practice.mapper;
import eleks.java.practice.dto.BankRequestDto;
import eleks.java.practice.dto.BankResponseDto;
import eleks.java.practice.entity.BankEntity;
public class BankMapper
{
    public BankEntity bankRequestDtoToBankEntity(BankRequestDto bankRequestDto)
    {
        BankEntity bankEntity = new BankEntity();
        if (bankRequestDto == null)
        {
            throw new RuntimeException("BankEntity is null");
        }
        bankEntity.setId(bankRequestDto.getId());
        bankEntity.setName(bankRequestDto.getName());
        bankEntity.setQnt(bankRequestDto.getQnt());
        return bankEntity;
    }
    public BankResponseDto bankEntityToBankResponseDto(BankEntity bankEntity)
    {
        BankResponseDto bankResponseDto = new BankResponseDto();
        if (bankEntity == null)
        {
            throw new RuntimeException("BankEntity is null");
        }
        bankResponseDto.setId(bankEntity.getId());
        bankResponseDto.setName(bankEntity.getName());
        bankResponseDto.setQnt(bankEntity.getQnt());
        return bankResponseDto;
    }
}
