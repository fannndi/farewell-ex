package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class iy0 extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f454a;

    public iy0(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f454a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((vk0) iInterface).getClass();
        obj.getClass();
        this.f454a.h.remove((Integer) obj);
    }
}
