package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import flar2.devcheck.benchmarkSuite.calibration.CalibrationActivity;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class i8 implements ui1, e80, b41, en, h2, fe2, sa0 {
    public static final int[] i = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public Object g;
    public Object h;

    public i8(ah1 ah1Var, ui1 ui1Var) {
        ui1Var.getClass();
        this.h = ah1Var;
        this.g = ui1Var;
    }

    public i8(AbsSeekBar absSeekBar) {
        this.g = absSeekBar;
    }

    public /* synthetic */ i8(Object obj) {
        this.g = obj;
        this.h = null;
    }

    public /* synthetic */ i8(Object obj, Object obj2) {
        this.h = obj;
        this.g = obj2;
    }

    public /* synthetic */ i8(Object obj, Object obj2, boolean z) {
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.e80
    public Object a() {
        return (k42) this.g;
    }

    @Override // defpackage.ge2
    public Object b() {
        return new qe2(((qz) this.g).g, (df2) ((ee2) this.h).b(), new m52());
    }

    @Override // defpackage.h2
    public boolean c(j2 j2Var, Menu menu) {
        return ((h2) this.g).c(j2Var, menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7 A[Catch: all -> 0x00b8, TRY_ENTER, TryCatch #3 {all -> 0x00b8, blocks: (B:49:0x00b7, B:50:0x00ba, B:51:0x00d2), top: B:47:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba A[Catch: all -> 0x00b8, TryCatch #3 {all -> 0x00b8, blocks: (B:49:0x00b7, B:50:0x00ba, B:51:0x00d2), top: B:47:0x00b5 }] */
    @Override // defpackage.ui1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ti1 d(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8.d(java.lang.String):ti1");
    }

    @Override // defpackage.en
    public void e(dn dnVar) {
        String K = rt0.K(dnVar);
        Context context = (Context) this.g;
        long j = dnVar.d;
        File file = null;
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = context.getFilesDir();
        }
        File file2 = new File(externalFilesDir, "calibration-" + j + ".json");
        try {
            FileWriter fileWriter = new FileWriter(file2);
            try {
                fileWriter.write(K);
                fileWriter.close();
                file = file2;
            } finally {
            }
        } catch (IOException unused) {
        }
        ((CalibrationActivity) this.h).m.post(new b9(4, this, K, file));
    }

    @Override // defpackage.e80
    public boolean f(CharSequence charSequence, int i2, int i3, u32 u32Var) {
        if ((u32Var.c & 4) > 0) {
            return true;
        }
        if (((k42) this.g) == null) {
            this.g = new k42(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((pg0) this.h).getClass();
        ((k42) this.g).setSpan(new v32(u32Var), i2, i3, 33);
        return true;
    }

    @Override // defpackage.h2
    public boolean g(j2 j2Var, MenuItem menuItem) {
        return ((h2) this.g).g(j2Var, menuItem);
    }

    @Override // defpackage.db1
    public Object get() {
        i42 i42Var = new i42();
        x42 x42Var = new x42();
        Object obj = ((db1) this.g).get();
        db1 db1Var = (db1) this.h;
        return new zi1(i42Var, x42Var, fb.f, (gk1) obj, db1Var);
    }

    public boolean h(xb2 xb2Var) {
        boolean containsKey;
        synchronized (this.h) {
            containsKey = ((s00) this.g).f913a.containsKey(xb2Var);
        }
        return containsKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory i(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "."
            java.lang.String r1 = "Could not instantiate "
            java.lang.Object r2 = r12.h
            java.util.Map r2 = (java.util.Map) r2
            r3 = 0
            if (r2 != 0) goto L80
            java.lang.Object r2 = r12.g
            android.content.Context r2 = (android.content.Context) r2
            android.content.pm.PackageManager r4 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            if (r4 != 0) goto L17
        L15:
            r2 = r3
            goto L29
        L17:
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            java.lang.Class<com.google.android.datatransport.runtime.backends.TransportBackendDiscovery> r6 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class
            r5.<init>(r2, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ServiceInfo r2 = r4.getServiceInfo(r5, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            if (r2 != 0) goto L27
            goto L15
        L27:
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
        L29:
            if (r2 != 0) goto L2e
            java.util.Map r2 = java.util.Collections.EMPTY_MAP
            goto L7e
        L2e:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Set r5 = r2.keySet()
            java.util.Iterator r5 = r5.iterator()
        L3b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L7d
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.get(r6)
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L3b
            java.lang.String r8 = "backend:"
            boolean r8 = r6.startsWith(r8)
            if (r8 == 0) goto L3b
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = ","
            r9 = -1
            java.lang.String[] r7 = r7.split(r8, r9)
            int r8 = r7.length
            r9 = 0
        L62:
            if (r9 >= r8) goto L3b
            r10 = r7[r9]
            java.lang.String r10 = r10.trim()
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L71
            goto L7a
        L71:
            r11 = 8
            java.lang.String r11 = r6.substring(r11)
            r4.put(r10, r11)
        L7a:
            int r9 = r9 + 1
            goto L62
        L7d:
            r2 = r4
        L7e:
            r12.h = r2
        L80:
            java.lang.Object r12 = r12.h
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r12 = r12.get(r13)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L8d
            return r3
        L8d:
            java.lang.Class r13 = java.lang.Class.forName(r12)     // Catch: java.lang.reflect.InvocationTargetException -> La2 java.lang.NoSuchMethodException -> La6 java.lang.InstantiationException -> Laa java.lang.IllegalAccessException -> Lb6 java.lang.ClassNotFoundException -> Lc2
            java.lang.Class<com.google.android.datatransport.cct.CctBackendFactory> r2 = com.google.android.datatransport.cct.CctBackendFactory.class
            java.lang.Class r13 = r13.asSubclass(r2)     // Catch: java.lang.reflect.InvocationTargetException -> La2 java.lang.NoSuchMethodException -> La6 java.lang.InstantiationException -> Laa java.lang.IllegalAccessException -> Lb6 java.lang.ClassNotFoundException -> Lc2
            java.lang.reflect.Constructor r13 = r13.getDeclaredConstructor(r3)     // Catch: java.lang.reflect.InvocationTargetException -> La2 java.lang.NoSuchMethodException -> La6 java.lang.InstantiationException -> Laa java.lang.IllegalAccessException -> Lb6 java.lang.ClassNotFoundException -> Lc2
            java.lang.Object r13 = r13.newInstance(r3)     // Catch: java.lang.reflect.InvocationTargetException -> La2 java.lang.NoSuchMethodException -> La6 java.lang.InstantiationException -> Laa java.lang.IllegalAccessException -> Lb6 java.lang.ClassNotFoundException -> Lc2
            com.google.android.datatransport.cct.CctBackendFactory r13 = (com.google.android.datatransport.cct.CctBackendFactory) r13     // Catch: java.lang.reflect.InvocationTargetException -> La2 java.lang.NoSuchMethodException -> La6 java.lang.InstantiationException -> Laa java.lang.IllegalAccessException -> Lb6 java.lang.ClassNotFoundException -> Lc2
            return r13
        La2:
            r1.concat(r12)
            goto Ld1
        La6:
            r1.concat(r12)
            goto Ld1
        Laa:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r1)
            r13.append(r12)
            r13.append(r0)
            goto Ld1
        Lb6:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r1)
            r13.append(r12)
            r13.append(r0)
            goto Ld1
        Lc2:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Class "
            r13.<init>(r0)
            r13.append(r12)
            java.lang.String r12 = " is not found."
            r13.append(r12)
        Ld1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8.i(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public void j(AttributeSet attributeSet, int i2) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.g;
        fh G = fh.G(i2, 0, absSeekBar.getContext(), attributeSet, i);
        Drawable x = G.x(0);
        if (x != null) {
            if (x instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) x;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i3 = 0; i3 < numberOfFrames; i3++) {
                    Drawable m = m(animationDrawable.getFrame(i3), true);
                    m.setLevel(10000);
                    animationDrawable2.addFrame(m, animationDrawable.getDuration(i3));
                }
                animationDrawable2.setLevel(10000);
                x = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(x);
        }
        Drawable x2 = G.x(1);
        if (x2 != null) {
            absSeekBar.setProgressDrawable(m(x2, false));
        }
        G.L();
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01f7, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f7 A[Catch: IOException | XmlPullParserException -> 0x01fd, IOException | XmlPullParserException -> 0x01fd, TryCatch #0 {IOException | XmlPullParserException -> 0x01fd, blocks: (B:17:0x0056, B:26:0x01f7, B:26:0x01f7, B:27:0x0068, B:28:0x0076, B:31:0x007b, B:39:0x0085, B:42:0x009f, B:45:0x008e, B:49:0x0097, B:52:0x00ad, B:55:0x00bc, B:55:0x00bc, B:57:0x00c4, B:57:0x00c4, B:60:0x00ce, B:60:0x00ce, B:64:0x00f7, B:64:0x00f7, B:67:0x00fe, B:67:0x00fe, B:68:0x0116, B:68:0x0116, B:70:0x00d7, B:70:0x00d7, B:72:0x00df, B:72:0x00df, B:75:0x00ed, B:75:0x00ed, B:78:0x0117, B:78:0x0117, B:80:0x011f, B:80:0x011f, B:83:0x012d, B:83:0x012d, B:86:0x0137, B:86:0x0137, B:89:0x0142, B:89:0x0142, B:90:0x015a, B:90:0x015a, B:92:0x015b, B:92:0x015b, B:95:0x0165, B:95:0x0165, B:98:0x0170, B:98:0x0170, B:99:0x0188, B:99:0x0188, B:101:0x0189, B:101:0x0189, B:103:0x0191, B:103:0x0191, B:106:0x019a, B:106:0x019a, B:109:0x01a4, B:109:0x01a4, B:112:0x01ae, B:112:0x01ae, B:113:0x01c6, B:113:0x01c6, B:115:0x01c7, B:115:0x01c7, B:118:0x01d1, B:118:0x01d1, B:121:0x01db, B:121:0x01db, B:122:0x01f3, B:122:0x01f3, B:125:0x01f4, B:125:0x01f4), top: B:16:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fe A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8.k(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public vq1 l(xb2 xb2Var) {
        vq1 c;
        xb2Var.getClass();
        synchronized (this.h) {
            c = ((s00) this.g).c(xb2Var);
        }
        return c;
    }

    public Drawable m(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.h) == null) {
                this.h = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            int id = layerDrawable.getId(i2);
            drawableArr[i2] = m(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i3 = 0; i3 < numberOfLayers; i3++) {
            layerDrawable2.setId(i3, layerDrawable.getId(i3));
            layerDrawable2.setLayerGravity(i3, layerDrawable.getLayerGravity(i3));
            layerDrawable2.setLayerWidth(i3, layerDrawable.getLayerWidth(i3));
            layerDrawable2.setLayerHeight(i3, layerDrawable.getLayerHeight(i3));
            layerDrawable2.setLayerInsetLeft(i3, layerDrawable.getLayerInsetLeft(i3));
            layerDrawable2.setLayerInsetRight(i3, layerDrawable.getLayerInsetRight(i3));
            layerDrawable2.setLayerInsetTop(i3, layerDrawable.getLayerInsetTop(i3));
            layerDrawable2.setLayerInsetBottom(i3, layerDrawable.getLayerInsetBottom(i3));
            layerDrawable2.setLayerInsetStart(i3, layerDrawable.getLayerInsetStart(i3));
            layerDrawable2.setLayerInsetEnd(i3, layerDrawable.getLayerInsetEnd(i3));
        }
        return layerDrawable2;
    }

    @Override // defpackage.en
    public void n(String str) {
        ((CalibrationActivity) this.h).m.post(new k5(this, 10, str));
    }

    public vq1 o(xb2 xb2Var) {
        vq1 e;
        synchronized (this.h) {
            e = ((s00) this.g).e(xb2Var);
        }
        return e;
    }

    @Override // defpackage.h2
    public boolean p(j2 j2Var, Menu menu) {
        ViewGroup viewGroup = ((a6) this.h).G;
        WeakHashMap weakHashMap = y62.f1215a;
        viewGroup.requestApplyInsets();
        return ((h2) this.g).p(j2Var, menu);
    }

    @Override // defpackage.en
    public void r(final int i2, final int i3) {
        ((CalibrationActivity) this.h).m.post(new Runnable() { // from class: bn
            @Override // java.lang.Runnable
            public final void run() {
                CalibrationActivity calibrationActivity = (CalibrationActivity) i8.this.h;
                int i4 = i3;
                int i5 = i2;
                calibrationActivity.i.setProgress(i4 > 0 ? (i5 * 100) / i4 : 0);
                calibrationActivity.h.setText(i5 + " / " + i4 + " subtests");
            }
        });
    }

    @Override // defpackage.h2
    public void u(j2 j2Var) {
        ((h2) this.g).u(j2Var);
        a6 a6Var = (a6) this.h;
        if (a6Var.B != null) {
            a6Var.r.getDecorView().removeCallbacks(a6Var.C);
        }
        if (a6Var.A != null) {
            j82 j82Var = a6Var.D;
            if (j82Var != null) {
                j82Var.b();
            }
            j82 b = y62.b(a6Var.A);
            b.a(0.0f);
            a6Var.D = b;
            b.d(new p5(2, this));
        }
        a6Var.z = null;
        ViewGroup viewGroup = a6Var.G;
        WeakHashMap weakHashMap = y62.f1215a;
        viewGroup.requestApplyInsets();
        a6Var.M();
    }

    @Override // defpackage.b41
    public gb2 v(View view, gb2 gb2Var) {
        o82 o82Var = (o82) this.g;
        p82 p82Var = (p82) this.h;
        p82 p82Var2 = new p82();
        p82Var2.f777a = p82Var.f777a;
        p82Var2.b = p82Var.b;
        p82Var2.c = p82Var.c;
        p82Var2.d = p82Var.d;
        return o82Var.b(view, gb2Var, p82Var2);
    }
}
