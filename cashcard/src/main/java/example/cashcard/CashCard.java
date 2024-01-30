package example.cashcard;

import lombok.Data;
import org.springframework.data.annotation.Id;

public record CashCard(@Id Long id, Double amount, String owner) {
}
