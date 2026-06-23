package defpackage;

import android.os.AsyncTask;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.pairip.VMRunner;
import flar2.devcheck.R;
import flar2.devcheck.utils.SuccessLoadingView;

/* loaded from: classes.dex */
public final class t11 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public TextView f965a;
    public SuccessLoadingView b;
    public ProgressBar c;
    public int d;
    public final /* synthetic */ u11 e;

    public t11(u11 u11Var) {
        this.e = u11Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        return VMRunner.invoke("nkpYrri4WCu0eCFU", new Object[]{this, objArr});
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        u11 u11Var = this.e;
        if (u11Var.G()) {
            try {
                this.b.b();
            } catch (Exception unused) {
            }
            try {
                this.c.setVisibility(4);
                u11Var.i0.f(-1).setEnabled(true);
                u11Var.i0.f(-1).setTextColor(this.d);
                this.f965a.setText(str);
            } catch (NullPointerException unused2) {
            }
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
        u11 u11Var = this.e;
        th2 th2Var = new th2(u11Var.g0());
        String A = u11Var.A(R.string.public_ip);
        j3 j3Var = (j3) th2Var.h;
        j3Var.e = A;
        View inflate = u11Var.g0().getLayoutInflater().inflate(R.layout.benchmark_dialog, (ViewGroup) null);
        j3Var.s = inflate;
        this.b = (SuccessLoadingView) inflate.findViewById(R.id.benchmark_successloadingview);
        try {
            TypedValue typedValue = new TypedValue();
            u11Var.g0().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
            int i = typedValue.data;
            this.d = i;
            this.b.setStrokeColor(i);
        } catch (Exception unused) {
        }
        this.c = (ProgressBar) inflate.findViewById(R.id.benchmark_progress);
        this.f965a = (TextView) inflate.findViewById(R.id.benchmark_message);
        th2Var.i(R.string.okay, new qf(9, this));
        n3 n3Var = u11Var.i0;
        if (n3Var != null && n3Var.isShowing()) {
            u11Var.i0.dismiss();
        }
        n3 a2 = th2Var.a();
        u11Var.i0 = a2;
        a2.show();
        u11Var.i0.f(-1).setEnabled(false);
        u11Var.i0.f(-2).setTextColor(this.d);
        try {
            int i2 = (u11Var.z().getDisplayMetrics().widthPixels * 90) / 100;
            if (u11Var.z().getConfiguration().orientation == 2 || u11Var.z().getBoolean(R.bool.isTablet)) {
                i2 = (u11Var.z().getDisplayMetrics().widthPixels * 60) / 100;
            }
            u11Var.i0.getWindow().setLayout(i2, -2);
        } catch (Exception unused2) {
        }
    }
}
