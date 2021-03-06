package com.aof.sharedmodule.Button;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

import com.aof.sharedmodule.R;

public class CrossButton extends PublicButton {

    public CrossButton(Context context, @Nullable AttributeSet attrs){
        super(context,attrs);
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.CrossButton);
        setButtonIndexSec(array.getInt(R.styleable.CrossButton_button_index_sec,-1));
        array.recycle();
    }

    private int ButtonIndexSec;

    public int getButtonIndexSec() { return ButtonIndexSec; }
    public void setButtonIndexSec(int buttonIndexSec) { ButtonIndexSec = buttonIndexSec; }

}
