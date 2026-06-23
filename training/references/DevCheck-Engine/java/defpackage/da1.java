package defpackage;

import android.app.ActivityManager;
import android.os.Debug;
import flar2.devcheck.ui.root.ProcessData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class da1 extends dl0 {
    public final /* synthetic */ ea1 h;

    public da1(ea1 ea1Var) {
        this.h = ea1Var;
        attachInterface(this, "flar2.devcheck.ui.root.IRootAidlInterface");
    }

    @Override // defpackage.el0
    public final ArrayList getProcessData() {
        ArrayList arrayList = new ArrayList();
        ActivityManager activityManager = (ActivityManager) this.h.getApplicationContext().getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        int[] iArr = new int[runningAppProcesses.size()];
        for (int i = 0; i < runningAppProcesses.size(); i++) {
            iArr[i] = runningAppProcesses.get(i).pid;
        }
        Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(iArr);
        for (int i2 = 0; i2 < processMemoryInfo.length; i2++) {
            arrayList.add(new ProcessData(iArr[i2], runningAppProcesses.get(i2).processName, processMemoryInfo[i2].getTotalPss() / rt0.v));
        }
        Collections.sort(arrayList, new a9(17));
        return arrayList;
    }
}
