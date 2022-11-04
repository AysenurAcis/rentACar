package kodlama.io.rentACar.entities.concretes;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Table(name="brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //  Veri tabanında 1-1 arttır
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;
}
 /*
 public Brand() {
        super();
    }

    public Brand(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  */