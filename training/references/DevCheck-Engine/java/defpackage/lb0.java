package defpackage;

import android.net.Uri;
import androidx.core.content.FileProvider;
import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class lb0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f579a;
    public final HashMap b = new HashMap();

    public lb0(String str) {
        this.f579a = str;
    }

    public final File a(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        if (indexOf == -1) {
            rw.o("Unable to find path from root: ", uri);
            return null;
        }
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.b.get(decode);
        if (file == null) {
            rw.o("Unable to find configured root for ", uri);
            return null;
        }
        File file2 = new File(file, decode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (FileProvider.a(canonicalFile.getPath()).startsWith(FileProvider.a(file.getPath()).concat(CGvJMCDBOmCdj.ZfZg))) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            rw.o("Failed to resolve canonical path for ", file2);
            return null;
        }
    }
}
