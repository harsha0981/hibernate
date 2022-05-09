import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Student {
    @Id
    private int Sid;
    private String Sname;
    private int Sage;
    @OneToMany(mappedBy ="student",fetch =FetchType.EAGER)
    private List<Laptop> laptop=new ArrayList<Laptop>();
    public int getSid() {
        return Sid;
    }
    public void setSid(int sid) {
        Sid = sid;
    }
    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public int getSage() {
        return Sage;
    }

    public void setSage(int sage) {
        Sage = sage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sid=" + Sid +
                ", Sname='" + Sname + '\'' +
                ", Sage=" + Sage +
                '}';
    }

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }
}
