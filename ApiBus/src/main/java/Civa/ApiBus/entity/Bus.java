package Civa.ApiBus.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "buses")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_id")
    private Long busId;

    @Column(name = "numero_bus", unique=true, nullable=false)
    private Integer numeroBus;

    @Column(unique=true, nullable = false)
    private String placa;

    @Column(name = "fecha_creacion", updatable = false)
    private LocalDateTime fechaCreacion;
    @PrePersist
    public void prePersist() {
        this.fechaCreacion = LocalDateTime.now();
    }

    private String caracteristicas;

    private boolean activo;

    @ManyToOne
    @JoinColumn(name="marca_id")
    private Marca marca;
}
