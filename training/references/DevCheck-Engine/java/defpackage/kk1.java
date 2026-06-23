package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.SQLException;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.slider.KtNX.UQdsoaJMID;
import com.google.android.material.textfield.TextInputLayout;
import flar2.devcheck.R;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public abstract class kk1 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile HashMap f539a = null;
    public static byte b = 0;
    public static final os c = new os(1, "android");
    public static final c4 d = new c4(4);
    public static final boolean[] e = new boolean[3];
    public static final byte[] f = new byte[0];
    public static boolean g = false;
    public static boolean h = true;

    public static boolean A(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int B(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 3] << 24) & (-16777216)) | ((bArr[i + 2] << 16) & 16711680) | ((bArr[i + 1] << 8) & 65280);
    }

    public static String F(int i, String str) {
        return "                                             ".substring(0, Math.min(i * 2, 45)).concat(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e1, code lost:
    
        r0 = defpackage.xc1.d(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e5, code lost:
    
        defpackage.rt0.e(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.kv1 G(defpackage.ti1 r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk1.G(ti1, java.lang.String):kv1");
    }

    public static void H(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static int I(Context context, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int J(Context context, int i, int i2) {
        TypedValue q = md2.q(context.getTheme(), i);
        return (q == null || q.type != 16) ? i2 : q.data;
    }

    public static TimeInterpolator K(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            c.m(nTAZxGMqQtZZAQ.bFXJEKiGVvVI);
            return null;
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!A(valueOf, "cubic-bezier") && !A(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (A(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return new PathInterpolator(t(split, 0), t(split, 1), t(split, 2), t(split, 3));
            }
            rw.d(split.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
            return null;
        }
        if (!A(valueOf, "path")) {
            c.m("Invalid motion easing type: ".concat(valueOf));
            return null;
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            sl.P(sl.m(substring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e2) {
            jw0.l(XmJDY.YKFCixHHulav.concat(substring), e2);
            return null;
        }
    }

    public static wp1 L(Context context) {
        TypedValue q = md2.q(context.getTheme(), R.attr.motionSpringFastSpatial);
        int[] iArr = yb1.G;
        TypedArray obtainStyledAttributes = q == null ? context.obtainStyledAttributes(null, iArr, 0, R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(q.resourceId, iArr);
        wp1 wp1Var = new wp1();
        try {
            float f2 = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f3 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f3 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            wp1Var.b(f2);
            wp1Var.a(f3);
            return wp1Var;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static double M(Context context, String str, double d2) {
        HashMap hashMap;
        HashMap hashMap2 = f539a;
        if (hashMap2 == null) {
            synchronized (kk1.class) {
                try {
                    if (f539a == null) {
                        List asList = Arrays.asList(new ry(0), new ry(2), new y40(context.getApplicationContext()), new ry(1));
                        HashMap hashMap3 = new HashMap();
                        Iterator it = asList.iterator();
                        while (it.hasNext()) {
                            for (os1 os1Var : ((mg) it.next()).b()) {
                                String id = os1Var.getId();
                                os1Var.getId();
                                hashMap3.put(id, new jk1(os1Var.c(), !(os1Var instanceof fw0)));
                            }
                        }
                        f539a = hashMap3;
                    }
                    hashMap = f539a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashMap2 = hashMap;
        }
        jk1 jk1Var = (jk1) hashMap2.get(str);
        if (jk1Var == null) {
            return 0.0d;
        }
        return sl.Q(d2, jk1Var.f486a, jk1Var.b);
    }

    public static void N(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = hasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        if (Build.VERSION.SDK_INT >= 26 || !z2 || z) {
            checkableImageButton.setLongClickable(z);
        }
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static byte[] P(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    public static final int Q(yb2 yb2Var) {
        yb2Var.getClass();
        int ordinal = yb2Var.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        throw new pt();
                    }
                }
            }
        }
        return i;
    }

    public static void R(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            b8.m(viewGroup, z);
        } else if (h) {
            try {
                b8.m(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }

    public static final void S(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    public static final h21 T(byte[] bArr) {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new h21(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i = 0; i < readInt; i++) {
                    iArr[i] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i2 = 0; i2 < readInt2; i2++) {
                    iArr2[i2] = objectInputStream.readInt();
                }
                h21 q = k32.q(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return q;
            } finally {
            }
        } finally {
        }
    }

    public static void U(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener, CharSequence charSequence) {
        if (!checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            checkableImageButton.setTooltipText(charSequence);
        } else if (onLongClickListener == null) {
            ym0.z(checkableImageButton, charSequence);
        }
    }

    public static int V(byte[] bArr, int i, gl2 gl2Var) {
        int a0 = a0(bArr, i, gl2Var);
        int i2 = gl2Var.f343a;
        if (i2 < 0) {
            p22.a("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - a0) {
            p22.a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            gl2Var.c = ll2.i;
            return a0;
        }
        gl2Var.c = ll2.f(bArr, a0, i2);
        return a0 + i2;
    }

    public static int W(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int X(rm2 rm2Var, int i, byte[] bArr, int i2, int i3, yl2 yl2Var, gl2 gl2Var) {
        vl2 c2 = rm2Var.c();
        rm2 rm2Var2 = rm2Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        gl2 gl2Var2 = gl2Var;
        int f0 = f0(c2, rm2Var2, bArr2, i2, i4, gl2Var2);
        rm2Var2.a(c2);
        gl2Var2.c = c2;
        yl2Var.add(c2);
        while (f0 < i4) {
            gl2 gl2Var3 = gl2Var2;
            int i5 = i4;
            int a0 = a0(bArr2, f0, gl2Var3);
            if (i != gl2Var3.f343a) {
                break;
            }
            byte[] bArr3 = bArr2;
            rm2 rm2Var3 = rm2Var2;
            vl2 c3 = rm2Var3.c();
            f0 = f0(c3, rm2Var3, bArr3, a0, i5, gl2Var3);
            rm2Var2 = rm2Var3;
            bArr2 = bArr3;
            i4 = i5;
            gl2Var2 = gl2Var3;
            rm2Var2.a(c3);
            gl2Var2.c = c3;
            yl2Var.add(c3);
        }
        return f0;
    }

    public static int Y(byte[] bArr, int i, yl2 yl2Var, gl2 gl2Var) {
        wl2 wl2Var = (wl2) yl2Var;
        int a0 = a0(bArr, i, gl2Var);
        int i2 = gl2Var.f343a + a0;
        while (a0 < i2) {
            a0 = a0(bArr, a0, gl2Var);
            wl2Var.d(gl2Var.f343a);
        }
        if (a0 == i2) {
            return a0;
        }
        p22.a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int Z(int i, byte[] bArr, int i2, int i3, zm2 zm2Var, gl2 gl2Var) {
        int i4 = i >>> 3;
        String str = UQdsoaJMID.yWsE;
        if (i4 == 0) {
            p22.a(str);
            return 0;
        }
        int i5 = i & 7;
        if (i5 == 0) {
            int d0 = d0(bArr, i2, gl2Var);
            zm2Var.c(i, Long.valueOf(gl2Var.b));
            return d0;
        }
        if (i5 == 1) {
            zm2Var.c(i, Long.valueOf(g0(i2, bArr)));
            return i2 + 8;
        }
        if (i5 == 2) {
            int a0 = a0(bArr, i2, gl2Var);
            int i6 = gl2Var.f343a;
            if (i6 < 0) {
                p22.a("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i6 > bArr.length - a0) {
                p22.a(UQdsoaJMID.SXPzFJY);
                return 0;
            }
            if (i6 == 0) {
                zm2Var.c(i, ll2.i);
            } else {
                zm2Var.c(i, ll2.f(bArr, a0, i6));
            }
            return a0 + i6;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                zm2Var.c(i, Integer.valueOf(W(i2, bArr)));
                return i2 + 4;
            }
            p22.a(str);
            return 0;
        }
        int i7 = (i & (-8)) | 4;
        zm2 b2 = zm2.b();
        int i8 = gl2Var.d + 1;
        gl2Var.d = i8;
        if (i8 >= 100) {
            p22.a("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i9 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int a02 = a0(bArr, i2, gl2Var);
            int i10 = gl2Var.f343a;
            if (i10 == i7) {
                i9 = i10;
                i2 = a02;
                break;
            }
            i2 = Z(i10, bArr, a02, i3, b2, gl2Var);
            i9 = i10;
        }
        gl2Var.d--;
        if (i2 > i3 || i9 != i7) {
            p22.a("Failed to parse the message.");
            return 0;
        }
        zm2Var.c(i, b2);
        return i2;
    }

    public static byte[] a(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static int a0(byte[] bArr, int i, gl2 gl2Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return b0(b2, bArr, i2, gl2Var);
        }
        gl2Var.f343a = b2;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x028a, code lost:
    
        if (r7.d == r6) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        if (r4.d == r12) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.jw r40, defpackage.dr0 r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instructions count: 1776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk1.b(jw, dr0, java.util.ArrayList, int):void");
    }

    public static int b0(int i, byte[] bArr, int i2, gl2 gl2Var) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            gl2Var.f343a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            gl2Var.f343a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            gl2Var.f343a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            gl2Var.f343a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                gl2Var.f343a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static void c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static int c0(int i, byte[] bArr, int i2, int i3, yl2 yl2Var, gl2 gl2Var) {
        wl2 wl2Var = (wl2) yl2Var;
        int a0 = a0(bArr, i2, gl2Var);
        wl2Var.d(gl2Var.f343a);
        while (a0 < i3) {
            int a02 = a0(bArr, a0, gl2Var);
            if (i != gl2Var.f343a) {
                break;
            }
            a0 = a0(bArr, a02, gl2Var);
            wl2Var.d(gl2Var.f343a);
        }
        return a0;
    }

    public static int d0(byte[] bArr, int i, gl2 gl2Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            gl2Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        gl2Var.b = j2;
        return i3;
    }

    public static int e0(Object obj, rm2 rm2Var, byte[] bArr, int i, int i2, int i3, gl2 gl2Var) {
        lm2 lm2Var = (lm2) rm2Var;
        int i4 = gl2Var.d + 1;
        gl2Var.d = i4;
        if (i4 >= 100) {
            p22.a("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int t = lm2Var.t(obj, bArr, i, i2, i3, gl2Var);
        gl2Var.d--;
        gl2Var.c = obj;
        return t;
    }

    public static final Object f(bs0 bs0Var, nt1 nt1Var) {
        try {
            if (bs0Var.isDone()) {
                return f0.g(bs0Var);
            }
            ao aoVar = new ao(1, ju0.T(nt1Var));
            aoVar.x();
            bs0Var.a(new iz1(bs0Var, aoVar, 1), s40.g);
            aoVar.z(new ds0(0, bs0Var));
            return aoVar.v();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            cause.getClass();
            throw cause;
        }
    }

    public static int f0(Object obj, rm2 rm2Var, byte[] bArr, int i, int i2, gl2 gl2Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = b0(i4, bArr, i3, gl2Var);
            i4 = gl2Var.f343a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            p22.a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i6 = gl2Var.d + 1;
        gl2Var.d = i6;
        if (i6 >= 100) {
            p22.a("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i7 = i5 + i4;
        rm2Var.e(obj, bArr, i5, i7, gl2Var);
        gl2Var.d--;
        gl2Var.c = obj;
        return i7;
    }

    public static String g(int i, String str, int i2) {
        if (i < 0) {
            return d10.I("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return d10.I("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        c.m(d51.q("negative size: ", i2));
        return null;
    }

    public static long g0(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static final LinkedHashSet h(byte[] bArr) {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                for (int i = 0; i < readInt; i++) {
                    Uri parse = Uri.parse(objectInputStream.readUTF());
                    boolean readBoolean = objectInputStream.readBoolean();
                    parse.getClass();
                    linkedHashSet.add(new kw(parse, readBoolean));
                }
                objectInputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                je2.h(byteArrayInputStream, th);
                throw th2;
            }
        }
        byteArrayInputStream.close();
        return linkedHashSet;
    }

    public static byte[] i(char c2) {
        return new byte[]{(byte) (c2 & 255), (byte) ((c2 >> '\b') & 255)};
    }

    public static void j(int i, int i2) {
        String I;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                I = d10.I("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    c.m(d51.q("negative size: ", i2));
                    return;
                }
                I = d10.I("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(I);
        }
    }

    public static void k(jw jwVar, dr0 dr0Var, iw iwVar) {
        iwVar.o = -1;
        ev evVar = iwVar.M;
        int[] iArr = iwVar.p0;
        ev evVar2 = iwVar.L;
        ev evVar3 = iwVar.J;
        ev evVar4 = iwVar.K;
        ev evVar5 = iwVar.I;
        iwVar.p = -1;
        int[] iArr2 = jwVar.p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = evVar5.g;
            int q = jwVar.q() - evVar4.g;
            evVar5.i = dr0Var.k(evVar5);
            evVar4.i = dr0Var.k(evVar4);
            dr0Var.d(evVar5.i, i);
            dr0Var.d(evVar4.i, q);
            iwVar.o = 2;
            iwVar.Y = i;
            int i2 = q - i;
            iwVar.U = i2;
            int i3 = iwVar.b0;
            if (i2 < i3) {
                iwVar.U = i3;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i4 = evVar3.g;
        int k = jwVar.k() - evVar2.g;
        evVar3.i = dr0Var.k(evVar3);
        evVar2.i = dr0Var.k(evVar2);
        dr0Var.d(evVar3.i, i4);
        dr0Var.d(evVar2.i, k);
        if (iwVar.a0 > 0 || iwVar.g0 == 8) {
            kp1 k2 = dr0Var.k(evVar);
            evVar.i = k2;
            dr0Var.d(k2, iwVar.a0 + i4);
        }
        iwVar.p = 2;
        iwVar.Z = i4;
        int i5 = k - i4;
        iwVar.V = i5;
        int i6 = iwVar.c0;
        if (i5 < i6) {
            iwVar.V = i6;
        }
    }

    public static void l(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? g(i, "start index", i3) : (i2 < 0 || i2 > i3) ? g(i2, "end index", i3) : d10.I("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String m(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        if (i2 < 0) {
            return null;
        }
        int B = B((i2 * 4) + 36, bArr) + i;
        Charset charset = lp.c;
        if (g) {
            charset = lp.f601a;
            i3 = B + 2;
            i4 = bArr[B + 1] & 255;
        } else {
            i3 = B + 2;
            i4 = ((bArr[B] & 255) | ((bArr[B + 1] & 255) << 8)) * 2;
        }
        return new String(bArr, i3, i4, charset);
    }

    public static ImageView.ScaleType n(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static byte[] o(ContextThemeWrapper contextThemeWrapper, HashMap hashMap) {
        os osVar;
        if (hashMap.entrySet().isEmpty()) {
            c.m("No color resources provided for harmonization.");
            return null;
        }
        os osVar2 = new os(127, contextThemeWrapper.getPackageName());
        HashMap hashMap2 = new HashMap();
        ms msVar = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            String resourceEntryName = contextThemeWrapper.getResources().getResourceEntryName(((Integer) entry.getKey()).intValue());
            ms msVar2 = new ms(intValue, resourceEntryName, ((Integer) entry.getValue()).intValue());
            if (!contextThemeWrapper.getResources().getResourceTypeName(((Integer) entry.getKey()).intValue()).equals(XmJDY.LqxQUvhVC)) {
                c.l(d51.w("Non color resource found: name=", resourceEntryName, ", typeId="), Integer.toHexString(msVar2.b & 255));
                return null;
            }
            byte b2 = msVar2.f652a;
            if (b2 == 1) {
                osVar = c;
            } else {
                if (b2 != Byte.MAX_VALUE) {
                    c.m(d51.q("Not supported with unknown package id: ", b2));
                    return null;
                }
                osVar = osVar2;
            }
            if (!hashMap2.containsKey(osVar)) {
                hashMap2.put(osVar, new ArrayList());
            }
            ((List) hashMap2.get(osVar)).add(msVar2);
            msVar = msVar2;
        }
        byte b3 = msVar.b;
        b = b3;
        if (b3 == 0) {
            c.m("No color resources found for harmonization.");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ArrayList arrayList = new ArrayList();
        int size = hashMap2.size();
        qs qsVar = new qs(false, new String[0]);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            List list = (List) entry2.getValue();
            Collections.sort(list, d);
            arrayList.add(new ns((os) entry2.getKey(), list));
        }
        int size2 = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            i += ((ns) obj).a();
        }
        int i3 = qsVar.l + 12 + i;
        byteArrayOutputStream.write(P((short) 2));
        byteArrayOutputStream.write(P((short) 12));
        byteArrayOutputStream.write(a(i3));
        byteArrayOutputStream.write(a(size));
        qsVar.a(byteArrayOutputStream);
        int size3 = arrayList.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj2 = arrayList.get(i4);
            i4++;
            ns nsVar = (ns) obj2;
            qs qsVar2 = nsVar.c;
            nsVar.f698a.a(byteArrayOutputStream);
            os osVar3 = nsVar.b;
            byteArrayOutputStream.write(a(osVar3.f755a));
            char[] charArray = osVar3.b.toCharArray();
            for (int i5 = 0; i5 < 128; i5++) {
                if (i5 < charArray.length) {
                    byteArrayOutputStream.write(i(charArray[i5]));
                } else {
                    byteArrayOutputStream.write(i((char) 0));
                }
            }
            byteArrayOutputStream.write(a(288));
            byteArrayOutputStream.write(a(0));
            byteArrayOutputStream.write(a(qsVar2.l + 288));
            byteArrayOutputStream.write(a(0));
            byteArrayOutputStream.write(a(0));
            qsVar2.a(byteArrayOutputStream);
            nsVar.d.a(byteArrayOutputStream);
            og ogVar = nsVar.e;
            ((ps) ogVar.h).a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{b, 0, 0, 0});
            byteArrayOutputStream.write(a(ogVar.g));
            for (int i6 : (int[]) ogVar.i) {
                byteArrayOutputStream.write(a(i6));
            }
            ry1 ry1Var = (ry1) ogVar.j;
            ps psVar = (ps) ry1Var.c;
            int[] iArr = (int[]) ry1Var.e;
            psVar.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{b, 0, 0, 0});
            byteArrayOutputStream.write(a(ry1Var.b));
            byteArrayOutputStream.write(a((iArr.length * 4) + 84));
            byteArrayOutputStream.write((byte[]) ry1Var.d);
            for (int i7 : iArr) {
                byteArrayOutputStream.write(a(i7));
            }
            for (sh shVar : (sh[]) ry1Var.f) {
                shVar.getClass();
                byteArrayOutputStream.write(P((short) 8));
                byteArrayOutputStream.write(P((short) 2));
                byteArrayOutputStream.write(a(shVar.f936a));
                byteArrayOutputStream.write(P((short) 8));
                byteArrayOutputStream.write(new byte[]{0, 28});
                byteArrayOutputStream.write(a(shVar.b));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static final String p(byte[] bArr) {
        Object obj;
        bArr.getClass();
        StringBuilder sb = new StringBuilder();
        g = (B(24, bArr) & rt0.t) != 0;
        int B = (B(16, bArr) * 4) + 36;
        int B2 = B(12, bArr);
        int i = B2;
        while (true) {
            if (i >= bArr.length - 4) {
                break;
            }
            if (B(i, bArr) == 1048834) {
                B2 = i;
                break;
            }
            i += 4;
        }
        int i2 = 0;
        while (B2 < bArr.length) {
            int B3 = B(B2, bArr);
            int B4 = B(B2 + 20, bArr);
            switch (B3) {
                case 1048832:
                    B2 += B(B2 + 4, bArr);
                    break;
                case 1048833:
                    B2 = B(B2 + 4, bArr) + B2;
                    break;
                case 1048834:
                    int B5 = B(B2 + 28, bArr);
                    B2 += 36;
                    String m = m(bArr, B, B4);
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i3 = 0; i3 < B5; i3++) {
                        int B6 = B(B2, bArr);
                        int B7 = B(B2 + 4, bArr);
                        int B8 = B(B2 + 8, bArr);
                        int B9 = B(B2 + 16, bArr);
                        B2 += 20;
                        String m2 = m(bArr, B, B6);
                        String m3 = m(bArr, B, B7);
                        if (B8 != -1) {
                            obj = m(bArr, B, B8);
                        } else if (B9 == -1) {
                            obj = "true";
                        } else if (B9 == 0) {
                            obj = "false";
                        } else if (B9 < 1000) {
                            obj = Integer.valueOf(B9);
                        } else {
                            obj = "@res/0x" + Integer.toHexString(B9);
                        }
                        if (m2 != null) {
                            stringBuffer.append(F(i2, "    android:" + m3 + "=\"" + obj + "\"\n"));
                        } else {
                            stringBuffer.append(F(i2, "    " + m3 + "=\"" + obj + "\"\n"));
                        }
                    }
                    if (stringBuffer.length() > 0) {
                        sb.append(F(i2, "<" + m + "\n" + stringBuffer.substring(0, stringBuffer.length() - 1) + ">\n"));
                    } else {
                        sb.append(F(i2, "<" + m + "\n" + ((Object) stringBuffer)));
                    }
                    i2 += 2;
                    break;
                case 1048835:
                    i2 -= 2;
                    B2 += 24;
                    sb.append(F(i2, "</" + m(bArr, B, B4) + ">\n"));
                    break;
                case 1048836:
                    sb.append(m(bArr, B, B(B2 + 16, bArr)));
                    B2 += B(B2 + 4, bArr);
                    break;
            }
        }
        return sb.toString();
    }

    public static final boolean q(int i, int i2) {
        return (i & i2) == i2;
    }

    public static byte[] r(short s) {
        return s > 127 ? new byte[]{(byte) ((127 & (s >> 8)) | rt0.s), (byte) (s & 255)} : new byte[]{(byte) (s & 255)};
    }

    public static final void s(ti1 ti1Var, String str) {
        ti1Var.getClass();
        aj1 C = ti1Var.C(str);
        try {
            C.w();
            rt0.e(C, null);
        } finally {
        }
    }

    public static float t(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final void v(qx qxVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = tx.f1013a.iterator();
        while (it.hasNext()) {
            try {
                ((u3) it.next()).D(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    bw0.b(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            bw0.b(th, new c40(qxVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final cc w(int i) {
        if (i == 0) {
            return cc.g;
        }
        if (i == 1) {
            return cc.h;
        }
        c.m(d51.p(i, "Could not convert ", " to BackoffPolicy"));
        return null;
    }

    public static final r21 x(int i) {
        if (i == 0) {
            return r21.g;
        }
        if (i == 1) {
            return r21.h;
        }
        if (i == 2) {
            return r21.i;
        }
        if (i == 3) {
            return r21.j;
        }
        if (i == 4) {
            return r21.k;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return r21.l;
        }
        c.m(d51.p(i, "Could not convert ", " to NetworkType"));
        return null;
    }

    public static final l51 y(int i) {
        if (i == 0) {
            return l51.g;
        }
        if (i == 1) {
            return l51.h;
        }
        c.m(d51.p(i, "Could not convert ", " to OutOfQuotaPolicy"));
        return null;
    }

    public static final yb2 z(int i) {
        if (i == 0) {
            return yb2.g;
        }
        if (i == 1) {
            return yb2.h;
        }
        if (i == 2) {
            return yb2.i;
        }
        if (i == 3) {
            return yb2.j;
        }
        if (i == 4) {
            return yb2.k;
        }
        if (i == 5) {
            return yb2.l;
        }
        c.m(d51.p(i, jYVJoqfHJs.ieXvj, " to State"));
        return null;
    }

    public void C(int i) {
    }

    public void D() {
    }

    public void E() {
    }

    public abstract void O(Object obj, float f2);

    public abstract boolean d(Object obj, Object obj2);

    public abstract boolean e(Object obj, Object obj2);

    public abstract float u(Object obj);
}
