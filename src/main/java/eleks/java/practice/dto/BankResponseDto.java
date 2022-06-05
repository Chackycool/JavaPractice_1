package eleks.java.practice.dto;
import java.util.Objects;
public class BankResponseDto
{
    private int id;
    private String name;
    private int qnt;

    public BankResponseDto(int id, String name, int qnt)
    {
        this.id = id;
        this.name = name;
        this.qnt = qnt;
    }

    public BankResponseDto()
    {
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQnt()
    {
        return qnt;
    }

    public void setQnt(int qnt)
    {
        this.qnt = qnt;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        BankResponseDto that = (BankResponseDto) o;
        return id == that.id && qnt == that.qnt && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, name, qnt);
    }

    @Override
    public String toString()
    {
        return "BankResponseDto{" +
            "id=" + id +
            "name='" + name  +
            "qnt=" + qnt +
            '}'+"\n";
    }
}
