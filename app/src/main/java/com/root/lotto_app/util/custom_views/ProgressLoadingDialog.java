package com.root.lotto_app.util.custom_views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;

import com.root.lotto_app.R;

/**
 * Created by Nasimxon on 10/2/2017.
 */

public class ProgressLoadingDialog extends Dialog {
    public ProgressLoadingDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.loading_view);
        if (getWindow() != null)
            getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        setCanceledOnTouchOutside(false);
    }
}