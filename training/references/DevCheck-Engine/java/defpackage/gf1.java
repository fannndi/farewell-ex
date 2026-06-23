package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class gf1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f337a;
    public final Field b;
    public final String c;
    public final /* synthetic */ Method d;
    public final /* synthetic */ c22 e;
    public final /* synthetic */ c22 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    public gf1(String str, Field field, Method method, c22 c22Var, c22 c22Var2, boolean z, boolean z2) {
        this.d = method;
        this.e = c22Var;
        this.f = c22Var2;
        this.g = z;
        this.h = z2;
        this.f337a = str;
        this.b = field;
        this.c = field.getName();
    }

    public final void a(to0 to0Var, Object obj) {
        Object obj2;
        Method method = this.d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new no0(d51.y("Accessor ", ef1.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            obj2 = this.b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        to0Var.r(this.f337a);
        this.e.c(to0Var, obj2);
    }
}
