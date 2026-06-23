package defpackage;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.graphics.Color;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.android.material.behavior.YqV.Gvyagftz;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class cu0 extends a4 {
    public ew0 c;
    public final ArrayList d;
    public final ApplicationInfo e;
    public final ExecutorService f;
    public final boolean g;
    public final Handler h;
    public final qy0 i;
    public final qy0 j;

    public cu0(Application application, ApplicationInfo applicationInfo, boolean z) {
        super(application);
        this.d = new ArrayList();
        this.i = new qy0();
        this.j = new qy0();
        this.e = applicationInfo;
        this.f = Executors.newCachedThreadPool();
        this.g = z;
        this.h = new Handler(application.getMainLooper());
    }

    public static SpannableString f(String str, boolean z) {
        if (str.length() == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        int parseColor = Color.parseColor("#b22222");
        int parseColor2 = Color.parseColor("#2e8b57");
        int parseColor3 = Color.parseColor("#406098");
        if (z) {
            parseColor = Color.parseColor("#bc7324");
            parseColor2 = Color.parseColor("#8bb050");
            parseColor3 = Color.parseColor(Gvyagftz.IigwhOHD);
        }
        String[] strArr = {"<.*", ">", jYVJoqfHJs.RJkhcmqjTxRVdy, "</.*>", "<uses-permission"};
        for (int i = 0; i < 5; i++) {
            try {
                Matcher matcher = Pattern.compile(strArr[i]).matcher(str);
                while (matcher.find()) {
                    spannableString.setSpan(new ForegroundColorSpan(parseColor), matcher.start(), matcher.end(), 33);
                }
            } catch (Exception unused) {
                return null;
            }
        }
        if (str.startsWith("<manifest ")) {
            spannableString.setSpan(new ForegroundColorSpan(parseColor), 0, 9, 33);
        }
        try {
            Matcher matcher2 = Pattern.compile(new String[]{"\".*\""}[0]).matcher(str);
            while (matcher2.find()) {
                spannableString.setSpan(new ForegroundColorSpan(parseColor2), matcher2.start(), matcher2.end(), 33);
            }
            String[] strArr2 = {"android:", "xmlns:"};
            for (int i2 = 0; i2 < 2; i2++) {
                try {
                    Matcher matcher3 = Pattern.compile(strArr2[i2]).matcher(str);
                    while (matcher3.find()) {
                        spannableString.setSpan(new ForegroundColorSpan(parseColor3), matcher3.start(), matcher3.end() - 1, 33);
                    }
                } catch (Exception unused2) {
                    return null;
                }
            }
            return spannableString;
        } catch (Exception unused3) {
            return null;
        }
    }

    @Override // defpackage.i72
    public final void b() {
        this.f.shutdownNow();
    }

    public final void d() {
        synchronized (this.d) {
            try {
                try {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = this.d;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        arrayList.add(new SpannableString((SpannableString) obj));
                    }
                    if (TextUtils.isEmpty((CharSequence) this.i.d())) {
                        this.j.i(new ArrayList());
                        this.h.post(new k5(this, 26, arrayList));
                    } else {
                        e(arrayList);
                    }
                } catch (Exception unused) {
                    this.h.post(new bu0(this, 2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(ArrayList arrayList) {
        String lowerCase = ((String) this.i.d()).toLowerCase();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            if (((SpannableString) arrayList.get(i)).toString().toLowerCase().contains(lowerCase)) {
                arrayList2.add(Integer.valueOf(i));
            }
        }
        this.h.post(new b9(this, arrayList2, arrayList, 13));
    }
}
