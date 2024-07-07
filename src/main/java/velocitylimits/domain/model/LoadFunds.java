package velocitylimits.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

/**
 * @author harshagangavarapu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoadFunds {
    private Long id;
    @JsonProperty("customer_id")
    private Long customerId;
    @JsonProperty("load_amount")
    private Double loadAmount;
    private LocalDateTime time;
}
