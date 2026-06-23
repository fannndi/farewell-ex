package defpackage;

import Cwd.YSHrxiHkAFcciU;
import androidx.emoji2.text.Fk.Iyrs;
import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;
import flar2.devcheck.cputimes.Sd.tEegR;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class oj0 {

    /* renamed from: a, reason: collision with root package name */
    public static final pi0[] f740a;
    public static final Map b;

    static {
        pi0 pi0Var = new pi0(pi0.i, "");
        km kmVar = pi0.f;
        pi0 pi0Var2 = new pi0(kmVar, "GET");
        pi0 pi0Var3 = new pi0(kmVar, "POST");
        km kmVar2 = pi0.g;
        pi0 pi0Var4 = new pi0(kmVar2, "/");
        pi0 pi0Var5 = new pi0(kmVar2, "/index.html");
        km kmVar3 = pi0.h;
        pi0 pi0Var6 = new pi0(kmVar3, "http");
        pi0 pi0Var7 = new pi0(kmVar3, "https");
        km kmVar4 = pi0.e;
        pi0[] pi0VarArr = {pi0Var, pi0Var2, pi0Var3, pi0Var4, pi0Var5, pi0Var6, pi0Var7, new pi0(kmVar4, RIhTGWkqQvGL.sqc), new pi0(kmVar4, "204"), new pi0(kmVar4, "206"), new pi0(kmVar4, "304"), new pi0(kmVar4, "400"), new pi0(kmVar4, "404"), new pi0(kmVar4, "500"), new pi0("accept-charset", ""), new pi0("accept-encoding", "gzip, deflate"), new pi0("accept-language", ""), new pi0("accept-ranges", ""), new pi0("accept", ""), new pi0("access-control-allow-origin", ""), new pi0("age", ""), new pi0("allow", ""), new pi0(YSHrxiHkAFcciU.CPBFmUg, ""), new pi0("cache-control", ""), new pi0("content-disposition", ""), new pi0("content-encoding", ""), new pi0("content-language", ""), new pi0("content-length", ""), new pi0(Iyrs.oWe, ""), new pi0("content-range", ""), new pi0("content-type", ""), new pi0("cookie", ""), new pi0("date", ""), new pi0("etag", ""), new pi0("expect", ""), new pi0("expires", ""), new pi0("from", ""), new pi0(hTYJVDOvZnZlYL.TJwzCnVlmDRv, ""), new pi0("if-match", ""), new pi0("if-modified-since", ""), new pi0("if-none-match", ""), new pi0("if-range", ""), new pi0("if-unmodified-since", ""), new pi0("last-modified", ""), new pi0("link", ""), new pi0("location", ""), new pi0("max-forwards", ""), new pi0("proxy-authenticate", ""), new pi0("proxy-authorization", ""), new pi0("range", ""), new pi0(tEegR.zrP, ""), new pi0("refresh", ""), new pi0("retry-after", ""), new pi0("server", ""), new pi0("set-cookie", ""), new pi0("strict-transport-security", ""), new pi0("transfer-encoding", ""), new pi0("user-agent", ""), new pi0("vary", ""), new pi0("via", ""), new pi0("www-authenticate", "")};
        f740a = pi0VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(pi0VarArr[i].f791a)) {
                linkedHashMap.put(pi0VarArr[i].f791a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        b = unmodifiableMap;
    }

    public static void a(km kmVar) {
        kmVar.getClass();
        int a2 = kmVar.a();
        for (int i = 0; i < a2; i++) {
            byte d = kmVar.d(i);
            if (65 <= d && d < 91) {
                rw.f("PROTOCOL_ERROR response malformed: mixed case name: ".concat(kmVar.j()));
                return;
            }
        }
    }
}
