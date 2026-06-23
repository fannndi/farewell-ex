package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.BatteryManager;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class cg implements mj1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f124a;
    public final kp b;
    public final ku1 c;
    public final BatteryManager d;
    public long g;
    public int i;
    public long l;
    public final h91 m;
    public final IntentFilter e = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    public final ArrayDeque f = new ArrayDeque(60);
    public int h = 2;
    public int j = -1;
    public int k = -1;

    public cg(Application application, kp kpVar, h91 h91Var, ku1 ku1Var) {
        Context applicationContext = application.getApplicationContext();
        this.f124a = applicationContext;
        this.b = kpVar;
        this.m = h91Var;
        this.c = ku1Var;
        this.d = (BatteryManager) applicationContext.getSystemService("batterymanager");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v17 int, still in use, count: 2, list:
          (r2v17 int) from 0x03cb: IF  (r2v17 int) > (0 int)  -> B:211:0x03cf A[HIDDEN]
          (r2v17 int) from 0x03cf: PHI (r2v3 int) = (r2v2 int), (r2v17 int), (r2v18 int) binds: [B:214:0x03ce, B:213:0x03cb, B:210:0x03c3] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Can't wrap try/catch for region: R(92:0|1|(1:3)(1:340)|4|(1:6)(1:339)|7|(1:338)(1:10)|11|(4:12|13|(1:15)(1:336)|16)|17|(3:330|331|332)(1:23)|24|(2:288|(79:294|295|296|(1:327)|301|(2:317|(4:319|(1:321)(1:325)|322|(1:324)))(2:306|(4:308|(1:310)(1:314)|311|(1:313)))|315|(1:31)|32|33|(2:35|(2:37|(1:39)))|41|(2:281|(1:283)(1:284))|(1:45)(1:(1:279)(1:280))|46|(1:51)|(1:53)|54|(1:56)(3:271|(1:277)(1:275)|276)|57|(1:59)(3:266|(1:268)(1:270)|269)|60|(1:265)(1:64)|65|(4:67|(1:69)(6:253|254|255|256|257|258)|70|(1:72))(1:264)|73|(1:252)(1:77)|78|(1:84)|(2:86|(49:88|89|(3:93|94|95)|(2:99|(44:102|103|(3:107|108|(1:112))|115|(2:245|246)|117|(1:244)(2:123|(37:127|(2:129|(39:133|134|135|136|(34:140|141|(3:146|147|(3:151|152|(1:156)))|159|(4:165|(1:167)|168|(30:170|(1:174)|175|(4:230|231|232|(9:234|178|(12:193|194|195|(1:197)(1:228)|198|(1:200)(1:227)|201|(1:203)(1:226)|(2:215|(2:220|(1:225)(1:224))(1:219))(1:207)|208|(1:210)(1:212)|211)|182|(1:184)(1:192)|185|(1:187)(1:191)|188|189))|177|178|(1:180)|193|194|195|(0)(0)|198|(0)(0)|201|(0)(0)|(0)|215|(1:217)|220|(1:222)|225|208|(0)(0)|211|182|(0)(0)|185|(0)(0)|188|189))|237|175|(0)|177|178|(0)|193|194|195|(0)(0)|198|(0)(0)|201|(0)(0)|(0)|215|(0)|220|(0)|225|208|(0)(0)|211|182|(0)(0)|185|(0)(0)|188|189)|238|141|(4:144|146|147|(4:149|151|152|(2:154|156)))|159|(6:161|163|165|(0)|168|(0))|237|175|(0)|177|178|(0)|193|194|195|(0)(0)|198|(0)(0)|201|(0)(0)|(0)|215|(0)|220|(0)|225|208|(0)(0)|211|182|(0)(0)|185|(0)(0)|188|189))(1:242)|241|238|141|(0)|159|(0)|237|175|(0)|177|178|(0)|193|194|195|(0)(0)|198|(0)(0)|201|(0)(0)|(0)|215|(0)|220|(0)|225|208|(0)(0)|211|182|(0)(0)|185|(0)(0)|188|189))|243|(0)(0)|241|238|141|(0)|159|(0)|237|175|(0)|177|178|(0)|193|194|195|(0)(0)|198|(0)(0)|201|(0)(0)|(0)|215|(0)|220|(0)|225|208|(0)(0)|211|182|(0)(0)|185|(0)(0)|188|189))|249|103|(4:105|107|108|(2:110|112))|115|(0)|117|(1:119)|244|243|(0)(0)|241|238|141|(0)|159|(0)|237|175|(0)|177|178|(0)|193|194|195|(0)(0)|198|(0)(0)|201|(0)(0)|(0)|215|(0)|220|(0)|225|208|(0)(0)|211|182|(0)(0)|185|(0)(0)|188|189))(1:251)|250|89|(4:91|93|94|95)|(0)|249|103|(0)|115|(0)|117|(0)|244|243|(0)(0)|241|238|141|(0)|159|(0)|237|175|(0)|177|178|(0)|193|194|195|(0)(0)|198|(0)(0)|201|(0)(0)|(0)|215|(0)|220|(0)|225|208|(0)(0)|211|182|(0)(0)|185|(0)(0)|188|189))|26|(76:31|32|33|(0)|41|(0)|281|(0)(0)|(0)(0)|46|(2:48|51)|(0)|54|(0)(0)|57|(0)(0)|60|(1:62)|265|65|(0)(0)|73|(1:75)|252|78|(2:80|84)|(0)(0)|250|89|(0)|(0)|249|103|(0)|115|(0)|117|(0)|244|243|(0)(0)|241|238|141|(0)|159|(0)|237|175|(0)|177|178|(0)|193|194|195|(0)(0)|198|(0)(0)|201|(0)(0)|(0)|215|(0)|220|(0)|225|208|(0)(0)|211|182|(0)(0)|185|(0)(0)|188|189)|31|32|33|(0)|41|(0)|281|(0)(0)|(0)(0)|46|(0)|(0)|54|(0)(0)|57|(0)(0)|60|(0)|265|65|(0)(0)|73|(0)|252|78|(0)|(0)(0)|250|89|(0)|(0)|249|103|(0)|115|(0)|117|(0)|244|243|(0)(0)|241|238|141|(0)|159|(0)|237|175|(0)|177|178|(0)|193|194|195|(0)(0)|198|(0)(0)|201|(0)(0)|(0)|215|(0)|220|(0)|225|208|(0)(0)|211|182|(0)(0)|185|(0)(0)|188|189|(2:(0)|(8:214|211|182|(0)(0)|185|(0)(0)|188|189))) */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x039a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03c3 A[Catch: all -> 0x03ce, TryCatch #4 {all -> 0x03ce, blocks: (B:195:0x0371, B:198:0x037e, B:201:0x038b, B:207:0x039e, B:210:0x03c3, B:212:0x03c5, B:215:0x03a3, B:217:0x03a7, B:219:0x03ab, B:220:0x03b0, B:222:0x03b4, B:224:0x03b8), top: B:194:0x0371 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03c5 A[Catch: all -> 0x03ce, TRY_LEAVE, TryCatch #4 {all -> 0x03ce, blocks: (B:195:0x0371, B:198:0x037e, B:201:0x038b, B:207:0x039e, B:210:0x03c3, B:212:0x03c5, B:215:0x03a3, B:217:0x03a7, B:219:0x03ab, B:220:0x03b0, B:222:0x03b4, B:224:0x03b8), top: B:194:0x0371 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03a7 A[Catch: all -> 0x03ce, TryCatch #4 {all -> 0x03ce, blocks: (B:195:0x0371, B:198:0x037e, B:201:0x038b, B:207:0x039e, B:210:0x03c3, B:212:0x03c5, B:215:0x03a3, B:217:0x03a7, B:219:0x03ab, B:220:0x03b0, B:222:0x03b4, B:224:0x03b8), top: B:194:0x0371 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03b4 A[Catch: all -> 0x03ce, TryCatch #4 {all -> 0x03ce, blocks: (B:195:0x0371, B:198:0x037e, B:201:0x038b, B:207:0x039e, B:210:0x03c3, B:212:0x03c5, B:215:0x03a3, B:217:0x03a7, B:219:0x03ab, B:220:0x03b0, B:222:0x03b4, B:224:0x03b8), top: B:194:0x0371 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x034c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0274 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104 A[Catch: all -> 0x0118, TryCatch #9 {all -> 0x0118, blocks: (B:33:0x00fc, B:35:0x0104, B:37:0x010e), top: B:32:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0242  */
    @Override // defpackage.mj1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg.a():void");
    }
}
