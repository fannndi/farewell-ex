package defpackage;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
public final class cz extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public bz f161a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.f161a.c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r4) {
        /*
            r3 = this;
            bz r3 = r3.f161a
            ts1 r3 = (defpackage.ts1) r3
            androidx.appcompat.widget.SearchView r0 = r3.q
            if (r4 != 0) goto Lb
            java.lang.String r4 = ""
            goto Lf
        Lb:
            java.lang.String r4 = r4.toString()
        Lf:
            int r1 = r0.getVisibility()
            r2 = 0
            if (r1 != 0) goto L29
            int r0 = r0.getWindowVisibility()
            if (r0 == 0) goto L1d
            goto L29
        L1d:
            android.app.SearchableInfo r0 = r3.r     // Catch: java.lang.RuntimeException -> L29
            android.database.Cursor r3 = r3.g(r0, r4)     // Catch: java.lang.RuntimeException -> L29
            if (r3 == 0) goto L29
            r3.getCount()     // Catch: java.lang.RuntimeException -> L29
            goto L2a
        L29:
            r3 = r2
        L2a:
            android.widget.Filter$FilterResults r4 = new android.widget.Filter$FilterResults
            r4.<init>()
            if (r3 == 0) goto L3a
            int r0 = r3.getCount()
            r4.count = r0
            r4.values = r3
            goto L3f
        L3a:
            r3 = 0
            r4.count = r3
            r4.values = r2
        L3f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cz.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        bz bzVar = this.f161a;
        Cursor cursor = bzVar.i;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        bzVar.b((Cursor) obj);
    }
}
