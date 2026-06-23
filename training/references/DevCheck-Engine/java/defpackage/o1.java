package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class o1 implements l31, e80, jt1 {
    public final /* synthetic */ int g;
    public String h;

    public /* synthetic */ o1(int i, String str) {
        this.g = i;
        this.h = str;
    }

    public o1(String str) {
        this.g = 7;
        this.h = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    public /* synthetic */ o1(o1 o1Var) {
        this.g = 4;
        this.h = o1Var.h;
    }

    public static String d(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return d51.s(str, " : ", str2);
    }

    @Override // defpackage.e80
    public Object a() {
        return this;
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            d(this.h, str, objArr);
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            d(this.h, str, objArr);
        }
    }

    @Override // defpackage.l31
    public Object e() {
        throw new no0(this.h);
    }

    @Override // defpackage.e80
    public boolean f(CharSequence charSequence, int i, int i2, u32 u32Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.h)) {
            return true;
        }
        u32Var.c = (u32Var.c & 3) | 4;
        return false;
    }

    @Override // defpackage.jt1
    public String j() {
        return this.h;
    }

    @Override // defpackage.jt1
    public void l(it1 it1Var) {
    }

    public String toString() {
        switch (this.g) {
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return "<" + this.h + '>';
            default:
                return super.toString();
        }
    }
}
