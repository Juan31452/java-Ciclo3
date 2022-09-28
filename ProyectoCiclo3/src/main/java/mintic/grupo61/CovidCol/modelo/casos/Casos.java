package mintic.grupo61.CovidCol.modelo.casos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data //se encarga de los getters y setters
@Entity
@Table(name = "casos")
public class Casos implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "Id", nullable = false)
    private Long Id;
    //@Column(name = "departamento", length = 20)
    private String departamento;
    //@Column(name = "municipio", length = 20)
    private String municipio;
    //@Column(name = "edad")
    private int edad;
    //@Column(name = "sexo", length = 3)
    private String sexo;
    //@Column(name = "tipoContagio", length = 15)
    private String tipoContagio;
    //@Column(name = "estado", length = 30)
    private String estado;
    //@Column(name = "recuperado", length = 30)
    private String recuperado;

    public Casos() {
    }

    public Casos(Long id, String departamento, String municipio, int edad, String sexo, String tipoContagio,
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
