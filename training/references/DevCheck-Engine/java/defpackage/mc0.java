package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import com.jjoe64.graphview.XZMC.MiGPiFgcCQCVh;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class mc0 {

    /* renamed from: a, reason: collision with root package name */
    public static final gt0 f623a = new gt0(2);
    public static final a9 b = new a9(7);

    public static th2 a(Context context, List list) {
        String str;
        Typeface c;
        Trace.beginSection(bw0.A("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                nc0 nc0Var = (nc0) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (c = n32.c((str = nc0Var.e))) == null || n32.d(c) == null) {
                    ProviderInfo b2 = b(context.getPackageManager(), nc0Var, context.getResources());
                    if (b2 == null) {
                        return new th2(4);
                    }
                    arrayList.add(c(context, nc0Var, b2.authority));
                } else {
                    arrayList.add(new yc0[]{new yc0(str, nc0Var.f)});
                }
            }
            return new th2(arrayList, 4);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, nc0 nc0Var, Resources resources) {
        a9 a9Var = b;
        gt0 gt0Var = f623a;
        String str = MiGPiFgcCQCVh.IVyCgQkJa;
        Trace.beginSection(bw0.A("FontProvider.getProvider"));
        try {
            List list = nc0Var.d;
            String str2 = nc0Var.f673a;
            String str3 = nc0Var.b;
            if (list == null) {
                list = md2.p(resources, 0);
            }
            lc0 lc0Var = new lc0();
            lc0Var.f581a = str2;
            lc0Var.b = str3;
            lc0Var.c = list;
            ProviderInfo providerInfo = (ProviderInfo) gt0Var.f(lc0Var);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str2, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException(str + str2);
            }
            if (!resolveContentProvider.packageName.equals(str3)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str2 + ", but package was not " + str3);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, a9Var);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, a9Var);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    gt0Var.j(lc0Var, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static yc0[] c(Context context, nc0 nc0Var, String str) {
        ContentProviderClient contentProviderClient;
        ContentProviderClient contentProviderClient2;
        ContentProviderClient contentProviderClient3;
        Uri withAppendedId;
        String str2 = jYVJoqfHJs.NxLGAl;
        Trace.beginSection(bw0.A("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme(str2).authority(str).build();
            Uri build2 = new Uri.Builder().scheme(str2).authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(bw0.A("ContentQueryWrapper.query"));
                try {
                    try {
                        String[] strArr2 = {nc0Var.c};
                        if (acquireUnstableContentProviderClient != null) {
                            try {
                                cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                            } catch (RemoteException unused) {
                            }
                        }
                        if (cursor == null || cursor.getCount() <= 0) {
                            contentProviderClient2 = acquireUnstableContentProviderClient;
                        } else {
                            int columnIndex = cursor.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursor.getColumnIndex("_id");
                            int columnIndex3 = cursor.getColumnIndex("file_id");
                            int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursor.getColumnIndex("font_weight");
                            int columnIndex6 = cursor.getColumnIndex("font_italic");
                            while (cursor.moveToNext()) {
                                int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                                int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                                if (columnIndex3 == -1) {
                                    contentProviderClient3 = acquireUnstableContentProviderClient;
                                    withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                                } else {
                                    contentProviderClient3 = acquireUnstableContentProviderClient;
                                    withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                                }
                                arrayList2.add(new yc0(withAppendedId, i2, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, nc0Var.f, i));
                                acquireUnstableContentProviderClient = contentProviderClient3;
                            }
                            contentProviderClient2 = acquireUnstableContentProviderClient;
                            arrayList = arrayList2;
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClient2 != null) {
                            contentProviderClient2.close();
                        }
                        return (yc0[]) arrayList.toArray(new yc0[0]);
                    } finally {
                    }
                } catch (Throwable th) {
                    th = th;
                    contentProviderClient = context;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                contentProviderClient = acquireUnstableContentProviderClient;
            }
        } finally {
            Trace.endSection();
        }
    }
}
