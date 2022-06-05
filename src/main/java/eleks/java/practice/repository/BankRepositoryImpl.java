package eleks.java.practice.repository;
import eleks.java.practice.entity.BankEntity;

import java.util.ArrayList;
import java.util.List;

public class BankRepositoryImpl implements BankRepository {
    public final List<BankEntity> bankEntityList = new ArrayList<>();

    @Override
    public void add(BankEntity bankEntity) {
        bankEntityList.add(bankEntity);
    }

    @Override
    public List<BankEntity> getAllBanks() {
        return bankEntityList;
    }



    @Override
    public BankEntity getBankById(int id) {
        BankEntity bankEntity = new BankEntity();
        for (var i : getAllBanks()) {
            if (i.getId() == id) bankEntity = i;
        }
        return bankEntity;
    }

    @Override
    public void deleteById(int id) {
        BankEntity bankEntity = new BankEntity();
        for (var i : getAllBanks()
        ) {
            if (i.getId() == id) bankEntity = i;
        }
        bankEntityList.remove(bankEntity);
    }

    public void PrintBank() {

    }

    public boolean idUnic(int id) {
        for (var i : getAllBanks()
        ) {
            if (i.getId() == id) return false;
        }
        return true;
    }
}
