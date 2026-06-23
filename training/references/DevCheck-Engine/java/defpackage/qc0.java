package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class qc0 implements Callable {
    public final /* synthetic */ int g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    public /* synthetic */ qc0(String str, Context context, Object obj, int i, int i2) {
        this.g = i2;
        this.h = str;
        this.i = context;
        this.k = obj;
        this.j = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.g;
        int i2 = this.j;
        Object obj = this.k;
        Context context = this.i;
        String str = this.h;
        switch (i) {
            case 0:
                Object[] objArr = {(nc0) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return tc0.b(str, context, Collections.unmodifiableList(arrayList), i2);
            default:
                try {
                    return tc0.b(str, context, (ArrayList) obj, i2);
                } catch (Throwable unused) {
                    return new sc0(-3);
                }
        }
    }
}
