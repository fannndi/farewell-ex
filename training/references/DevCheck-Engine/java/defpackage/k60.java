package defpackage;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class k60 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f517a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f517a = field;
    }
}
