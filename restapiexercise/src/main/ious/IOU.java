import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ious")

public class IOU {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String borrower;
    private String lender;
    private BigDecimal amount;
    private Instant dateTime;

}
