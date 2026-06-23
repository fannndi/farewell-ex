package flar2.devcheck.benchmarkSuite.backend;

import defpackage.a41;
import defpackage.cw0;
import defpackage.d10;
import defpackage.gj;
import defpackage.mf1;
import defpackage.rw;
import defpackage.z31;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final cw0 f288a;
    public static final a41 b;

    static {
        mf1 mf1Var = cw0.c;
        f288a = d10.m("application/json; charset=utf-8");
        z31 z31Var = new z31();
        z31Var.c.add(new gj(0));
        b = new a41(z31Var);
    }

    public static String a(BenchmarkSubmission benchmarkSubmission) {
        StringBuilder sb = new StringBuilder();
        String str = benchmarkSubmission.runId;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("|");
        String str2 = benchmarkSubmission.hardwareHash;
        sb.append(str2 != null ? str2 : "");
        sb.append("|");
        Double d = benchmarkSubmission.overallScore;
        sb.append((d == null || d.isNaN() || d.isInfinite()) ? "0.000" : BigDecimal.valueOf(d.doubleValue()).setScale(3, RoundingMode.HALF_UP).toPlainString());
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(sb.toString().getBytes("UTF-8"));
            StringBuilder sb2 = new StringBuilder(digest.length * 2);
            for (byte b2 : digest) {
                sb2.append(String.format("%02x", Byte.valueOf(b2)));
            }
            return sb2.toString();
        } catch (Exception e) {
            rw.j(e);
            return null;
        }
    }
}
