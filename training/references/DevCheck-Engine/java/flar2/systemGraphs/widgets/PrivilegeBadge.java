package flar2.devcheck.systemGraphs.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.g91;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public class PrivilegeBadge extends AppCompatTextView {
    public PrivilegeBadge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float f = getResources().getDisplayMetrics().density;
        int i = (int) (10.0f * f);
        int i2 = (int) (f * 3.0f);
        setPadding(i, i2, i, i2);
        setTextSize(2, 11.0f);
        setIncludeFontPadding(false);
        setGravity(17);
        setStrategy(g91.j);
    }

    public final int g(int i, int i2) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setStrategy(g91 g91Var) {
        int g;
        int argb;
        CharSequence charSequence;
        int ordinal = g91Var.ordinal();
        if (ordinal == 0) {
            g = g(R.attr.textSecondary, -11184811);
            argb = Color.argb(24, Color.red(g), Color.green(g), Color.blue(g));
            charSequence = GFUHKHDfiFuPm.rBDVh;
        } else if (ordinal == 1) {
            g = g(R.attr.colorPrimary, -14776091);
            argb = Color.argb(28, Color.red(g), Color.green(g), Color.blue(g));
            charSequence = "Shizuku";
        } else if (ordinal != 2) {
            setVisibility(8);
            return;
        } else {
            g = g(R.attr.colorPrimary, -14776091);
            argb = Color.argb(28, Color.red(g), Color.green(g), Color.blue(g));
            charSequence = "Root";
        }
        setVisibility(0);
        setTextColor(g);
        setText(charSequence);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(getResources().getDisplayMetrics().density * 12.0f);
        gradientDrawable.setColor(argb);
        setBackground(gradientDrawable);
    }
}
