package defpackage;

import android.app.ProgressDialog;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.SnackbarContentLayout;
import flar2.devcheck.MainActivity;
import flar2.devcheck.R;
import flar2.devcheck.tools.CPUActivity;
import flar2.devcheck.tools.WifiActivity;
import java.lang.ref.WeakReference;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class om extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f746a = 1;
    public Object b;
    public Object c;

    public om(MainActivity mainActivity) {
        this.b = new WeakReference(mainActivity);
    }

    public om(CPUActivity cPUActivity, RecyclerView recyclerView) {
        this.c = cPUActivity;
        this.b = recyclerView;
    }

    public om(WifiActivity wifiActivity) {
        this.c = wifiActivity;
    }

    private final void a() {
    }

    private final void b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00dc  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r29) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        switch (this.f746a) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                try {
                    ProgressDialog progressDialog = (ProgressDialog) this.c;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                break;
            default:
                super.onCancelled();
                break;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        switch (this.f746a) {
            case 0:
                try {
                    ((RecyclerView) this.b).setAdapter(new l01((CPUActivity) this.c, (List) obj));
                    break;
                } catch (Exception unused) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                Uri uri = (Uri) obj;
                MainActivity mainActivity = (MainActivity) ((WeakReference) this.b).get();
                try {
                    ProgressDialog progressDialog = (ProgressDialog) this.c;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                } catch (Throwable unused2) {
                }
                if (mainActivity != null && !mainActivity.isFinishing() && uri != null) {
                    String str = MainActivity.U;
                    cp1 f = cp1.f(mainActivity.findViewById(R.id.coord_layout), mainActivity.getString(R.string.saved_to) + " " + uz1.p0(mainActivity.getContentResolver(), uri), -2);
                    ((SnackbarContentLayout) f.i.getChildAt(0)).getActionView().setTextColor(uz1.R(mainActivity));
                    f.g(mainActivity.getString(R.string.open), new uc(mainActivity, 10, uri));
                    f.h();
                    break;
                }
                break;
            default:
                List list = (List) obj;
                WifiActivity wifiActivity = (WifiActivity) this.c;
                try {
                    if (list != null) {
                        if (list.size() != 0) {
                            try {
                                this.b = wifiActivity.G.getLayoutManager().g0();
                            } catch (NullPointerException unused3) {
                            }
                            wifiActivity.G.getRecycledViewPool().a();
                            wifiActivity.J.clear();
                            wifiActivity.J.addAll(list);
                            int size = wifiActivity.J.size();
                            View view = wifiActivity.H;
                            if (size > 0) {
                                view.setVisibility(8);
                                wifiActivity.K.f();
                            } else {
                                view.setVisibility(0);
                                wifiActivity.I.setText(wifiActivity.getString(R.string.not_found));
                            }
                            try {
                                wifiActivity.G.getLayoutManager().f0((Parcelable) this.b);
                            } catch (NullPointerException unused4) {
                            }
                            wifiActivity.G.scrollBy(1, 0);
                            break;
                        } else {
                            wifiActivity.H.setVisibility(0);
                            wifiActivity.I.setText(wifiActivity.getString(R.string.not_found));
                            wifiActivity.J.clear();
                            wifiActivity.K.f();
                            break;
                        }
                    } else {
                        wifiActivity.J.clear();
                        wifiActivity.K.f();
                        break;
                    }
                } catch (Exception unused5) {
                    return;
                }
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        switch (this.f746a) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                MainActivity mainActivity = (MainActivity) ((WeakReference) this.b).get();
                if (mainActivity == null || mainActivity.isFinishing()) {
                    cancel(true);
                    break;
                } else {
                    if (uz1.d(mainActivity)) {
                        this.c = new ProgressDialog(mainActivity, R.style.CustomProgressDialogDark);
                    } else {
                        this.c = new ProgressDialog(mainActivity, R.style.CustomProgressDialog);
                    }
                    ((ProgressDialog) this.c).setMessage(mainActivity.getString(R.string.exporting));
                    ((ProgressDialog) this.c).setCancelable(false);
                    TypedValue typedValue = new TypedValue();
                    mainActivity.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                    int i = typedValue.data;
                    Drawable mutate = new ProgressBar(mainActivity).getIndeterminateDrawable().mutate();
                    mutate.setColorFilter(i, PorterDuff.Mode.SRC_IN);
                    ((ProgressDialog) this.c).setIndeterminateDrawable(mutate);
                    try {
                        ((ProgressDialog) this.c).show();
                        break;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                break;
            default:
                super.onPreExecute();
                break;
        }
    }
}
