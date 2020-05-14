package co.edu.sena.mapping.domain;

import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = ("mesa"),uniqueConstraints = {@UniqueConstraint(name = "uk_mesa",columnNames = {("name"),("color")})})
public class Mesa {

    @Id()
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ("id"),unique = true)
    private String id;

    @Column(name = ("name"))
    private String name;

    @NotNull
    @Column(name = ("color"),length = 255,nullable = true)
    private String color;

    @Column(name = ("silla"))
    @OneToMany(cascade = CascadeType.ALL, mappedBy = ("mesa"))
    private List<Silla> silla;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
