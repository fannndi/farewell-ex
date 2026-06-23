package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.widget.RemoteViewsCompatService;
import flar2.devcheck.R;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rf1 implements RemoteViewsService.RemoteViewsFactory {
    public static final ml e = new ml(new long[0], new RemoteViews[0]);

    /* renamed from: a, reason: collision with root package name */
    public final RemoteViewsCompatService f890a;
    public final int b;
    public final int c;
    public ml d = e;

    public rf1(RemoteViewsCompatService remoteViewsCompatService, int i, int i2) {
        this.f890a = remoteViewsCompatService;
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        Long l;
        RemoteViewsCompatService remoteViewsCompatService = this.f890a;
        SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        sharedPreferences.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(':');
        sb.append(this.c);
        ml mlVar = null;
        String string = sharedPreferences.getString(sb.toString(), null);
        if (string != null) {
            byte[] decode = Base64.decode(string, 0);
            decode.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.getClass();
            try {
                obtain.unmarshall(decode, 0, decode.length);
                obtain.setDataPosition(0);
                byte[] bArr = new byte[obtain.readInt()];
                obtain.readByteArray(bArr);
                String readString = obtain.readString();
                readString.getClass();
                long readLong = obtain.readLong();
                obtain.recycle();
                if (ym0.b(Build.VERSION.INCREMENTAL, readString)) {
                    try {
                        l = Long.valueOf(Build.VERSION.SDK_INT >= 28 ? r4.e(remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0)) : r0.versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                        Objects.toString(remoteViewsCompatService.getPackageManager());
                        l = null;
                    }
                    if (l != null && l.longValue() == readLong) {
                        try {
                            obtain = Parcel.obtain();
                            obtain.getClass();
                            try {
                                obtain.unmarshall(bArr, 0, bArr.length);
                                obtain.setDataPosition(0);
                                ml mlVar2 = new ml(obtain);
                                obtain.recycle();
                                mlVar = mlVar2;
                            } finally {
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            } finally {
            }
        }
        if (mlVar == null) {
            mlVar = e;
        }
        this.d = mlVar;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return ((long[]) this.d.d).length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return ((long[]) this.d.d)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return ((RemoteViews[]) this.d.e)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f890a.getPackageName(), R.layout.invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.d.c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.d.b;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
