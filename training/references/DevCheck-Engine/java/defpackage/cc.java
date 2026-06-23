package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cc {
    public static final cc g;
    public static final cc h;
    public static final /* synthetic */ cc[] i;

    static {
        cc ccVar = new cc("EXPONENTIAL", 0);
        g = ccVar;
        cc ccVar2 = new cc("LINEAR", 1);
        h = ccVar2;
        i = new cc[]{ccVar, ccVar2};
    }

    public static cc valueOf(String str) {
        return (cc) Enum.valueOf(cc.class, str);
    }

    public static cc[] values() {
        return (cc[]) i.clone();
    }
}
