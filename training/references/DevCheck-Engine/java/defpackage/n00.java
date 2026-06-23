package defpackage;

import android.os.Build;
import android.os.Process;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class n00 extends Thread {
    public static final /* synthetic */ int n = 0;
    public final RandomAccessFile g;
    public int h;
    public long i = 0;
    public long j = 0;
    public int k;
    public final int l;
    public final /* synthetic */ p00 m;

    public n00(p00 p00Var) {
        this.m = p00Var;
        go1 go1Var = p00Var.z1;
        if (go1Var != null && go1Var.d()) {
            this.g = null;
            this.h = 5;
            return;
        }
        if (i51.b("prefRoot").booleanValue()) {
            this.g = null;
            this.h = 4;
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            try {
                try {
                    this.g = new RandomAccessFile(new File("/proc/stat"), "r");
                    this.h = 3;
                    return;
                } catch (Exception unused) {
                    this.l = 1800;
                    this.h = 1;
                    return;
                }
            } catch (FileNotFoundException unused2) {
                this.l = Integer.parseInt(uz1.A0(uz1.K("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq")));
                this.h = 1;
                return;
            }
        }
        if (!uz1.q("/sys/devices/system/cpu/rq-stats/cpu_normalized_load")) {
            try {
                this.l = Integer.parseInt(uz1.A0(uz1.K("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq")));
            } catch (Exception unused3) {
                this.l = 1800;
            }
            this.h = 1;
            return;
        }
        try {
            try {
                this.g = new RandomAccessFile(new File("/sys/devices/system/cpu/rq-stats/cpu_normalized_load"), "r");
                this.h = 2;
            } catch (Exception unused4) {
                this.l = 1800;
                this.h = 1;
            }
        } catch (FileNotFoundException unused5) {
            this.l = Integer.parseInt(uz1.A0(uz1.K("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq")));
            this.h = 1;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        p00 p00Var = this.m;
        RandomAccessFile randomAccessFile = this.g;
        Process.setThreadPriority(10);
        try {
            int A = d51.A(this.h);
            long j = 0;
            int i3 = 0;
            if (A == 1) {
                i = 1;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    String readLine = randomAccessFile.readLine();
                    if (readLine == null || !readLine.contains(" = ")) {
                        break;
                    }
                    i4 += Integer.parseInt(readLine.split(" = ")[1].split("/")[0]);
                    i5++;
                }
                i2 = i4 / i5;
                randomAccessFile.seek(0L);
            } else if (A != 2) {
                if (A == 3) {
                    String[] split = ((String) wn1.a("cat /proc/stat").o().c().get(0)).substring(5).split(" ");
                    long h = d51.h(split[3]);
                    int length = split.length;
                    while (i3 < length) {
                        j += d51.h(split[i3]);
                        i3++;
                    }
                    i2 = (int) ((1.0d - ((h - this.i) / (j - this.j))) * 100.0d);
                    this.i = h;
                    this.j = j;
                } else if (A != 4) {
                    try {
                        String charSequence = p00Var.i0.getText().toString();
                        if (charSequence.isEmpty()) {
                            i2 = -1;
                        } else {
                            double parseInt = Integer.parseInt(charSequence.substring(0, charSequence.indexOf(" ")));
                            double d = this.l;
                            String str = uz1.f1060a;
                            int i6 = (int) (((parseInt - 100.0d) / (d - 100.0d)) * 100.0d);
                            double d2 = (this.k + i6) / 2.0d;
                            this.k = i6;
                            i2 = (int) d2;
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    String u = ju0.u("head -n 1 /proc/stat");
                    if (u == null) {
                        i = 1;
                        i2 = -1;
                    } else {
                        String[] split2 = u.substring(5).trim().split("\\s+");
                        long parseLong = Long.parseLong(split2[3]);
                        int length2 = split2.length;
                        while (i3 < length2) {
                            j += Long.parseLong(split2[i3]);
                            i3++;
                        }
                        i2 = (int) ((1.0d - ((parseLong - this.i) / (j - this.j))) * 100.0d);
                        this.i = parseLong;
                        this.j = j;
                    }
                }
                i = 1;
            } else {
                String[] split3 = randomAccessFile.readLine().substring(5).split(" ");
                long h2 = d51.h(split3[3]);
                int length3 = split3.length;
                long j2 = 0;
                while (i3 < length3) {
                    j2 += d51.h(split3[i3]);
                    i3++;
                }
                i = 1;
                i2 = (int) ((1.0d - ((h2 - this.i) / (j2 - this.j))) * 100.0d);
                this.i = h2;
                this.j = j2;
                randomAccessFile.seek(0L);
            }
            if (i2 < -1) {
                this.h = i;
            } else if (i2 != -1) {
                p00Var.A1.post(new xj(i2, i, this));
            }
        } catch (Exception unused2) {
        }
    }
}
