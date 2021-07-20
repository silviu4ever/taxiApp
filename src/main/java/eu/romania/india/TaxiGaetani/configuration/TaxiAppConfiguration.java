package eu.romania.india.TaxiGaetani.configuration;

import eu.europa.ec.oib.platform.data.paging.PageAndFilterHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"eu.romania.india.TaxiGaetani.repository"}, repositoryBaseClass = PageAndFilterHandler.class )
public class TaxiAppConfiguration {
}
