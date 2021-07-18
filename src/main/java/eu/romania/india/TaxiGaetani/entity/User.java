package eu.romania.india.TaxiGaetani.entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("User")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

public class User extends UserAbstract{
}
