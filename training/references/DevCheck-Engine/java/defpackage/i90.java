package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i90 extends c22 {
    public static final h90 d = new h90();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f418a;
    public final HashMap b;
    public final HashMap c;

    public i90(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            int ceil = (int) Math.ceil(i / 0.75f);
            this.f418a = new HashMap(ceil);
            this.b = new HashMap(ceil);
            this.c = new HashMap(ceil);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String name = r4.name();
                String str = r4.toString();
                om1 om1Var = (om1) field2.getAnnotation(om1.class);
                if (om1Var != null) {
                    name = om1Var.value();
                    for (String str2 : om1Var.alternate()) {
                        this.f418a.put(str2, r4);
                    }
                }
                this.f418a.put(name, r4);
                this.b.put(str, r4);
                this.c.put(r4, name);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        if (ro0Var.Q() == 9) {
            ro0Var.M();
            return null;
        }
        String O = ro0Var.O();
        Enum r0 = (Enum) this.f418a.get(O);
        return r0 == null ? (Enum) this.b.get(O) : r0;
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        Enum r2 = (Enum) obj;
        to0Var.K(r2 == null ? null : (String) this.c.get(r2));
    }
}
