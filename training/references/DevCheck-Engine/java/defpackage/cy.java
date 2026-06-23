package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cy {
    public static final cy g;
    public static final cy h;
    public static final cy i;
    public static final cy j;
    public static final /* synthetic */ cy[] k;

    static {
        cy cyVar = new cy("DEFAULT", 0);
        g = cyVar;
        cy cyVar2 = new cy("LAZY", 1);
        h = cyVar2;
        cy cyVar3 = new cy("ATOMIC", 2);
        i = cyVar3;
        cy cyVar4 = new cy("UNDISPATCHED", 3);
        j = cyVar4;
        k = new cy[]{cyVar, cyVar2, cyVar3, cyVar4};
    }

    public static cy valueOf(String str) {
        return (cy) Enum.valueOf(cy.class, str);
    }

    public static cy[] values() {
        return (cy[]) k.clone();
    }
}
