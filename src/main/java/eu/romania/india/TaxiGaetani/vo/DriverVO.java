package eu.romania.india.TaxiGaetani.vo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
@Data
@EqualsAndHashCode
@ToString
public class DriverVO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String brand;
    private String model;
}