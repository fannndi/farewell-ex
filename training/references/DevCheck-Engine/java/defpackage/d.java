package defpackage;

import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import moe.shizuku.api.BinderContainer;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162a;

    public /* synthetic */ d(int i) {
        this.f162a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createFromParcel(final android.os.Parcel r14) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f162a) {
            case 0:
                return new e[i];
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return new c2[i];
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return new o2[i];
            case 3:
                return new x6[i];
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return new d8[i];
            case 5:
                return new zb[i];
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return new ac[i];
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return new ec[i];
            case 8:
                return new ee[i];
            case rt0.o /* 9 */:
                return new BinderContainer[i];
            case 10:
                return new zm[i];
            case 11:
                return new a10[i];
            case 12:
                return new k70[i];
            case 13:
                return new e90[i];
            case 14:
                return new xd0[i];
            case 15:
                return new be0[i];
            case 16:
                return new ge0[i];
            case rt0.p /* 17 */:
                return new wm0[i];
            case 18:
                return new ar0[i];
            case 19:
                return new xr0[i];
            case 20:
                return new nv0[i];
            case 21:
                return new MediaBrowserCompat$MediaItem[i];
            case 22:
                return new MediaDescriptionCompat[i];
            case 23:
                return new MediaMetadataCompat[i];
            case 24:
                return new MediaSessionCompat$QueueItem[i];
            case 25:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 26:
                return new MediaSessionCompat$Token[i];
            case 27:
                return new ay0[i];
            case 28:
                return new jy0[i];
            default:
                return new y01[i];
        }
    }
}
