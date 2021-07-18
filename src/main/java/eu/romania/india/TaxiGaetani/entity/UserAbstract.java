package eu.romania.india.TaxiGaetani.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Table(name = "USERDRIVER")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name="TYPE")
@Data
@EqualsAndHashCode
@ToString
public abstract class UserAbstract {
    @Id
    @Column(name = "id")
    @SequenceGenerator(sequenceName = "SEQ_USERDRIVER", name = "SEQ_USERDRIVER")
    @GeneratedValue(generator = "SEQ_USERDRIVER")
    private Integer id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;
}
