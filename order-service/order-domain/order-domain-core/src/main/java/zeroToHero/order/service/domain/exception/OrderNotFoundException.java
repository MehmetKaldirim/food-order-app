package zeroToHero.order.service.domain.exception;

import com.zeroToHero.domain.exception.DomainException;

public class OrderNotFoundException extends DomainException {
    public OrderNotFoundException(String message) {
        super(message);
    }

    public OrderNotFoundException(Throwable cause) {
        super(cause);
    }
}
