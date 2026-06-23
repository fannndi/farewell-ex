package defpackage;

import androidx.emoji2.text.Fk.Iyrs;
import com.google.android.material.behavior.YqV.Gvyagftz;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public final class eu0 implements Map.Entry {
    public final gu0 g;
    public final int h;
    public final int i;

    public eu0(gu0 gu0Var, int i) {
        gu0Var.getClass();
        this.g = gu0Var;
        this.h = i;
        this.i = gu0Var.n;
    }

    public final void a() {
        if (this.g.n != this.i) {
            throw new ConcurrentModificationException(Gvyagftz.GpDarSn);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ym0.b(entry.getKey(), getKey()) && ym0.b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.g.g[this.h];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.g.h;
        objArr.getClass();
        return objArr[this.h];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        gu0 gu0Var = this.g;
        gu0Var.c();
        Object[] objArr = gu0Var.h;
        if (objArr == null) {
            int length = gu0Var.g.length;
            if (length < 0) {
                c.m(Iyrs.mfgvnkBu);
                return null;
            }
            objArr = new Object[length];
            gu0Var.h = objArr;
        }
        int i = this.h;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
