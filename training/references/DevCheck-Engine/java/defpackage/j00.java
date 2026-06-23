package defpackage;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import flar2.devcheck.R;
import flar2.devcheck.sensors.JCZI.nyGJ;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import moe.shizuku.api.hYGD.yttXLrAeLjN;

/* loaded from: classes.dex */
public final class j00 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f456a;
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ th2 c;
    public final /* synthetic */ p00 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j00(p00 p00Var, Object obj, RecyclerView recyclerView, th2 th2Var, int i) {
        this.f456a = i;
        this.d = p00Var;
        this.e = obj;
        this.b = recyclerView;
        this.c = th2Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        String str;
        int i = this.f456a;
        Object obj = this.e;
        p00 p00Var = this.d;
        String str2 = "";
        switch (i) {
            case 0:
                Intent intent = (Intent) obj;
                ArrayList arrayList = new ArrayList();
                if (intent != null) {
                    try {
                        int intExtra = intent.getIntExtra("temperature", -1) / 10;
                        String str3 = et.f248a.d("prefFahrenheit") ? ((int) ((intExtra * 1.8d) + 32.0d)) + "°F" : intExtra + "°C";
                        int intExtra2 = intent.getIntExtra("plugged", -1);
                        if (intExtra2 == 1) {
                            str2 = p00Var.A(R.string.ac);
                        } else if (intExtra2 == 2) {
                            str2 = p00Var.A(R.string.usb);
                        } else if (intExtra2 == 4) {
                            str2 = p00Var.A(R.string.wireless);
                        }
                        int intExtra3 = intent.getIntExtra("status", -1);
                        String A = intExtra3 == 2 ? p00Var.A(R.string.charging) : intExtra3 == 3 ? p00Var.A(R.string.discharging) : intExtra3 == 5 ? p00Var.A(R.string.full) : intExtra3 == 4 ? p00Var.A(R.string.not_charging) : intExtra3 == 1 ? p00Var.A(R.string.unknown) : "NA";
                        arrayList.add(new hn0(14, p00Var.A(R.string.battery_level), ((int) ((intent.getIntExtra("level", -1) * 100.0f) / intent.getIntExtra("scale", -1))) + "%"));
                        arrayList.add(new hn0(14, p00Var.A(R.string.temperature), str3));
                        arrayList.add(new hn0(14, p00Var.A(R.string.status), A + " " + str2));
                        arrayList.add(new hn0(14, p00Var.A(R.string.technology), intent.getStringExtra("technology")));
                        int intExtra4 = intent.getIntExtra("health", -1);
                        arrayList.add(new hn0(14, p00Var.A(R.string.health), intExtra4 == 2 ? p00Var.A(R.string.good) : intExtra4 == 4 ? p00Var.A(R.string.dead) : intExtra4 == 7 ? p00Var.A(R.string.cold) : intExtra4 == 3 ? p00Var.A(R.string.overheat) : intExtra4 == 5 ? p00Var.A(R.string.over_voltage) : intExtra4 == 1 ? p00Var.A(R.string.unknown) : intExtra4 == 6 ? p00Var.A(R.string.unspecified_failure) : "NA"));
                        try {
                            DecimalFormat decimalFormat = new DecimalFormat("0.000");
                            float z = om0.z(p00Var.i0(), intent);
                            if (z > 3.0f && z < 6.0f) {
                                arrayList.add(new hn0(14, p00Var.A(R.string.voltage), decimalFormat.format(z) + " V"));
                            }
                        } catch (Exception unused) {
                        }
                        if (Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                            String K = uz1.K("/efs/FactoryApp/batt_cable_count");
                            if (!K.equals("NA") && !K.equals("EE")) {
                                arrayList.add(new hn0(14, p00Var.A(R.string.charger_connect_count), K));
                            }
                        }
                        String s = om0.s(p00Var.i0());
                        if (s != null) {
                            arrayList.add(new hn0(14, p00Var.A(R.string.battery_design_capacity), s));
                        }
                        if (uz1.q("/sys/kernel/fast_charge/force_fast_charge")) {
                            if (uz1.K("/sys/kernel/fast_charge/force_fast_charge").equals("1")) {
                                arrayList.add(new hn0(14, p00Var.A(R.string.usb_fastcharge), p00Var.A(R.string.enabled)));
                            } else {
                                arrayList.add(new hn0(14, p00Var.A(R.string.usb_fastcharge), p00Var.A(R.string.disabled)));
                            }
                        }
                    } catch (NullPointerException | Exception unused2) {
                    }
                }
                return arrayList;
            default:
                String str4 = bOxzFZXgEkjph.BWCghc;
                String str5 = qJTtDWNCVUDjB.WbzrE;
                ArrayList arrayList2 = new ArrayList();
                try {
                    arrayList2.add(new hn0(14, p00Var.A(R.string.android_version), (String) ((a61) obj).b));
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMMM d, yyyy");
                    try {
                        Date parse = simpleDateFormat.parse(Build.VERSION.SECURITY_PATCH);
                        if (parse != null) {
                            arrayList2.add(new hn0(14, p00Var.A(R.string.security_patch_level), simpleDateFormat2.format(parse)));
                        }
                    } catch (ParseException unused3) {
                    }
                    arrayList2.add(new hn0(14, p00Var.A(R.string.build), Build.DISPLAY));
                    try {
                        str = uz1.X(str4);
                    } catch (Exception unused4) {
                        str = "";
                    }
                    try {
                        if (!str.equals("")) {
                            String A2 = p00Var.A(R.string.rom_base);
                            try {
                                str2 = uz1.X(str4);
                            } catch (Exception unused5) {
                            }
                            arrayList2.add(new hn0(14, A2, str2));
                        }
                    } catch (NullPointerException unused6) {
                    }
                    try {
                        String str6 = Build.MANUFACTURER;
                        if (str6.toLowerCase().contains("oneplus")) {
                            String X = uz1.X("ro.rom.version");
                            if (X.trim().length() < 3) {
                                arrayList2.add(new hn0(14, "OxygenOS", uz1.X("ro.oxygen.version")));
                            } else {
                                arrayList2.add(new hn0(14, "OxygenOS", X));
                            }
                        } else if (str6.toLowerCase().contains("huawei")) {
                            String X2 = uz1.X("ro.build.version.emui");
                            if (X2 != null && X2.length() > 2) {
                                arrayList2.add(new hn0(14, "EMUI", X2.replace("_", " ").trim()));
                            }
                        } else if (str6.toLowerCase().contains("xiaomi") && !Build.MODEL.equalsIgnoreCase("tissot") && !Build.DEVICE.equalsIgnoreCase("tissot")) {
                            String X3 = uz1.X("ro.build.version.incremental");
                            if (X3 != null && X3.length() > 2) {
                                arrayList2.add(new hn0(14, yttXLrAeLjN.DlLItpKJSys, X3.trim()));
                            }
                        } else if (str6.toLowerCase().contains("samsung")) {
                            if (uz1.i0(p00Var.i0().getApplicationContext())) {
                                try {
                                    int i2 = Build.VERSION.class.getDeclaredField("SEM_PLATFORM_INT").getInt(null) - 90000;
                                    if (i2 > 0) {
                                        arrayList2.add(new hn0(14, "One UI " + p00Var.A(R.string.version), ((i2 / 10000) + "." + ((i2 % 10000) / 100)).trim()));
                                    }
                                } catch (Exception unused7) {
                                }
                            }
                            String X4 = uz1.X("ro.build.version.incremental");
                            if (X4 != null && X4.length() > 1) {
                                arrayList2.add(new hn0(14, p00Var.A(R.string.rom_base), X4.trim()));
                            }
                        }
                    } catch (NullPointerException | Exception unused8) {
                    }
                    try {
                        String K2 = uz1.K(nyGJ.FTVwzpezRoSMNU);
                        if (K2.equals("EE") || K2.equals("NA")) {
                            K2 = uz1.o("cat /proc/version");
                        }
                        if (K2.equals("EE") || K2.equals("NA") || K2.length() < 5) {
                            K2 = System.getProperty("os.version");
                        }
                        Matcher matcher = Pattern.compile("Linux version (\\S+) \\((\\S+?)\\) (\\(gcc.+? \\)) (#\\d+) (?:.*?)?((Sun|Mon|Tue|Wed|Thu|Fri|Sat).+)").matcher(K2);
                        if (matcher.matches() && matcher.groupCount() >= 4) {
                            K2 = matcher.group(1) + " " + matcher.group(4) + str5 + matcher.group(2) + str5 + matcher.group(3).substring(1, matcher.group(3).length() - 1) + str5 + matcher.group(5);
                        }
                        arrayList2.add(new hn0(14, p00Var.A(R.string.kernel), K2));
                    } catch (Exception unused9) {
                    }
                    try {
                        String[] strArr = Build.SUPPORTED_ABIS;
                        int length = strArr.length;
                        StringBuilder sb = null;
                        for (int i3 = 0; i3 < length; i3++) {
                            String str7 = strArr[i3];
                            if (sb == null) {
                                sb = str7 == null ? null : new StringBuilder(str7);
                            } else {
                                sb.append(" ");
                                sb.append(str7);
                            }
                        }
                        String property = System.getProperty("os.arch");
                        String str8 = property.contains("64") ? " (64-bit)" : " (32-bit)";
                        if (property.contains("64") || !sb.toString().contains("64")) {
                            arrayList2.add(new hn0(14, p00Var.A(R.string.architecture), property + str8));
                        } else {
                            arrayList2.add(new hn0(14, p00Var.A(R.string.architecture), " 64-bit"));
                        }
                        arrayList2.add(new hn0(14, p00Var.A(R.string.instruction_sets), sb != null ? sb.toString() : null));
                    } catch (NullPointerException unused10) {
                    }
                    try {
                        String X5 = uz1.X("ro.boot.slot_suffix");
                        if (X5 != null && X5.length() > 0) {
                            if (X5.equals("_b")) {
                                arrayList2.add(new hn0(14, p00Var.A(R.string.slot), "_b"));
                            } else if (X5.equals("_a")) {
                                arrayList2.add(new hn0(14, p00Var.A(R.string.slot), "_a"));
                            }
                        }
                    } catch (Exception unused11) {
                    }
                    if (uz1.e() || uz1.f()) {
                        arrayList2.add(new hn0(14, p00Var.A(R.string.root), p00Var.A(R.string.rooted)));
                        if (i51.b("prefRoot").booleanValue()) {
                            arrayList2.add(new hn0(14, p00Var.A(R.string.root_method), uz1.m("su -v").trim()));
                        }
                    }
                } catch (NullPointerException | Exception unused12) {
                }
                return arrayList2;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        int i = this.f456a;
        th2 th2Var = this.c;
        RecyclerView recyclerView = this.b;
        p00 p00Var = this.d;
        switch (i) {
            case 0:
                List list = (List) obj;
                if (p00Var.G()) {
                    try {
                        recyclerView.setAdapter(new l01(p00Var.g0(), list));
                        n3 n3Var = p00Var.r1;
                        if (n3Var != null && n3Var.isShowing()) {
                            p00Var.r1.dismiss();
                        }
                        n3 a2 = th2Var.a();
                        p00Var.r1 = a2;
                        a2.show();
                        p00.u0(p00Var);
                        p00Var.Y0.setRefreshing(false);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                List list2 = (List) obj;
                if (p00Var.G()) {
                    try {
                        recyclerView.setAdapter(new l01(p00Var.g0(), list2));
                        n3 n3Var2 = p00Var.r1;
                        if (n3Var2 != null && n3Var2.isShowing()) {
                            p00Var.r1.dismiss();
                        }
                        n3 a3 = th2Var.a();
                        p00Var.r1 = a3;
                        a3.show();
                        p00.u0(p00Var);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
        }
    }
}
