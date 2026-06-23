package defpackage;

import android.text.TextUtils;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class ks1 extends File {
    public final String g;

    public ks1(File file) {
        super(file.getAbsolutePath());
        this.g = k32.t(getPath());
    }

    public ks1(String str) {
        this(new File(str));
    }

    public final String a(String str) {
        ExecutorService executorService = wn1.m;
        wn1 k = rt0.k();
        String[] strArr = {str.replace("@@", this.g)};
        un0 un0Var = new un0(k);
        un0Var.a(strArr);
        un0Var.i = new ArrayList();
        un0Var.j = null;
        List c = un0Var.e().c();
        if (c == null || c.size() == 0) {
            return "";
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            if (!TextUtils.isEmpty((String) it.next())) {
                return (String) c.get(c.size() - 1);
            }
        }
        return "";
    }

    public final boolean b(String str) {
        ExecutorService executorService = wn1.m;
        wn1 k = rt0.k();
        String[] strArr = {str.replace("@@", this.g)};
        un0 un0Var = new un0(k);
        un0Var.a(strArr);
        un0Var.i = null;
        return un0Var.e().e();
    }

    public final ks1 c(String str) {
        return new ks1(new File(getPath(), str));
    }

    @Override // java.io.File
    public final boolean canExecute() {
        return b("[ -x @@ ]");
    }

    @Override // java.io.File
    public final boolean canRead() {
        return b("[ -r @@ ]");
    }

    @Override // java.io.File
    public final boolean canWrite() {
        return b("[ -w @@ ]");
    }

    @Override // java.io.File
    public final boolean createNewFile() {
        return b("[ ! -e @@ ] && echo -n > @@");
    }

    @Override // java.io.File
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ks1[] listFiles() {
        String[] list;
        if (!b(qJTtDWNCVUDjB.EcQ) || (list = list(null)) == null) {
            return null;
        }
        int length = list.length;
        ks1[] ks1VarArr = new ks1[length];
        for (int i = 0; i < length; i++) {
            ks1VarArr[i] = c(list[i]);
        }
        return ks1VarArr;
    }

    @Override // java.io.File
    public final boolean delete() {
        return b("rm -f @@ || rmdir -f @@");
    }

    @Override // java.io.File
    public final void deleteOnExit() {
        throw new UnsupportedOperationException("Unsupported SuFile operation");
    }

    public final boolean e(int i, boolean z, boolean z2) {
        char[] charArray = a("stat -c '%a' @@").toCharArray();
        int i2 = 0;
        if (charArray.length != 3) {
            return false;
        }
        while (i2 < 3) {
            int i3 = charArray[i2] - '0';
            charArray[i2] = (char) (((!z || (z2 && i2 != 0)) ? i3 & (~i) : i3 | i) + 48);
            i2++;
        }
        return b("chmod " + new String(charArray) + " @@");
    }

    @Override // java.io.File
    public final boolean exists() {
        return b("[ -e @@ ]");
    }

    public final long f(String str) {
        String[] split = a("stat -fc '%S " + str + "' @@").split(" ");
        if (split.length != 2) {
            return Long.MAX_VALUE;
        }
        try {
            return Long.parseLong(split[0]) * Long.parseLong(split[1]);
        } catch (NumberFormatException unused) {
            return Long.MAX_VALUE;
        }
    }

    @Override // java.io.File
    public final File getAbsoluteFile() {
        return this;
    }

    @Override // java.io.File
    public final String getAbsolutePath() {
        return getPath();
    }

    @Override // java.io.File
    public final File getCanonicalFile() {
        return new ks1(getCanonicalPath());
    }

    @Override // java.io.File
    public final String getCanonicalPath() {
        String a2 = a("readlink -f @@");
        return a2.isEmpty() ? getPath() : a2;
    }

    @Override // java.io.File
    public final long getFreeSpace() {
        return f("%f");
    }

    @Override // java.io.File
    public final File getParentFile() {
        String parent = getParent();
        if (parent == null) {
            return null;
        }
        return new ks1(parent);
    }

    @Override // java.io.File
    public final long getTotalSpace() {
        return f("%b");
    }

    @Override // java.io.File
    public final long getUsableSpace() {
        return f("%a");
    }

    @Override // java.io.File
    public final boolean isDirectory() {
        return b("[ -d @@ ]");
    }

    @Override // java.io.File
    public final boolean isFile() {
        return b("[ -f @@ ]");
    }

    @Override // java.io.File
    public final long lastModified() {
        try {
            return Long.parseLong(a("stat -c '%Y' @@")) * 1000;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // java.io.File
    public final long length() {
        try {
            return Long.parseLong(a("stat -c '%s' @@"));
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // java.io.File
    public final String[] list() {
        return list(null);
    }

    @Override // java.io.File
    public final String[] list(FilenameFilter filenameFilter) {
        if (!b("[ -d @@ ]")) {
            return null;
        }
        String str = "ls -a " + this.g;
        ExecutorService executorService = wn1.m;
        un0 un0Var = new un0(rt0.k());
        un0Var.a(str);
        un0Var.i = new LinkedList();
        un0Var.j = null;
        List c = un0Var.e().c();
        ListIterator listIterator = c.listIterator();
        while (listIterator.hasNext()) {
            String str2 = (String) listIterator.next();
            if (str2.equals(".") || str2.equals("..") || (filenameFilter != null && !filenameFilter.accept(this, str2))) {
                listIterator.remove();
            }
        }
        return (String[]) c.toArray(new String[0]);
    }

    @Override // java.io.File
    public final File[] listFiles(FileFilter fileFilter) {
        String[] list = list(null);
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            ks1 c = c(str);
            if (fileFilter == null || fileFilter.accept(c)) {
                arrayList.add(c);
            }
        }
        return (ks1[]) arrayList.toArray(new ks1[0]);
    }

    @Override // java.io.File
    public final File[] listFiles(FilenameFilter filenameFilter) {
        String[] list;
        if (!b("[ -d @@ ]") || (list = list(filenameFilter)) == null) {
            return null;
        }
        int length = list.length;
        ks1[] ks1VarArr = new ks1[length];
        for (int i = 0; i < length; i++) {
            ks1VarArr[i] = c(list[i]);
        }
        return ks1VarArr;
    }

    @Override // java.io.File
    public final boolean mkdir() {
        return b("mkdir @@");
    }

    @Override // java.io.File
    public final boolean mkdirs() {
        return b("mkdir -p @@");
    }

    @Override // java.io.File
    public final boolean renameTo(File file) {
        String str = "mv -f " + this.g + " " + k32.t(file.getAbsolutePath());
        ExecutorService executorService = wn1.m;
        un0 un0Var = new un0(rt0.k());
        un0Var.a(str);
        un0Var.i = null;
        return un0Var.e().e();
    }

    @Override // java.io.File
    public final boolean setExecutable(boolean z, boolean z2) {
        return e(1, z, z2);
    }

    @Override // java.io.File
    public final boolean setLastModified(long j) {
        return b("[ -e @@ ] && touch -t " + new SimpleDateFormat("yyyyMMddHHmm", Locale.US).format(new Date(j)) + " @@");
    }

    @Override // java.io.File
    public final boolean setReadOnly() {
        return e(2, false, false) && e(1, false, false);
    }

    @Override // java.io.File
    public final boolean setReadable(boolean z, boolean z2) {
        return e(4, z, z2);
    }

    @Override // java.io.File
    public final boolean setWritable(boolean z, boolean z2) {
        return e(2, z, z2);
    }
}
