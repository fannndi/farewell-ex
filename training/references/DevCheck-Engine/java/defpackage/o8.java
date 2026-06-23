package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class o8 extends xc1 {
    public final /* synthetic */ int d;
    public ArrayList e;
    public Object f;

    public o8(bx1 bx1Var, ArrayList arrayList) {
        this.d = 3;
        this.f = bx1Var;
        this.e = arrayList;
    }

    public /* synthetic */ o8(ArrayList arrayList, ArrayList arrayList2, int i) {
        this.d = i;
        this.e = arrayList;
        this.f = arrayList2;
    }

    @Override // defpackage.xc1
    public final boolean b(int i, int i2) {
        switch (this.d) {
            case 0:
                return ((y61) this.e.get(i)).equals(((ArrayList) this.f).get(i2));
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ArrayList arrayList = (ArrayList) this.f;
                ArrayList arrayList2 = this.e;
                if (i >= 0 && i2 >= 0 && i < arrayList2.size() && i2 < arrayList.size()) {
                    yv1 yv1Var = (yv1) arrayList2.get(i);
                    yv1 yv1Var2 = (yv1) arrayList.get(i2);
                    if (yv1Var.getClass() == yv1Var2.getClass()) {
                        if (yv1Var instanceof tv1) {
                            v91 v91Var = ((tv1) yv1Var).f1011a;
                            v91 v91Var2 = ((tv1) yv1Var2).f1011a;
                            u91 u91Var = v91Var.f1075a;
                            Drawable drawable = u91Var.d;
                            u91 u91Var2 = v91Var2.f1075a;
                            boolean z = drawable == u91Var2.d;
                            if (u91Var.c.equals(u91Var2.c) && Math.abs(v91Var.b - v91Var2.b) <= 0.1d && v91Var.c == v91Var2.c && v91Var.f == v91Var2.f && v91Var.e == v91Var2.e && v91Var.h == v91Var2.h && v91Var.g == v91Var2.g && z) {
                                return true;
                            }
                        } else {
                            x91 x91Var = ((wv1) yv1Var).b;
                            x91 x91Var2 = ((wv1) yv1Var2).b;
                            if (x91Var.f1172a == x91Var2.f1172a && x91Var.b.equals(x91Var2.b)) {
                                String str = x91Var.c;
                                String str2 = x91Var2.c;
                                if ((str == null ? str2 == null : str.equals(str2)) && x91Var.d == x91Var2.d && Math.abs(x91Var.e - x91Var2.e) <= 0.1d && x91Var.g == x91Var2.g && x91Var.f == x91Var2.f) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ArrayList arrayList3 = (ArrayList) this.f;
                ArrayList arrayList4 = this.e;
                if (i >= 0 && i2 >= 0 && i < arrayList4.size() && i2 < arrayList3.size()) {
                    hw1 hw1Var = (hw1) arrayList4.get(i);
                    hw1 hw1Var2 = (hw1) arrayList3.get(i2);
                    if (hw1Var.getClass() == hw1Var2.getClass()) {
                        if (hw1Var instanceof cw1) {
                            r91 r91Var = ((cw1) hw1Var).f158a;
                            r91 r91Var2 = ((cw1) hw1Var2).f158a;
                            q91 q91Var = r91Var.f878a;
                            Drawable drawable2 = q91Var.d;
                            q91 q91Var2 = r91Var2.f878a;
                            boolean z2 = drawable2 == q91Var2.d;
                            if (q91Var.c.equals(q91Var2.c) && Math.abs(r91Var.b - r91Var2.b) <= 0.1d && r91Var.c == r91Var2.c && r91Var.f == r91Var2.f && r91Var.e == r91Var2.e && z2) {
                                return true;
                            }
                        } else {
                            s91 s91Var = ((fw1) hw1Var).b;
                            s91 s91Var2 = ((fw1) hw1Var2).b;
                            if (s91Var.f923a == s91Var2.f923a && s91Var.b.equals(s91Var2.b)) {
                                String str3 = s91Var.c;
                                String str4 = s91Var2.c;
                                if ((str3 == null ? str4 == null : str3.equals(str4)) && s91Var.d == s91Var2.d && Math.abs(s91Var.e - s91Var2.e) <= 0.1d && s91Var.g == s91Var2.g && s91Var.f == s91Var2.f) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            default:
                zw1 zw1Var = (zw1) this.e.get(i);
                zw1 zw1Var2 = (zw1) ((bx1) this.f).e.get(i2);
                if (zw1Var.c != zw1Var2.c || zw1Var.h != zw1Var2.h || zw1Var.i != zw1Var2.i) {
                    return false;
                }
                String str5 = zw1Var.b;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = zw1Var2.b;
                return str5.equals(str6 != null ? str6 : "");
        }
    }

    @Override // defpackage.xc1
    public final boolean c(int i, int i2) {
        switch (this.d) {
            case 0:
                return ((y61) this.e.get(i)).i == ((y61) ((ArrayList) this.f).get(i2)).i;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ArrayList arrayList = (ArrayList) this.f;
                ArrayList arrayList2 = this.e;
                return i >= 0 && i2 >= 0 && i < arrayList2.size() && i2 < arrayList.size() && ((yv1) arrayList2.get(i)).a() == ((yv1) arrayList.get(i2)).a();
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ArrayList arrayList3 = (ArrayList) this.f;
                ArrayList arrayList4 = this.e;
                return i >= 0 && i2 >= 0 && i < arrayList4.size() && i2 < arrayList3.size() && ((hw1) arrayList4.get(i)).a() == ((hw1) arrayList3.get(i2)).a();
            default:
                String str = ((zw1) this.e.get(i)).f1291a;
                String str2 = ((zw1) ((bx1) this.f).e.get(i2)).f1291a;
                if (str == null || str2 == null) {
                    return false;
                }
                return str.equals(str2);
        }
    }

    @Override // defpackage.xc1
    public final Object r(int i, int i2) {
        boolean z = true;
        switch (this.d) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ArrayList arrayList = (ArrayList) this.f;
                ArrayList arrayList2 = this.e;
                if (i >= 0 && i2 >= 0 && i < arrayList2.size() && i2 < arrayList.size()) {
                    yv1 yv1Var = (yv1) arrayList2.get(i);
                    yv1 yv1Var2 = (yv1) arrayList.get(i2);
                    if ((yv1Var instanceof tv1) && (yv1Var2 instanceof tv1)) {
                        v91 v91Var = ((tv1) yv1Var).f1011a;
                        u91 u91Var = v91Var.f1075a;
                        v91 v91Var2 = ((tv1) yv1Var2).f1011a;
                        u91 u91Var2 = v91Var2.f1075a;
                        boolean equals = u91Var.c.equals(u91Var2.c);
                        boolean z2 = u91Var.d == u91Var2.d;
                        if (Math.abs(v91Var.b - v91Var2.b) <= 0.1d && v91Var.c == v91Var2.c && v91Var.f == v91Var2.f && v91Var.e == v91Var2.e && v91Var.h == v91Var2.h && v91Var.g == v91Var2.g) {
                            z = false;
                        }
                        if (equals && z2 && z) {
                        }
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ArrayList arrayList3 = (ArrayList) this.f;
                ArrayList arrayList4 = this.e;
                if (i >= 0 && i2 >= 0 && i < arrayList4.size() && i2 < arrayList3.size()) {
                    hw1 hw1Var = (hw1) arrayList4.get(i);
                    hw1 hw1Var2 = (hw1) arrayList3.get(i2);
                    if ((hw1Var instanceof cw1) && (hw1Var2 instanceof cw1)) {
                        r91 r91Var = ((cw1) hw1Var).f158a;
                        q91 q91Var = r91Var.f878a;
                        r91 r91Var2 = ((cw1) hw1Var2).f158a;
                        q91 q91Var2 = r91Var2.f878a;
                        boolean equals2 = q91Var.c.equals(q91Var2.c);
                        boolean z3 = q91Var.d == q91Var2.d;
                        if (Math.abs(r91Var.b - r91Var2.b) <= 0.1d && r91Var.c == r91Var2.c && r91Var.f == r91Var2.f && r91Var.e == r91Var2.e) {
                            z = false;
                        }
                        if (equals2 && z3 && z) {
                        }
                    }
                }
                break;
        }
        return null;
    }

    @Override // defpackage.xc1
    public final int s() {
        switch (this.d) {
            case 0:
                return ((ArrayList) this.f).size();
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return ((ArrayList) this.f).size();
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return ((ArrayList) this.f).size();
            default:
                return ((bx1) this.f).e.size();
        }
    }

    @Override // defpackage.xc1
    public final int t() {
        switch (this.d) {
        }
        return this.e.size();
    }
}
