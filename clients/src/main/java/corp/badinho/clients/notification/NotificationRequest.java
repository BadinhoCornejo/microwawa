package corp.badinho.clients.notification;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotificationRequest {
    Integer toCustomerId;
    String toCustomerName;
    String message;
}
