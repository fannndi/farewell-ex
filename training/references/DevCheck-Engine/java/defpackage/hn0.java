package defpackage;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class hn0 {
    public final ArrayList A;
    public ArrayList B;
    public final Intent C;
    public final boolean D;
    public final List E;

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f391a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public String h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;
    public String m;
    public String n;
    public String o;
    public String p;
    public final boolean q;
    public final int r;
    public final String s;
    public int t;
    public int u;
    public final int v;
    public final ApplicationInfo w;
    public final am1 x;
    public j71 y;
    public final String z;

    public hn0(int i, int i2, String str, String str2) {
        this.l = i;
        this.h = null;
        this.k = i2;
        this.i = str2;
        this.u = 9;
        this.j = str;
    }

    public hn0(int i, String str) {
        this.r = i;
        this.d = str;
        this.u = 52;
    }

    public hn0(int i, String str, String str2) {
        this.b = str;
        this.d = str2;
        this.u = i;
    }

    public hn0(Drawable drawable, String str) {
        this.f391a = drawable;
        this.b = str;
        this.g = null;
        this.d = null;
        this.s = null;
        this.u = 32;
    }

    public hn0(Drawable drawable, String str, int i) {
        this.f391a = drawable;
        this.b = null;
        this.d = str;
        this.s = null;
        this.u = i;
    }

    public hn0(Drawable drawable, String str, int i, ApplicationInfo applicationInfo) {
        this.f391a = drawable;
        this.b = str;
        this.v = i;
        this.w = applicationInfo;
        this.u = 34;
    }

    public hn0(Drawable drawable, String str, String str2) {
        this.f391a = drawable;
        this.b = str;
        this.d = str2;
        this.u = 57;
    }

    public hn0(Drawable drawable, String str, String str2, String str3, ApplicationInfo applicationInfo, int i) {
        this.f391a = drawable;
        this.b = str;
        this.d = str2;
        this.s = str3;
        this.w = applicationInfo;
        this.u = i;
    }

    public hn0(Drawable drawable, String str, String str2, String str3, String str4, boolean z) {
        this.f391a = drawable;
        this.b = str;
        this.g = str2;
        this.d = str3;
        this.s = str4;
        this.q = z;
        this.u = 11;
    }

    public hn0(Drawable drawable, String str, String str2, String str3, boolean z) {
        this.f391a = drawable;
        this.b = str;
        this.d = str2;
        this.s = str3;
        this.q = z;
        this.u = 11;
    }

    public hn0(String str, String str2, am1 am1Var) {
        this.b = str;
        this.d = str2;
        this.x = am1Var;
        this.u = 22;
    }

    public hn0(String str, String str2, Intent intent) {
        this.b = str;
        this.d = str2;
        this.C = intent;
        this.u = 6;
    }

    public hn0(String str, String str2, String str3) {
        this.b = str;
        this.d = str2;
        this.u = 42;
        this.z = str3;
    }

    public hn0(String str, String str2, String str3, String str4) {
        this.u = 54;
        this.b = str;
        this.c = str3;
        this.d = str2;
        this.s = str4;
    }

    public hn0(String str, String str2, String str3, String str4, int i, int i2) {
        this.b = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.t = i;
        this.u = i2;
    }

    public hn0(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3) {
        this.f = str;
        this.e = str2;
        this.d = str3;
        this.s = str4;
        this.g = str5;
        this.t = i;
        this.v = i2;
        this.u = i3;
    }

    public hn0(String str, boolean z) {
        this.b = str;
        this.D = z;
        this.u = 45;
    }

    public hn0(ArrayList arrayList) {
        this.A = arrayList;
        this.u = 56;
    }

    public hn0(ArrayList arrayList, int i) {
        this.E = arrayList;
        this.u = 59;
    }

    public final Drawable a() {
        return this.f391a;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.b;
    }

    public final void e(String str) {
        this.h = str;
    }

    public final void f(String str) {
        this.m = str;
    }
}
