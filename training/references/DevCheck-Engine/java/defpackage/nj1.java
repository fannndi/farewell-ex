package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class nj1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f687a;
    public final String b;
    public final String c;
    public final String d;
    public final Drawable e;
    public final int f;
    public final int g;

    public nj1(int i) {
        this.g = i;
        if (i == 0) {
            this.f = 100;
        } else {
            this.f = 0;
        }
    }

    public nj1(String str, String str2, String str3, String str4, Drawable drawable, int i) {
        this.f687a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = drawable;
        this.f = i;
        this.g = 1;
    }
}
