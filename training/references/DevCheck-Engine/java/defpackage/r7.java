package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public class r7 {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final yo1 h = new yo1(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f874a = new Object[2];

    public b5 a(Context context, AttributeSet attributeSet) {
        return new b5(context, attributeSet);
    }

    public c5 b(Context context, AttributeSet attributeSet) {
        return new c5(context, attributeSet, flar2.devcheck.R.attr.buttonStyle);
    }

    public e5 c(Context context, AttributeSet attributeSet) {
        return new e5(context, attributeSet, flar2.devcheck.R.attr.checkboxStyle);
    }

    public l6 d(Context context, AttributeSet attributeSet) {
        return new l6(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        yo1 yo1Var = h;
        Constructor constructor = (Constructor) yo1Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            yo1Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f874a);
    }
}
