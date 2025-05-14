package org.example.persistence.entity;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class BlockEntity {
    private long id;
    private String blockReason;
    private OffsetDateTime blockedAt;
    private String unblockReason;
    private OffsetDateTime unblockedAt;

}
