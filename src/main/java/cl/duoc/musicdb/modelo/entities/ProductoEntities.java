package cl.duoc.musicdb.modelo.entities;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class ProductoEntities {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idproducto")
    private int idProducto;

    @Column(name = "nomprod")
    private String nomProd;

    @Column(name = "marca")
    private String marca;
    @Column(name = "valor")
    private int valor;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "idcategoria")
    private int idCategoria;

    /*
    @ManyToOne (fetch = FetchType. EAGER, cascade = CascadeType. All)
    @JoinColumn(name = "id_categoria", referencedColumnName = "Id", insertable = false, updatable = false)
    @JsonBackReference
     */

}
