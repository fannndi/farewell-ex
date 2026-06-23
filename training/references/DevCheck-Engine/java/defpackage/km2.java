package defpackage;

import android.telephony.fHMN.BFtDZYxPcpGN;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class km2 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f540a;

    static {
        char[] cArr = new char[80];
        f540a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(op0.M(new ll2(((String) obj).getBytes(zl2.f1280a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof ll2) {
            sb.append(": \"");
            sb.append(op0.M((ll2) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof vl2) {
            sb.append(" {");
            c((vl2) obj, sb, i + 2);
            sb.append("\n");
            b(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i3, "key", entry.getKey());
        a(sb, i3, BFtDZYxPcpGN.fNhNjCbPDJTM, entry.getValue());
        sb.append("\n");
        b(i, sb);
        sb.append("}");
    }

    public static void b(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f540a, 0, i2);
            i -= i2;
        }
    }

    public static void c(vl2 vl2Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = vl2Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb, i, substring.substring(0, substring.length() - 4), vl2.i(method2, vl2Var, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, substring.substring(0, substring.length() - 3), vl2.i(method, vl2Var, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object i5 = vl2.i(method4, vl2Var, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) vl2.i(method5, vl2Var, new Object[0])).booleanValue()) {
                        }
                        a(sb, i, substring, i5);
                    } else if (i5 instanceof Boolean) {
                        if (!((Boolean) i5).booleanValue()) {
                        }
                        a(sb, i, substring, i5);
                    } else if (i5 instanceof Integer) {
                        if (((Integer) i5).intValue() == 0) {
                        }
                        a(sb, i, substring, i5);
                    } else if (i5 instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) i5).floatValue()) == 0) {
                        }
                        a(sb, i, substring, i5);
                    } else if (i5 instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) i5).doubleValue()) == 0) {
                        }
                        a(sb, i, substring, i5);
                    } else {
                        if (i5 instanceof String) {
                            equals = i5.equals("");
                        } else if (i5 instanceof ll2) {
                            equals = i5.equals(ll2.i);
                        } else if (i5 instanceof dl2) {
                            if (i5 == ((vl2) ((vl2) ((dl2) i5)).d(6))) {
                            }
                            a(sb, i, substring, i5);
                        } else {
                            if ((i5 instanceof Enum) && ((Enum) i5).ordinal() == 0) {
                            }
                            a(sb, i, substring, i5);
                        }
                        if (equals) {
                        }
                        a(sb, i, substring, i5);
                    }
                }
            }
            i2 = i3;
        }
        zm2 zm2Var = vl2Var.zzc;
        if (zm2Var != null) {
            for (int i6 = 0; i6 < zm2Var.f1282a; i6++) {
                a(sb, i, String.valueOf(zm2Var.b[i6] >>> 3), zm2Var.c[i6]);
            }
        }
    }
}
