package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class mf1 implements Serializable {
    public final Pattern g;

    public mf1(String str) {
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.g = compile;
    }

    public final fh a(int i, String str) {
        str.getClass();
        Matcher region = this.g.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (region.lookingAt()) {
            return new fh(region, str);
        }
        return null;
    }

    public final String toString() {
        String pattern = this.g.toString();
        pattern.getClass();
        return pattern;
    }
}
