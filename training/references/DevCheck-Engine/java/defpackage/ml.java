package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.RemoteViews;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class ml {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f639a;
    public boolean b;
    public int c;
    public final Object d;
    public final Object e;

    public ml(Parcel parcel) {
        this.f639a = 1;
        parcel.getClass();
        int readInt = parcel.readInt();
        long[] jArr = new long[readInt];
        this.d = jArr;
        parcel.readLongArray(jArr);
        Parcelable.Creator creator = RemoteViews.CREATOR;
        creator.getClass();
        RemoteViews[] remoteViewsArr = new RemoteViews[readInt];
        parcel.readTypedArray(remoteViewsArr, creator);
        for (int i = 0; i < readInt; i++) {
            if (remoteViewsArr[i] == null) {
                throw new IllegalArgumentException("null element found in " + remoteViewsArr + '.');
            }
        }
        this.e = remoteViewsArr;
        this.b = parcel.readInt() == 1;
        this.c = parcel.readInt();
    }

    public ml(BottomSheetBehavior bottomSheetBehavior) {
        this.f639a = 0;
        this.e = bottomSheetBehavior;
        this.d = new wa(1, this);
    }

    public ml(SideSheetBehavior sideSheetBehavior) {
        this.f639a = 2;
        this.e = sideSheetBehavior;
        this.d = new oo1(1, this);
    }

    public ml(long[] jArr, RemoteViews[] remoteViewsArr) {
        this.f639a = 1;
        this.d = jArr;
        this.e = remoteViewsArr;
        this.b = false;
        this.c = 1;
        if (jArr.length != remoteViewsArr.length) {
            c.m("RemoteCollectionItems has different number of ids and views");
            throw null;
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = yr.g0(new LinkedHashSet(arrayList)).size();
        if (size <= 1) {
            return;
        }
        c.d(d51.p(size, "View type count is set to 1, but the collection contains ", " different layout ids"));
        throw null;
    }

    public void a(int i) {
        int i2 = this.f639a;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.Y;
                if (weakReference != null && weakReference.get() != null) {
                    this.c = i;
                    if (!this.b) {
                        ((View) bottomSheetBehavior.Y.get()).postOnAnimation((wa) obj);
                        this.b = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.c = i;
                    if (!this.b) {
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((oo1) obj);
                        this.b = true;
                        break;
                    }
                }
                break;
        }
    }
}
