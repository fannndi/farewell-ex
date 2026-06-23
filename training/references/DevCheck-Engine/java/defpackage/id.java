package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class id {
    public static final id g;
    public static final id h;
    public static final id i;
    public static final id j;
    public static final /* synthetic */ id[] k;

    static {
        id idVar = new id("NONE", 0);
        g = idVar;
        id idVar2 = new id("START", 1);
        h = idVar2;
        id idVar3 = new id("END", 2);
        i = idVar3;
        id idVar4 = new id("BOTH", 3);
        j = idVar4;
        k = new id[]{idVar, idVar2, idVar3, idVar4};
    }

    public static id valueOf(String str) {
        return (id) Enum.valueOf(id.class, str);
    }

    public static id[] values() {
        return (id[]) k.clone();
    }
}
