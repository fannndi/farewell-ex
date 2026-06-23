package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class s00 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f913a;

    public s00(int i) {
        switch (i) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                this.f913a = new LinkedHashMap(0, 0.75f, true);
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                this.f913a = new LinkedHashMap();
                break;
            case 3:
                this.f913a = new LinkedHashMap();
                break;
            default:
                this.f913a = new LinkedHashMap();
                break;
        }
    }

    public void a(qx0 qx0Var) {
        qx0Var.getClass();
        int i = qx0Var.f865a;
        int i2 = qx0Var.b;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.f913a;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(i2))) {
            Objects.toString(treeMap.get(Integer.valueOf(i2)));
            qx0Var.toString();
        }
        treeMap.put(Integer.valueOf(i2), qx0Var);
    }

    public void b(HashMap hashMap) {
        Object[] objArr;
        hashMap.getClass();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            if (value == null) {
                value = null;
            } else {
                vq a2 = af1.a(value.getClass());
                if (!a2.equals(af1.a(Boolean.TYPE)) && !a2.equals(af1.a(Byte.TYPE)) && !a2.equals(af1.a(Integer.TYPE)) && !a2.equals(af1.a(Long.TYPE)) && !a2.equals(af1.a(Float.TYPE)) && !a2.equals(af1.a(Double.TYPE)) && !a2.equals(af1.a(String.class)) && !a2.equals(af1.a(Boolean[].class)) && !a2.equals(af1.a(Byte[].class)) && !a2.equals(af1.a(Integer[].class)) && !a2.equals(af1.a(Long[].class)) && !a2.equals(af1.a(Float[].class)) && !a2.equals(af1.a(Double[].class)) && !a2.equals(af1.a(String[].class))) {
                    int i = 0;
                    if (a2.equals(af1.a(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        int i2 = x00.f1154a;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i < length) {
                            objArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                    } else if (a2.equals(af1.a(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        int i3 = x00.f1154a;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i < length2) {
                            objArr[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                    } else if (a2.equals(af1.a(int[].class))) {
                        int[] iArr = (int[]) value;
                        int i4 = x00.f1154a;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i < length3) {
                            objArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                    } else if (a2.equals(af1.a(long[].class))) {
                        long[] jArr = (long[]) value;
                        int i5 = x00.f1154a;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i < length4) {
                            objArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                    } else if (a2.equals(af1.a(float[].class))) {
                        float[] fArr = (float[]) value;
                        int i6 = x00.f1154a;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i < length5) {
                            objArr[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                    } else {
                        if (!a2.equals(af1.a(double[].class))) {
                            rw.h("Key ", str, " has invalid type ", a2);
                            return;
                        }
                        double[] dArr = (double[]) value;
                        int i7 = x00.f1154a;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i < length6) {
                            objArr[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                    }
                    value = objArr;
                }
            }
            this.f913a.put(str, value);
        }
    }

    public vq1 c(xb2 xb2Var) {
        xb2Var.getClass();
        return (vq1) this.f913a.remove(xb2Var);
    }

    public List d(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.f913a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (ym0.b(((xb2) entry.getKey()).f1176a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((xb2) it.next());
        }
        return yr.g0(linkedHashMap.values());
    }

    public vq1 e(xb2 xb2Var) {
        LinkedHashMap linkedHashMap = this.f913a;
        Object obj = linkedHashMap.get(xb2Var);
        if (obj == null) {
            obj = new vq1(xb2Var);
            linkedHashMap.put(xb2Var, obj);
        }
        return (vq1) obj;
    }
}
