package defpackage;

import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class r60 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ r60(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    private final void a() {
        int i;
        mj1[] mj1VarArr;
        fh fhVar = (fh) this.h;
        synchronized (fhVar) {
            mj1VarArr = (mj1[]) ((HashSet) fhVar.i).toArray(new mj1[0]);
        }
        for (mj1 mj1Var : mj1VarArr) {
            ((ScheduledExecutorService) fhVar.h).submit(new r60(23, mj1Var));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:23|(7:25|(1:27)|28|29|30|32|33)|35|(5:46|47|48|49|33)|28|29|30|32|33) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b() {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r60.b():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:251|252|253|(2:349|350)|255|256|(21:(18:(1:268)|342|271|(15:(14:(1:283)|284|285|286|(3:289|(9:292|293|294|(1:296)(1:331)|297|(5:302|(4:305|(4:312|(1:314)|315|316)|311|303)|318|319|(1:321)(1:322))|323|324|(2:326|327)(1:328))(1:291)|287)|332|333|294|(0)(0)|297|(6:299|302|(1:303)|318|319|(0)(0))|323|324|(0)(0))|336|284|285|286|(1:287)|332|333|294|(0)(0)|297|(0)|323|324|(0)(0))|341|284|285|286|(1:287)|332|333|294|(0)(0)|297|(0)|323|324|(0)(0))|343|342|271|(16:273|(15:276|(2:280|283)|284|285|286|(1:287)|332|333|294|(0)(0)|297|(0)|323|324|(0)(0))|336|284|285|286|(1:287)|332|333|294|(0)(0)|297|(0)|323|324|(0)(0))|338|(0)|336|284|285|286|(1:287)|332|333|294|(0)(0)|297|(0)|323|324|(0)(0))|348|342|271|(0)|338|(0)|336|284|285|286|(1:287)|332|333|294|(0)(0)|297|(0)|323|324|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x049f, code lost:
    
        r1 = r3.replace(" · ", " × ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0339, code lost:
    
        if (r3.trim().isEmpty() != false) goto L178;
     */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0533 A[Catch: all -> 0x06c5, TryCatch #16 {all -> 0x06c5, blocks: (B:350:0x0331, B:256:0x033d, B:258:0x0466, B:261:0x0477, B:265:0x0480, B:268:0x0487, B:270:0x049f, B:271:0x04a7, B:273:0x0533, B:276:0x0544, B:280:0x054d, B:283:0x0554, B:284:0x056c, B:296:0x0647, B:297:0x064d, B:299:0x0671, B:302:0x0678, B:303:0x067e, B:305:0x0684, B:307:0x068a, B:312:0x0691, B:314:0x0697, B:315:0x069a, B:311:0x069d, B:319:0x06a0, B:322:0x06a7, B:323:0x06ab, B:338:0x053b, B:345:0x046e), top: B:349:0x0331 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0544 A[Catch: all -> 0x06c5, TryCatch #16 {all -> 0x06c5, blocks: (B:350:0x0331, B:256:0x033d, B:258:0x0466, B:261:0x0477, B:265:0x0480, B:268:0x0487, B:270:0x049f, B:271:0x04a7, B:273:0x0533, B:276:0x0544, B:280:0x054d, B:283:0x0554, B:284:0x056c, B:296:0x0647, B:297:0x064d, B:299:0x0671, B:302:0x0678, B:303:0x067e, B:305:0x0684, B:307:0x068a, B:312:0x0691, B:314:0x0697, B:315:0x069a, B:311:0x069d, B:319:0x06a0, B:322:0x06a7, B:323:0x06ab, B:338:0x053b, B:345:0x046e), top: B:349:0x0331 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x062d A[Catch: all -> 0x0635, TryCatch #7 {all -> 0x0635, blocks: (B:286:0x0620, B:287:0x0628, B:289:0x062d, B:291:0x0637, B:333:0x063a), top: B:285:0x0620 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0647 A[Catch: all -> 0x06c5, TryCatch #16 {all -> 0x06c5, blocks: (B:350:0x0331, B:256:0x033d, B:258:0x0466, B:261:0x0477, B:265:0x0480, B:268:0x0487, B:270:0x049f, B:271:0x04a7, B:273:0x0533, B:276:0x0544, B:280:0x054d, B:283:0x0554, B:284:0x056c, B:296:0x0647, B:297:0x064d, B:299:0x0671, B:302:0x0678, B:303:0x067e, B:305:0x0684, B:307:0x068a, B:312:0x0691, B:314:0x0697, B:315:0x069a, B:311:0x069d, B:319:0x06a0, B:322:0x06a7, B:323:0x06ab, B:338:0x053b, B:345:0x046e), top: B:349:0x0331 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0671 A[Catch: all -> 0x06c5, TryCatch #16 {all -> 0x06c5, blocks: (B:350:0x0331, B:256:0x033d, B:258:0x0466, B:261:0x0477, B:265:0x0480, B:268:0x0487, B:270:0x049f, B:271:0x04a7, B:273:0x0533, B:276:0x0544, B:280:0x054d, B:283:0x0554, B:284:0x056c, B:296:0x0647, B:297:0x064d, B:299:0x0671, B:302:0x0678, B:303:0x067e, B:305:0x0684, B:307:0x068a, B:312:0x0691, B:314:0x0697, B:315:0x069a, B:311:0x069d, B:319:0x06a0, B:322:0x06a7, B:323:0x06ab, B:338:0x053b, B:345:0x046e), top: B:349:0x0331 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0684 A[Catch: all -> 0x06c5, TryCatch #16 {all -> 0x06c5, blocks: (B:350:0x0331, B:256:0x033d, B:258:0x0466, B:261:0x0477, B:265:0x0480, B:268:0x0487, B:270:0x049f, B:271:0x04a7, B:273:0x0533, B:276:0x0544, B:280:0x054d, B:283:0x0554, B:284:0x056c, B:296:0x0647, B:297:0x064d, B:299:0x0671, B:302:0x0678, B:303:0x067e, B:305:0x0684, B:307:0x068a, B:312:0x0691, B:314:0x0697, B:315:0x069a, B:311:0x069d, B:319:0x06a0, B:322:0x06a7, B:323:0x06ab, B:338:0x053b, B:345:0x046e), top: B:349:0x0331 }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06a6 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06a7 A[Catch: all -> 0x06c5, TryCatch #16 {all -> 0x06c5, blocks: (B:350:0x0331, B:256:0x033d, B:258:0x0466, B:261:0x0477, B:265:0x0480, B:268:0x0487, B:270:0x049f, B:271:0x04a7, B:273:0x0533, B:276:0x0544, B:280:0x054d, B:283:0x0554, B:284:0x056c, B:296:0x0647, B:297:0x064d, B:299:0x0671, B:302:0x0678, B:303:0x067e, B:305:0x0684, B:307:0x068a, B:312:0x0691, B:314:0x0697, B:315:0x069a, B:311:0x069d, B:319:0x06a0, B:322:0x06a7, B:323:0x06ab, B:338:0x053b, B:345:0x046e), top: B:349:0x0331 }] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:328:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x064c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r60.run():void");
    }
}
