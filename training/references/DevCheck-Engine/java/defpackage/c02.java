package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class c02 {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f103a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public c02(Drawable drawable, String str, int i) {
        this.f103a = drawable;
        this.b = str;
        this.f = i;
    }

    public c02(Drawable drawable, String str, String str2, String str3, boolean z) {
        this.c = str;
        this.g = z;
        this.d = str2;
        this.e = str3;
        this.f103a = drawable;
        this.f = 1;
    }

    public c02(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.j = true;
        this.h = z5;
        this.i = z;
        this.f = 4;
    }
}
