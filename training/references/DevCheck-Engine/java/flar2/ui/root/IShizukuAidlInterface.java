package flar2.devcheck.ui.root;

import android.os.IInterface;
import defpackage.ia1;
import defpackage.p91;
import defpackage.pm1;
import java.util.List;

/* loaded from: classes.dex */
public interface IShizukuAidlInterface extends IInterface {
    public static final String DESCRIPTOR = "flar2.devcheck.ui.root.IShizukuAidlInterface";

    void destroy();

    String execute(String str, long j);

    void exit();

    List<pm1> getAllServices();

    List<ProcessData> getProcessData();

    List<p91> getProcessMemInfo(int[] iArr);

    List<String> getServicesForUid(int i);

    List<ia1> getTopSnapshot(int i);

    int[] getUidImportance();

    String readTextFile(String str, int i);
}
