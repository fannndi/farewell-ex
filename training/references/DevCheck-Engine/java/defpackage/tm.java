package defpackage;

import Cwd.ynLVXgis;
import android.content.Context;
import android.os.AsyncTask;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;
import flar2.devcheck.cputimes.CPUTimeActivity;
import flar2.devcheck.sensors.SensorActivity;
import flar2.devcheck.tools.ToolsActivity;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class tm extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f995a;
    public final /* synthetic */ a5 b;

    public /* synthetic */ tm(a5 a5Var, int i) {
        this.f995a = i;
        this.b = a5Var;
    }

    private final void a() {
    }

    private final void b() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:41|(4:56|57|58|(9:59|(4:61|62|(2:66|(2:68|69)(1:71))|70)(16:75|76|(4:78|(1:146)|80|81)(1:147)|82|(7:84|(1:86)(2:141|(1:143)(1:144))|87|(1:89)|90|91|(7:129|130|131|132|(1:134)|135|(1:137))(1:93))(1:145)|94|(3:96|(1:98)|99)|100|(3:102|(2:125|126)(12:106|(1:109)|110|(1:112)|113|(1:115)|116|(1:118)|119|(1:121)|122|123)|124)|128|44|45|46|(3:48|(1:50)|51)(1:54)|52|53)|74|44|45|46|(0)(0)|52|53))|43|44|45|46|(0)(0)|52|53) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x045d, code lost:
    
        r3 = new defpackage.li1();
        r3.f592a = 0;
        r3.b = r0.getString(flar2.devcheck.R.string.not_available);
        r1.add(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03f2 A[Catch: Exception -> 0x045d, TryCatch #0 {Exception -> 0x045d, blocks: (B:46:0x03ea, B:48:0x03f2, B:50:0x040e, B:54:0x044b), top: B:45:0x03ea }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x044b A[Catch: Exception -> 0x045d, TRY_LEAVE, TryCatch #0 {Exception -> 0x045d, blocks: (B:46:0x03ea, B:48:0x03f2, B:50:0x040e, B:54:0x044b), top: B:45:0x03ea }] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r42) {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        int i = this.f995a;
        a5 a5Var = this.b;
        switch (i) {
            case 0:
                CPUTimeActivity cPUTimeActivity = (CPUTimeActivity) a5Var;
                cPUTimeActivity.F.setTranslationY(r0.getHeight());
                cPUTimeActivity.F.setAlpha(0.0f);
                cPUTimeActivity.F.animate().translationY(0.0f).setDuration(350L).alpha(1.0f).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                cPUTimeActivity.G.clear();
                cPUTimeActivity.G.addAll((List) obj);
                cPUTimeActivity.G.notifyDataSetChanged();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                SensorActivity sensorActivity = (SensorActivity) a5Var;
                try {
                    sensorActivity.K.setAdapter(new l01((Context) sensorActivity.g0.get(), (List) obj));
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                String str = (String) obj;
                ToolsActivity toolsActivity = (ToolsActivity) a5Var;
                if (str != null && !str.contains(nTAZxGMqQtZZAQ.diskRjGdilrg)) {
                    boolean contains = str.contains("MEETS_DEVICE_INTEGRITY");
                    boolean contains2 = str.contains(ynLVXgis.DeMMMALR);
                    boolean contains3 = str.contains("MEETS_STRONG_INTEGRITY");
                    toolsActivity.G.remove(3);
                    toolsActivity.G.add(3, new c02(false, contains, contains2, contains3, false));
                    toolsActivity.H.g(3);
                    break;
                } else {
                    toolsActivity.G.remove(3);
                    toolsActivity.G.add(3, new c02(false, false, false, false, true));
                    toolsActivity.H.g(3);
                    break;
                }
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        switch (this.f995a) {
            case 0:
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                break;
            default:
                super.onPreExecute();
                break;
        }
    }
}
