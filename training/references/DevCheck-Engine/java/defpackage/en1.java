package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class en1 {

    /* renamed from: a, reason: collision with root package name */
    public final mn1[] f240a = new mn1[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final mn1 g = new mn1();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public en1() {
        for (int i = 0; i < 4; i++) {
            this.f240a[i] = new mn1();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public static en1 b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? dn1.f201a : new en1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(cn1 cn1Var, float[] fArr, float f, RectF rectF, sv0 sv0Var, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        mn1[] mn1VarArr;
        boolean z;
        Matrix[] matrixArr2;
        boolean z2;
        int i2;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.c;
            fArr2 = this.h;
            mn1VarArr = this.f240a;
            z = 0;
            matrixArr2 = this.b;
            if (i3 >= 4) {
                break;
            }
            nx tqVar = fArr == null ? i3 != 1 ? i3 != 2 ? i3 != 3 ? cn1Var.f : cn1Var.e : cn1Var.h : cn1Var.g : new tq(fArr[i3]);
            ym0 ym0Var = i3 != 1 ? i3 != 2 ? i3 != 3 ? cn1Var.b : cn1Var.f131a : cn1Var.d : cn1Var.c;
            mn1 mn1Var = mn1VarArr[i3];
            ym0Var.getClass();
            ym0Var.j(mn1Var, f, tqVar.a(rectF));
            int i4 = i3 + 1;
            float f2 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.d;
            if (i3 == 1) {
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i3;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i3;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i3;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            mn1 mn1Var2 = mn1VarArr[i2];
            fArr2[0] = mn1Var2.c;
            fArr2[1] = mn1Var2.d;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f2);
            i3 = i4;
        }
        char c = 1;
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            mn1 mn1Var3 = mn1VarArr[i5];
            fArr2[z] = mn1Var3.f647a;
            fArr2[c] = mn1Var3.b;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[z], fArr2[c]);
            } else {
                path.lineTo(fArr2[z], fArr2[c]);
            }
            mn1VarArr[i5].b(matrixArr2[i5], path);
            if (sv0Var != null) {
                mn1 mn1Var4 = mn1VarArr[i5];
                Matrix matrix = matrixArr2[i5];
                vv0 vv0Var = sv0Var.f957a;
                BitSet bitSet = vv0Var.k;
                mn1Var4.getClass();
                bitSet.set(i5, z);
                ln1[] ln1VarArr = vv0Var.i;
                mn1Var4.a(mn1Var4.f);
                ln1VarArr[i5] = new fn1(new ArrayList(mn1Var4.h), new Matrix(matrix));
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            mn1 mn1Var5 = mn1VarArr[i5];
            fArr2[0] = mn1Var5.c;
            fArr2[1] = mn1Var5.d;
            matrixArr2[i5].mapPoints(fArr2);
            mn1 mn1Var6 = mn1VarArr[i7];
            float f3 = mn1Var6.f647a;
            float[] fArr3 = this.i;
            fArr3[0] = f3;
            fArr3[1] = mn1Var6.b;
            matrixArr2[i7].mapPoints(fArr3);
            mn1[] mn1VarArr2 = mn1VarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, 0.0f);
            mn1 mn1Var7 = mn1VarArr2[i5];
            fArr2[0] = mn1Var7.c;
            fArr2[1] = mn1Var7.d;
            matrixArr2[i5].mapPoints(fArr2);
            float abs = (i5 == 1 || i5 == 3) ? Math.abs(rectF.centerX() - fArr2[0]) : Math.abs(rectF.centerY() - fArr2[1]);
            mn1 mn1Var8 = this.g;
            mn1Var8.d(0.0f, 0.0f, 270.0f, 0.0f);
            j70 j70Var = i5 != 1 ? i5 != 2 ? i5 != 3 ? cn1Var.j : cn1Var.i : cn1Var.l : cn1Var.k;
            j70Var.k(max, abs, f, mn1Var8);
            Path path4 = this.j;
            path4.reset();
            mn1Var8.b(matrixArr[i5], path4);
            if (this.l && (j70Var.j() || c(path4, i5) || c(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = mn1Var8.f647a;
                c = 1;
                fArr2[1] = mn1Var8.b;
                matrixArr[i5].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                mn1Var8.b(matrixArr[i5], path2);
            } else {
                c = 1;
                mn1Var8.b(matrixArr[i5], path);
            }
            if (sv0Var != null) {
                Matrix matrix2 = matrixArr[i5];
                vv0 vv0Var2 = sv0Var.f957a;
                z2 = false;
                vv0Var2.k.set(i5 + 4, false);
                ln1[] ln1VarArr2 = vv0Var2.j;
                mn1Var8.a(mn1Var8.f);
                ln1VarArr2[i5] = new fn1(new ArrayList(mn1Var8.h), new Matrix(matrix2));
            } else {
                z2 = false;
            }
            i5 = i6;
            z = z2;
            mn1VarArr = mn1VarArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean c(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.f240a[i].b(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
