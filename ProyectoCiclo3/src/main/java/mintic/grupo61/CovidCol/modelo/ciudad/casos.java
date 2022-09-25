package mintic.grupo61.CovidCol.modelo.ciudad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "casos")
public class casos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String departamento;
    private String municipio;
    private int edad;
    private String sexo;
    private String tipoContagio;
    private String estado;
    private String recuperado;

    public casos() {
    }

    public casos(Long id, String departamento, String municipio, int edad, String sexo, String tipoContagio,
            String estado, String recuperado) {
        Id = id;
        this.departamento = departamento;
        this.municipio = municipio;
        this.edad = edad;
        this.sexo = sexo;
        this.tipoContagio = tipoContagio;
        this.estado = estado;
        this.recuperado = recuperado;
    }

}
