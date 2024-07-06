package velocitylimits.domain.repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

/**
 * @author harshagangavarapu
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "LoadedCustomerFunds")
public class LoadedCustomerFundsEntity {
    @Id
    @Column
    private Long id;
    @Column
    @JsonProperty("customer_id")
    private Long customerId;
    @Column
    @JsonProperty("load_amount")
    private double loadAmount;
    @Column
    private LocalDateTime time;
}
