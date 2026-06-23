package defpackage;

import android.text.TextUtils;
import android.view.View;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class l62 extends fu0 {
    public final /* synthetic */ int k;

    public l62(int i, Class cls, int i2, int i3, int i4) {
        this.k = i4;
        this.g = i;
        this.j = cls;
        this.i = i2;
        this.h = i3;
    }

    @Override // defpackage.fu0
    public final Object c(View view) {
        switch (this.k) {
            case 0:
                return Boolean.valueOf(t62.c(view));
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return t62.a(view);
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return v62.b(view);
            default:
                return Boolean.valueOf(t62.b(view));
        }
    }

    @Override // defpackage.fu0
    public final void d(View view, Object obj) {
        switch (this.k) {
            case 0:
                t62.f(view, ((Boolean) obj).booleanValue());
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                t62.e(view, (CharSequence) obj);
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                v62.c(view, (CharSequence) obj);
                break;
            default:
                t62.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.fu0
    public final boolean g(Object obj, Object obj2) {
        boolean equals;
        switch (this.k) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !equals;
    }
}
