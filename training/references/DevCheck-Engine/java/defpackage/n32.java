package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class n32 {

    /* renamed from: a, reason: collision with root package name */
    public static final k32 f663a;
    public static final gt0 b;
    public static Paint c;

    static {
        Trace.beginSection(bw0.A("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f663a = new t32();
        } else if (i >= 29) {
            f663a = new s32();
        } else if (i >= 28) {
            f663a = new r32();
        } else if (i >= 26) {
            f663a = new q32();
        } else if (p32.l != null) {
            f663a = new p32();
        } else {
            f663a = new o32();
        }
        b = new gt0(16);
        c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, uc0 uc0Var, Resources resources, int i, String str, int i2, int i3, sl slVar, boolean z) {
        Typeface m;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        int i4 = 9;
        int i5 = -3;
        if (uc0Var instanceof xc0) {
            xc0 xc0Var = (xc0) uc0Var;
            String str2 = xc0Var.d;
            Typeface typeface = null;
            int i6 = 1;
            int i7 = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = xc0Var.f1177a;
                if (arrayList.size() == 1) {
                    build = c(((nc0) arrayList.get(0)).e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i8 = 0;
                        while (true) {
                            if (i8 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= arrayList.size()) {
                                        break;
                                    }
                                    nc0 nc0Var = (nc0) arrayList.get(i9);
                                    if (i9 == arrayList.size() - 1 && TextUtils.isEmpty(nc0Var.f)) {
                                        customFallbackBuilder.setSystemFallback(nc0Var.e);
                                        break;
                                    }
                                    String str3 = nc0Var.e;
                                    String str4 = nc0Var.f;
                                    Font d = d(c(str3));
                                    if (d == null) {
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build3 = fi0.z(d).build();
                                    } else {
                                        try {
                                            m32.m();
                                            m32.w();
                                            fontVariationSettings = pu1.c(d).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = fi0.i(build2).build();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = fi0.g(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i9++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((nc0) arrayList.get(i8)).e) == null) {
                                    break;
                                }
                                i8++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (slVar != null) {
                    new Handler(Looper.getMainLooper()).post(new n51(slVar, i4, build));
                }
                b.j(b(resources, i, str, i2, i3), build);
                return build;
            }
            boolean z2 = !z ? slVar != null : xc0Var.c != 0;
            int i10 = z ? xc0Var.b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            my1 my1Var = new my1();
            my1Var.g = slVar;
            ArrayList arrayList2 = xc0Var.f1177a;
            x9 x9Var = new x9(handler, 4);
            zf zfVar = new zf(my1Var, 4, x9Var);
            int i11 = 7;
            if (!z2) {
                String a2 = tc0.a(i3, arrayList2);
                Typeface typeface2 = (Typeface) tc0.f979a.f(a2);
                if (typeface2 != null) {
                    x9Var.execute(new hk2(my1Var, i11, typeface2));
                    typeface = typeface2;
                } else {
                    rc0 rc0Var = new rc0(i7, zfVar);
                    synchronized (tc0.c) {
                        try {
                            yo1 yo1Var = tc0.d;
                            ArrayList arrayList3 = (ArrayList) yo1Var.get(a2);
                            if (arrayList3 != null) {
                                arrayList3.add(rc0Var);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(rc0Var);
                                yo1Var.put(a2, arrayList4);
                                qc0 qc0Var = new qc0(a2, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = tc0.b;
                                rc0 rc0Var2 = new rc0(i6, a2);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                qi0 qi0Var = new qi0();
                                qi0Var.h = qc0Var;
                                qi0Var.i = rc0Var2;
                                qi0Var.j = handler2;
                                threadPoolExecutor.execute(qi0Var);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    c.m("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                nc0 nc0Var2 = (nc0) arrayList2.get(0);
                gt0 gt0Var = tc0.f979a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{nc0Var2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a3 = tc0.a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) tc0.f979a.f(a3);
                if (typeface3 != null) {
                    x9Var.execute(new hk2(my1Var, i11, typeface3));
                    typeface = typeface3;
                } else if (i10 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{nc0Var2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    sc0 b2 = tc0.b(a3, context, Collections.unmodifiableList(arrayList6), i3);
                    zfVar.G(b2);
                    typeface = b2.f927a;
                } else {
                    try {
                        try {
                            try {
                                sc0 sc0Var = (sc0) tc0.b.submit(new qc0(a3, context, nc0Var2, i3, 0)).get(i10, TimeUnit.MILLISECONDS);
                                zfVar.G(sc0Var);
                                typeface = sc0Var.f927a;
                            } catch (TimeoutException unused2) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e) {
                            throw e;
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused3) {
                        ((x9) zfVar.i).execute(new ce(i5, i6, (my1) zfVar.h));
                    }
                }
            }
            m = typeface;
        } else {
            m = f663a.m(context, (vc0) uc0Var, resources, i3);
            if (slVar != null) {
                if (m != null) {
                    new Handler(Looper.getMainLooper()).post(new n51(slVar, i4, m));
                } else {
                    slVar.c(-3);
                }
            }
        }
        if (m != null) {
            b.j(b(resources, i, str, i2, i3), m);
        }
        return m;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
