package com.lingluren.yikatong.terminal.terminal;

import android.app.Activity;
import android.os.Bundle;

import com.lingluren.yikatong.terminal.face.FaceSdkAdapter;
import com.lingluren.yikatong.terminal.verify.VerifyManager;

/**
 * 一卡通离线核验终端入口。
 *
 * 后续绑定真实布局：
 * 设备编号、景区、SDK状态、本地会员数量、核验入口、最近日志。
 */
public class TerminalVerifyActivity extends Activity {

    private FaceSdkAdapter faceSdkAdapter;
    private VerifyManager verifyManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        faceSdkAdapter = new FaceSdkAdapter();
        verifyManager = new VerifyManager();
    }
}
