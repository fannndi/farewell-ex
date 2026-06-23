package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class er {
    public static final er g;
    public static final /* synthetic */ er[] h;

    /* JADX INFO: Fake field, exist only in values array */
    er EF0;

    static {
        er erVar = new er("UNKNOWN", 0);
        er erVar2 = new er("ANDROID_FIREBASE", 1);
        g = erVar2;
        h = new er[]{erVar, erVar2};
    }

    public static er valueOf(String str) {
        return (er) Enum.valueOf(er.class, str);
    }

    public static er[] values() {
        return (er[]) h.clone();
    }
}
