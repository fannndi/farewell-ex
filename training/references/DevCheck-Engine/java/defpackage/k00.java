package defpackage;

import android.os.AsyncTask;
import androidx.recyclerview.widget.RecyclerView;
import com.pairip.VMRunner;
import java.util.List;

/* loaded from: classes.dex */
public final class k00 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f504a;
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ th2 c;
    public final /* synthetic */ p00 d;

    public k00(p00 p00Var, boolean z, RecyclerView recyclerView, th2 th2Var) {
        this.d = p00Var;
        this.f504a = z;
        this.b = recyclerView;
        this.c = th2Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        return VMRunner.invoke("zmpZlO7eqKqdP2Y3", new Object[]{this, objArr});
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        List list = (List) obj;
        p00 p00Var = this.d;
        if (p00Var.G()) {
            try {
                this.b.setAdapter(new l01(p00Var.g0(), list));
                n3 n3Var = p00Var.r1;
                if (n3Var != null && n3Var.isShowing()) {
                    p00Var.r1.dismiss();
                }
                n3 a2 = this.c.a();
                p00Var.r1 = a2;
                a2.show();
                p00.u0(p00Var);
            } catch (Exception unused) {
            }
        }
    }
}
