package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import com.google.android.material.bottomappbar.HaCM.QCeVODiUkb;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import flar2.devcheck.R;
import flar2.devcheck.permissionsSummary.xEua.bPnJ;
import java.text.DecimalFormat;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class am1 {
    public static final l0 l = new l0(13);
    public static final String[] m = {"samsung", "acceleration sensor", "barometer sensor", "accelerometer sensor", "proximity sensor", "light sensor", "accelerometer", "magnetic sensor", "gyroscope sensor", "proximity & light", "proximity", CDsMEtnUjndKau.qcq, "light", "magnetometer", "magnetic field sensor", "lux sensor", "als", "prox", "gravity", "pressure", "step detector", "step counter", "temperature", "humidity"};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f38a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Sensor j;
    public final boolean k;

    public am1(Context context, Sensor sensor) {
        String string;
        this.k = sensor.getStringType().contains("uncalibrated");
        this.c = sensor.getType();
        int type = sensor.getType();
        String str = bPnJ.zXI;
        switch (type) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                string = context.getString(R.string.accelerometer);
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                string = context.getString(R.string.magnetic_field);
                break;
            case 3:
                string = context.getString(R.string.orientation);
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                string = context.getString(R.string.gyroscope);
                break;
            case 5:
                string = context.getString(R.string.light);
                break;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                string = context.getString(R.string.pressure);
                break;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
            case 14:
            case 16:
            case rt0.p /* 17 */:
            default:
                string = str;
                break;
            case 8:
                string = context.getString(R.string.proximity);
                break;
            case rt0.o /* 9 */:
                string = context.getString(R.string.gravity);
                break;
            case 10:
                string = context.getString(R.string.linear_acceleration);
                break;
            case 11:
                string = context.getString(R.string.rotation_vector);
                break;
            case 12:
                string = context.getString(R.string.humidity);
                break;
            case 13:
                string = context.getString(R.string.temperature);
                break;
            case 15:
                string = context.getString(R.string.game_rotation_vector);
                break;
            case 18:
                string = context.getString(R.string.step_detector);
                break;
            case 19:
                string = context.getString(R.string.step_counter);
                break;
        }
        this.b = string;
        if (string.equals(str)) {
            String replace = sensor.getName().replace("SAMSUNG", "").replace("Samsung", "").replace("HTC", "");
            this.b = (replace.substring(0, 1).toUpperCase() + replace.substring(1)).trim();
            this.f38a = false;
        } else {
            this.f38a = true;
        }
        this.e = b(sensor);
        if (this.f38a) {
            this.d = a(sensor, false);
        } else {
            String stringType = sensor.getStringType();
            String trim = stringType.substring(stringType.lastIndexOf(46) + 1).trim();
            String str2 = trim.substring(0, 1).toUpperCase() + trim.substring(1);
            String str3 = QCeVODiUkb.Mfz;
            String replace2 = str2.replace(str3, " ");
            replace2 = replace2.length() < 4 ? trim.toUpperCase() : replace2;
            try {
                if (replace2.indexOf(str3) == replace2.length() - 1) {
                    replace2 = replace2.substring(0, replace2.length() - 1);
                }
            } catch (Exception unused) {
            }
            try {
                replace2 = replace2.replace(str3, " ");
            } catch (Exception unused2) {
            }
            this.d = replace2;
        }
        this.j = sensor;
        StringBuilder sb = new StringBuilder();
        l0 l0Var = l;
        this.h = d51.v((DecimalFormat) l0Var.get(), sensor.getPower(), sb, " mA");
        this.g = ((DecimalFormat) l0Var.get()).format(sensor.getResolution());
        this.f = ((DecimalFormat) l0Var.get()).format(sensor.getMaximumRange());
        if (sensor.isWakeUpSensor()) {
            this.i = context.getString(R.string.yes);
        } else {
            this.i = context.getString(R.string.no);
        }
    }

    public static String a(Sensor sensor, boolean z) {
        String str;
        String trim = b(sensor).trim();
        String trim2 = sensor.getName().trim();
        String lowerCase = trim2.toLowerCase();
        boolean matches = lowerCase.matches(".*[0-9].*");
        String str2 = null;
        String[] strArr = m;
        if (matches && lowerCase.matches(qJTtDWNCVUDjB.IdqtVAFy)) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = null;
                    break;
                }
                str = strArr[i];
                if (trim2.toLowerCase().contains(str)) {
                    break;
                }
                i++;
            }
            if (str != null) {
                trim2 = trim2.toLowerCase().replace(str, "");
                if (trim2.charAt(0) == '-') {
                    trim2 = trim2.substring(1);
                }
            }
            trim2 = trim2.toUpperCase();
        }
        if (trim.contains("Samsung") && trim2.toLowerCase().contains("samsung")) {
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                String str3 = strArr[i2];
                if (trim2.toLowerCase().contains(str3)) {
                    str2 = str3;
                    break;
                }
                i2++;
            }
            if (str2 != null) {
                trim2 = trim2.toLowerCase().replace(str2, "").trim();
            }
        }
        try {
            trim2 = trim2.replace(GFUHKHDfiFuPm.anndXIBFIcnKXw, " ");
        } catch (Exception unused) {
        }
        try {
            trim2 = trim2.replace("NON-WAKEUP", " ");
        } catch (Exception unused2) {
        }
        String str4 = trim2.substring(0, 1).toUpperCase() + trim2.substring(1);
        try {
            if (str4.indexOf("_") == str4.length() - 1) {
                str4 = str4.substring(0, str4.length() - 1);
            }
        } catch (Exception unused3) {
        }
        try {
            str4 = str4.replace("_", " ");
        } catch (Exception unused4) {
        }
        if (str4.toLowerCase().contains(trim.toLowerCase()) || z) {
            return str4;
        }
        return trim.trim() + " " + str4.trim();
    }

    public static String b(Sensor sensor) {
        String vendor = sensor.getVendor();
        if (vendor.equals("st") || vendor.equals("STMicroelectronics")) {
            vendor = "ST Microelectronics";
        }
        String str = vendor.substring(0, 1).toUpperCase() + vendor.substring(1);
        if (str.length() < 4) {
            str = str.toUpperCase();
        }
        if (str.equals("BOSCH")) {
            str = "Bosch";
        }
        if (str.equals("Ams AG")) {
            str = "AMS AG";
        }
        return str.replace(",", "").trim();
    }
}
