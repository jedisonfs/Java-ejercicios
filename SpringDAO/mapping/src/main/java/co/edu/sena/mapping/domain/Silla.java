package co.edu.sena.mapping.domain;

import javax.persistence.*;

@Entity
@Table(name = ("silla"),uniqueConstraints = {@UniqueConstraint(name = ("uk_marca_color"),columnNames = {("marca"),("color")})})
public class Silla {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = ("marca"),nullable = false)
    private String marca;

    @Column(name = ("color"),nullable = false)
    private String color;

    @ManyToOne
    @JoinColumn(name = ("mesa_id"),referencedColumnName = ("id"),foreignKey = @ForeignKey(name = ("fk_mesa")),nullable = false)
    private Mesa mesa;

    public void setMarca(String marca){
        this.color = color;
    }

    public  String getMacar(){
        return marca;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String setColor(){
        return color;
    }
}
