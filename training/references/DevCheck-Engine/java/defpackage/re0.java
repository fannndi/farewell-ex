package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.Method;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class re0 implements af0 {
    public final /* synthetic */ int g;

    public /* synthetic */ re0(int i) {
        this.g = i;
    }

    @Override // defpackage.af0
    public final Object a() {
        Class<?> returnType;
        int i = this.g;
        e42 e42Var = e42.f219a;
        switch (i) {
            case 0:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                try {
                    String[] strArr = se0.h;
                    Method method = (Method) se0.j.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
            case 3:
                return e42Var;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return Boolean.TRUE;
            default:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
        }
    }
}
