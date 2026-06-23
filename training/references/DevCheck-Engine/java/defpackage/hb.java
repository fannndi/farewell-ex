package defpackage;

import android.telephony.fHMN.BFtDZYxPcpGN;
import androidx.media.RfwE.BIxeFreLLop;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hb extends ct0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f373a;
    public final long b;
    public final bb c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public hb(long j, long j2, bb bbVar, Integer num, String str, ArrayList arrayList) {
        jb1 jb1Var = jb1.g;
        this.f373a = j;
        this.b = j2;
        this.c = bbVar;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ct0)) {
            return false;
        }
        hb hbVar = (hb) ((ct0) obj);
        if (this.f373a != hbVar.f373a || this.b != hbVar.b || !this.c.equals(hbVar.c)) {
            return false;
        }
        Integer num = hbVar.d;
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = hbVar.e;
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(hbVar.f)) {
            return false;
        }
        Object obj2 = jb1.g;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f373a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((this.f.hashCode() ^ ((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ jb1.g.hashCode();
    }

    public final String toString() {
        return BIxeFreLLop.awX + this.f373a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + BFtDZYxPcpGN.scgrmAiBmSRbn + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + jb1.g + rQcwh.pZjEhMeDGDWvMQJ;
    }
}
