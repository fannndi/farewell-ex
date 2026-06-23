package defpackage;

import Cwd.YSHrxiHkAFcciU;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

/* loaded from: classes.dex */
public class u11 extends ld0 implements b01, d01, gz0, f01 {
    public RecyclerView d0;
    public l01 e0;
    public v21 f0;
    public boolean g0 = false;
    public SwipeRefreshLayout h0;
    public n3 i0;

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.tab_fragment2, viewGroup, false);
        this.d0 = (RecyclerView) inflate.findViewById(R.id.fragment_recyclerview);
        i0();
        this.d0.setLayoutManager(new LinearLayoutManager(1));
        l01 l01Var = new l01(i0(), (List) new ArrayList());
        this.e0 = l01Var;
        l01Var.g = this;
        l01Var.h = this;
        l01Var.j = this;
        l01Var.l = this;
        l01Var.p = this;
        this.d0.setAdapter(l01Var);
        int i = (z().getBoolean(R.bool.isTablet) || z().getBoolean(R.bool.isTablet10)) ? 320 : (z().getBoolean(R.bool.isNexus6) && z().getBoolean(R.bool.isLandscape)) ? 420 : z().getBoolean(R.bool.isLandscape) ? 350 : z().getBoolean(R.bool.isNexus6) ? 530 : 450;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_container);
        this.h0 = swipeRefreshLayout;
        swipeRefreshLayout.g(i);
        this.h0.setOnRefreshListener(new p8(26, this));
        this.h0.setRefreshing(true);
        Application application = g0().getApplication();
        application.getClass();
        if (k72.i == null) {
            k72.i = new k72(application);
        }
        k72 k72Var = k72.i;
        k72Var.getClass();
        gr grVar = new gr(l(), k72Var, h());
        vq a2 = af1.a(v21.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return null;
        }
        v21 v21Var = (v21) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        this.f0 = v21Var;
        if (v21Var.c == null) {
            v21Var.c = new qy0();
            v21Var.k();
        }
        v21Var.c.e(D(), new nc(18, this));
        return inflate;
    }

    @Override // defpackage.ld0
    public final void V() {
        j21 j21Var;
        this.K = true;
        tl0.a("network");
        n3 n3Var = this.i0;
        if (n3Var != null && n3Var.isShowing()) {
            this.i0.dismiss();
        }
        v21 v21Var = this.f0;
        v21Var.i.cancel();
        TelephonyManager telephonyManager = v21Var.e;
        if (telephonyManager == null || (j21Var = v21Var.f) == null || !v21Var.g) {
            return;
        }
        try {
            telephonyManager.listen(j21Var, 0);
        } catch (Exception unused) {
        }
        v21Var.g = false;
    }

    @Override // defpackage.ld0
    public final void X(int i, String[] strArr, int[] iArr) {
        try {
            if (i == 123) {
                if (iArr.length == 0) {
                    return;
                }
                if (iArr[0] == 0) {
                    this.f0.k();
                    return;
                } else {
                    if (r0("android.permission.READ_PHONE_STATE")) {
                        return;
                    }
                    Toast.makeText(i0(), R.string.permission_denied, 0).show();
                    return;
                }
            }
            if (i == 134 && iArr.length != 0) {
                if (iArr[0] == 0) {
                    this.f0.k();
                } else {
                    if (r0("android.permission.ACCESS_FINE_LOCATION")) {
                        return;
                    }
                    Toast.makeText(i0(), R.string.permission_denied, 0).show();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.ld0
    public final void Y() {
        j21 j21Var;
        this.K = true;
        tl0.b(t(), "network");
        v21 v21Var = this.f0;
        TelephonyManager telephonyManager = v21Var.e;
        if (telephonyManager != null && (j21Var = v21Var.f) != null && !v21Var.g) {
            try {
                telephonyManager.listen(j21Var, rt0.t);
                v21Var.g = true;
            } catch (Exception unused) {
            }
        }
        Timer timer = new Timer();
        v21Var.i = timer;
        timer.schedule(new af(3, v21Var), 0L, 2000L);
    }

    @Override // defpackage.gz0
    public final void c(String str) {
        ((ClipboardManager) i0().getApplicationContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", str));
        Toast.makeText(i0(), R.string.copied_to_clipboard, 0).show();
    }

    @Override // defpackage.d01
    public final void d(String str) {
        try {
            new t11(this).executeOnExecutor(MainApp.h, new Void[0]);
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.b01
    public final void e() {
        try {
            f0(new String[]{"android.permission.READ_PHONE_STATE"}, 123);
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.f01
    public final void i(String str) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        int slotIndex;
        try {
            if (!str.equals(i0().getString(R.string.mobile)) && !str.equals("Mobile")) {
                if (!str.equals(i0().getString(R.string.wifi)) && !str.equals("Wi-Fi")) {
                    uz1.u0(i0());
                    return;
                }
                Context i0 = i0();
                String str2 = uz1.f1060a;
                try {
                    Intent intent = Build.VERSION.SDK_INT >= 29 ? new Intent(YSHrxiHkAFcciU.HbaSsZ) : new Intent("android.settings.WIFI_SETTINGS");
                    intent.addFlags(1350565888);
                    i0.getApplicationContext().startActivity(intent);
                    return;
                } catch (Exception unused) {
                    Intent intent2 = new Intent("android.settings.WIFI_SETTINGS");
                    intent2.addFlags(1350565888);
                    i0.startActivity(intent2);
                    return;
                }
            }
            Context i02 = i0();
            String str3 = uz1.f1060a;
            int i = 0;
            if (Build.VERSION.SDK_INT >= 29) {
                if (pr.g(i02, "android.permission.READ_PHONE_STATE") == 0) {
                    List<SubscriptionInfo> activeSubscriptionInfoList2 = ((SubscriptionManager) i02.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
                    if (activeSubscriptionInfoList2 != null) {
                        for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList2) {
                            if (subscriptionInfo.getSimSlotIndex() == 0) {
                                i = subscriptionInfo.getSubscriptionId();
                            }
                            if (subscriptionInfo.getSimSlotIndex() == 1) {
                                subscriptionInfo.getSubscriptionId();
                            }
                        }
                    }
                } else {
                    int i2 = 0;
                    while (i < 10) {
                        slotIndex = SubscriptionManager.getSlotIndex(i);
                        if (slotIndex == 0) {
                            i2 = i;
                        }
                        SubscriptionManager.getSlotIndex(i);
                        i++;
                    }
                    i = i2;
                }
            } else if (pr.g(i02, "android.permission.READ_PHONE_STATE") == 0 && (activeSubscriptionInfoList = ((SubscriptionManager) i02.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList()) != null) {
                for (SubscriptionInfo subscriptionInfo2 : activeSubscriptionInfoList) {
                    if (subscriptionInfo2.getSimSlotIndex() == 0) {
                        i = subscriptionInfo2.getSubscriptionId();
                    }
                    if (subscriptionInfo2.getSimSlotIndex() == 1) {
                        subscriptionInfo2.getSubscriptionId();
                    }
                }
            }
            Intent intent3 = new Intent("android.settings.NETWORK_OPERATOR_SETTINGS");
            if (i != 0 && Build.VERSION.SDK_INT >= 28) {
                intent3.putExtra("android.provider.extra.SUB_ID", i);
            }
            intent3.addFlags(1350565888);
            i02.getApplicationContext().startActivity(intent3);
        } catch (ActivityNotFoundException | Exception unused2) {
        }
    }

    @Override // defpackage.d01
    public final void j(String str) {
    }

    @Override // defpackage.d01
    public final void n(Intent intent, String str) {
    }
}
