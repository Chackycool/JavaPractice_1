package eleks.java.practice.entity;
import java.util.Objects;
public class AccountEntity {
    private int id;
    private String name;
    private int bank_id;

    public AccountEntity(int id, String name, int bank_id) {
        this.id = id;
        this.name = name;
        this.bank_id = bank_id;
    }

    public AccountEntity() {
    }

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountEntity that = (AccountEntity) o;
        return id == that.id && bank_id == that.bank_id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, bank_id);
    }

    @Override
    public String toString() {
        return "AccountEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bank_id=" + bank_id +
                '}';
    }
}