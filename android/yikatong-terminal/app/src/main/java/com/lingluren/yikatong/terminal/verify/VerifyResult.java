package com.lingluren.yikatong.terminal.verify;

public class VerifyResult {
    private final String memberId;
    private final boolean passed;
    private final String message;

    public VerifyResult(String memberId, boolean passed, String message) {
        this.memberId = memberId;
        this.passed = passed;
        this.message = message;
    }

    public String getMemberId() {
        return memberId;
    }

    public boolean isPassed() {
        return passed;
    }

    public String getMessage() {
        return message;
    }
}
