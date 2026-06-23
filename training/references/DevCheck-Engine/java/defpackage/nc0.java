package defpackage;

import android.util.Base64;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import flar2.devcheck.cputimes.Sd.tEegR;
import java.util.List;

/* loaded from: classes.dex */
public final class nc0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f673a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final String f;
    public final String g;

    public nc0(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f673a = str;
        str2.getClass();
        this.b = str2;
        this.c = str3;
        list.getClass();
        this.d = list;
        this.e = str4;
        this.f = str5;
        this.g = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f673a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mSystemFont: " + this.e + ", mVariationSettings: " + this.f + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.d;
            if (i >= list.size()) {
                sb.append(rQcwh.BrHmVvbaQHfXVPT);
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append(tEegR.gZQ);
            }
            sb.append(" ]");
            i++;
        }
    }
}
