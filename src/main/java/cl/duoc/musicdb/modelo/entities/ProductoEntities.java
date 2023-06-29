package cl.duoc.musicdb.modelo.entities;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class ProductoEntities {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;
    private String nomprod;
    private String marca;
    private int valor;
    private int cantidad;
    private int idcategoria;

    @ManyToOne (fetch = FetchType. EAGER, cascade = CascadeType. All)
    @JoinColumn(name = "id_categoria", referencedColumnName = "Id", insertable = false, updatable = false)

}
