package defpackage;

import android.R;
import android.widget.TextView;
import flar2.devcheck.tools.CPUActivity;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class mm implements v31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f642a;
    public final /* synthetic */ CPUActivity b;

    public /* synthetic */ mm(CPUActivity cPUActivity, int i) {
        this.f642a = i;
        this.b = cPUActivity;
    }

    @Override // defpackage.v31
    public final void a(Object obj) {
        int i = this.f642a;
        CPUActivity cPUActivity = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                int i2 = CPUActivity.J;
                list.isEmpty();
                cPUActivity.G.x(list);
                break;
            default:
                String str = (String) obj;
                int i3 = CPUActivity.J;
                try {
                    ((TextView) cPUActivity.H.findViewById(R.id.message)).setText(new JSONObject(str).toString(4));
                    break;
                } catch (JSONException e) {
                    rw.j(e);
                }
        }
    }
}
