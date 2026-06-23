package flar2.devcheck.tests;

import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.af;
import defpackage.af1;
import defpackage.c;
import defpackage.c3;
import defpackage.gr;
import defpackage.n72;
import defpackage.nc;
import defpackage.op0;
import defpackage.pj;
import defpackage.pr;
import defpackage.py0;
import defpackage.rj;
import defpackage.sj;
import defpackage.sl;
import defpackage.sq;
import defpackage.vq;
import defpackage.w5;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.tests.ChargingActivity;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Timer;

/* loaded from: classes.dex */
public class ChargingActivity extends a5 {
    public static final /* synthetic */ int M = 0;
    public Timer H;
    public ImageView I;
    public int J;
    public int K;
    public final sq F = new sq();
    public final DecimalFormat G = new DecimalFormat("###.#");
    public final w5 L = new w5(8, this);

    /* JADX WARN: Can't wrap try/catch for region: R(40:0|1|(3:2|3|(1:5))|6|(5:7|8|9|10|11)|(4:12|13|(1:15)(1:153)|16)|17|(3:18|(2:20|21)(1:(1:147)(1:(1:149)(1:150)))|(1:22))|(3:24|25|26)(1:(3:125|126|127)(2:128|(3:130|131|132)(2:133|(3:135|136|137)(29:(3:140|141|142)|139|31|32|33|(1:121)(1:37)|38|39|40|(20:42|(1:44)|45|46|47|(1:49)(1:103)|50|(1:52)|(13:54|(2:56|(1:58))|60|61|62|(3:66|67|(2:71|(6:75|76|(1:78)(1:94)|79|(1:93)(1:82)|(2:84|85)(4:87|(1:89)(1:92)|90|91))))|97|76|(0)(0)|79|(0)|93|(0)(0))|(2:102|60)|61|62|(4:64|66|67|(3:69|71|(8:73|75|76|(0)(0)|79|(0)|93|(0)(0))))|97|76|(0)(0)|79|(0)|93|(0)(0))|118|45|46|47|(0)(0)|50|(0)|(11:(2:100|102)|61|62|(0)|97|76|(0)(0)|79|(0)|93|(0)(0))|60|61|62|(0)|97|76|(0)(0)|79|(0)|93|(0)(0)))))|27|29|31|32|33|(1:35)|121|38|39|40|(0)|118|45|46|47|(0)(0)|50|(0)|(0)|(0)|61|62|(0)|97|76|(0)(0)|79|(0)|93|(0)(0)|(1:(1:110))) */
    /* JADX WARN: Can't wrap try/catch for region: R(42:0|1|2|3|(1:5)|6|(5:7|8|9|10|11)|(4:12|13|(1:15)(1:153)|16)|17|(3:18|(2:20|21)(1:(1:147)(1:(1:149)(1:150)))|(1:22))|(3:24|25|26)(1:(3:125|126|127)(2:128|(3:130|131|132)(2:133|(3:135|136|137)(29:(3:140|141|142)|139|31|32|33|(1:121)(1:37)|38|39|40|(20:42|(1:44)|45|46|47|(1:49)(1:103)|50|(1:52)|(13:54|(2:56|(1:58))|60|61|62|(3:66|67|(2:71|(6:75|76|(1:78)(1:94)|79|(1:93)(1:82)|(2:84|85)(4:87|(1:89)(1:92)|90|91))))|97|76|(0)(0)|79|(0)|93|(0)(0))|(2:102|60)|61|62|(4:64|66|67|(3:69|71|(8:73|75|76|(0)(0)|79|(0)|93|(0)(0))))|97|76|(0)(0)|79|(0)|93|(0)(0))|118|45|46|47|(0)(0)|50|(0)|(11:(2:100|102)|61|62|(0)|97|76|(0)(0)|79|(0)|93|(0)(0))|60|61|62|(0)|97|76|(0)(0)|79|(0)|93|(0)(0)))))|27|29|31|32|33|(1:35)|121|38|39|40|(0)|118|45|46|47|(0)(0)|50|(0)|(0)|(0)|61|62|(0)|97|76|(0)(0)|79|(0)|93|(0)(0)|(1:(1:110))) */
    /* JADX WARN: Can't wrap try/catch for region: R(47:0|1|2|3|(1:5)|6|(5:7|8|9|10|11)|12|13|(1:15)(1:153)|16|17|18|(2:20|21)(1:(1:147)(1:(1:149)(1:150)))|22|(3:24|25|26)(1:(3:125|126|127)(2:128|(3:130|131|132)(2:133|(3:135|136|137)(29:(3:140|141|142)|139|31|32|33|(1:121)(1:37)|38|39|40|(20:42|(1:44)|45|46|47|(1:49)(1:103)|50|(1:52)|(13:54|(2:56|(1:58))|60|61|62|(3:66|67|(2:71|(6:75|76|(1:78)(1:94)|79|(1:93)(1:82)|(2:84|85)(4:87|(1:89)(1:92)|90|91))))|97|76|(0)(0)|79|(0)|93|(0)(0))|(2:102|60)|61|62|(4:64|66|67|(3:69|71|(8:73|75|76|(0)(0)|79|(0)|93|(0)(0))))|97|76|(0)(0)|79|(0)|93|(0)(0))|118|45|46|47|(0)(0)|50|(0)|(11:(2:100|102)|61|62|(0)|97|76|(0)(0)|79|(0)|93|(0)(0))|60|61|62|(0)|97|76|(0)(0)|79|(0)|93|(0)(0)))))|27|29|31|32|33|(1:35)|121|38|39|40|(0)|118|45|46|47|(0)(0)|50|(0)|(0)|(0)|61|62|(0)|97|76|(0)(0)|79|(0)|93|(0)(0)|(1:(1:110))) */
    /* JADX WARN: Can't wrap try/catch for region: R(51:0|1|2|3|(1:5)|6|7|8|9|10|11|12|13|(1:15)(1:153)|16|17|18|(2:20|21)(1:(1:147)(1:(1:149)(1:150)))|22|(3:24|25|26)(1:(3:125|126|127)(2:128|(3:130|131|132)(2:133|(3:135|136|137)(29:(3:140|141|142)|139|31|32|33|(1:121)(1:37)|38|39|40|(20:42|(1:44)|45|46|47|(1:49)(1:103)|50|(1:52)|(13:54|(2:56|(1:58))|60|61|62|(3:66|67|(2:71|(6:75|76|(1:78)(1:94)|79|(1:93)(1:82)|(2:84|85)(4:87|(1:89)(1:92)|90|91))))|97|76|(0)(0)|79|(0)|93|(0)(0))|(2:102|60)|61|62|(4:64|66|67|(3:69|71|(8:73|75|76|(0)(0)|79|(0)|93|(0)(0))))|97|76|(0)(0)|79|(0)|93|(0)(0))|118|45|46|47|(0)(0)|50|(0)|(11:(2:100|102)|61|62|(0)|97|76|(0)(0)|79|(0)|93|(0)(0))|60|61|62|(0)|97|76|(0)(0)|79|(0)|93|(0)(0)))))|27|29|31|32|33|(1:35)|121|38|39|40|(0)|118|45|46|47|(0)(0)|50|(0)|(0)|(0)|61|62|(0)|97|76|(0)(0)|79|(0)|93|(0)(0)|(1:(1:110))) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0297, code lost:
    
        if (r8.replace("-", r1).trim().length() > 4) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0299, code lost:
    
        r3 = java.lang.Integer.parseInt(r8) / 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x029f, code lost:
    
        r12 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02a8, code lost:
    
        r2 = r23.getString(flar2.devcheck.R.string.current) + " " + r12 + " mA";
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c2, code lost:
    
        r12 = java.lang.Integer.parseInt(r8);
        r2 = r23.getString(flar2.devcheck.R.string.current) + " " + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02a3, code lost:
    
        r3 = java.lang.Integer.parseInt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02a1, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x020f, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023c A[Catch: Exception -> 0x028a, TryCatch #2 {Exception -> 0x028a, blocks: (B:47:0x0226, B:49:0x0235, B:50:0x0240, B:52:0x024b, B:58:0x0255, B:60:0x025b, B:61:0x0264, B:103:0x023c), top: B:46:0x0226 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0206 A[Catch: Exception -> 0x020f, TryCatch #0 {Exception -> 0x020f, blocks: (B:40:0x01f4, B:42:0x0206, B:118:0x0212), top: B:39:0x01f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0235 A[Catch: Exception -> 0x028a, TryCatch #2 {Exception -> 0x028a, blocks: (B:47:0x0226, B:49:0x0235, B:50:0x0240, B:52:0x024b, B:58:0x0255, B:60:0x025b, B:61:0x0264, B:103:0x023c), top: B:46:0x0226 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x024b A[Catch: Exception -> 0x028a, TryCatch #2 {Exception -> 0x028a, blocks: (B:47:0x0226, B:49:0x0235, B:50:0x0240, B:52:0x024b, B:58:0x0255, B:60:0x025b, B:61:0x0264, B:103:0x023c), top: B:46:0x0226 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0353 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0338  */
    /* JADX WARN: Type inference failed for: r12v27, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void B(flar2.devcheck.tests.ChargingActivity r23, android.content.Intent r24) {
        /*
            Method dump skipped, instructions count: 953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: flar2.devcheck.tests.ChargingActivity.B(flar2.devcheck.tests.ChargingActivity, android.content.Intent):void");
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_charging);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.root);
        if (relativeLayout != null) {
            op0.a(relativeLayout, true, false, true, true, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        final int i = 1;
        r.j0(true);
        r().m0(getResources().getString(R.string.charging));
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true);
        this.J = typedValue.data;
        this.K = getColor(R.color.neutral);
        final int i2 = 0;
        final SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("testPrefs", 0);
        ImageView imageView = (ImageView) findViewById(R.id.big_icon);
        this.I = imageView;
        imageView.setImageDrawable(getDrawable(R.drawable.ic_big_charging));
        ((TextView) findViewById(R.id.isWorking)).setText(getString(R.string.is_it_charging));
        ((Button) findViewById(R.id.success)).setOnClickListener(new View.OnClickListener(this) { // from class: ip
            public final /* synthetic */ ChargingActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                ChargingActivity chargingActivity = this.h;
                switch (i3) {
                    case 0:
                        int i4 = ChargingActivity.M;
                        sharedPreferences2.edit().putBoolean(chargingActivity.getString(R.string.charging), true).commit();
                        chargingActivity.finish();
                        break;
                    default:
                        int i5 = ChargingActivity.M;
                        sharedPreferences2.edit().putBoolean(chargingActivity.getString(R.string.charging), false).commit();
                        chargingActivity.finish();
                        break;
                }
            }
        });
        ((Button) findViewById(R.id.fail)).setOnClickListener(new View.OnClickListener(this) { // from class: ip
            public final /* synthetic */ ChargingActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                ChargingActivity chargingActivity = this.h;
                switch (i3) {
                    case 0:
                        int i4 = ChargingActivity.M;
                        sharedPreferences2.edit().putBoolean(chargingActivity.getString(R.string.charging), true).commit();
                        chargingActivity.finish();
                        break;
                    default:
                        int i5 = ChargingActivity.M;
                        sharedPreferences2.edit().putBoolean(chargingActivity.getString(R.string.charging), false).commit();
                        chargingActivity.finish();
                        break;
                }
            }
        });
        rj rjVar = new rj((pj) ((MainApp) getApplication()).g.g, 0);
        n72 l = l();
        py0 h = h();
        l.getClass();
        gr grVar = new gr(l, rjVar, h);
        vq a2 = af1.a(sj.class);
        String b = a2.b();
        if (b != null) {
            ((sj) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).c().e(this, new nc(9, this));
        } else {
            c.m("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        super.onPause();
        unregisterReceiver(this.L);
        try {
            Timer timer = this.H;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        registerReceiver(this.L, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        Timer timer = new Timer();
        this.H = timer;
        timer.schedule(new af(2, this), 0L, 1000L);
    }
}
