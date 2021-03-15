package org.itstep.enums;

import java.time.LocalDateTime;

public enum RoleEnum {

    ROLE_ADMIN(LocalDateTime.now().plusMonths(5)),
    ROLE_USER(LocalDateTime.now().plusYears(5));

    private LocalDateTime expiredDate;

    RoleEnum(LocalDateTime expiredDate) {
        this.expiredDate = expiredDate;
    }

    public LocalDateTime getExpiredDate() {
        return expiredDate;
    }
}
