package defpackage;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.slider.KtNX.UQdsoaJMID;
import flar2.devcheck.R;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ts1 extends bz implements View.OnClickListener {
    public static final /* synthetic */ int D = 0;
    public int A;
    public int B;
    public int C;
    public final int n;
    public final int o;
    public final LayoutInflater p;
    public final SearchView q;
    public final SearchableInfo r;
    public final Context s;
    public final WeakHashMap t;
    public final int u;
    public int v;
    public ColorStateList w;
    public int x;
    public int y;
    public int z;

    public ts1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.h = true;
        this.i = null;
        this.g = false;
        this.j = -1;
        this.k = new zy(this);
        this.l = new az(0, this);
        this.o = suggestionRowLayout;
        this.n = suggestionRowLayout;
        this.p = (LayoutInflater) context.getSystemService("layout_inflater");
        this.v = 1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.q = searchView;
        this.r = searchableInfo;
        this.u = searchView.getSuggestionCommitIconResId();
        this.s = context;
        this.t = weakHashMap;
    }

    public static String h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a  */
    @Override // defpackage.bz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r21, android.database.Cursor r22) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts1.a(android.view.View, android.database.Cursor):void");
    }

    @Override // defpackage.bz
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.x = cursor.getColumnIndex("suggest_text_1");
                this.y = cursor.getColumnIndex("suggest_text_2");
                this.z = cursor.getColumnIndex("suggest_text_2_url");
                this.A = cursor.getColumnIndex("suggest_icon_1");
                this.B = cursor.getColumnIndex("suggest_icon_2");
                this.C = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.bz
    public final String c(Cursor cursor) {
        String h;
        String h2;
        if (cursor == null) {
            return null;
        }
        String h3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h3 != null) {
            return h3;
        }
        SearchableInfo searchableInfo = this.r;
        if (searchableInfo.shouldRewriteQueryFromData() && (h2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h;
    }

    @Override // defpackage.bz
    public final View d(ViewGroup viewGroup) {
        View inflate = this.p.inflate(this.n, viewGroup, false);
        inflate.setTag(new ss1(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.u);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            jw0.p("No authority: ", uri);
            return null;
        }
        try {
            Resources resourcesForApplication = this.s.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                jw0.p("No path: ", uri);
                return null;
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    jw0.p("Single path segment is not a resource ID: ", uri);
                    return null;
                }
            } else {
                if (size != 2) {
                    jw0.p("More than two path segments: ", uri);
                    return null;
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            jw0.p("No resource found for: ", uri);
            return null;
        } catch (PackageManager.NameNotFoundException unused2) {
            jw0.p("No package found for authority: ", uri);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r9) {
        /*
            r8 = this;
            java.util.WeakHashMap r0 = r8.t
            android.content.Context r1 = r8.s
            r2 = 0
            java.lang.String r2 = flar2.devcheck.sensors.JCZI.nyGJ.Seubmg
            r3 = 0
            if (r9 == 0) goto Ld5
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto Ld5
            r4 = 0
            java.lang.String r4 = flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj.hvHxvQcwXlJlY
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L1b
            goto Ld5
        L1b:
            int r4 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L56 android.content.res.Resources.NotFoundException -> Ld5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L56 android.content.res.Resources.NotFoundException -> Ld5
            r5.<init>(r2)     // Catch: java.lang.NumberFormatException -> L56 android.content.res.Resources.NotFoundException -> Ld5
            java.lang.String r2 = r1.getPackageName()     // Catch: java.lang.NumberFormatException -> L56 android.content.res.Resources.NotFoundException -> Ld5
            r5.append(r2)     // Catch: java.lang.NumberFormatException -> L56 android.content.res.Resources.NotFoundException -> Ld5
            java.lang.String r2 = "/"
            r5.append(r2)     // Catch: java.lang.NumberFormatException -> L56 android.content.res.Resources.NotFoundException -> Ld5
            r5.append(r4)     // Catch: java.lang.NumberFormatException -> L56 android.content.res.Resources.NotFoundException -> Ld5
            java.lang.String r2 = r5.toString()     // Catch: java.lang.NumberFormatException -> L56 android.content.res.Resources.NotFoundException -> Ld5
            java.lang.Object r5 = r0.get(r2)     // Catch: java.lang.NumberFormatException -> L56 android.content.res.Resources.NotFoundException -> Ld5
            android.graphics.drawable.Drawable$ConstantState r5 = (android.graphics.drawable.Drawable.ConstantState) r5     // Catch: java.lang.NumberFormatException -> L56 android.content.res.Resources.NotFoundException -> Ld5
            if (r5 != 0) goto L41
            r5 = r3
            goto L45
        L41:
            android.graphics.drawable.Drawable r5 = r5.newDrawable()     // Catch: java.lang.NumberFormatException -> L56 android.content.res.Resources.NotFoundException -> Ld5
        L45:
            if (r5 == 0) goto L48
            return r5
        L48:
            android.graphics.drawable.Drawable r4 = r1.getDrawable(r4)     // Catch: java.lang.NumberFormatException -> L56 android.content.res.Resources.NotFoundException -> Ld5
            if (r4 == 0) goto L55
            android.graphics.drawable.Drawable$ConstantState r5 = r4.getConstantState()     // Catch: java.lang.NumberFormatException -> L56 android.content.res.Resources.NotFoundException -> Ld5
            r0.put(r2, r5)     // Catch: java.lang.NumberFormatException -> L56 android.content.res.Resources.NotFoundException -> Ld5
        L55:
            return r4
        L56:
            java.lang.Object r2 = r0.get(r9)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L60
            r2 = r3
            goto L64
        L60:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L64:
            if (r2 == 0) goto L67
            return r2
        L67:
            android.net.Uri r2 = android.net.Uri.parse(r9)
            java.lang.String r4 = "Failed to open "
            java.lang.String r5 = "Resource does not exist: "
            java.lang.String r6 = r2.getScheme()     // Catch: java.io.FileNotFoundException -> L80
            java.lang.String r7 = "android.resource"
            boolean r6 = r7.equals(r6)     // Catch: java.io.FileNotFoundException -> L80
            if (r6 == 0) goto L94
            android.graphics.drawable.Drawable r3 = r8.e(r2)     // Catch: java.io.FileNotFoundException -> L80 android.content.res.Resources.NotFoundException -> L82
            goto Lcc
        L80:
            r8 = move-exception
            goto Lc6
        L82:
            java.io.FileNotFoundException r8 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L80
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L80
            r1.<init>(r5)     // Catch: java.io.FileNotFoundException -> L80
            r1.append(r2)     // Catch: java.io.FileNotFoundException -> L80
            java.lang.String r1 = r1.toString()     // Catch: java.io.FileNotFoundException -> L80
            r8.<init>(r1)     // Catch: java.io.FileNotFoundException -> L80
            throw r8     // Catch: java.io.FileNotFoundException -> L80
        L94:
            android.content.ContentResolver r8 = r1.getContentResolver()     // Catch: java.io.FileNotFoundException -> L80
            java.io.InputStream r8 = r8.openInputStream(r2)     // Catch: java.io.FileNotFoundException -> L80
            if (r8 == 0) goto Lb4
            android.graphics.drawable.Drawable r1 = android.graphics.drawable.Drawable.createFromStream(r8, r3)     // Catch: java.lang.Throwable -> Lab
            r8.close()     // Catch: java.io.IOException -> La7
        La5:
            r3 = r1
            goto Lcc
        La7:
            r2.toString()     // Catch: java.io.FileNotFoundException -> L80
            goto La5
        Lab:
            r1 = move-exception
            r8.close()     // Catch: java.io.IOException -> Lb0
            goto Lb3
        Lb0:
            r2.toString()     // Catch: java.io.FileNotFoundException -> L80
        Lb3:
            throw r1     // Catch: java.io.FileNotFoundException -> L80
        Lb4:
            java.io.FileNotFoundException r8 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L80
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L80
            r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> L80
            r1.append(r2)     // Catch: java.io.FileNotFoundException -> L80
            java.lang.String r1 = r1.toString()     // Catch: java.io.FileNotFoundException -> L80
            r8.<init>(r1)     // Catch: java.io.FileNotFoundException -> L80
            throw r8     // Catch: java.io.FileNotFoundException -> L80
        Lc6:
            java.util.Objects.toString(r2)
            r8.getMessage()
        Lcc:
            if (r3 == 0) goto Ld5
            android.graphics.drawable.Drawable$ConstantState r8 = r3.getConstantState()
            r0.put(r9, r8)
        Ld5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts1.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme(UQdsoaJMID.BhxcnHq).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.s.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // defpackage.bz, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View inflate = this.p.inflate(this.o, viewGroup, false);
            if (inflate != null) {
                ((ss1) inflate.getTag()).f953a.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // defpackage.bz, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View d = this.d(viewGroup);
            ((ss1) d.getTag()).f953a.setText(e.toString());
            return d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.i;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.i;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.q.p((CharSequence) tag);
        }
    }
}
