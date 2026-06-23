package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class jx0 {

    /* renamed from: a, reason: collision with root package name */
    public final i8 f501a;
    public final fh b;
    public final HashMap c;

    public jx0(Context context, fh fhVar) {
        i8 i8Var = new i8(context);
        this.c = new HashMap();
        this.f501a = i8Var;
        this.b = fhVar;
    }

    public final synchronized k12 a(String str) {
        if (this.c.containsKey(str)) {
            return (k12) this.c.get(str);
        }
        CctBackendFactory i = this.f501a.i(str);
        if (i == null) {
            return null;
        }
        fh fhVar = this.b;
        k12 create = i.create(new cb((Context) fhVar.h, (ir) fhVar.i, (ir) fhVar.j, str));
        this.c.put(str, create);
        return create;
    }
}
