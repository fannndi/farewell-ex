package flar2.devcheck.tests;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.ae0;
import defpackage.af1;
import defpackage.c;
import defpackage.c3;
import defpackage.fh;
import defpackage.gr;
import defpackage.gx1;
import defpackage.hk;
import defpackage.hx1;
import defpackage.ig1;
import defpackage.kx1;
import defpackage.l72;
import defpackage.lk;
import defpackage.lx1;
import defpackage.n72;
import defpackage.op0;
import defpackage.pj;
import defpackage.pr;
import defpackage.py0;
import defpackage.rj;
import defpackage.rn;
import defpackage.rt0;
import defpackage.sj;
import defpackage.sl;
import defpackage.tl2;
import defpackage.uz1;
import defpackage.vq;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class TestActivity extends a5 implements hx1 {
    public static final /* synthetic */ int K = 0;
    public sj F;
    public SharedPreferences G;
    public ArrayList H;
    public kx1 I;
    public final ExecutorService J = Executors.newSingleThreadExecutor();

    public static void B(TestActivity testActivity, boolean z) {
        testActivity.G.edit().putBoolean(testActivity.getString(R.string.fingerprint), z).commit();
        testActivity.E();
        testActivity.I.f();
    }

    public final int C(String str) {
        if (this.G.contains(str)) {
            return this.G.getBoolean(str, false) ? 2 : 3;
        }
        return 1;
    }

    public final void D(int i, String str) {
        try {
            switch (i) {
                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                    startActivity(new Intent(this, (Class<?>) FlashlightActivity.class));
                    break;
                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                    startActivity(new Intent(this, (Class<?>) VibActivity.class));
                    break;
                case 3:
                    startActivity(new Intent(this, (Class<?>) ButtonActivity.class));
                    break;
                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    startActivity(new Intent(this, (Class<?>) MultiTouchActivity.class));
                    break;
                case 5:
                    startActivity(new Intent(this, (Class<?>) ScreenActivity.class));
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                    startActivity(new Intent(this, (Class<?>) BrightnessActivity.class));
                    break;
                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                    startActivity(new Intent(this, (Class<?>) LightSensorActivity.class));
                    break;
                case 8:
                    startActivity(new Intent(this, (Class<?>) ProximityActivity.class));
                    break;
                case rt0.o /* 9 */:
                    startActivity(new Intent(this, (Class<?>) AccelerometerActivity.class));
                    break;
                case 10:
                    if (!this.F.d()) {
                        uz1.q0(this);
                        break;
                    } else {
                        startActivity(new Intent(this, (Class<?>) ChargingActivity.class));
                        break;
                    }
                case 11:
                    if (!this.F.d()) {
                        uz1.q0(this);
                        break;
                    } else {
                        startActivity(new Intent(this, (Class<?>) SpeakersActivity.class));
                        break;
                    }
                case 12:
                    if (!this.F.d()) {
                        uz1.q0(this);
                        break;
                    } else {
                        startActivity(new Intent(this, (Class<?>) HeadsetActivity.class));
                        break;
                    }
                case 13:
                    if (!this.F.d()) {
                        uz1.q0(this);
                        break;
                    } else {
                        startActivity(new Intent(this, (Class<?>) EarpieceActivity.class));
                        break;
                    }
                case 14:
                    if (!this.F.d()) {
                        uz1.q0(this);
                        break;
                    } else {
                        startActivity(new Intent(this, (Class<?>) MicActivity.class));
                        break;
                    }
            }
            if (!str.equals(getString(R.string.fingerprint)) && !str.equals(getString(R.string.biometric_test))) {
                if (str.equals(getString(R.string.face_detection))) {
                    if (this.F.d()) {
                        F();
                        return;
                    } else {
                        uz1.q0(this);
                        return;
                    }
                }
                if (str.equals(getString(R.string.iris_scanner))) {
                    if (this.F.d()) {
                        F();
                        return;
                    } else {
                        uz1.q0(this);
                        return;
                    }
                }
                return;
            }
            if (this.F.d()) {
                F();
            } else {
                uz1.q0(this);
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void E() {
        ArrayList arrayList = this.H;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
        this.H.add(new lx1(null, 0, null, false, 0));
        ArrayList arrayList2 = this.H;
        Resources resources = getResources();
        ThreadLocal threadLocal = ig1.f428a;
        arrayList2.add(new lx1(resources.getDrawable(R.drawable.ic_test_flashlight, null), C(getString(R.string.flashlight)), getString(R.string.flashlight), false, 1));
        this.H.add(new lx1(getResources().getDrawable(R.drawable.ic_test_vibrate, null), C(getString(R.string.vibration)), getString(R.string.vibration), false, 1));
        this.H.add(new lx1(getResources().getDrawable(R.drawable.ic_test_button, null), C(getString(R.string.buttons)), getString(R.string.buttons), false, 1));
        this.H.add(new lx1(getResources().getDrawable(R.drawable.ic_test_touch, null), C(getString(R.string.multitouch)), getString(R.string.multitouch), false, 1));
        this.H.add(new lx1(getResources().getDrawable(R.drawable.ic_phone, null), C(getString(R.string.display)), getString(R.string.display), false, 1));
        this.H.add(new lx1(getResources().getDrawable(R.drawable.ic_test_brightness, null), C(getString(R.string.backlight)), getString(R.string.backlight), false, 1));
        this.H.add(new lx1(getResources().getDrawable(R.drawable.ic_light_sensor, null), C(getString(R.string.light_sensor)), getString(R.string.light_sensor), false, 1));
        this.H.add(new lx1(getResources().getDrawable(R.drawable.ic_proximity, null), C(getString(R.string.proximity)), getString(R.string.proximity), false, 1));
        this.H.add(new lx1(getResources().getDrawable(R.drawable.ic_accelerometer, null), C(getString(R.string.accelerometer)), getString(R.string.accelerometer), false, 1));
        this.H.add(new lx1(getResources().getDrawable(R.drawable.ic_bolt, null), C(getString(R.string.charging)), getString(R.string.charging), true, 1));
        this.H.add(new lx1(getResources().getDrawable(R.drawable.ic_test_speaker, null), C(getString(R.string.speakers)), getString(R.string.speakers), true, 1));
        this.H.add(new lx1(getResources().getDrawable(R.drawable.ic_test_headset, null), C(getString(R.string.headset)), getString(R.string.headset), true, 1));
        this.H.add(new lx1(getResources().getDrawable(R.drawable.ic_test_phone, null), C(getString(R.string.earpiece)), getString(R.string.earpiece), true, 1));
        this.H.add(new lx1(getResources().getDrawable(R.drawable.ic_test_mic, null), C(getString(R.string.mic)), getString(R.string.mic), true, 1));
        if (uz1.b0(this) && uz1.c0(this)) {
            this.H.add(new lx1(getResources().getDrawable(R.drawable.ic_test_fingerprint, null), C(getString(R.string.fingerprint)), getString(R.string.biometric_test), true, 1));
        } else if (uz1.b0(this)) {
            this.H.add(new lx1(getResources().getDrawable(R.drawable.ic_test_face, null), C(getString(R.string.fingerprint)), getString(R.string.face_detection), true, 1));
        } else if (uz1.c0(this)) {
            this.H.add(new lx1(getResources().getDrawable(R.drawable.ic_test_iris, null), C(getString(R.string.fingerprint)), getString(R.string.iris_scanner), true, 1));
        }
        this.H.add(new lx1(null, 0, null, false, 2));
    }

    public final void F() {
        gx1 gx1Var = new gx1(this);
        hk hkVar = new hk();
        ExecutorService executorService = this.J;
        if (executorService == null) {
            c.m("Executor must not be null.");
            return;
        }
        ae0 s = s();
        n72 l = l();
        l72 g = g();
        py0 h = h();
        l.getClass();
        g.getClass();
        gr grVar = new gr(l, g, h);
        vq a2 = af1.a(lk.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        lk lkVar = (lk) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        hkVar.g = true;
        hkVar.h = s;
        lkVar.b = executorService;
        lkVar.c = gx1Var;
        String string = getString(R.string.fingerprint);
        String string2 = getString(R.string.fingerprint_test_msg);
        try {
            if (((FingerprintManager) getSystemService("fingerprint")).hasEnrolledFingerprints()) {
                if (Build.MANUFACTURER.equalsIgnoreCase("samsung") && (uz1.b0(this) || uz1.c0(this))) {
                    string = getString(R.string.biometric_test);
                    string2 = getString(R.string.biometric_test_msg);
                }
            } else if (uz1.b0(this) || uz1.c0(this)) {
                string = getString(R.string.biometric_test);
                string2 = getString(R.string.biometric_test_msg);
            }
        } catch (Exception unused) {
            if (!uz1.b0(this) && !uz1.c0(this)) {
                return;
            }
            string = getString(R.string.biometric_test);
            string2 = getString(R.string.biometric_test_msg);
        }
        String str = string;
        String str2 = string2;
        String string3 = getString(R.string.cancel);
        if (TextUtils.isEmpty(str)) {
            c.m("Title must be set and non-empty.");
            return;
        }
        boolean w = tl2.w(255);
        if (TextUtils.isEmpty(string3) && !w) {
            c.m(bOxzFZXgEkjph.YZkHMslu);
        } else if (!TextUtils.isEmpty(string3) && w) {
            c.m("Negative text must not be set if device credential authentication is allowed.");
        } else {
            try {
                hkVar.c(new fh(str, str2, string3, 7, false));
            } catch (Exception unused2) {
            }
        }
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_tools);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord_layout);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.tools_recyclerview);
        if (coordinatorLayout != null && recyclerView != null) {
            op0.a(coordinatorLayout, true, false, true, false, false, false);
            op0.a(recyclerView, false, false, false, true, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        r.j0(true);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);
        collapsingToolbarLayout.setTitle(getString(R.string.tests));
        getWindow().setStatusBarColor(getColor(android.R.color.transparent));
        pr.U(getWindow(), false);
        this.G = getApplicationContext().getSharedPreferences("testPrefs", 0);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.tools_recyclerview);
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        this.H = new ArrayList();
        rj rjVar = new rj((pj) ((MainApp) getApplication()).g.g, 0);
        n72 l = l();
        py0 h = h();
        l.getClass();
        gr grVar = new gr(l, rjVar, h);
        vq a2 = af1.a(sj.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        sj sjVar = (sj) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        this.F = sjVar;
        sjVar.c().e(this, new rn(this, 5, recyclerView2));
        this.j.a(this.F.b.f792a);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_monitor, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        if (itemId != R.id.action_reset) {
            return super.onOptionsItemSelected(menuItem);
        }
        try {
            SharedPreferences sharedPreferences = this.G;
            if (sharedPreferences != null) {
                sharedPreferences.edit().clear().commit();
            }
            E();
            this.I.f();
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        kx1 kx1Var;
        super.onResume();
        E();
        if (this.H == null || (kx1Var = this.I) == null) {
            return;
        }
        kx1Var.f();
    }
}
