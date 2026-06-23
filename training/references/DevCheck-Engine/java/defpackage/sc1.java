package defpackage;

import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import flar2.devcheck.R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import moe.shizuku.api.hYGD.yttXLrAeLjN;

/* loaded from: classes.dex */
public abstract class sc1 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f928a = {"global", "soc", "family"};
    public static final HashSet b = new HashSet(Arrays.asList("apple", "asus", "fairphone", "google", "hisilicon", "honor", "htc", "huawei", "infinix", "lenovo", "lg", "mediatek", "motorola", YHJbtPFAANaPQ.yetDbsOsnOwturl, "nothing", "oneplus", "oppo", "qualcomm", GFUHKHDfiFuPm.ObueHRbjtXg, "realme", "redmi", "samsung", "sony", "spreadtrum", "tcl", "tecno", "unisoc", yttXLrAeLjN.zty, "xiaomi", "zte"));
    public static final String[] c = {"cpu", "memory", "disk", "gpu"};
    public static final int[] d = {R.string.benchmark_rankings_section_cpu, R.string.benchmark_rankings_section_memory, R.string.benchmark_rankings_section_disk, R.string.benchmark_rankings_section_gpu};

    public static String a(double d2) {
        return String.format(Locale.getDefault(), "%,.0f", Double.valueOf(Math.max(0.0d, d2)));
    }

    public static String b(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(32);
        if (indexOf <= 0 || indexOf == str.length() - 1) {
            return str;
        }
        return !b.contains(str.substring(0, indexOf).toLowerCase(Locale.ROOT)) ? str : str.substring(indexOf + 1).trim();
    }
}
