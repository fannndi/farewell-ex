package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class s82 extends md2 {
    public static boolean m = true;
    public static boolean n = true;
    public static boolean o = true;
    public static boolean p = true;

    public void L(View view, int i, int i2, int i3, int i4) {
        if (o) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                o = false;
            }
        }
    }

    public void M(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (p) {
                try {
                    view.setTransitionVisibility(i);
                    return;
                } catch (NoSuchMethodError unused) {
                    p = false;
                    return;
                }
            }
            return;
        }
        if (!md2.l) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                md2.k = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            md2.l = true;
        }
        Field field = md2.k;
        if (field != null) {
            try {
                md2.k.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void N(View view, Matrix matrix) {
        if (m) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                m = false;
            }
        }
    }

    public void O(ViewGroup viewGroup, Matrix matrix) {
        if (n) {
            try {
                viewGroup.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                n = false;
            }
        }
    }
}
