package defpackage;

import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class bu0 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ cu0 h;

    public /* synthetic */ bu0(cu0 cu0Var, int i) {
        this.g = i;
        this.h = cu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i = this.g;
        String str2 = null;
        cu0 cu0Var = this.h;
        switch (i) {
            case 0:
                cu0Var.getClass();
                try {
                    ZipFile zipFile = new ZipFile(cu0Var.e.publicSourceDir);
                    try {
                        Enumeration<? extends ZipEntry> entries = zipFile.entries();
                        str = null;
                        while (entries.hasMoreElements()) {
                            ZipEntry nextElement = entries.nextElement();
                            if (nextElement.getName().equals("AndroidManifest.xml")) {
                                InputStream inputStream = zipFile.getInputStream(nextElement);
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    try {
                                        byte[] bArr = new byte[rt0.w];
                                        while (true) {
                                            int read = inputStream.read(bArr, 0, rt0.w);
                                            if (read != -1) {
                                                byteArrayOutputStream.write(bArr, 0, read);
                                            } else {
                                                String p = kk1.p(byteArrayOutputStream.toByteArray());
                                                byteArrayOutputStream.close();
                                                inputStream.close();
                                                str = p;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } finally {
                                }
                            }
                        }
                        zipFile.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    str = null;
                }
                if (str != null) {
                    try {
                        str2 = str.replaceAll("<manifest", "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"").replaceAll(">\n {4}</uses-permission>", qJTtDWNCVUDjB.wSsIpG).replaceAll(">\n {4}</uses-sdk>", "/>");
                    } catch (Exception unused2) {
                    }
                }
                synchronized (cu0Var.d) {
                    try {
                        if (str2 == null) {
                            cu0Var.h.post(new bu0(cu0Var, 3));
                            return;
                        }
                        for (String str3 : str2.split(jYVJoqfHJs.aVLVQA)) {
                            cu0Var.d.add(cu0.f(str3, cu0Var.g));
                        }
                        cu0Var.d();
                        return;
                    } finally {
                    }
                }
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                cu0Var.d();
                return;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                cu0Var.j.i(new ArrayList());
                cu0Var.c.i(null);
                return;
            default:
                cu0Var.c.i(null);
                return;
        }
    }
}
