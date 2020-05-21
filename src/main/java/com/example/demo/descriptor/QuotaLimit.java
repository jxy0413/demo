package com.example.demo.descriptor;

import lombok.Data;

/**
 * @Auther jxy
 * @Date 2020-04-10
 */
@Data
public class QuotaLimit {
    private QuotaType type;
    private QuotaSubject subject;
    private QuotaThrottleType throttleType;
    private LimitPolicy policy;
    private String limit;

    public enum QuotaSubject {
        NAMESPACE, TABLE, USER;
    }

    public enum QuotaType {
        THROTTLE, SPACE;
    }

    public enum QuotaThrottleType {
        REQUEST_NUMBER,

        REQUEST_SIZE,

        WRITE_NUMBER,

        WRITE_SIZE,

        READ_NUMBER,

        READ_SIZE,
    }

    public enum LimitPolicy {
        NO_INSERTS, NO_WRITES, NO_WRITES_COMPACTIONS, DISABLE;
    }
}
