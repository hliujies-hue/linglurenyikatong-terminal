package com.lingluren.yikatong.terminal.verify;

/**
 * 离线核验流程状态。
 */
public enum VerifyFlowState {
    IDLE,
    CAMERA_READY,
    FACE_DETECTED,
    LIVING_CHECK,
    SEARCHING,
    PASSED,
    FAILED
}
