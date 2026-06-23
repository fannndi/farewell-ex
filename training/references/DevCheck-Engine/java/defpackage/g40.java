package defpackage;

import android.os.SystemClock;
import android.view.View;
import flar2.devcheck.taskmgr.TaskManagerActivity;
import flar2.devcheck.taskmgr2.TaskManager2Activity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class g40 implements v31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g40(int i, Object obj) {
        this.f317a = i;
        this.b = obj;
    }

    @Override // defpackage.v31
    public final void a(Object obj) {
        TaskManager2Activity taskManager2Activity;
        long j;
        int i = this.f317a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                i40 i40Var = (i40) obj2;
                if (((eq0) obj) != null && i40Var.k0) {
                    View j0 = i40Var.j0();
                    if (j0.getParent() != null) {
                        c.n("DialogFragment can not be attached to a container view");
                        break;
                    } else if (i40Var.o0 != null) {
                        if (ae0.H(3)) {
                            Objects.toString(i40Var.o0);
                        }
                        i40Var.o0.setContentView(j0);
                        break;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                y91 y91Var = (y91) obj;
                TaskManager2Activity taskManager2Activity2 = (TaskManager2Activity) obj2;
                if (y91Var != null) {
                    zv1 zv1Var = taskManager2Activity2.G;
                    ArrayList arrayList = y91Var.f1220a;
                    HashMap hashMap = zv1Var.i;
                    HashMap hashMap2 = zv1Var.j;
                    zv1Var.h = arrayList;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    HashSet hashSet = new HashSet();
                    Iterator it = zv1Var.h.iterator();
                    while (it.hasNext()) {
                        hashSet.add(Integer.valueOf(((v91) it.next()).f1075a.f1026a));
                    }
                    ArrayList arrayList2 = new ArrayList(hashMap2.keySet());
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj3 = arrayList2.get(i2);
                        i2++;
                        Integer num = (Integer) obj3;
                        if (hashSet.contains(num)) {
                            hashMap2.remove(num);
                            hashMap.remove(num);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(zv1Var.k.keySet());
                    int size2 = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj4 = arrayList3.get(i3);
                        i3++;
                        Integer num2 = (Integer) obj4;
                        if (hashSet.contains(num2) || hashMap2.containsKey(num2)) {
                            taskManager2Activity = taskManager2Activity2;
                        } else {
                            int intValue = num2.intValue();
                            v91 v91Var = (v91) hashMap.get(num2);
                            if (v91Var != null) {
                                taskManager2Activity = taskManager2Activity2;
                            } else {
                                ArrayList arrayList4 = zv1Var.f;
                                int size3 = arrayList4.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 < size3) {
                                        Object obj5 = arrayList4.get(i4);
                                        i4++;
                                        yv1 yv1Var = (yv1) obj5;
                                        taskManager2Activity = taskManager2Activity2;
                                        if (yv1Var instanceof tv1) {
                                            v91 v91Var2 = ((tv1) yv1Var).f1011a;
                                            if (v91Var2.f1075a.f1026a == intValue) {
                                                v91Var = v91Var2;
                                            }
                                        }
                                        taskManager2Activity2 = taskManager2Activity;
                                    } else {
                                        taskManager2Activity = taskManager2Activity2;
                                        v91Var = null;
                                    }
                                }
                            }
                            if (v91Var == null) {
                                List list = zv1Var.h;
                                int intValue2 = num2.intValue();
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        v91Var = (v91) it2.next();
                                        if (v91Var.f1075a.f1026a == intValue2) {
                                        }
                                    } else {
                                        v91Var = null;
                                    }
                                }
                            }
                            if (v91Var != null) {
                                hashMap.put(num2, v91Var);
                                hashMap2.put(num2, Long.valueOf(uptimeMillis + 2000));
                            }
                        }
                        taskManager2Activity2 = taskManager2Activity;
                    }
                    TaskManager2Activity taskManager2Activity3 = taskManager2Activity2;
                    ArrayList A = zv1Var.A(zv1Var.h);
                    if (zv1Var.l) {
                        int size4 = A.size();
                        int i5 = 0;
                        while (i5 < size4) {
                            Object obj6 = A.get(i5);
                            i5++;
                            int i6 = ((v91) obj6).f1075a.f1026a;
                            if (!zv1Var.m.contains(Integer.valueOf(i6))) {
                                zv1Var.g.add(Integer.valueOf(i6));
                            }
                        }
                    }
                    zv1Var.G(A);
                    taskManager2Activity3.E();
                    break;
                }
                break;
            default:
                t91 t91Var = (t91) obj;
                if (t91Var != null) {
                    zv1 zv1Var2 = ((TaskManagerActivity) obj2).G;
                    ArrayList arrayList5 = t91Var.f974a;
                    HashMap hashMap3 = zv1Var2.i;
                    HashMap hashMap4 = zv1Var2.j;
                    zv1Var2.h = arrayList5;
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    HashSet hashSet2 = new HashSet();
                    Iterator it3 = zv1Var2.h.iterator();
                    while (it3.hasNext()) {
                        hashSet2.add(Integer.valueOf(((r91) it3.next()).f878a.f827a));
                    }
                    ArrayList arrayList6 = new ArrayList(hashMap4.keySet());
                    int size5 = arrayList6.size();
                    int i7 = 0;
                    while (i7 < size5) {
                        Object obj7 = arrayList6.get(i7);
                        i7++;
                        Integer num3 = (Integer) obj7;
                        if (hashSet2.contains(num3)) {
                            hashMap4.remove(num3);
                            hashMap3.remove(num3);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(zv1Var2.k.keySet());
                    int size6 = arrayList7.size();
                    int i8 = 0;
                    while (i8 < size6) {
                        Object obj8 = arrayList7.get(i8);
                        i8++;
                        Integer num4 = (Integer) obj8;
                        if (!hashSet2.contains(num4) && !hashMap4.containsKey(num4)) {
                            int intValue3 = num4.intValue();
                            r91 r91Var = (r91) hashMap3.get(num4);
                            if (r91Var != null) {
                                j = 2000;
                            } else {
                                ArrayList arrayList8 = zv1Var2.f;
                                j = 2000;
                                int size7 = arrayList8.size();
                                int i9 = 0;
                                while (true) {
                                    if (i9 < size7) {
                                        Object obj9 = arrayList8.get(i9);
                                        i9++;
                                        hw1 hw1Var = (hw1) obj9;
                                        if (hw1Var instanceof cw1) {
                                            r91 r91Var2 = ((cw1) hw1Var).f158a;
                                            if (r91Var2.f878a.f827a == intValue3) {
                                                r91Var = r91Var2;
                                            }
                                        }
                                    } else {
                                        r91Var = null;
                                    }
                                }
                            }
                            if (r91Var == null) {
                                List list2 = zv1Var2.h;
                                int intValue4 = num4.intValue();
                                Iterator it4 = list2.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        r91 r91Var3 = (r91) it4.next();
                                        if (r91Var3.f878a.f827a == intValue4) {
                                            r91Var = r91Var3;
                                        }
                                    } else {
                                        r91Var = null;
                                    }
                                }
                            }
                            if (r91Var != null) {
                                hashMap3.put(num4, r91Var);
                                hashMap4.put(num4, Long.valueOf(uptimeMillis2 + j));
                            }
                        }
                    }
                    ArrayList z = zv1Var2.z(zv1Var2.h);
                    if (zv1Var2.l) {
                        int size8 = z.size();
                        int i10 = 0;
                        while (i10 < size8) {
                            Object obj10 = z.get(i10);
                            i10++;
                            int i11 = ((r91) obj10).f878a.f827a;
                            if (!zv1Var2.m.contains(Integer.valueOf(i11))) {
                                zv1Var2.g.add(Integer.valueOf(i11));
                            }
                        }
                    }
                    zv1Var2.F(z);
                    break;
                }
                break;
        }
    }
}
