package defpackage;

import android.os.AsyncTask;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class di0 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192a;
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ ei0 c;

    public /* synthetic */ di0(ei0 ei0Var, RecyclerView recyclerView, int i) {
        this.f192a = i;
        this.c = ei0Var;
        this.b = recyclerView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016a A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r30) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.di0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        int i = this.f192a;
        RecyclerView recyclerView = this.b;
        ei0 ei0Var = this.c;
        switch (i) {
            case 0:
                List list = (List) obj;
                if (ei0Var.G() && list != null) {
                    try {
                        recyclerView.setAdapter(new l01(ei0Var.g0(), list));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                List list2 = (List) obj;
                if (ei0Var.G()) {
                    try {
                        recyclerView.setAdapter(new l01(ei0Var.i0(), list2));
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                List list3 = (List) obj;
                if (ei0Var.G()) {
                    try {
                        recyclerView.setAdapter(new l01(ei0Var.i0(), list3));
                        break;
                    } catch (Exception unused3) {
                        return;
                    }
                }
                break;
            case 3:
                List list4 = (List) obj;
                if (ei0Var.G()) {
                    try {
                        recyclerView.setAdapter(new l01(ei0Var.i0(), list4));
                        break;
                    } catch (Exception unused4) {
                        return;
                    }
                }
                break;
            default:
                List list5 = (List) obj;
                if (ei0Var.G()) {
                    try {
                        recyclerView.setAdapter(new l01(ei0Var.g0(), list5));
                        break;
                    } catch (Exception unused5) {
                        return;
                    }
                }
                break;
        }
    }
}
