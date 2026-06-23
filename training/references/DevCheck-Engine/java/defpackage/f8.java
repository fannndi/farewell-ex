package defpackage;

import flar2.devcheck.cputimes.Sd.tEegR;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class f8 {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f268a = new ArrayList();

    public static ArrayList a() {
        ArrayList arrayList = f268a;
        if (arrayList != null) {
            arrayList.clear();
        }
        int i = 0;
        if (i51.b("prefRoot").booleanValue()) {
            ArrayList arrayList2 = new ArrayList();
            for (String str : wn1.a(tEegR.AaezJJ).o().c()) {
                if (str.length() > 2 && str.matches("[0-9]+")) {
                    arrayList2.add(str);
                }
            }
            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() + 1);
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                try {
                    int parseInt = Integer.parseInt((String) obj);
                    e8 e8Var = new e8();
                    e8Var.g = parseInt;
                    newFixedThreadPool.execute(e8Var);
                } catch (NumberFormatException unused) {
                }
            }
            newFixedThreadPool.shutdown();
            try {
                newFixedThreadPool.awaitTermination(40L, TimeUnit.SECONDS);
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
        } else {
            File[] listFiles = new File("/proc").listFiles();
            int length = listFiles.length;
            while (i < length) {
                File file = listFiles[i];
                if (file.isDirectory()) {
                    try {
                        arrayList.add(new d8(Integer.parseInt(file.getName())));
                    } catch (c8 | IOException | NumberFormatException unused3) {
                    }
                }
                i++;
            }
        }
        return arrayList;
    }
}
