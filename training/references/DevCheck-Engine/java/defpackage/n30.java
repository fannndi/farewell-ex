package defpackage;

import Cwd.ynLVXgis;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;
import flar2.devcheck.nativebridge.xm.oWuW;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class n30 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f662a = new HashSet(Arrays.asList("samsung", "google", "oneplus", "xiaomi", "redmi", "poco", "motorola", "moto", bOxzFZXgEkjph.Oug, "iqoo", "realme", "oppo", "honor", "huawei", "nothing", "sony", "tecno", RIhTGWkqQvGL.UOKhq, "meizu", "nubia", "cubot", "itel", "lg", "lge", "blu", "acer"));
    public static final HashSet b = new HashSet(Arrays.asList("galaxy", "pixel", "oneplus", "redmi", "poco", "moto ", "moto-", "xperia", "iqoo", "note ", "note-", "nothing phone", oWuW.SDNhSlj, "hot ", " edge ", "y20", "y21", ynLVXgis.RSzmHjPAOxgR));
    public static final HashSet c = new HashSet(Arrays.asList("tab ", "tab-", "tab_", "pad ", "pad-", "pad_", oWuW.ziXOkMBSp));
    public static final HashSet d = new HashSet(Arrays.asList("tv", "range", "washer", "dryer", "fridge", "refrigerator", "ac ", "aircon", "thermostat", YHJbtPFAANaPQ.GLxSHAI, "bravia"));

    public static boolean a(String str, Set set) {
        if (str != null && !str.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (str.contains((String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
