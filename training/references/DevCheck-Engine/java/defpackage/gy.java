package defpackage;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes.dex */
public final class gy implements FileFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f355a;

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        switch (this.f355a) {
            case 0:
                if (file.isDirectory() && hy.f405a.matcher(file.getName()).matches()) {
                    break;
                }
                break;
            default:
                if (file.isDirectory() && file.getName().startsWith("policy")) {
                    break;
                }
                break;
        }
        return true;
    }
}
