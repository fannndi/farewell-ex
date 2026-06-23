package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a70 implements b70 {

    /* renamed from: a, reason: collision with root package name */
    public Long f12a;

    @Override // defpackage.b70
    public final boolean b() {
        if (this.f12a == null) {
            try {
                Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                declaredMethod.setAccessible(true);
                Long l = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                l.longValue();
                this.f12a = l;
            } catch (Exception unused) {
                this.f12a = -1L;
            }
        }
        return this.f12a.longValue() >= 40100;
    }
}
