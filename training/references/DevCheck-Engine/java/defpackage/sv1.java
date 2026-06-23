package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class sv1 implements View.OnLongClickListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ td1 i;

    public /* synthetic */ sv1(td1 td1Var, Object obj, int i) {
        this.g = i;
        this.i = td1Var;
        this.h = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        String str;
        int i = this.g;
        int i2 = 0;
        Object obj = this.h;
        td1 td1Var = this.i;
        switch (i) {
            case 0:
                zv1 zv1Var = (zv1) td1Var;
                ud1 ud1Var = zv1Var.f983a;
                HashSet hashSet = zv1Var.m;
                HashSet hashSet2 = zv1Var.g;
                ArrayList arrayList = zv1Var.f;
                int b = ((te1) obj).b();
                if (b != -1) {
                    tv1 tv1Var = (tv1) arrayList.get(b);
                    int i3 = tv1Var.f1011a.f1075a.f1026a;
                    if (!hashSet2.contains(Integer.valueOf(i3))) {
                        List list = tv1Var.f1011a.d;
                        if (!hashSet2.contains(Integer.valueOf(i3))) {
                            hashSet2.add(Integer.valueOf(i3));
                            if (zv1Var.l) {
                                hashSet.remove(Integer.valueOf(i3));
                            }
                            int i4 = b + 1;
                            ArrayList arrayList2 = new ArrayList(list.size());
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(new wv1(i3, (x91) it.next()));
                            }
                            arrayList.addAll(i4, arrayList2);
                            zv1Var.i(i4, arrayList2.size());
                            ud1Var.d(b, 1, "expanded_state");
                            break;
                        }
                    } else if (hashSet2.contains(Integer.valueOf(i3))) {
                        hashSet2.remove(Integer.valueOf(i3));
                        if (zv1Var.l) {
                            hashSet.add(Integer.valueOf(i3));
                        }
                        int i5 = b + 1;
                        int i6 = 0;
                        while (true) {
                            int i7 = i5 + i6;
                            if (i7 < arrayList.size() && (arrayList.get(i7) instanceof wv1)) {
                                i6++;
                            }
                        }
                        if (i6 > 0) {
                            while (i2 < i6) {
                                arrayList.remove(i5);
                                i2++;
                            }
                            zv1Var.j(i5, i6);
                        }
                        ud1Var.d(b, 1, "expanded_state");
                        break;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                zv1 zv1Var2 = (zv1) td1Var;
                ud1 ud1Var2 = zv1Var2.f983a;
                HashSet hashSet3 = zv1Var2.m;
                HashSet hashSet4 = zv1Var2.g;
                ArrayList arrayList3 = zv1Var2.f;
                int b2 = ((te1) obj).b();
                if (b2 != -1) {
                    cw1 cw1Var = (cw1) arrayList3.get(b2);
                    int i8 = cw1Var.f158a.f878a.f827a;
                    if (!hashSet4.contains(Integer.valueOf(i8))) {
                        List list2 = cw1Var.f158a.d;
                        if (!hashSet4.contains(Integer.valueOf(i8))) {
                            hashSet4.add(Integer.valueOf(i8));
                            if (zv1Var2.l) {
                                hashSet3.remove(Integer.valueOf(i8));
                            }
                            int i9 = b2 + 1;
                            ArrayList arrayList4 = new ArrayList(list2.size());
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(new fw1(i8, (s91) it2.next()));
                            }
                            arrayList3.addAll(i9, arrayList4);
                            zv1Var2.i(i9, arrayList4.size());
                            ud1Var2.d(b2, 1, "expanded_state");
                            break;
                        }
                    } else if (hashSet4.contains(Integer.valueOf(i8))) {
                        hashSet4.remove(Integer.valueOf(i8));
                        if (zv1Var2.l) {
                            hashSet3.add(Integer.valueOf(i8));
                        }
                        int i10 = b2 + 1;
                        int i11 = 0;
                        while (true) {
                            int i12 = i10 + i11;
                            if (i12 < arrayList3.size() && (arrayList3.get(i12) instanceof fw1)) {
                                i11++;
                            }
                        }
                        if (i11 > 0) {
                            while (i2 < i11) {
                                arrayList3.remove(i10);
                                i2++;
                            }
                            zv1Var2.j(i10, i11);
                        }
                        ud1Var2.d(b2, 1, "expanded_state");
                        break;
                    }
                }
                break;
            default:
                gc1 gc1Var = (gc1) obj;
                cj cjVar = ((k02) td1Var).e;
                if (cjVar != null && (str = gc1Var.d) != null && !str.isEmpty()) {
                    if (cjVar.D0 != null || cjVar.F0()) {
                        cjVar.H0(gc1Var);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
