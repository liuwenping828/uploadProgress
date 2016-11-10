package com.lwp.uploadprogress;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;

/**
 * 上传进度对话框
 */
public class UploadProgress extends ProgressDialog {

    public UploadProgress(Context context) {
        this(context, 0);
    }

    public UploadProgress(Context context, int theme) {
        super(context, theme);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progressdialog);
        // 设置点击外部不可取消
        setCanceledOnTouchOutside(false);
        // 设置不可以取消
        setCancelable(false);
    }
}
