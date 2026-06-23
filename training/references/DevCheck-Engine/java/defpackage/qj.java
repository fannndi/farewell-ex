package defpackage;

/* loaded from: classes.dex */
public final class qj {

    /* renamed from: a, reason: collision with root package name */
    public int f847a;
    public String b;

    public static cf a() {
        cf cfVar = new cf();
        cfVar.b = "";
        return cfVar;
    }

    public final String toString() {
        int i = this.f847a;
        int i2 = bk2.f89a;
        lj2 lj2Var = aj2.i;
        Integer valueOf = Integer.valueOf(i);
        return "Response Code: " + (!lj2Var.containsKey(valueOf) ? aj2.h : (aj2) lj2Var.get(valueOf)).toString() + ", Debug Message: " + this.b;
    }
}
