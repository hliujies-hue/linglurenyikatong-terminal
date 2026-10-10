package com.lingluren.yikatong.terminal.database;

/**
 * 设备同步记录。
 * 用于记录新增、更新、删除事件执行状态。
 */
public class SyncRecordEntity {

    private String eventId;
    private String eventType;
    private String status;
    private String message;

    public String getEventId() {
        return eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
