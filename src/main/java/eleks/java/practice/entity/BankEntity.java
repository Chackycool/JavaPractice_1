package eleks.java.practice.entity;
import java.util.Objects;
public class BankEntity
{
    private int id;
    private String name;
    private int qnt;


    public BankEntity(int id, String name, int qnt)
    {
        this.id = id;
        this.name = name;
        this.qnt = qnt;
    }

    public BankEntity()
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
        BankEntity that = (BankEntity) o;
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

        return "BankEntity{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", qnt=" + qnt +
            '}';
    }

}

