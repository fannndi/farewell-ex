package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.TypedValue;
import com.jjoe64.graphview.GraphView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ez {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f255a;
    public final GraphView b;
    public float c;
    public float d;
    public boolean e;
    public final HashMap f;
    public final Paint g;
    public final Paint h;
    public double i;
    public final dz j;
    public int k;

    public ez(GraphView graphView) {
        dz dzVar = new dz();
        this.j = dzVar;
        this.b = graphView;
        Paint paint = new Paint();
        this.f255a = paint;
        paint.setColor(Color.argb(rt0.s, 180, 180, 180));
        paint.setStrokeWidth(10.0f);
        this.f = new HashMap();
        this.g = new Paint();
        this.h = new Paint();
        float f = graphView.getGridLabelRenderer().f483a.f430a;
        dzVar.f213a = f;
        dzVar.b = (int) (f / 5.0f);
        dzVar.c = (int) (f / 2.0f);
        dzVar.d = Color.argb(180, 100, 100, 100);
        dzVar.e = (int) dzVar.f213a;
        TypedValue typedValue = new TypedValue();
        graphView.getContext().getTheme().resolveAttribute(R.attr.textAppearanceSmall, typedValue, true);
        int i = -16777216;
        try {
            TypedArray obtainStyledAttributes = graphView.getContext().obtainStyledAttributes(typedValue.data, new int[]{R.attr.textColorPrimary});
            int color = obtainStyledAttributes.getColor(0, -16777216);
            obtainStyledAttributes.recycle();
            i = color;
        } catch (Exception unused) {
        }
        dzVar.f = i;
        this.k = 0;
    }

    public final void a() {
        HashMap hashMap = this.f;
        hashMap.clear();
        double d = 0.0d;
        for (qq0 qq0Var : this.b.getSeries()) {
            if (qq0Var instanceof qq0) {
                float f = this.c;
                float f2 = Float.NaN;
                u00 u00Var = null;
                u00 u00Var2 = null;
                for (Map.Entry entry : qq0Var.b.entrySet()) {
                    float abs = Math.abs(((PointF) entry.getKey()).x - f);
                    if (u00Var2 == null || abs < f2) {
                        u00Var2 = (u00) entry.getValue();
                        f2 = abs;
                    }
                }
                if (u00Var2 != null && f2 < 200.0f) {
                    u00Var = u00Var2;
                }
                if (u00Var != null) {
                    d = u00Var.g;
                    hashMap.put(qq0Var, u00Var);
                }
            }
        }
        if (hashMap.isEmpty()) {
            return;
        }
        this.i = d;
    }
}
