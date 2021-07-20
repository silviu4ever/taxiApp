package eu.romania.india.TaxiGaetani.service;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class SearchDriverVO {
    private Integer userId;
    private Double currentLongitude;
    private Double currentLatitude;

    private Double toLongitude;
    private Double toLatitude;
}
