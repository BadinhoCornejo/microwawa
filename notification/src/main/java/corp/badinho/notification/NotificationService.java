package corp.badinho.notification;

import corp.badinho.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void send(NotificationRequest request) {
        notificationRepository.save(
                Notification.builder()
                        .toCustomerId(request.getToCustomerId())
                        .toCustomerEmail(request.getToCustomerName())
                        .sender("badinho")
                        .message(request.getMessage())
                        .sentAt(LocalDateTime.now())
                        .build()
        );
    }
}

