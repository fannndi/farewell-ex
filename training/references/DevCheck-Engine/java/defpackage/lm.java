package defpackage;

import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class lm {
    public static final String c;
    public static final Set d;
    public static final lm e;

    /* renamed from: a, reason: collision with root package name */
    public final String f597a;
    public final String b;

    static {
        String H = pr.H("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = H;
        pr.H("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        pr.H("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new v80("proto"), new v80(YHJbtPFAANaPQ.fTOQed))));
        e = new lm(H, null);
    }

    public lm(String str, String str2) {
        this.f597a = str;
        this.b = str2;
    }

    public static lm a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            c.m("Version marker missing from extras");
            return null;
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            c.m("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            c.m("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = split[1];
        return new lm(str2, str3.isEmpty() ? null : str3);
    }
}
