package literalura.modelos;



import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "autores")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Integer fechaDeNacimiento;
    private Integer fechaDeFallecimiento;
    @OneToMany(mappedBy = "autor", fetch = FetchType.EAGER)
    private List<Libro> libros = new ArrayList<>();

    public Autor(DatosAutor autor) {
        this.nombre = autor.nombre();
        this.fechaDeNacimiento = autor.fechaDeNacimiento();
        this.fechaDeFallecimiento = autor.fechaDeFallecimiento();
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

}
