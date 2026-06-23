package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.chip.Chip;
import flar2.devcheck.AboutActivity;
import flar2.devcheck.FeedbackActivity;
import flar2.devcheck.MainActivity;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.sanity.SanityCheckActivity;
import flar2.devcheck.gputimes.GpuTimeActivity;
import flar2.devcheck.manifest.ManifestActivity;
import flar2.devcheck.networkMapper.NetworkMapperActivity;
import flar2.devcheck.systemGraphs.SystemGraphsActivity;
import flar2.devcheck.taskmgr2.TaskManager2Activity;
import flar2.devcheck.tests.EarpieceActivity;
import flar2.devcheck.tests.HeadsetActivity;
import flar2.devcheck.tests.MicActivity;
import flar2.devcheck.tests.ScreenActivity;
import flar2.devcheck.tests.SpeakersActivity;
import flar2.devcheck.tools.CPUActivity;
import flar2.devcheck.usage.NetworkUsageActivity;
import flar2.devcheck.widgets.barDetailWidget.BarDetailWidgetConfigureActivity;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Timer;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class tc implements View.OnClickListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ tc(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    public /* synthetic */ tc(r11 r11Var, String str) {
        this.g = 18;
        this.h = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BottomSheetBehavior bottomSheetBehavior;
        y91 y91Var;
        int i = this.g;
        String str = null;
        Object obj = this.h;
        switch (i) {
            case 0:
                int i2 = BarDetailWidgetConfigureActivity.T;
                uz1.q0((BarDetailWidgetConfigureActivity) obj);
                return;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((qg) obj).E0();
                return;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ((si) obj).u0();
                return;
            case 3:
                ((Chip) obj).callOnClick();
                return;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                al alVar = (al) obj;
                if (!alVar.h || (bottomSheetBehavior = alVar.c) == null) {
                    return;
                }
                bottomSheetBehavior.O(5);
                return;
            case 5:
                CPUActivity cPUActivity = (CPUActivity) obj;
                wm wmVar = cPUActivity.I;
                if (wmVar.f == null) {
                    wmVar.f = new qy0();
                    wmVar.d.execute(new vm(wmVar, 1));
                }
                wmVar.f.e(cPUActivity, new mm(cPUActivity, r6));
                return;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                dr drVar = (dr) obj;
                EditText editText = drVar.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (view.hasFocus()) {
                    drVar.i.requestFocus();
                }
                if (text != null) {
                    text.clear();
                }
                drVar.p();
                return;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                ((s60) obj).t();
                return;
            case 8:
                int i3 = EarpieceActivity.R;
                ((EarpieceActivity) obj).B();
                return;
            case rt0.o /* 9 */:
                FeedbackActivity feedbackActivity = (FeedbackActivity) obj;
                int i4 = FeedbackActivity.S;
                try {
                    String str2 = feedbackActivity.F.getText().toString() + "\n" + feedbackActivity.L.getText().toString() + "\n" + feedbackActivity.H.getText().toString() + "\n" + feedbackActivity.I.getText().toString() + "\n" + feedbackActivity.J.getText().toString() + "\n" + feedbackActivity.M.getText().toString() + "\n" + feedbackActivity.O.getText().toString() + "\n" + feedbackActivity.K.getText().toString() + "\n" + feedbackActivity.N.getText().toString() + "\n" + feedbackActivity.P.getText().toString() + "\n" + feedbackActivity.G.getText().toString() + "\n" + feedbackActivity.Q.getText().toString() + "\n\n" + feedbackActivity.R.getText().toString();
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{"elementalxcontact@gmail.com"});
                    intent.putExtra("android.intent.extra.SUBJECT", "DevCheck feedback");
                    intent.putExtra("android.intent.extra.TEXT", str2);
                    intent.setType("message/rfc822");
                    feedbackActivity.startActivity(intent);
                    return;
                } catch (Exception unused) {
                    Toast.makeText(feedbackActivity, feedbackActivity.getString(R.string.error), 0).show();
                    return;
                }
            case 10:
                int i5 = GpuTimeActivity.J;
                ((GpuTimeActivity) obj).finish();
                return;
            case 11:
                ei0 ei0Var = (ei0) obj;
                mi0 mi0Var = ei0Var.g0;
                if (mi0Var.k == null) {
                    mi0Var.k = new qy0();
                    mi0Var.d.execute(new gi0(mi0Var, 2));
                }
                mi0Var.k.e(ei0Var, new nc(13, ei0Var));
                return;
            case 12:
                int i6 = HeadsetActivity.S;
                ((HeadsetActivity) obj).C();
                return;
            case 13:
                ym0.v(((ci) ((gm2) obj).h).g0());
                return;
            case 14:
                MainActivity mainActivity = (MainActivity) obj;
                String str3 = MainActivity.U;
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) AboutActivity.class));
                return;
            case 15:
                ((ManifestActivity) obj).H.setText("");
                return;
            case 16:
                ((rv0) obj).A0();
                throw null;
            case rt0.p /* 17 */:
                MicActivity micActivity = (MicActivity) obj;
                od1 od1Var = micActivity.I;
                if (od1Var != null && od1Var.b) {
                    od1Var.b = false;
                    Timer timer = od1Var.f;
                    if (timer != null) {
                        timer.cancel();
                    }
                    micActivity.F.setImageResource(R.drawable.ic_big_mic_off);
                    micActivity.F.setImageTintList(ColorStateList.valueOf(micActivity.G));
                    return;
                }
                if (od1Var != null) {
                    od1Var.a();
                    micActivity.F.setImageResource(R.drawable.ic_big_mic);
                    micActivity.F.setImageTintList(ColorStateList.valueOf(micActivity.H));
                    return;
                } else {
                    micActivity.B();
                    od1 od1Var2 = micActivity.I;
                    if (od1Var2 != null) {
                        od1Var2.a();
                        return;
                    }
                    return;
                }
            case 18:
                Context context = view.getContext();
                String trim = ((String) obj).trim();
                if (trim.isEmpty()) {
                    Toast.makeText(context, R.string.unable_to_open_browser, 0).show();
                    return;
                }
                if (!trim.startsWith("http://") && !trim.startsWith("https://")) {
                    trim = "http://".concat(trim);
                }
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(trim));
                    intent2.addFlags(268435456);
                    context.startActivity(intent2);
                    return;
                } catch (Exception unused2) {
                    if (trim.startsWith("http://")) {
                        try {
                            Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://".concat(trim.substring(7))));
                            intent3.addFlags(268435456);
                            context.startActivity(intent3);
                            return;
                        } catch (Exception unused3) {
                            Toast.makeText(context, R.string.unable_to_open_browser, 0).show();
                            return;
                        }
                    }
                    Toast.makeText(context, R.string.unable_to_open_browser, 0).show();
                    return;
                }
            case 19:
                s11 s11Var = (s11) obj;
                EnumSet noneOf = EnumSet.noneOf(bp0.class);
                if (s11Var.u0.isChecked()) {
                    noneOf.add(bp0.h);
                }
                if (s11Var.v0.isChecked()) {
                    noneOf.add(bp0.l);
                }
                if (s11Var.w0.isChecked()) {
                    noneOf.add(bp0.m);
                    try {
                        noneOf.add(bp0.valueOf("TABLET"));
                    } catch (IllegalArgumentException unused4) {
                    }
                }
                if (s11Var.x0.isChecked()) {
                    noneOf.add(bp0.k);
                }
                if (s11Var.y0.isChecked()) {
                    noneOf.add(bp0.i);
                }
                if (s11Var.z0.isChecked()) {
                    noneOf.add(bp0.j);
                }
                if (s11Var.A0.isChecked()) {
                    noneOf.add(bp0.g);
                }
                if (noneOf.isEmpty()) {
                    noneOf = EnumSet.allOf(bp0.class);
                }
                e21 e21Var = s11Var.t0;
                e21Var.g.clear();
                e21Var.g.addAll(noneOf);
                if (e21Var.f != null) {
                    e21Var.r(e21Var.f);
                }
                Context v = s11Var.v();
                if (v == null) {
                    return;
                }
                Iterator it = noneOf.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    i7 |= 1 << ((bp0) it.next()).ordinal();
                }
                v.getSharedPreferences("network_mapper_prefs", 0).edit().putInt("device_filter_mask", i7).apply();
                return;
            case 20:
                NetworkMapperActivity networkMapperActivity = (NetworkMapperActivity) obj;
                int i8 = NetworkMapperActivity.j0;
                if (networkMapperActivity.C()) {
                    networkMapperActivity.F.w();
                    return;
                } else {
                    pr.R(networkMapperActivity, new String[]{"android.permission.ACCESS_WIFI_STATE", "android.permission.INTERNET", "android.permission.ACCESS_FINE_LOCATION"}, 1001);
                    return;
                }
            case 21:
                int i9 = NetworkUsageActivity.W;
                ((NetworkUsageActivity) obj).finish();
                return;
            case 22:
                p51 p51Var = (p51) obj;
                ApplicationInfo applicationInfo = p51Var.u0;
                try {
                    try {
                        Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent4.setData(Uri.parse("package:" + applicationInfo.packageName));
                        p51Var.s0(intent4);
                        return;
                    } catch (Exception unused5) {
                        p51Var.s0(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
                        return;
                    }
                } catch (Exception unused6) {
                    return;
                }
            case 23:
                c61 c61Var = (c61) obj;
                EditText editText2 = c61Var.f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = c61Var.f;
                r6 = (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) ? 0 : 1;
                EditText editText4 = c61Var.f;
                if (r6 != 0) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    c61Var.f.setSelection(selectionEnd);
                }
                c61Var.p();
                return;
            case 24:
                ha1 ha1Var = (ha1) obj;
                a5 t = ha1Var.t();
                if ((t instanceof TaskManager2Activity) && (y91Var = (y91) ((TaskManager2Activity) t).F.d.d()) != null) {
                    ArrayList arrayList = y91Var.f1220a;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            Object obj2 = arrayList.get(i10);
                            i10++;
                            u91 u91Var = ((v91) obj2).f1075a;
                            if (u91Var.f1026a == ha1Var.u0) {
                                String str4 = u91Var.b;
                                if (!str4.startsWith("uid:")) {
                                    str = str4;
                                }
                            }
                        }
                    }
                }
                if (str == null) {
                    Toast.makeText(ha1Var.i0(), "No package for this UID", 0).show();
                    return;
                }
                try {
                    try {
                        Intent intent5 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent5.setData(Uri.parse("package:" + str));
                        ha1Var.s0(intent5);
                        return;
                    } catch (Exception unused7) {
                        ha1Var.s0(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
                        return;
                    }
                } catch (Exception unused8) {
                    return;
                }
            case 25:
                int i11 = SanityCheckActivity.j;
                ((SanityCheckActivity) obj).a();
                return;
            case 26:
                ScreenActivity screenActivity = (ScreenActivity) obj;
                int i12 = screenActivity.J;
                int[] iArr = ScreenActivity.K;
                int i13 = i12 < 6 ? i12 + 1 : 6;
                if (i13 < 0 || i13 >= 7) {
                    return;
                }
                screenActivity.J = i13;
                int i14 = iArr[i13];
                screenActivity.G.setBackgroundColor(i14);
                screenActivity.getWindow().setNavigationBarColor(i14);
                TextView textView = screenActivity.I;
                if (i13 == 6) {
                    textView.setVisibility(0);
                    screenActivity.H.setVisibility(0);
                } else {
                    textView.setVisibility(4);
                    screenActivity.H.setVisibility(4);
                }
                if (i13 > 0) {
                    screenActivity.F.setVisibility(4);
                    return;
                }
                return;
            case 27:
                int i15 = SpeakersActivity.S;
                ((SpeakersActivity) obj).C();
                return;
            case 28:
                ae0 s = ((rp1) obj).g0().s();
                s.getClass();
                s.w(new zd0(s, -1, 0), false);
                return;
            default:
                int i16 = SystemGraphsActivity.G;
                ((SystemGraphsActivity) obj).finish();
                return;
        }
    }
}
