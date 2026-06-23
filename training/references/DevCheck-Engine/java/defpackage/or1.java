package defpackage;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class or1 implements Callable {
    public final InputStream g;
    public final List h;
    public final /* synthetic */ int i;

    public or1(InputStream inputStream, List list, int i) {
        this.i = i;
        this.g = inputStream;
        this.h = list;
    }

    public final String a(boolean z) {
        boolean z2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.g, StandardCharsets.UTF_8));
        do {
            String readLine = bufferedReader.readLine();
            z2 = false;
            if (readLine != null) {
                int length = readLine.length();
                int i = length - 36;
                boolean startsWith = readLine.startsWith(un0.m, i);
                if (startsWith) {
                    if (length != 36) {
                        readLine = readLine.substring(0, i);
                    }
                }
                List list = this.h;
                if (list != null) {
                    list.add(readLine);
                }
                z2 = !startsWith;
            }
        } while (z2);
        if (z) {
            return bufferedReader.readLine();
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int parseInt;
        switch (this.i) {
            case 0:
                a(false);
                return null;
            default:
                String a2 = a(true);
                if (a2 == null) {
                    parseInt = 1;
                } else {
                    try {
                        parseInt = Integer.parseInt(a2);
                    } catch (NumberFormatException unused) {
                        return 1;
                    }
                }
                return Integer.valueOf(parseInt);
        }
    }
}
