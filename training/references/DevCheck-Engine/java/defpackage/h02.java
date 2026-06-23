package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.work.impl.WorkDatabase;
import flar2.devcheck.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class h02 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f358a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public h02(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.d = layoutParams;
        this.e = new Rect();
        this.f = new int[2];
        this.g = new int[2];
        this.f358a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(h02.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public h02(Context context, ju juVar, gr grVar, la1 la1Var, WorkDatabase workDatabase, gc2 gc2Var, ArrayList arrayList) {
        context.getClass();
        la1Var.getClass();
        this.b = juVar;
        this.c = grVar;
        this.d = la1Var;
        this.e = workDatabase;
        this.f = gc2Var;
        this.g = arrayList;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f358a = applicationContext;
        new m52();
    }

    public h02(i82 i82Var) {
        this.f358a = new Matrix();
        this.b = new Matrix();
        this.d = new float[1];
        this.e = new Matrix();
        this.f = new float[2];
        this.g = new Matrix();
        new Matrix();
        this.c = i82Var;
    }

    public ht0 a(float f, float f2) {
        float[] fArr = (float[]) this.f;
        fArr[0] = f;
        fArr[1] = f2;
        f(fArr);
        double d = fArr[0];
        double d2 = fArr[1];
        ht0 ht0Var = (ht0) ht0.j.b();
        ht0Var.h = d;
        ht0Var.i = d2;
        return ht0Var;
    }

    public ht0 b(float f, float f2) {
        ht0 ht0Var = (ht0) ht0.j.b();
        ht0Var.h = 0.0d;
        ht0Var.i = 0.0d;
        c(f, f2, ht0Var);
        return ht0Var;
    }

    public void c(float f, float f2, ht0 ht0Var) {
        float[] fArr = (float[]) this.f;
        fArr[0] = f;
        fArr[1] = f2;
        e(fArr);
        ht0Var.h = fArr[0];
        ht0Var.i = fArr[1];
    }

    public void d(Path path) {
        path.transform((Matrix) this.f358a);
        path.transform(((i82) this.c).f417a);
        path.transform((Matrix) this.b);
    }

    public void e(float[] fArr) {
        Matrix matrix = (Matrix) this.e;
        matrix.reset();
        ((Matrix) this.b).invert(matrix);
        matrix.mapPoints(fArr);
        ((i82) this.c).f417a.invert(matrix);
        matrix.mapPoints(fArr);
        ((Matrix) this.f358a).invert(matrix);
        matrix.mapPoints(fArr);
    }

    public void f(float[] fArr) {
        ((Matrix) this.f358a).mapPoints(fArr);
        ((i82) this.c).f417a.mapPoints(fArr);
        ((Matrix) this.b).mapPoints(fArr);
    }

    public void g() {
        i82 i82Var = (i82) this.c;
        Matrix matrix = (Matrix) this.b;
        matrix.reset();
        matrix.postTranslate(i82Var.b.left, i82Var.d - i82Var.j());
    }

    public void h(float f, float f2, float f3, float f4) {
        Matrix matrix = (Matrix) this.f358a;
        i82 i82Var = (i82) this.c;
        float width = i82Var.b.width() / f2;
        float height = i82Var.b.height() / f3;
        if (Float.isInfinite(width)) {
            width = 0.0f;
        }
        if (Float.isInfinite(height)) {
            height = 0.0f;
        }
        matrix.reset();
        matrix.postTranslate(-f, -f4);
        matrix.postScale(width, -height);
    }
}
