package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import flar2.devcheck.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class du extends td1 {
    public final /* synthetic */ int d = 1;
    public Object e;

    public /* synthetic */ du() {
    }

    public du(td1[] td1VarArr) {
        List<td1> asList = Arrays.asList(td1VarArr);
        this.e = new eu(this);
        for (td1 td1Var : asList) {
            eu euVar = (eu) this.e;
            ArrayList arrayList = (ArrayList) euVar.d;
            int size = arrayList.size();
            if (size < 0 || size > arrayList.size()) {
                throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + size);
            }
            if (euVar.b != 1) {
                op0.c(IGQCApxXGMWo.FUJSyUcNUlyyP, td1Var.b);
            } else {
                boolean z = td1Var.b;
            }
            int size2 = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size2) {
                    i = -1;
                    break;
                } else if (((f11) arrayList.get(i)).c == td1Var) {
                    break;
                } else {
                    i++;
                }
            }
            if ((i == -1 ? null : (f11) arrayList.get(i)) == null) {
                f11 f11Var = new f11(td1Var, euVar, (th2) euVar.f, (ai1) ((h70) euVar.i).g);
                arrayList.add(size, f11Var);
                ArrayList arrayList2 = (ArrayList) euVar.c;
                int size3 = arrayList2.size();
                int i2 = 0;
                while (i2 < size3) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    RecyclerView recyclerView = (RecyclerView) ((WeakReference) obj).get();
                    if (recyclerView != null) {
                        td1Var.k(recyclerView);
                    }
                }
                if (f11Var.e > 0) {
                    ((du) euVar.e).i(euVar.f(f11Var), f11Var.e);
                }
                euVar.e();
            }
        }
        u(((eu) this.e).b != 1);
    }

    private final void v(RecyclerView recyclerView) {
    }

    @Override // defpackage.td1
    public int b(td1 td1Var, te1 te1Var, int i) {
        switch (this.d) {
            case 0:
                eu euVar = (eu) this.e;
                f11 f11Var = (f11) ((IdentityHashMap) euVar.g).get(te1Var);
                if (f11Var == null) {
                    return -1;
                }
                td1 td1Var2 = f11Var.c;
                int f = i - euVar.f(f11Var);
                int c = td1Var2.c();
                if (f >= 0 && f < c) {
                    return td1Var2.b(td1Var, te1Var, f);
                }
                throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + f + " which is out of bounds for the adapter with size " + c + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + te1Var + "adapter:" + td1Var);
            default:
                return super.b(td1Var, te1Var, i);
        }
    }

    @Override // defpackage.td1
    public final int c() {
        int i = 0;
        switch (this.d) {
            case 0:
                ArrayList arrayList = (ArrayList) ((eu) this.e).d;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    i += ((f11) obj).e;
                }
                return i;
            default:
                ArrayList arrayList2 = (ArrayList) this.e;
                if (arrayList2 == null) {
                    return 0;
                }
                return arrayList2.size();
        }
    }

    @Override // defpackage.td1
    public long d(int i) {
        switch (this.d) {
            case 0:
                eu euVar = (eu) this.e;
                h h = euVar.h(i);
                f11 f11Var = (f11) h.c;
                f11Var.c.d(h.f357a);
                f11Var.b.getClass();
                h.b = false;
                h.c = null;
                h.f357a = -1;
                euVar.h = h;
                return -1L;
            default:
                return super.d(i);
        }
    }

    @Override // defpackage.td1
    public int e(int i) {
        int i2;
        switch (this.d) {
            case 0:
                eu euVar = (eu) this.e;
                h h = euVar.h(i);
                f11 f11Var = (f11) h.c;
                int i3 = h.f357a;
                gr grVar = f11Var.f257a;
                int e = f11Var.c.e(i3);
                SparseIntArray sparseIntArray = (SparseIntArray) grVar.h;
                int indexOfKey = sparseIntArray.indexOfKey(e);
                if (indexOfKey > -1) {
                    i2 = sparseIntArray.valueAt(indexOfKey);
                } else {
                    th2 th2Var = (th2) grVar.k;
                    f11 f11Var2 = (f11) grVar.j;
                    int i4 = th2Var.g;
                    th2Var.g = i4 + 1;
                    ((SparseArray) th2Var.h).put(i4, f11Var2);
                    sparseIntArray.put(e, i4);
                    ((SparseIntArray) grVar.i).put(i4, e);
                    i2 = i4;
                }
                h.b = false;
                h.c = null;
                h.f357a = -1;
                euVar.h = h;
                return i2;
            default:
                return super.e(i);
        }
    }

    @Override // defpackage.td1
    public final void k(RecyclerView recyclerView) {
        switch (this.d) {
            case 0:
                eu euVar = (eu) this.e;
                ArrayList arrayList = (ArrayList) euVar.c;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    if (((WeakReference) obj).get() == recyclerView) {
                        break;
                    }
                }
                arrayList.add(new WeakReference(recyclerView));
                ArrayList arrayList2 = (ArrayList) euVar.d;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    ((f11) obj2).c.k(recyclerView);
                }
                break;
        }
    }

    @Override // defpackage.td1
    public final void l(te1 te1Var, int i) {
        switch (this.d) {
            case 0:
                eu euVar = (eu) this.e;
                h h = euVar.h(i);
                ((IdentityHashMap) euVar.g).put(te1Var, (f11) h.c);
                f11 f11Var = (f11) h.c;
                f11Var.c.a(te1Var, h.f357a);
                h.b = false;
                h.c = null;
                h.f357a = -1;
                euVar.h = h;
                break;
            default:
                i12 i12Var = (i12) te1Var;
                TextView textView = i12Var.A;
                ArrayList arrayList = (ArrayList) this.e;
                textView.setText(((j12) arrayList.get(i12Var.b())).f457a);
                i12Var.B.setText(((j12) arrayList.get(i12Var.b())).b);
                i12Var.C.setImageResource(((j12) arrayList.get(i12Var.b())).c);
                break;
        }
    }

    @Override // defpackage.td1
    public final te1 n(ViewGroup viewGroup, int i) {
        switch (this.d) {
            case 0:
                f11 f11Var = (f11) ((SparseArray) ((th2) ((eu) this.e).f).h).get(i);
                if (f11Var == null) {
                    c.m(d51.q("Cannot find the wrapper for global view type ", i));
                    f11Var = null;
                }
                gr grVar = f11Var.f257a;
                SparseIntArray sparseIntArray = (SparseIntArray) grVar.i;
                int indexOfKey = sparseIntArray.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return f11Var.c.n(viewGroup, sparseIntArray.valueAt(indexOfKey));
                }
                throw new IllegalStateException("requested global type " + i + " does not belong to the adapter:" + ((f11) grVar.j).c);
            default:
                View j = d51.j(viewGroup, R.layout.translator_card, viewGroup, false);
                i12 i12Var = new i12(j);
                i12Var.A = (TextView) j.findViewById(R.id.language);
                i12Var.B = (TextView) j.findViewById(R.id.translator);
                i12Var.C = (ImageView) j.findViewById(R.id.language_flag);
                return i12Var;
        }
    }

    @Override // defpackage.td1
    public void o(RecyclerView recyclerView) {
        switch (this.d) {
            case 0:
                eu euVar = (eu) this.e;
                ArrayList arrayList = (ArrayList) euVar.c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        WeakReference weakReference = (WeakReference) arrayList.get(size);
                        if (weakReference.get() == null) {
                            arrayList.remove(size);
                        } else if (weakReference.get() == recyclerView) {
                            arrayList.remove(size);
                        }
                        size--;
                    }
                }
                ArrayList arrayList2 = (ArrayList) euVar.d;
                int size2 = arrayList2.size();
                int i = 0;
                while (i < size2) {
                    Object obj = arrayList2.get(i);
                    i++;
                    ((f11) obj).c.o(recyclerView);
                }
                break;
        }
    }

    @Override // defpackage.td1
    public boolean p(te1 te1Var) {
        switch (this.d) {
            case 0:
                eu euVar = (eu) this.e;
                IdentityHashMap identityHashMap = (IdentityHashMap) euVar.g;
                f11 f11Var = (f11) identityHashMap.get(te1Var);
                if (f11Var == null) {
                    jw0.i("Cannot find wrapper for ", te1Var, ", seems like it is not bound by this adapter: ", euVar);
                    return false;
                }
                boolean p = f11Var.c.p(te1Var);
                identityHashMap.remove(te1Var);
                return p;
            default:
                return super.p(te1Var);
        }
    }

    @Override // defpackage.td1
    public void q(te1 te1Var) {
        switch (this.d) {
            case 0:
                ((eu) this.e).i(te1Var).c.q(te1Var);
                break;
        }
    }

    @Override // defpackage.td1
    public void r(te1 te1Var) {
        switch (this.d) {
            case 0:
                ((eu) this.e).i(te1Var).c.r(te1Var);
                break;
        }
    }

    @Override // defpackage.td1
    public void s(te1 te1Var) {
        switch (this.d) {
            case 0:
                eu euVar = (eu) this.e;
                IdentityHashMap identityHashMap = (IdentityHashMap) euVar.g;
                f11 f11Var = (f11) identityHashMap.get(te1Var);
                if (f11Var == null) {
                    jw0.i("Cannot find wrapper for ", te1Var, ILBLnlCHDVqsSN.wusHjXeetqd, euVar);
                    break;
                } else {
                    f11Var.c.s(te1Var);
                    identityHashMap.remove(te1Var);
                    break;
                }
        }
    }
}
