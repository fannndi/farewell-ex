package defpackage;

import android.os.AsyncTask;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import android.util.DisplayMetrics;
import android.view.Display;
import androidx.core.widget.rsm.gXdyRQCGVlHW;
import androidx.recyclerview.widget.RecyclerView;
import com.pairip.VMRunner;
import flar2.devcheck.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class l00 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f561a;
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ld0 d;

    /* loaded from: classes4.dex */
    public abstract class c2020060317 extends AsyncTask {
        /* JADX WARN: Can't wrap try/catch for region: R(15:39|(3:40|41|42)|(11:(4:43|44|45|(6:46|47|48|49|50|51))|(31:112|113|(2:115|116)(1:138)|117|118|119|120|121|122|(1:124)(1:133)|125|126|127|128|129|58|59|60|61|(1:65)|67|(1:69)|71|72|(1:74)|75|(1:77)|78|(3:80|(2:82|(9:84|85|86|87|(8:89|90|91|92|93|94|95|97)|101|94|95|97)(1:103))(1:105)|104)|106|107)|71|72|(0)|75|(0)|78|(0)|106|107)|52|(3:143|144|(2:147|(1:153)))|54|55|57|58|59|60|61|(2:63|65)|67|(0)) */
        /* JADX WARN: Can't wrap try/catch for region: R(35:39|40|41|42|43|44|45|46|47|48|49|50|51|52|(3:143|144|(2:147|(1:153)))|54|55|(31:112|113|(2:115|116)(1:138)|117|118|119|120|121|122|(1:124)(1:133)|125|126|127|128|129|58|59|60|61|(1:65)|67|(1:69)|71|72|(1:74)|75|(1:77)|78|(3:80|(2:82|(9:84|85|86|87|(8:89|90|91|92|93|94|95|97)|101|94|95|97)(1:103))(1:105)|104)|106|107)|57|58|59|60|61|(2:63|65)|67|(0)|71|72|(0)|75|(0)|78|(0)|106|107) */
        /* JADX WARN: Removed duplicated region for block: B:112:0x022e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:143:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x034a A[Catch: Exception -> 0x0361, TryCatch #20 {Exception -> 0x0361, blocks: (B:61:0x0344, B:63:0x034a, B:65:0x0350), top: B:60:0x0344 }] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x036f A[Catch: Exception -> 0x03ce, TRY_LEAVE, TryCatch #1 {Exception -> 0x03ce, blocks: (B:59:0x0332, B:67:0x0361, B:69:0x036f), top: B:58:0x0332 }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x03e1 A[Catch: Exception -> 0x04d5, TryCatch #8 {Exception -> 0x04d5, blocks: (B:72:0x03ce, B:74:0x03e1, B:75:0x03ea, B:77:0x03ef, B:78:0x03f8, B:80:0x0435, B:82:0x0443, B:85:0x045a, B:95:0x0481), top: B:71:0x03ce }] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x03ef A[Catch: Exception -> 0x04d5, TryCatch #8 {Exception -> 0x04d5, blocks: (B:72:0x03ce, B:74:0x03e1, B:75:0x03ea, B:77:0x03ef, B:78:0x03f8, B:80:0x0435, B:82:0x0443, B:85:0x045a, B:95:0x0481), top: B:71:0x03ce }] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0435 A[Catch: Exception -> 0x04d5, TryCatch #8 {Exception -> 0x04d5, blocks: (B:72:0x03ce, B:74:0x03e1, B:75:0x03ea, B:77:0x03ef, B:78:0x03f8, B:80:0x0435, B:82:0x0443, B:85:0x045a, B:95:0x0481), top: B:71:0x03ce }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final java.lang.Object doInBackground(defpackage.l00 r37, java.lang.Object[] r38) {
            /*
                Method dump skipped, instructions count: 1668
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: l00.c2020060317.doInBackground(l00, java.lang.Object[]):java.lang.Object");
        }
    }

    public /* synthetic */ l00(p00 p00Var, RecyclerView recyclerView, th2 th2Var, int i) {
        this.f561a = i;
        this.d = p00Var;
        this.b = recyclerView;
        this.c = th2Var;
    }

    public l00(sn snVar, String str, RecyclerView recyclerView) {
        this.f561a = 4;
        this.d = snVar;
        this.c = str;
        this.b = recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(Object[] objArr) {
        p00 p00Var = (p00) this.d;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(new hn0(14, p00Var.A(R.string.gpu), i51.e("VENDOR") + " " + i51.e("RENDERER")));
            try {
                Integer g = c3.g();
                if (g != null) {
                    arrayList.add(new hn0(14, p00Var.A(R.string.max_frequency), g + " MHz"));
                }
            } catch (NullPointerException unused) {
            }
            Display defaultDisplay = p00Var.g0().getWindowManager().getDefaultDisplay();
            int physicalHeight = defaultDisplay.getSupportedModes()[0].getPhysicalHeight();
            int physicalWidth = defaultDisplay.getSupportedModes()[0].getPhysicalWidth();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (i < physicalWidth) {
                if (i2 > i) {
                    arrayList.add(new hn0(14, p00Var.A(R.string.resolution), physicalHeight + " x " + physicalWidth));
                } else {
                    arrayList.add(new hn0(14, p00Var.A(R.string.resolution), physicalWidth + " x " + physicalHeight));
                }
                if (i2 > i) {
                    arrayList.add(new hn0(14, p00Var.A(R.string.current_resolution), i2 + " x " + i));
                } else {
                    arrayList.add(new hn0(14, p00Var.A(R.string.current_resolution), i + " x " + i2));
                }
            } else if (i2 > i) {
                arrayList.add(new hn0(14, p00Var.A(R.string.resolution), i2 + " x " + i));
            } else {
                arrayList.add(new hn0(14, p00Var.A(R.string.resolution), i + " x " + i2));
            }
            int i3 = displayMetrics.densityDpi;
            int sqrt = (int) ((25.4d * Math.sqrt(Math.pow(i / displayMetrics.xdpi, 2.0d) + Math.pow(i2 / displayMetrics.ydpi, 2.0d))) + 0.5d);
            double round = Math.round(r8 * 100.0d) / 100.0d;
            float sqrt2 = ((float) Math.sqrt((i2 * i2) + (i * i))) / ((float) round);
            arrayList.add(new hn0(14, p00Var.A(R.string.screen_density), Math.round(sqrt2) + " ppi"));
            double d = sqrt2 / i3;
            String str = GFUHKHDfiFuPm.RmgdhInNbkQsjKV;
            if (d < 1.1d) {
                DecimalFormat decimalFormat = new DecimalFormat(str);
                arrayList.add(new hn0(14, p00Var.A(R.string.screen_size), decimalFormat.format(round) + gXdyRQCGVlHW.mfUCuMB + sqrt + " mm"));
            }
            double d2 = i2;
            double d3 = i;
            double d4 = d2 / d3;
            if (i2 < i) {
                d4 = d3 / d2;
            }
            try {
                String u = uz1.u(d4);
                if (!u.equals("NA")) {
                    arrayList.add(new hn0(14, p00Var.A(R.string.aspect_ratio), u));
                }
            } catch (Exception unused2) {
            }
            try {
                if (i51.b("prefRoot").booleanValue()) {
                    String trim = (i51.b("prefRoot").booleanValue() ? uz1.m("grep panel_name /sys/devices/virtual/graphics/fb0/msm_fb_panel_info") : uz1.o("grep panel_name /sys/devices/virtual/graphics/fb0/msm_fb_panel_info")).trim();
                    if (trim.contains("panel_name")) {
                        arrayList.add(new hn0(14, p00Var.A(R.string.panel), trim.substring(trim.indexOf("panel_name") + 11)));
                    }
                } else {
                    String trim2 = uz1.o("grep panel_name /sys/devices/virtual/graphics/fb0/msm_fb_panel_info").trim();
                    if (trim2.contains("panel_name")) {
                        arrayList.add(new hn0(14, p00Var.A(R.string.panel), trim2.substring(trim2.indexOf("panel_name") + 11)));
                    } else {
                        String X = uz1.X("sys.panel.display");
                        if (X != null && X.length() > 2) {
                            arrayList.add(new hn0(14, p00Var.A(R.string.panel), X));
                        }
                    }
                }
            } catch (Exception unused3) {
            }
            DecimalFormat decimalFormat2 = new DecimalFormat(str);
            arrayList.add(new hn0(14, p00Var.A(R.string.frame_rate), decimalFormat2.format(defaultDisplay.getRefreshRate()) + " Hz"));
        } catch (Exception unused4) {
        }
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:123:0x065d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0596 A[Catch: Exception -> 0x05e5, AssertionError | Exception -> 0x08cd, TRY_LEAVE, TryCatch #13 {AssertionError | Exception -> 0x08cd, blocks: (B:3:0x003d, B:5:0x0043, B:12:0x00a2, B:16:0x00b6, B:18:0x00ca, B:24:0x00f1, B:29:0x00ff, B:32:0x0116, B:32:0x0116, B:34:0x013f, B:34:0x013f, B:36:0x0156, B:36:0x0156, B:37:0x016c, B:37:0x016c, B:39:0x0172, B:39:0x0172, B:42:0x019c, B:42:0x019c, B:43:0x0203, B:43:0x0203, B:46:0x0220, B:46:0x0220, B:50:0x0253, B:50:0x0253, B:61:0x02b7, B:61:0x02b7, B:62:0x02e2, B:62:0x02e2, B:63:0x030e, B:63:0x030e, B:64:0x033a, B:64:0x033a, B:65:0x0365, B:65:0x0365, B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e, B:74:0x041e, B:77:0x042c, B:79:0x042f, B:84:0x044c, B:86:0x0452, B:89:0x0463, B:90:0x0493, B:92:0x04a2, B:92:0x04a2, B:94:0x04b3, B:96:0x04e3, B:98:0x04fc, B:99:0x050f, B:102:0x0520, B:105:0x058e, B:107:0x0596, B:110:0x05be, B:111:0x05e7, B:111:0x05e7, B:113:0x05ef, B:113:0x05ef, B:114:0x0626, B:114:0x0626, B:116:0x0631, B:118:0x0642, B:217:0x0650, B:121:0x065d, B:126:0x0665, B:128:0x0672, B:130:0x0677, B:131:0x0684, B:133:0x0691, B:135:0x0699, B:137:0x06a6, B:139:0x06ab, B:140:0x06b8, B:142:0x06c5, B:144:0x06cf, B:146:0x06d3, B:148:0x06e2, B:148:0x06e2, B:150:0x06f3, B:150:0x06f3, B:151:0x070e, B:151:0x070e, B:153:0x071f, B:153:0x071f, B:156:0x073d, B:159:0x075c, B:162:0x077b, B:165:0x079a, B:167:0x07b9, B:170:0x07d8, B:171:0x07f9, B:171:0x07f9, B:173:0x0801, B:173:0x0801, B:175:0x080d, B:175:0x080d, B:176:0x0823, B:176:0x0823, B:178:0x0836, B:180:0x0840, B:182:0x0844, B:186:0x0850, B:202:0x0864, B:187:0x0874, B:187:0x0874, B:190:0x0885, B:190:0x0885, B:192:0x0894, B:192:0x0894, B:195:0x08a4, B:195:0x08a4, B:198:0x08b4, B:198:0x08b4, B:199:0x08c1, B:199:0x08c1, B:212:0x072e, B:212:0x072e, B:213:0x0701, B:213:0x0701, B:239:0x01e2, B:239:0x01e2, B:243:0x0162, B:243:0x0162, B:247:0x007f, B:249:0x0092), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05ef A[Catch: AssertionError | Exception -> 0x08cd, AssertionError | Exception -> 0x08cd, TryCatch #13 {AssertionError | Exception -> 0x08cd, blocks: (B:3:0x003d, B:5:0x0043, B:12:0x00a2, B:16:0x00b6, B:18:0x00ca, B:24:0x00f1, B:29:0x00ff, B:32:0x0116, B:32:0x0116, B:34:0x013f, B:34:0x013f, B:36:0x0156, B:36:0x0156, B:37:0x016c, B:37:0x016c, B:39:0x0172, B:39:0x0172, B:42:0x019c, B:42:0x019c, B:43:0x0203, B:43:0x0203, B:46:0x0220, B:46:0x0220, B:50:0x0253, B:50:0x0253, B:61:0x02b7, B:61:0x02b7, B:62:0x02e2, B:62:0x02e2, B:63:0x030e, B:63:0x030e, B:64:0x033a, B:64:0x033a, B:65:0x0365, B:65:0x0365, B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e, B:74:0x041e, B:77:0x042c, B:79:0x042f, B:84:0x044c, B:86:0x0452, B:89:0x0463, B:90:0x0493, B:92:0x04a2, B:92:0x04a2, B:94:0x04b3, B:96:0x04e3, B:98:0x04fc, B:99:0x050f, B:102:0x0520, B:105:0x058e, B:107:0x0596, B:110:0x05be, B:111:0x05e7, B:111:0x05e7, B:113:0x05ef, B:113:0x05ef, B:114:0x0626, B:114:0x0626, B:116:0x0631, B:118:0x0642, B:217:0x0650, B:121:0x065d, B:126:0x0665, B:128:0x0672, B:130:0x0677, B:131:0x0684, B:133:0x0691, B:135:0x0699, B:137:0x06a6, B:139:0x06ab, B:140:0x06b8, B:142:0x06c5, B:144:0x06cf, B:146:0x06d3, B:148:0x06e2, B:148:0x06e2, B:150:0x06f3, B:150:0x06f3, B:151:0x070e, B:151:0x070e, B:153:0x071f, B:153:0x071f, B:156:0x073d, B:159:0x075c, B:162:0x077b, B:165:0x079a, B:167:0x07b9, B:170:0x07d8, B:171:0x07f9, B:171:0x07f9, B:173:0x0801, B:173:0x0801, B:175:0x080d, B:175:0x080d, B:176:0x0823, B:176:0x0823, B:178:0x0836, B:180:0x0840, B:182:0x0844, B:186:0x0850, B:202:0x0864, B:187:0x0874, B:187:0x0874, B:190:0x0885, B:190:0x0885, B:192:0x0894, B:192:0x0894, B:195:0x08a4, B:195:0x08a4, B:198:0x08b4, B:198:0x08b4, B:199:0x08c1, B:199:0x08c1, B:212:0x072e, B:212:0x072e, B:213:0x0701, B:213:0x0701, B:239:0x01e2, B:239:0x01e2, B:243:0x0162, B:243:0x0162, B:247:0x007f, B:249:0x0092), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0642 A[Catch: Exception -> 0x065d, AssertionError | Exception -> 0x08cd, TryCatch #6 {Exception -> 0x065d, blocks: (B:116:0x0631, B:118:0x0642, B:217:0x0650), top: B:115:0x0631 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0665 A[Catch: Exception -> 0x0691, AssertionError | Exception -> 0x08cd, TryCatch #3 {Exception -> 0x0691, blocks: (B:121:0x065d, B:126:0x0665, B:128:0x0672, B:130:0x0677, B:131:0x0684), top: B:120:0x065d }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0699 A[Catch: Exception -> 0x06c5, AssertionError | Exception -> 0x08cd, TryCatch #13 {AssertionError | Exception -> 0x08cd, blocks: (B:3:0x003d, B:5:0x0043, B:12:0x00a2, B:16:0x00b6, B:18:0x00ca, B:24:0x00f1, B:29:0x00ff, B:32:0x0116, B:32:0x0116, B:34:0x013f, B:34:0x013f, B:36:0x0156, B:36:0x0156, B:37:0x016c, B:37:0x016c, B:39:0x0172, B:39:0x0172, B:42:0x019c, B:42:0x019c, B:43:0x0203, B:43:0x0203, B:46:0x0220, B:46:0x0220, B:50:0x0253, B:50:0x0253, B:61:0x02b7, B:61:0x02b7, B:62:0x02e2, B:62:0x02e2, B:63:0x030e, B:63:0x030e, B:64:0x033a, B:64:0x033a, B:65:0x0365, B:65:0x0365, B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e, B:74:0x041e, B:77:0x042c, B:79:0x042f, B:84:0x044c, B:86:0x0452, B:89:0x0463, B:90:0x0493, B:92:0x04a2, B:92:0x04a2, B:94:0x04b3, B:96:0x04e3, B:98:0x04fc, B:99:0x050f, B:102:0x0520, B:105:0x058e, B:107:0x0596, B:110:0x05be, B:111:0x05e7, B:111:0x05e7, B:113:0x05ef, B:113:0x05ef, B:114:0x0626, B:114:0x0626, B:116:0x0631, B:118:0x0642, B:217:0x0650, B:121:0x065d, B:126:0x0665, B:128:0x0672, B:130:0x0677, B:131:0x0684, B:133:0x0691, B:135:0x0699, B:137:0x06a6, B:139:0x06ab, B:140:0x06b8, B:142:0x06c5, B:144:0x06cf, B:146:0x06d3, B:148:0x06e2, B:148:0x06e2, B:150:0x06f3, B:150:0x06f3, B:151:0x070e, B:151:0x070e, B:153:0x071f, B:153:0x071f, B:156:0x073d, B:159:0x075c, B:162:0x077b, B:165:0x079a, B:167:0x07b9, B:170:0x07d8, B:171:0x07f9, B:171:0x07f9, B:173:0x0801, B:173:0x0801, B:175:0x080d, B:175:0x080d, B:176:0x0823, B:176:0x0823, B:178:0x0836, B:180:0x0840, B:182:0x0844, B:186:0x0850, B:202:0x0864, B:187:0x0874, B:187:0x0874, B:190:0x0885, B:190:0x0885, B:192:0x0894, B:192:0x0894, B:195:0x08a4, B:195:0x08a4, B:198:0x08b4, B:198:0x08b4, B:199:0x08c1, B:199:0x08c1, B:212:0x072e, B:212:0x072e, B:213:0x0701, B:213:0x0701, B:239:0x01e2, B:239:0x01e2, B:243:0x0162, B:243:0x0162, B:247:0x007f, B:249:0x0092), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x06cf A[Catch: Exception -> 0x06e2, AssertionError | Exception -> 0x08cd, TryCatch #13 {AssertionError | Exception -> 0x08cd, blocks: (B:3:0x003d, B:5:0x0043, B:12:0x00a2, B:16:0x00b6, B:18:0x00ca, B:24:0x00f1, B:29:0x00ff, B:32:0x0116, B:32:0x0116, B:34:0x013f, B:34:0x013f, B:36:0x0156, B:36:0x0156, B:37:0x016c, B:37:0x016c, B:39:0x0172, B:39:0x0172, B:42:0x019c, B:42:0x019c, B:43:0x0203, B:43:0x0203, B:46:0x0220, B:46:0x0220, B:50:0x0253, B:50:0x0253, B:61:0x02b7, B:61:0x02b7, B:62:0x02e2, B:62:0x02e2, B:63:0x030e, B:63:0x030e, B:64:0x033a, B:64:0x033a, B:65:0x0365, B:65:0x0365, B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e, B:74:0x041e, B:77:0x042c, B:79:0x042f, B:84:0x044c, B:86:0x0452, B:89:0x0463, B:90:0x0493, B:92:0x04a2, B:92:0x04a2, B:94:0x04b3, B:96:0x04e3, B:98:0x04fc, B:99:0x050f, B:102:0x0520, B:105:0x058e, B:107:0x0596, B:110:0x05be, B:111:0x05e7, B:111:0x05e7, B:113:0x05ef, B:113:0x05ef, B:114:0x0626, B:114:0x0626, B:116:0x0631, B:118:0x0642, B:217:0x0650, B:121:0x065d, B:126:0x0665, B:128:0x0672, B:130:0x0677, B:131:0x0684, B:133:0x0691, B:135:0x0699, B:137:0x06a6, B:139:0x06ab, B:140:0x06b8, B:142:0x06c5, B:144:0x06cf, B:146:0x06d3, B:148:0x06e2, B:148:0x06e2, B:150:0x06f3, B:150:0x06f3, B:151:0x070e, B:151:0x070e, B:153:0x071f, B:153:0x071f, B:156:0x073d, B:159:0x075c, B:162:0x077b, B:165:0x079a, B:167:0x07b9, B:170:0x07d8, B:171:0x07f9, B:171:0x07f9, B:173:0x0801, B:173:0x0801, B:175:0x080d, B:175:0x080d, B:176:0x0823, B:176:0x0823, B:178:0x0836, B:180:0x0840, B:182:0x0844, B:186:0x0850, B:202:0x0864, B:187:0x0874, B:187:0x0874, B:190:0x0885, B:190:0x0885, B:192:0x0894, B:192:0x0894, B:195:0x08a4, B:195:0x08a4, B:198:0x08b4, B:198:0x08b4, B:199:0x08c1, B:199:0x08c1, B:212:0x072e, B:212:0x072e, B:213:0x0701, B:213:0x0701, B:239:0x01e2, B:239:0x01e2, B:243:0x0162, B:243:0x0162, B:247:0x007f, B:249:0x0092), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x06f3 A[Catch: AssertionError | Exception -> 0x08cd, AssertionError | Exception -> 0x08cd, TryCatch #13 {AssertionError | Exception -> 0x08cd, blocks: (B:3:0x003d, B:5:0x0043, B:12:0x00a2, B:16:0x00b6, B:18:0x00ca, B:24:0x00f1, B:29:0x00ff, B:32:0x0116, B:32:0x0116, B:34:0x013f, B:34:0x013f, B:36:0x0156, B:36:0x0156, B:37:0x016c, B:37:0x016c, B:39:0x0172, B:39:0x0172, B:42:0x019c, B:42:0x019c, B:43:0x0203, B:43:0x0203, B:46:0x0220, B:46:0x0220, B:50:0x0253, B:50:0x0253, B:61:0x02b7, B:61:0x02b7, B:62:0x02e2, B:62:0x02e2, B:63:0x030e, B:63:0x030e, B:64:0x033a, B:64:0x033a, B:65:0x0365, B:65:0x0365, B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e, B:74:0x041e, B:77:0x042c, B:79:0x042f, B:84:0x044c, B:86:0x0452, B:89:0x0463, B:90:0x0493, B:92:0x04a2, B:92:0x04a2, B:94:0x04b3, B:96:0x04e3, B:98:0x04fc, B:99:0x050f, B:102:0x0520, B:105:0x058e, B:107:0x0596, B:110:0x05be, B:111:0x05e7, B:111:0x05e7, B:113:0x05ef, B:113:0x05ef, B:114:0x0626, B:114:0x0626, B:116:0x0631, B:118:0x0642, B:217:0x0650, B:121:0x065d, B:126:0x0665, B:128:0x0672, B:130:0x0677, B:131:0x0684, B:133:0x0691, B:135:0x0699, B:137:0x06a6, B:139:0x06ab, B:140:0x06b8, B:142:0x06c5, B:144:0x06cf, B:146:0x06d3, B:148:0x06e2, B:148:0x06e2, B:150:0x06f3, B:150:0x06f3, B:151:0x070e, B:151:0x070e, B:153:0x071f, B:153:0x071f, B:156:0x073d, B:159:0x075c, B:162:0x077b, B:165:0x079a, B:167:0x07b9, B:170:0x07d8, B:171:0x07f9, B:171:0x07f9, B:173:0x0801, B:173:0x0801, B:175:0x080d, B:175:0x080d, B:176:0x0823, B:176:0x0823, B:178:0x0836, B:180:0x0840, B:182:0x0844, B:186:0x0850, B:202:0x0864, B:187:0x0874, B:187:0x0874, B:190:0x0885, B:190:0x0885, B:192:0x0894, B:192:0x0894, B:195:0x08a4, B:195:0x08a4, B:198:0x08b4, B:198:0x08b4, B:199:0x08c1, B:199:0x08c1, B:212:0x072e, B:212:0x072e, B:213:0x0701, B:213:0x0701, B:239:0x01e2, B:239:0x01e2, B:243:0x0162, B:243:0x0162, B:247:0x007f, B:249:0x0092), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x071f A[Catch: AssertionError | Exception -> 0x08cd, AssertionError | Exception -> 0x08cd, TryCatch #13 {AssertionError | Exception -> 0x08cd, blocks: (B:3:0x003d, B:5:0x0043, B:12:0x00a2, B:16:0x00b6, B:18:0x00ca, B:24:0x00f1, B:29:0x00ff, B:32:0x0116, B:32:0x0116, B:34:0x013f, B:34:0x013f, B:36:0x0156, B:36:0x0156, B:37:0x016c, B:37:0x016c, B:39:0x0172, B:39:0x0172, B:42:0x019c, B:42:0x019c, B:43:0x0203, B:43:0x0203, B:46:0x0220, B:46:0x0220, B:50:0x0253, B:50:0x0253, B:61:0x02b7, B:61:0x02b7, B:62:0x02e2, B:62:0x02e2, B:63:0x030e, B:63:0x030e, B:64:0x033a, B:64:0x033a, B:65:0x0365, B:65:0x0365, B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e, B:74:0x041e, B:77:0x042c, B:79:0x042f, B:84:0x044c, B:86:0x0452, B:89:0x0463, B:90:0x0493, B:92:0x04a2, B:92:0x04a2, B:94:0x04b3, B:96:0x04e3, B:98:0x04fc, B:99:0x050f, B:102:0x0520, B:105:0x058e, B:107:0x0596, B:110:0x05be, B:111:0x05e7, B:111:0x05e7, B:113:0x05ef, B:113:0x05ef, B:114:0x0626, B:114:0x0626, B:116:0x0631, B:118:0x0642, B:217:0x0650, B:121:0x065d, B:126:0x0665, B:128:0x0672, B:130:0x0677, B:131:0x0684, B:133:0x0691, B:135:0x0699, B:137:0x06a6, B:139:0x06ab, B:140:0x06b8, B:142:0x06c5, B:144:0x06cf, B:146:0x06d3, B:148:0x06e2, B:148:0x06e2, B:150:0x06f3, B:150:0x06f3, B:151:0x070e, B:151:0x070e, B:153:0x071f, B:153:0x071f, B:156:0x073d, B:159:0x075c, B:162:0x077b, B:165:0x079a, B:167:0x07b9, B:170:0x07d8, B:171:0x07f9, B:171:0x07f9, B:173:0x0801, B:173:0x0801, B:175:0x080d, B:175:0x080d, B:176:0x0823, B:176:0x0823, B:178:0x0836, B:180:0x0840, B:182:0x0844, B:186:0x0850, B:202:0x0864, B:187:0x0874, B:187:0x0874, B:190:0x0885, B:190:0x0885, B:192:0x0894, B:192:0x0894, B:195:0x08a4, B:195:0x08a4, B:198:0x08b4, B:198:0x08b4, B:199:0x08c1, B:199:0x08c1, B:212:0x072e, B:212:0x072e, B:213:0x0701, B:213:0x0701, B:239:0x01e2, B:239:0x01e2, B:243:0x0162, B:243:0x0162, B:247:0x007f, B:249:0x0092), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0801 A[Catch: AssertionError | Exception -> 0x08cd, AssertionError | Exception -> 0x08cd, TryCatch #13 {AssertionError | Exception -> 0x08cd, blocks: (B:3:0x003d, B:5:0x0043, B:12:0x00a2, B:16:0x00b6, B:18:0x00ca, B:24:0x00f1, B:29:0x00ff, B:32:0x0116, B:32:0x0116, B:34:0x013f, B:34:0x013f, B:36:0x0156, B:36:0x0156, B:37:0x016c, B:37:0x016c, B:39:0x0172, B:39:0x0172, B:42:0x019c, B:42:0x019c, B:43:0x0203, B:43:0x0203, B:46:0x0220, B:46:0x0220, B:50:0x0253, B:50:0x0253, B:61:0x02b7, B:61:0x02b7, B:62:0x02e2, B:62:0x02e2, B:63:0x030e, B:63:0x030e, B:64:0x033a, B:64:0x033a, B:65:0x0365, B:65:0x0365, B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e, B:74:0x041e, B:77:0x042c, B:79:0x042f, B:84:0x044c, B:86:0x0452, B:89:0x0463, B:90:0x0493, B:92:0x04a2, B:92:0x04a2, B:94:0x04b3, B:96:0x04e3, B:98:0x04fc, B:99:0x050f, B:102:0x0520, B:105:0x058e, B:107:0x0596, B:110:0x05be, B:111:0x05e7, B:111:0x05e7, B:113:0x05ef, B:113:0x05ef, B:114:0x0626, B:114:0x0626, B:116:0x0631, B:118:0x0642, B:217:0x0650, B:121:0x065d, B:126:0x0665, B:128:0x0672, B:130:0x0677, B:131:0x0684, B:133:0x0691, B:135:0x0699, B:137:0x06a6, B:139:0x06ab, B:140:0x06b8, B:142:0x06c5, B:144:0x06cf, B:146:0x06d3, B:148:0x06e2, B:148:0x06e2, B:150:0x06f3, B:150:0x06f3, B:151:0x070e, B:151:0x070e, B:153:0x071f, B:153:0x071f, B:156:0x073d, B:159:0x075c, B:162:0x077b, B:165:0x079a, B:167:0x07b9, B:170:0x07d8, B:171:0x07f9, B:171:0x07f9, B:173:0x0801, B:173:0x0801, B:175:0x080d, B:175:0x080d, B:176:0x0823, B:176:0x0823, B:178:0x0836, B:180:0x0840, B:182:0x0844, B:186:0x0850, B:202:0x0864, B:187:0x0874, B:187:0x0874, B:190:0x0885, B:190:0x0885, B:192:0x0894, B:192:0x0894, B:195:0x08a4, B:195:0x08a4, B:198:0x08b4, B:198:0x08b4, B:199:0x08c1, B:199:0x08c1, B:212:0x072e, B:212:0x072e, B:213:0x0701, B:213:0x0701, B:239:0x01e2, B:239:0x01e2, B:243:0x0162, B:243:0x0162, B:247:0x007f, B:249:0x0092), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0840 A[Catch: Exception -> 0x0874, AssertionError | Exception -> 0x08cd, TryCatch #2 {Exception -> 0x0874, blocks: (B:178:0x0836, B:180:0x0840, B:182:0x0844, B:186:0x0850, B:202:0x0864), top: B:177:0x0836 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0850 A[Catch: Exception -> 0x0874, AssertionError | Exception -> 0x08cd, TryCatch #2 {Exception -> 0x0874, blocks: (B:178:0x0836, B:180:0x0840, B:182:0x0844, B:186:0x0850, B:202:0x0864), top: B:177:0x0836 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0885 A[Catch: AssertionError | Exception -> 0x08cd, AssertionError | Exception -> 0x08cd, TRY_ENTER, TryCatch #13 {AssertionError | Exception -> 0x08cd, blocks: (B:3:0x003d, B:5:0x0043, B:12:0x00a2, B:16:0x00b6, B:18:0x00ca, B:24:0x00f1, B:29:0x00ff, B:32:0x0116, B:32:0x0116, B:34:0x013f, B:34:0x013f, B:36:0x0156, B:36:0x0156, B:37:0x016c, B:37:0x016c, B:39:0x0172, B:39:0x0172, B:42:0x019c, B:42:0x019c, B:43:0x0203, B:43:0x0203, B:46:0x0220, B:46:0x0220, B:50:0x0253, B:50:0x0253, B:61:0x02b7, B:61:0x02b7, B:62:0x02e2, B:62:0x02e2, B:63:0x030e, B:63:0x030e, B:64:0x033a, B:64:0x033a, B:65:0x0365, B:65:0x0365, B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e, B:74:0x041e, B:77:0x042c, B:79:0x042f, B:84:0x044c, B:86:0x0452, B:89:0x0463, B:90:0x0493, B:92:0x04a2, B:92:0x04a2, B:94:0x04b3, B:96:0x04e3, B:98:0x04fc, B:99:0x050f, B:102:0x0520, B:105:0x058e, B:107:0x0596, B:110:0x05be, B:111:0x05e7, B:111:0x05e7, B:113:0x05ef, B:113:0x05ef, B:114:0x0626, B:114:0x0626, B:116:0x0631, B:118:0x0642, B:217:0x0650, B:121:0x065d, B:126:0x0665, B:128:0x0672, B:130:0x0677, B:131:0x0684, B:133:0x0691, B:135:0x0699, B:137:0x06a6, B:139:0x06ab, B:140:0x06b8, B:142:0x06c5, B:144:0x06cf, B:146:0x06d3, B:148:0x06e2, B:148:0x06e2, B:150:0x06f3, B:150:0x06f3, B:151:0x070e, B:151:0x070e, B:153:0x071f, B:153:0x071f, B:156:0x073d, B:159:0x075c, B:162:0x077b, B:165:0x079a, B:167:0x07b9, B:170:0x07d8, B:171:0x07f9, B:171:0x07f9, B:173:0x0801, B:173:0x0801, B:175:0x080d, B:175:0x080d, B:176:0x0823, B:176:0x0823, B:178:0x0836, B:180:0x0840, B:182:0x0844, B:186:0x0850, B:202:0x0864, B:187:0x0874, B:187:0x0874, B:190:0x0885, B:190:0x0885, B:192:0x0894, B:192:0x0894, B:195:0x08a4, B:195:0x08a4, B:198:0x08b4, B:198:0x08b4, B:199:0x08c1, B:199:0x08c1, B:212:0x072e, B:212:0x072e, B:213:0x0701, B:213:0x0701, B:239:0x01e2, B:239:0x01e2, B:243:0x0162, B:243:0x0162, B:247:0x007f, B:249:0x0092), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x072e A[Catch: AssertionError | Exception -> 0x08cd, AssertionError | Exception -> 0x08cd, TRY_LEAVE, TryCatch #13 {AssertionError | Exception -> 0x08cd, blocks: (B:3:0x003d, B:5:0x0043, B:12:0x00a2, B:16:0x00b6, B:18:0x00ca, B:24:0x00f1, B:29:0x00ff, B:32:0x0116, B:32:0x0116, B:34:0x013f, B:34:0x013f, B:36:0x0156, B:36:0x0156, B:37:0x016c, B:37:0x016c, B:39:0x0172, B:39:0x0172, B:42:0x019c, B:42:0x019c, B:43:0x0203, B:43:0x0203, B:46:0x0220, B:46:0x0220, B:50:0x0253, B:50:0x0253, B:61:0x02b7, B:61:0x02b7, B:62:0x02e2, B:62:0x02e2, B:63:0x030e, B:63:0x030e, B:64:0x033a, B:64:0x033a, B:65:0x0365, B:65:0x0365, B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e, B:74:0x041e, B:77:0x042c, B:79:0x042f, B:84:0x044c, B:86:0x0452, B:89:0x0463, B:90:0x0493, B:92:0x04a2, B:92:0x04a2, B:94:0x04b3, B:96:0x04e3, B:98:0x04fc, B:99:0x050f, B:102:0x0520, B:105:0x058e, B:107:0x0596, B:110:0x05be, B:111:0x05e7, B:111:0x05e7, B:113:0x05ef, B:113:0x05ef, B:114:0x0626, B:114:0x0626, B:116:0x0631, B:118:0x0642, B:217:0x0650, B:121:0x065d, B:126:0x0665, B:128:0x0672, B:130:0x0677, B:131:0x0684, B:133:0x0691, B:135:0x0699, B:137:0x06a6, B:139:0x06ab, B:140:0x06b8, B:142:0x06c5, B:144:0x06cf, B:146:0x06d3, B:148:0x06e2, B:148:0x06e2, B:150:0x06f3, B:150:0x06f3, B:151:0x070e, B:151:0x070e, B:153:0x071f, B:153:0x071f, B:156:0x073d, B:159:0x075c, B:162:0x077b, B:165:0x079a, B:167:0x07b9, B:170:0x07d8, B:171:0x07f9, B:171:0x07f9, B:173:0x0801, B:173:0x0801, B:175:0x080d, B:175:0x080d, B:176:0x0823, B:176:0x0823, B:178:0x0836, B:180:0x0840, B:182:0x0844, B:186:0x0850, B:202:0x0864, B:187:0x0874, B:187:0x0874, B:190:0x0885, B:190:0x0885, B:192:0x0894, B:192:0x0894, B:195:0x08a4, B:195:0x08a4, B:198:0x08b4, B:198:0x08b4, B:199:0x08c1, B:199:0x08c1, B:212:0x072e, B:212:0x072e, B:213:0x0701, B:213:0x0701, B:239:0x01e2, B:239:0x01e2, B:243:0x0162, B:243:0x0162, B:247:0x007f, B:249:0x0092), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0701 A[Catch: AssertionError | Exception -> 0x08cd, AssertionError | Exception -> 0x08cd, TryCatch #13 {AssertionError | Exception -> 0x08cd, blocks: (B:3:0x003d, B:5:0x0043, B:12:0x00a2, B:16:0x00b6, B:18:0x00ca, B:24:0x00f1, B:29:0x00ff, B:32:0x0116, B:32:0x0116, B:34:0x013f, B:34:0x013f, B:36:0x0156, B:36:0x0156, B:37:0x016c, B:37:0x016c, B:39:0x0172, B:39:0x0172, B:42:0x019c, B:42:0x019c, B:43:0x0203, B:43:0x0203, B:46:0x0220, B:46:0x0220, B:50:0x0253, B:50:0x0253, B:61:0x02b7, B:61:0x02b7, B:62:0x02e2, B:62:0x02e2, B:63:0x030e, B:63:0x030e, B:64:0x033a, B:64:0x033a, B:65:0x0365, B:65:0x0365, B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e, B:74:0x041e, B:77:0x042c, B:79:0x042f, B:84:0x044c, B:86:0x0452, B:89:0x0463, B:90:0x0493, B:92:0x04a2, B:92:0x04a2, B:94:0x04b3, B:96:0x04e3, B:98:0x04fc, B:99:0x050f, B:102:0x0520, B:105:0x058e, B:107:0x0596, B:110:0x05be, B:111:0x05e7, B:111:0x05e7, B:113:0x05ef, B:113:0x05ef, B:114:0x0626, B:114:0x0626, B:116:0x0631, B:118:0x0642, B:217:0x0650, B:121:0x065d, B:126:0x0665, B:128:0x0672, B:130:0x0677, B:131:0x0684, B:133:0x0691, B:135:0x0699, B:137:0x06a6, B:139:0x06ab, B:140:0x06b8, B:142:0x06c5, B:144:0x06cf, B:146:0x06d3, B:148:0x06e2, B:148:0x06e2, B:150:0x06f3, B:150:0x06f3, B:151:0x070e, B:151:0x070e, B:153:0x071f, B:153:0x071f, B:156:0x073d, B:159:0x075c, B:162:0x077b, B:165:0x079a, B:167:0x07b9, B:170:0x07d8, B:171:0x07f9, B:171:0x07f9, B:173:0x0801, B:173:0x0801, B:175:0x080d, B:175:0x080d, B:176:0x0823, B:176:0x0823, B:178:0x0836, B:180:0x0840, B:182:0x0844, B:186:0x0850, B:202:0x0864, B:187:0x0874, B:187:0x0874, B:190:0x0885, B:190:0x0885, B:192:0x0894, B:192:0x0894, B:195:0x08a4, B:195:0x08a4, B:198:0x08b4, B:198:0x08b4, B:199:0x08c1, B:199:0x08c1, B:212:0x072e, B:212:0x072e, B:213:0x0701, B:213:0x0701, B:239:0x01e2, B:239:0x01e2, B:243:0x0162, B:243:0x0162, B:247:0x007f, B:249:0x0092), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0650 A[Catch: Exception -> 0x065d, AssertionError | Exception -> 0x08cd, TRY_LEAVE, TryCatch #6 {Exception -> 0x065d, blocks: (B:116:0x0631, B:118:0x0642, B:217:0x0650), top: B:115:0x0631 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03a8 A[Catch: Exception -> 0x041e, AssertionError | Exception -> 0x08cd, TryCatch #5 {Exception -> 0x041e, blocks: (B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e), top: B:67:0x0394 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03b9 A[Catch: Exception -> 0x041e, AssertionError | Exception -> 0x08cd, TryCatch #5 {Exception -> 0x041e, blocks: (B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e), top: B:67:0x0394 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03ca A[Catch: Exception -> 0x041e, AssertionError | Exception -> 0x08cd, TryCatch #5 {Exception -> 0x041e, blocks: (B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e), top: B:67:0x0394 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03db A[Catch: Exception -> 0x041e, AssertionError | Exception -> 0x08cd, TryCatch #5 {Exception -> 0x041e, blocks: (B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e), top: B:67:0x0394 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03ec A[Catch: Exception -> 0x041e, AssertionError | Exception -> 0x08cd, TryCatch #5 {Exception -> 0x041e, blocks: (B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e), top: B:67:0x0394 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03fd A[Catch: Exception -> 0x041e, AssertionError | Exception -> 0x08cd, TryCatch #5 {Exception -> 0x041e, blocks: (B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e), top: B:67:0x0394 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x040e A[Catch: Exception -> 0x041e, AssertionError | Exception -> 0x08cd, TRY_LEAVE, TryCatch #5 {Exception -> 0x041e, blocks: (B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e), top: B:67:0x0394 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x01e2 A[Catch: AssertionError | Exception -> 0x08cd, AssertionError | Exception -> 0x08cd, TryCatch #13 {AssertionError | Exception -> 0x08cd, blocks: (B:3:0x003d, B:5:0x0043, B:12:0x00a2, B:16:0x00b6, B:18:0x00ca, B:24:0x00f1, B:29:0x00ff, B:32:0x0116, B:32:0x0116, B:34:0x013f, B:34:0x013f, B:36:0x0156, B:36:0x0156, B:37:0x016c, B:37:0x016c, B:39:0x0172, B:39:0x0172, B:42:0x019c, B:42:0x019c, B:43:0x0203, B:43:0x0203, B:46:0x0220, B:46:0x0220, B:50:0x0253, B:50:0x0253, B:61:0x02b7, B:61:0x02b7, B:62:0x02e2, B:62:0x02e2, B:63:0x030e, B:63:0x030e, B:64:0x033a, B:64:0x033a, B:65:0x0365, B:65:0x0365, B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e, B:74:0x041e, B:77:0x042c, B:79:0x042f, B:84:0x044c, B:86:0x0452, B:89:0x0463, B:90:0x0493, B:92:0x04a2, B:92:0x04a2, B:94:0x04b3, B:96:0x04e3, B:98:0x04fc, B:99:0x050f, B:102:0x0520, B:105:0x058e, B:107:0x0596, B:110:0x05be, B:111:0x05e7, B:111:0x05e7, B:113:0x05ef, B:113:0x05ef, B:114:0x0626, B:114:0x0626, B:116:0x0631, B:118:0x0642, B:217:0x0650, B:121:0x065d, B:126:0x0665, B:128:0x0672, B:130:0x0677, B:131:0x0684, B:133:0x0691, B:135:0x0699, B:137:0x06a6, B:139:0x06ab, B:140:0x06b8, B:142:0x06c5, B:144:0x06cf, B:146:0x06d3, B:148:0x06e2, B:148:0x06e2, B:150:0x06f3, B:150:0x06f3, B:151:0x070e, B:151:0x070e, B:153:0x071f, B:153:0x071f, B:156:0x073d, B:159:0x075c, B:162:0x077b, B:165:0x079a, B:167:0x07b9, B:170:0x07d8, B:171:0x07f9, B:171:0x07f9, B:173:0x0801, B:173:0x0801, B:175:0x080d, B:175:0x080d, B:176:0x0823, B:176:0x0823, B:178:0x0836, B:180:0x0840, B:182:0x0844, B:186:0x0850, B:202:0x0864, B:187:0x0874, B:187:0x0874, B:190:0x0885, B:190:0x0885, B:192:0x0894, B:192:0x0894, B:195:0x08a4, B:195:0x08a4, B:198:0x08b4, B:198:0x08b4, B:199:0x08c1, B:199:0x08c1, B:212:0x072e, B:212:0x072e, B:213:0x0701, B:213:0x0701, B:239:0x01e2, B:239:0x01e2, B:243:0x0162, B:243:0x0162, B:247:0x007f, B:249:0x0092), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0116 A[Catch: AssertionError | Exception -> 0x08cd, AssertionError | Exception -> 0x08cd, TRY_ENTER, TryCatch #13 {AssertionError | Exception -> 0x08cd, blocks: (B:3:0x003d, B:5:0x0043, B:12:0x00a2, B:16:0x00b6, B:18:0x00ca, B:24:0x00f1, B:29:0x00ff, B:32:0x0116, B:32:0x0116, B:34:0x013f, B:34:0x013f, B:36:0x0156, B:36:0x0156, B:37:0x016c, B:37:0x016c, B:39:0x0172, B:39:0x0172, B:42:0x019c, B:42:0x019c, B:43:0x0203, B:43:0x0203, B:46:0x0220, B:46:0x0220, B:50:0x0253, B:50:0x0253, B:61:0x02b7, B:61:0x02b7, B:62:0x02e2, B:62:0x02e2, B:63:0x030e, B:63:0x030e, B:64:0x033a, B:64:0x033a, B:65:0x0365, B:65:0x0365, B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e, B:74:0x041e, B:77:0x042c, B:79:0x042f, B:84:0x044c, B:86:0x0452, B:89:0x0463, B:90:0x0493, B:92:0x04a2, B:92:0x04a2, B:94:0x04b3, B:96:0x04e3, B:98:0x04fc, B:99:0x050f, B:102:0x0520, B:105:0x058e, B:107:0x0596, B:110:0x05be, B:111:0x05e7, B:111:0x05e7, B:113:0x05ef, B:113:0x05ef, B:114:0x0626, B:114:0x0626, B:116:0x0631, B:118:0x0642, B:217:0x0650, B:121:0x065d, B:126:0x0665, B:128:0x0672, B:130:0x0677, B:131:0x0684, B:133:0x0691, B:135:0x0699, B:137:0x06a6, B:139:0x06ab, B:140:0x06b8, B:142:0x06c5, B:144:0x06cf, B:146:0x06d3, B:148:0x06e2, B:148:0x06e2, B:150:0x06f3, B:150:0x06f3, B:151:0x070e, B:151:0x070e, B:153:0x071f, B:153:0x071f, B:156:0x073d, B:159:0x075c, B:162:0x077b, B:165:0x079a, B:167:0x07b9, B:170:0x07d8, B:171:0x07f9, B:171:0x07f9, B:173:0x0801, B:173:0x0801, B:175:0x080d, B:175:0x080d, B:176:0x0823, B:176:0x0823, B:178:0x0836, B:180:0x0840, B:182:0x0844, B:186:0x0850, B:202:0x0864, B:187:0x0874, B:187:0x0874, B:190:0x0885, B:190:0x0885, B:192:0x0894, B:192:0x0894, B:195:0x08a4, B:195:0x08a4, B:198:0x08b4, B:198:0x08b4, B:199:0x08c1, B:199:0x08c1, B:212:0x072e, B:212:0x072e, B:213:0x0701, B:213:0x0701, B:239:0x01e2, B:239:0x01e2, B:243:0x0162, B:243:0x0162, B:247:0x007f, B:249:0x0092), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0172 A[Catch: AssertionError | Exception -> 0x08cd, AssertionError | Exception -> 0x08cd, TRY_LEAVE, TryCatch #13 {AssertionError | Exception -> 0x08cd, blocks: (B:3:0x003d, B:5:0x0043, B:12:0x00a2, B:16:0x00b6, B:18:0x00ca, B:24:0x00f1, B:29:0x00ff, B:32:0x0116, B:32:0x0116, B:34:0x013f, B:34:0x013f, B:36:0x0156, B:36:0x0156, B:37:0x016c, B:37:0x016c, B:39:0x0172, B:39:0x0172, B:42:0x019c, B:42:0x019c, B:43:0x0203, B:43:0x0203, B:46:0x0220, B:46:0x0220, B:50:0x0253, B:50:0x0253, B:61:0x02b7, B:61:0x02b7, B:62:0x02e2, B:62:0x02e2, B:63:0x030e, B:63:0x030e, B:64:0x033a, B:64:0x033a, B:65:0x0365, B:65:0x0365, B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e, B:74:0x041e, B:77:0x042c, B:79:0x042f, B:84:0x044c, B:86:0x0452, B:89:0x0463, B:90:0x0493, B:92:0x04a2, B:92:0x04a2, B:94:0x04b3, B:96:0x04e3, B:98:0x04fc, B:99:0x050f, B:102:0x0520, B:105:0x058e, B:107:0x0596, B:110:0x05be, B:111:0x05e7, B:111:0x05e7, B:113:0x05ef, B:113:0x05ef, B:114:0x0626, B:114:0x0626, B:116:0x0631, B:118:0x0642, B:217:0x0650, B:121:0x065d, B:126:0x0665, B:128:0x0672, B:130:0x0677, B:131:0x0684, B:133:0x0691, B:135:0x0699, B:137:0x06a6, B:139:0x06ab, B:140:0x06b8, B:142:0x06c5, B:144:0x06cf, B:146:0x06d3, B:148:0x06e2, B:148:0x06e2, B:150:0x06f3, B:150:0x06f3, B:151:0x070e, B:151:0x070e, B:153:0x071f, B:153:0x071f, B:156:0x073d, B:159:0x075c, B:162:0x077b, B:165:0x079a, B:167:0x07b9, B:170:0x07d8, B:171:0x07f9, B:171:0x07f9, B:173:0x0801, B:173:0x0801, B:175:0x080d, B:175:0x080d, B:176:0x0823, B:176:0x0823, B:178:0x0836, B:180:0x0840, B:182:0x0844, B:186:0x0850, B:202:0x0864, B:187:0x0874, B:187:0x0874, B:190:0x0885, B:190:0x0885, B:192:0x0894, B:192:0x0894, B:195:0x08a4, B:195:0x08a4, B:198:0x08b4, B:198:0x08b4, B:199:0x08c1, B:199:0x08c1, B:212:0x072e, B:212:0x072e, B:213:0x0701, B:213:0x0701, B:239:0x01e2, B:239:0x01e2, B:243:0x0162, B:243:0x0162, B:247:0x007f, B:249:0x0092), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019c A[Catch: AssertionError | Exception -> 0x08cd, AssertionError | Exception -> 0x08cd, TRY_ENTER, TryCatch #13 {AssertionError | Exception -> 0x08cd, blocks: (B:3:0x003d, B:5:0x0043, B:12:0x00a2, B:16:0x00b6, B:18:0x00ca, B:24:0x00f1, B:29:0x00ff, B:32:0x0116, B:32:0x0116, B:34:0x013f, B:34:0x013f, B:36:0x0156, B:36:0x0156, B:37:0x016c, B:37:0x016c, B:39:0x0172, B:39:0x0172, B:42:0x019c, B:42:0x019c, B:43:0x0203, B:43:0x0203, B:46:0x0220, B:46:0x0220, B:50:0x0253, B:50:0x0253, B:61:0x02b7, B:61:0x02b7, B:62:0x02e2, B:62:0x02e2, B:63:0x030e, B:63:0x030e, B:64:0x033a, B:64:0x033a, B:65:0x0365, B:65:0x0365, B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e, B:74:0x041e, B:77:0x042c, B:79:0x042f, B:84:0x044c, B:86:0x0452, B:89:0x0463, B:90:0x0493, B:92:0x04a2, B:92:0x04a2, B:94:0x04b3, B:96:0x04e3, B:98:0x04fc, B:99:0x050f, B:102:0x0520, B:105:0x058e, B:107:0x0596, B:110:0x05be, B:111:0x05e7, B:111:0x05e7, B:113:0x05ef, B:113:0x05ef, B:114:0x0626, B:114:0x0626, B:116:0x0631, B:118:0x0642, B:217:0x0650, B:121:0x065d, B:126:0x0665, B:128:0x0672, B:130:0x0677, B:131:0x0684, B:133:0x0691, B:135:0x0699, B:137:0x06a6, B:139:0x06ab, B:140:0x06b8, B:142:0x06c5, B:144:0x06cf, B:146:0x06d3, B:148:0x06e2, B:148:0x06e2, B:150:0x06f3, B:150:0x06f3, B:151:0x070e, B:151:0x070e, B:153:0x071f, B:153:0x071f, B:156:0x073d, B:159:0x075c, B:162:0x077b, B:165:0x079a, B:167:0x07b9, B:170:0x07d8, B:171:0x07f9, B:171:0x07f9, B:173:0x0801, B:173:0x0801, B:175:0x080d, B:175:0x080d, B:176:0x0823, B:176:0x0823, B:178:0x0836, B:180:0x0840, B:182:0x0844, B:186:0x0850, B:202:0x0864, B:187:0x0874, B:187:0x0874, B:190:0x0885, B:190:0x0885, B:192:0x0894, B:192:0x0894, B:195:0x08a4, B:195:0x08a4, B:198:0x08b4, B:198:0x08b4, B:199:0x08c1, B:199:0x08c1, B:212:0x072e, B:212:0x072e, B:213:0x0701, B:213:0x0701, B:239:0x01e2, B:239:0x01e2, B:243:0x0162, B:243:0x0162, B:247:0x007f, B:249:0x0092), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0220 A[Catch: AssertionError | Exception -> 0x08cd, AssertionError | Exception -> 0x08cd, TRY_ENTER, TryCatch #13 {AssertionError | Exception -> 0x08cd, blocks: (B:3:0x003d, B:5:0x0043, B:12:0x00a2, B:16:0x00b6, B:18:0x00ca, B:24:0x00f1, B:29:0x00ff, B:32:0x0116, B:32:0x0116, B:34:0x013f, B:34:0x013f, B:36:0x0156, B:36:0x0156, B:37:0x016c, B:37:0x016c, B:39:0x0172, B:39:0x0172, B:42:0x019c, B:42:0x019c, B:43:0x0203, B:43:0x0203, B:46:0x0220, B:46:0x0220, B:50:0x0253, B:50:0x0253, B:61:0x02b7, B:61:0x02b7, B:62:0x02e2, B:62:0x02e2, B:63:0x030e, B:63:0x030e, B:64:0x033a, B:64:0x033a, B:65:0x0365, B:65:0x0365, B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e, B:74:0x041e, B:77:0x042c, B:79:0x042f, B:84:0x044c, B:86:0x0452, B:89:0x0463, B:90:0x0493, B:92:0x04a2, B:92:0x04a2, B:94:0x04b3, B:96:0x04e3, B:98:0x04fc, B:99:0x050f, B:102:0x0520, B:105:0x058e, B:107:0x0596, B:110:0x05be, B:111:0x05e7, B:111:0x05e7, B:113:0x05ef, B:113:0x05ef, B:114:0x0626, B:114:0x0626, B:116:0x0631, B:118:0x0642, B:217:0x0650, B:121:0x065d, B:126:0x0665, B:128:0x0672, B:130:0x0677, B:131:0x0684, B:133:0x0691, B:135:0x0699, B:137:0x06a6, B:139:0x06ab, B:140:0x06b8, B:142:0x06c5, B:144:0x06cf, B:146:0x06d3, B:148:0x06e2, B:148:0x06e2, B:150:0x06f3, B:150:0x06f3, B:151:0x070e, B:151:0x070e, B:153:0x071f, B:153:0x071f, B:156:0x073d, B:159:0x075c, B:162:0x077b, B:165:0x079a, B:167:0x07b9, B:170:0x07d8, B:171:0x07f9, B:171:0x07f9, B:173:0x0801, B:173:0x0801, B:175:0x080d, B:175:0x080d, B:176:0x0823, B:176:0x0823, B:178:0x0836, B:180:0x0840, B:182:0x0844, B:186:0x0850, B:202:0x0864, B:187:0x0874, B:187:0x0874, B:190:0x0885, B:190:0x0885, B:192:0x0894, B:192:0x0894, B:195:0x08a4, B:195:0x08a4, B:198:0x08b4, B:198:0x08b4, B:199:0x08c1, B:199:0x08c1, B:212:0x072e, B:212:0x072e, B:213:0x0701, B:213:0x0701, B:239:0x01e2, B:239:0x01e2, B:243:0x0162, B:243:0x0162, B:247:0x007f, B:249:0x0092), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0452 A[Catch: Exception -> 0x04a2, AssertionError | Exception -> 0x08cd, TRY_LEAVE, TryCatch #13 {AssertionError | Exception -> 0x08cd, blocks: (B:3:0x003d, B:5:0x0043, B:12:0x00a2, B:16:0x00b6, B:18:0x00ca, B:24:0x00f1, B:29:0x00ff, B:32:0x0116, B:32:0x0116, B:34:0x013f, B:34:0x013f, B:36:0x0156, B:36:0x0156, B:37:0x016c, B:37:0x016c, B:39:0x0172, B:39:0x0172, B:42:0x019c, B:42:0x019c, B:43:0x0203, B:43:0x0203, B:46:0x0220, B:46:0x0220, B:50:0x0253, B:50:0x0253, B:61:0x02b7, B:61:0x02b7, B:62:0x02e2, B:62:0x02e2, B:63:0x030e, B:63:0x030e, B:64:0x033a, B:64:0x033a, B:65:0x0365, B:65:0x0365, B:68:0x0394, B:69:0x03a3, B:231:0x03a8, B:232:0x03b9, B:233:0x03ca, B:234:0x03db, B:235:0x03ec, B:236:0x03fd, B:237:0x040e, B:74:0x041e, B:77:0x042c, B:79:0x042f, B:84:0x044c, B:86:0x0452, B:89:0x0463, B:90:0x0493, B:92:0x04a2, B:92:0x04a2, B:94:0x04b3, B:96:0x04e3, B:98:0x04fc, B:99:0x050f, B:102:0x0520, B:105:0x058e, B:107:0x0596, B:110:0x05be, B:111:0x05e7, B:111:0x05e7, B:113:0x05ef, B:113:0x05ef, B:114:0x0626, B:114:0x0626, B:116:0x0631, B:118:0x0642, B:217:0x0650, B:121:0x065d, B:126:0x0665, B:128:0x0672, B:130:0x0677, B:131:0x0684, B:133:0x0691, B:135:0x0699, B:137:0x06a6, B:139:0x06ab, B:140:0x06b8, B:142:0x06c5, B:144:0x06cf, B:146:0x06d3, B:148:0x06e2, B:148:0x06e2, B:150:0x06f3, B:150:0x06f3, B:151:0x070e, B:151:0x070e, B:153:0x071f, B:153:0x071f, B:156:0x073d, B:159:0x075c, B:162:0x077b, B:165:0x079a, B:167:0x07b9, B:170:0x07d8, B:171:0x07f9, B:171:0x07f9, B:173:0x0801, B:173:0x0801, B:175:0x080d, B:175:0x080d, B:176:0x0823, B:176:0x0823, B:178:0x0836, B:180:0x0840, B:182:0x0844, B:186:0x0850, B:202:0x0864, B:187:0x0874, B:187:0x0874, B:190:0x0885, B:190:0x0885, B:192:0x0894, B:192:0x0894, B:195:0x08a4, B:195:0x08a4, B:198:0x08b4, B:198:0x08b4, B:199:0x08c1, B:199:0x08c1, B:212:0x072e, B:212:0x072e, B:213:0x0701, B:213:0x0701, B:239:0x01e2, B:239:0x01e2, B:243:0x0162, B:243:0x0162, B:247:0x007f, B:249:0x0092), top: B:2:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04e3 A[Catch: Exception -> 0x0520, AssertionError | Exception -> 0x08cd, TryCatch #4 {Exception -> 0x0520, blocks: (B:94:0x04b3, B:96:0x04e3, B:98:0x04fc, B:99:0x050f), top: B:93:0x04b3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList a() {
        /*
            Method dump skipped, instructions count: 2272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l00.a():java.util.ArrayList");
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        return VMRunner.invoke("rwWj6RLhfoflzgZG", new Object[]{l00.class, new Object[]{this, objArr}});
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        int i = this.f561a;
        Object obj2 = this.c;
        RecyclerView recyclerView = this.b;
        ld0 ld0Var = this.d;
        switch (i) {
            case 0:
                List list = (List) obj;
                p00 p00Var = (p00) ld0Var;
                if (p00Var.G()) {
                    try {
                        recyclerView.setAdapter(new l01(p00Var.g0(), list));
                        n3 n3Var = p00Var.r1;
                        if (n3Var != null && n3Var.isShowing()) {
                            p00Var.r1.dismiss();
                        }
                        n3 a2 = ((th2) obj2).a();
                        p00Var.r1 = a2;
                        a2.show();
                        p00.u0(p00Var);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                List list2 = (List) obj;
                p00 p00Var2 = (p00) ld0Var;
                if (p00Var2.G()) {
                    try {
                        recyclerView.setAdapter(new l01(p00Var2.g0(), list2));
                        n3 n3Var2 = p00Var2.r1;
                        if (n3Var2 != null && n3Var2.isShowing()) {
                            p00Var2.r1.dismiss();
                        }
                        n3 a3 = ((th2) obj2).a();
                        p00Var2.r1 = a3;
                        a3.show();
                        p00.u0(p00Var2);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                List list3 = (List) obj;
                p00 p00Var3 = (p00) ld0Var;
                if (p00Var3.G()) {
                    try {
                        recyclerView.setAdapter(new l01(p00Var3.g0(), list3));
                        n3 n3Var3 = p00Var3.r1;
                        if (n3Var3 != null && n3Var3.isShowing()) {
                            p00Var3.r1.dismiss();
                        }
                        n3 a4 = ((th2) obj2).a();
                        p00Var3.r1 = a4;
                        a4.show();
                        p00.u0(p00Var3);
                        break;
                    } catch (Exception unused3) {
                        return;
                    }
                }
                break;
            case 3:
                List list4 = (List) obj;
                p00 p00Var4 = (p00) ld0Var;
                if (p00Var4.G()) {
                    try {
                        recyclerView.setAdapter(new l01(p00Var4.g0(), list4));
                        n3 n3Var4 = p00Var4.r1;
                        if (n3Var4 != null && n3Var4.isShowing()) {
                            p00Var4.r1.dismiss();
                        }
                        n3 a5 = ((th2) obj2).a();
                        p00Var4.r1 = a5;
                        a5.show();
                        p00.u0(p00Var4);
                        break;
                    } catch (Exception unused4) {
                        return;
                    }
                }
                break;
            default:
                List list5 = (List) obj;
                sn snVar = (sn) ld0Var;
                if (snVar.G()) {
                    try {
                        recyclerView.setAdapter(new l01(snVar.i0(), list5));
                        break;
                    } catch (Exception unused5) {
                        return;
                    }
                }
                break;
        }
    }
}
