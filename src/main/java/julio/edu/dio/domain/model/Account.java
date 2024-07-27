package julio.edu.dio.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String number;
    private String agency;
    @Column(precision = 12, scale = 2)
    private BigDecimal balance;
    @Column(name = "additional_limit", precision = 12, scale = 2)
    private BigDecimal limit;

}