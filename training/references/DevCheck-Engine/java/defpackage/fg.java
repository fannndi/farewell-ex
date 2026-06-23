package defpackage;

import android.app.Application;
import android.content.IntentFilter;
import android.os.BatteryManager;
import flar2.devcheck.MainApp;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class fg extends a4 {
    public static Boolean p;
    public static Boolean q;
    public qy0 c;
    public final ExecutorService d;
    public final String e;
    public final DecimalFormat f;
    public final DecimalFormat g;
    public final DecimalFormat h;
    public final sq i;
    public boolean j;
    public final qy0 k;
    public final w5 l;
    public final go1 m;
    public Timer n;
    public BatteryManager o;

    public fg(Application application) {
        super(application);
        this.f = new DecimalFormat("###.#");
        this.g = new DecimalFormat("0.00");
        this.h = new DecimalFormat("0.000");
        this.i = new sq();
        this.j = false;
        this.k = new qy0();
        this.l = new w5(3, this);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Application application2 = this.b;
        application2.getClass();
        application2.registerReceiver(this.l, intentFilter);
        this.d = MainApp.h;
        Application application3 = this.b;
        application3.getClass();
        this.e = om0.s(application3);
        Application application4 = this.b;
        application4.getClass();
        this.m = op0.m(application4);
    }

    @Override // defpackage.i72
    public final void b() {
        try {
            Application application = this.b;
            application.getClass();
            application.unregisterReceiver(this.l);
        } catch (Exception unused) {
        }
    }

    public final BatteryManager d() {
        if (this.o == null) {
            Application application = this.b;
            application.getClass();
            this.o = (BatteryManager) application.getApplicationContext().getSystemService("batterymanager");
        }
        return this.o;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:288:0x0b2f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03f7 A[Catch: Exception -> 0x046b, TRY_ENTER, TryCatch #3 {Exception -> 0x046b, blocks: (B:118:0x03f7, B:657:0x0416, B:660:0x0435, B:661:0x0450), top: B:116:0x03f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04b1 A[Catch: Exception -> 0x0048, TRY_ENTER, TRY_LEAVE, TryCatch #57 {Exception -> 0x0048, blocks: (B:3:0x0022, B:6:0x0032, B:7:0x0050, B:9:0x006f, B:12:0x008f, B:34:0x0159, B:37:0x0184, B:99:0x0389, B:110:0x03d8, B:120:0x046c, B:128:0x04b1, B:189:0x064f, B:198:0x06b0, B:201:0x06ba, B:203:0x06c4, B:215:0x0719, B:224:0x0747, B:225:0x075e, B:226:0x0753, B:227:0x0771, B:229:0x0784, B:230:0x079f, B:232:0x07b3, B:234:0x07e6, B:236:0x07ec, B:238:0x07fa, B:240:0x0804, B:242:0x0826, B:243:0x0817, B:247:0x082b, B:249:0x083b, B:251:0x0841, B:253:0x0847, B:254:0x0860, B:591:0x06e0, B:592:0x06ee, B:593:0x06fc, B:594:0x070a, B:596:0x07cf, B:598:0x07db), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04fe A[Catch: Exception -> 0x053d, TRY_LEAVE, TryCatch #55 {Exception -> 0x053d, blocks: (B:136:0x04f5, B:138:0x04fe), top: B:135:0x04f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x054b A[Catch: Exception -> 0x0574, TryCatch #7 {Exception -> 0x0574, blocks: (B:156:0x0542, B:158:0x054b, B:160:0x0555, B:162:0x055b, B:164:0x0561), top: B:155:0x0542 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0582 A[Catch: Exception -> 0x058e, TryCatch #14 {Exception -> 0x058e, blocks: (B:168:0x0578, B:170:0x0582, B:171:0x05ec, B:613:0x0595, B:615:0x05a3, B:618:0x05b2, B:621:0x05c1, B:624:0x05d0, B:627:0x05df), top: B:167:0x0578 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0648 A[Catch: Exception -> 0x064d, TRY_LEAVE, TryCatch #41 {Exception -> 0x064d, blocks: (B:184:0x0636, B:186:0x0648), top: B:183:0x0636 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x064f A[Catch: Exception -> 0x0048, TRY_ENTER, TRY_LEAVE, TryCatch #57 {Exception -> 0x0048, blocks: (B:3:0x0022, B:6:0x0032, B:7:0x0050, B:9:0x006f, B:12:0x008f, B:34:0x0159, B:37:0x0184, B:99:0x0389, B:110:0x03d8, B:120:0x046c, B:128:0x04b1, B:189:0x064f, B:198:0x06b0, B:201:0x06ba, B:203:0x06c4, B:215:0x0719, B:224:0x0747, B:225:0x075e, B:226:0x0753, B:227:0x0771, B:229:0x0784, B:230:0x079f, B:232:0x07b3, B:234:0x07e6, B:236:0x07ec, B:238:0x07fa, B:240:0x0804, B:242:0x0826, B:243:0x0817, B:247:0x082b, B:249:0x083b, B:251:0x0841, B:253:0x0847, B:254:0x0860, B:591:0x06e0, B:592:0x06ee, B:593:0x06fc, B:594:0x070a, B:596:0x07cf, B:598:0x07db), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x067c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06ba A[Catch: Exception -> 0x0048, TRY_ENTER, TryCatch #57 {Exception -> 0x0048, blocks: (B:3:0x0022, B:6:0x0032, B:7:0x0050, B:9:0x006f, B:12:0x008f, B:34:0x0159, B:37:0x0184, B:99:0x0389, B:110:0x03d8, B:120:0x046c, B:128:0x04b1, B:189:0x064f, B:198:0x06b0, B:201:0x06ba, B:203:0x06c4, B:215:0x0719, B:224:0x0747, B:225:0x075e, B:226:0x0753, B:227:0x0771, B:229:0x0784, B:230:0x079f, B:232:0x07b3, B:234:0x07e6, B:236:0x07ec, B:238:0x07fa, B:240:0x0804, B:242:0x0826, B:243:0x0817, B:247:0x082b, B:249:0x083b, B:251:0x0841, B:253:0x0847, B:254:0x0860, B:591:0x06e0, B:592:0x06ee, B:593:0x06fc, B:594:0x070a, B:596:0x07cf, B:598:0x07db), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0784 A[Catch: Exception -> 0x0048, TryCatch #57 {Exception -> 0x0048, blocks: (B:3:0x0022, B:6:0x0032, B:7:0x0050, B:9:0x006f, B:12:0x008f, B:34:0x0159, B:37:0x0184, B:99:0x0389, B:110:0x03d8, B:120:0x046c, B:128:0x04b1, B:189:0x064f, B:198:0x06b0, B:201:0x06ba, B:203:0x06c4, B:215:0x0719, B:224:0x0747, B:225:0x075e, B:226:0x0753, B:227:0x0771, B:229:0x0784, B:230:0x079f, B:232:0x07b3, B:234:0x07e6, B:236:0x07ec, B:238:0x07fa, B:240:0x0804, B:242:0x0826, B:243:0x0817, B:247:0x082b, B:249:0x083b, B:251:0x0841, B:253:0x0847, B:254:0x0860, B:591:0x06e0, B:592:0x06ee, B:593:0x06fc, B:594:0x070a, B:596:0x07cf, B:598:0x07db), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x07b3 A[Catch: Exception -> 0x0048, TryCatch #57 {Exception -> 0x0048, blocks: (B:3:0x0022, B:6:0x0032, B:7:0x0050, B:9:0x006f, B:12:0x008f, B:34:0x0159, B:37:0x0184, B:99:0x0389, B:110:0x03d8, B:120:0x046c, B:128:0x04b1, B:189:0x064f, B:198:0x06b0, B:201:0x06ba, B:203:0x06c4, B:215:0x0719, B:224:0x0747, B:225:0x075e, B:226:0x0753, B:227:0x0771, B:229:0x0784, B:230:0x079f, B:232:0x07b3, B:234:0x07e6, B:236:0x07ec, B:238:0x07fa, B:240:0x0804, B:242:0x0826, B:243:0x0817, B:247:0x082b, B:249:0x083b, B:251:0x0841, B:253:0x0847, B:254:0x0860, B:591:0x06e0, B:592:0x06ee, B:593:0x06fc, B:594:0x070a, B:596:0x07cf, B:598:0x07db), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x07ec A[Catch: Exception -> 0x0048, TryCatch #57 {Exception -> 0x0048, blocks: (B:3:0x0022, B:6:0x0032, B:7:0x0050, B:9:0x006f, B:12:0x008f, B:34:0x0159, B:37:0x0184, B:99:0x0389, B:110:0x03d8, B:120:0x046c, B:128:0x04b1, B:189:0x064f, B:198:0x06b0, B:201:0x06ba, B:203:0x06c4, B:215:0x0719, B:224:0x0747, B:225:0x075e, B:226:0x0753, B:227:0x0771, B:229:0x0784, B:230:0x079f, B:232:0x07b3, B:234:0x07e6, B:236:0x07ec, B:238:0x07fa, B:240:0x0804, B:242:0x0826, B:243:0x0817, B:247:0x082b, B:249:0x083b, B:251:0x0841, B:253:0x0847, B:254:0x0860, B:591:0x06e0, B:592:0x06ee, B:593:0x06fc, B:594:0x070a, B:596:0x07cf, B:598:0x07db), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x083b A[Catch: Exception -> 0x0048, TryCatch #57 {Exception -> 0x0048, blocks: (B:3:0x0022, B:6:0x0032, B:7:0x0050, B:9:0x006f, B:12:0x008f, B:34:0x0159, B:37:0x0184, B:99:0x0389, B:110:0x03d8, B:120:0x046c, B:128:0x04b1, B:189:0x064f, B:198:0x06b0, B:201:0x06ba, B:203:0x06c4, B:215:0x0719, B:224:0x0747, B:225:0x075e, B:226:0x0753, B:227:0x0771, B:229:0x0784, B:230:0x079f, B:232:0x07b3, B:234:0x07e6, B:236:0x07ec, B:238:0x07fa, B:240:0x0804, B:242:0x0826, B:243:0x0817, B:247:0x082b, B:249:0x083b, B:251:0x0841, B:253:0x0847, B:254:0x0860, B:591:0x06e0, B:592:0x06ee, B:593:0x06fc, B:594:0x070a, B:596:0x07cf, B:598:0x07db), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0919 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0b50 A[Catch: Exception -> 0x0b63, TRY_LEAVE, TryCatch #11 {Exception -> 0x0b63, blocks: (B:286:0x0b2f, B:291:0x0b50), top: B:285:0x0b2f }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0b69 A[Catch: Exception -> 0x0ba2, TryCatch #38 {Exception -> 0x0ba2, blocks: (B:294:0x0b63, B:296:0x0b69, B:302:0x0b86, B:304:0x0b90, B:307:0x0baa, B:309:0x0bbc, B:311:0x0bc4, B:313:0x0bce, B:316:0x0be1, B:318:0x0beb, B:321:0x0bfb, B:322:0x0c1e, B:324:0x0c24, B:329:0x0c31, B:331:0x0c6e, B:493:0x0c44, B:496:0x0c56, B:497:0x0c62), top: B:293:0x0b63 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0baa A[Catch: Exception -> 0x0ba2, TryCatch #38 {Exception -> 0x0ba2, blocks: (B:294:0x0b63, B:296:0x0b69, B:302:0x0b86, B:304:0x0b90, B:307:0x0baa, B:309:0x0bbc, B:311:0x0bc4, B:313:0x0bce, B:316:0x0be1, B:318:0x0beb, B:321:0x0bfb, B:322:0x0c1e, B:324:0x0c24, B:329:0x0c31, B:331:0x0c6e, B:493:0x0c44, B:496:0x0c56, B:497:0x0c62), top: B:293:0x0b63 }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0bc4 A[Catch: Exception -> 0x0ba2, TryCatch #38 {Exception -> 0x0ba2, blocks: (B:294:0x0b63, B:296:0x0b69, B:302:0x0b86, B:304:0x0b90, B:307:0x0baa, B:309:0x0bbc, B:311:0x0bc4, B:313:0x0bce, B:316:0x0be1, B:318:0x0beb, B:321:0x0bfb, B:322:0x0c1e, B:324:0x0c24, B:329:0x0c31, B:331:0x0c6e, B:493:0x0c44, B:496:0x0c56, B:497:0x0c62), top: B:293:0x0b63 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0be1 A[Catch: Exception -> 0x0ba2, TryCatch #38 {Exception -> 0x0ba2, blocks: (B:294:0x0b63, B:296:0x0b69, B:302:0x0b86, B:304:0x0b90, B:307:0x0baa, B:309:0x0bbc, B:311:0x0bc4, B:313:0x0bce, B:316:0x0be1, B:318:0x0beb, B:321:0x0bfb, B:322:0x0c1e, B:324:0x0c24, B:329:0x0c31, B:331:0x0c6e, B:493:0x0c44, B:496:0x0c56, B:497:0x0c62), top: B:293:0x0b63 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0c2b  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0c89 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0cd7  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0d3d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0dea A[Catch: Exception -> 0x0ba4, TRY_ENTER, TRY_LEAVE, TryCatch #37 {Exception -> 0x0ba4, blocks: (B:351:0x0d06, B:358:0x0d3e, B:360:0x0d6f, B:395:0x0dea, B:423:0x0ea8, B:425:0x0eae, B:427:0x0ebc, B:429:0x0ec6), top: B:350:0x0d06 }] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0e0f A[Catch: Exception -> 0x0e54, TryCatch #47 {Exception -> 0x0e54, blocks: (B:397:0x0e05, B:399:0x0e0f, B:401:0x0e13, B:403:0x0e19, B:405:0x0e26, B:407:0x0e2c, B:409:0x0e32, B:411:0x0e38, B:412:0x0e50), top: B:396:0x0e05 }] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0e5a A[Catch: NullPointerException | Exception -> 0x0ea6, TRY_ENTER, TryCatch #0 {NullPointerException | Exception -> 0x0ea6, blocks: (B:414:0x0e54, B:416:0x0e5a, B:418:0x0e67, B:419:0x0e83, B:421:0x0e8b), top: B:413:0x0e54 }] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0eae A[Catch: Exception -> 0x0ba4, TryCatch #37 {Exception -> 0x0ba4, blocks: (B:351:0x0d06, B:358:0x0d3e, B:360:0x0d6f, B:395:0x0dea, B:423:0x0ea8, B:425:0x0eae, B:427:0x0ebc, B:429:0x0ec6), top: B:350:0x0d06 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c3 A[Catch: Exception -> 0x01d4, TryCatch #49 {Exception -> 0x01d4, blocks: (B:41:0x01b0, B:43:0x01c3, B:45:0x01cb, B:738:0x01da), top: B:40:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0efa A[Catch: Exception -> 0x0f51, TryCatch #51 {Exception -> 0x0f51, blocks: (B:432:0x0ed5, B:434:0x0ee9, B:438:0x0eda, B:442:0x0eee, B:444:0x0efa, B:446:0x0f00, B:448:0x0f06, B:449:0x0f25, B:451:0x0f31), top: B:431:0x0ed5 }] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0f31 A[Catch: Exception -> 0x0f51, TRY_LEAVE, TryCatch #51 {Exception -> 0x0f51, blocks: (B:432:0x0ed5, B:434:0x0ee9, B:438:0x0eda, B:442:0x0eee, B:444:0x0efa, B:446:0x0f00, B:448:0x0f06, B:449:0x0f25, B:451:0x0f31), top: B:431:0x0ed5 }] */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0de1  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0d0f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0c75  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x09a1 A[Catch: Exception -> 0x098f, TryCatch #13 {Exception -> 0x098f, blocks: (B:282:0x0967, B:281:0x0960, B:511:0x0993, B:513:0x09a1, B:515:0x09a9, B:517:0x09bc, B:518:0x09e1, B:519:0x09d2, B:520:0x0a04, B:522:0x0a0a, B:524:0x0a10, B:526:0x0a18, B:528:0x0a2b, B:529:0x0a50, B:530:0x0a41, B:531:0x0a74, B:536:0x0a82), top: B:268:0x0917 }] */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0a04 A[Catch: Exception -> 0x098f, TryCatch #13 {Exception -> 0x098f, blocks: (B:282:0x0967, B:281:0x0960, B:511:0x0993, B:513:0x09a1, B:515:0x09a9, B:517:0x09bc, B:518:0x09e1, B:519:0x09d2, B:520:0x0a04, B:522:0x0a0a, B:524:0x0a10, B:526:0x0a18, B:528:0x0a2b, B:529:0x0a50, B:530:0x0a41, B:531:0x0a74, B:536:0x0a82), top: B:268:0x0917 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0894 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:599:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022f A[Catch: Exception -> 0x027f, TryCatch #18 {Exception -> 0x027f, blocks: (B:60:0x0228, B:63:0x022f, B:66:0x023a, B:67:0x0249, B:713:0x0258, B:716:0x0262, B:717:0x0271), top: B:59:0x0228 }] */
    /* JADX WARN: Removed duplicated region for block: B:651:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x0312 A[Catch: Exception -> 0x0335, TryCatch #30 {Exception -> 0x0335, blocks: (B:81:0x02f9, B:83:0x0308, B:85:0x032d, B:678:0x0312, B:680:0x0321, B:681:0x0329), top: B:80:0x02f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:689:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x02c3 A[Catch: Exception -> 0x02f6, TryCatch #5 {Exception -> 0x02f6, blocks: (B:702:0x029c, B:704:0x02a6, B:706:0x02ae, B:693:0x02bf, B:695:0x02c3, B:696:0x02e7, B:699:0x02e0, B:700:0x02bb), top: B:701:0x029c }] */
    /* JADX WARN: Removed duplicated region for block: B:699:0x02e0 A[Catch: Exception -> 0x02f6, TryCatch #5 {Exception -> 0x02f6, blocks: (B:702:0x029c, B:704:0x02a6, B:706:0x02ae, B:693:0x02bf, B:695:0x02c3, B:696:0x02e7, B:699:0x02e0, B:700:0x02bb), top: B:701:0x029c }] */
    /* JADX WARN: Removed duplicated region for block: B:701:0x029c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:708:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x01fe A[Catch: Exception -> 0x02f0, TRY_LEAVE, TryCatch #1 {Exception -> 0x02f0, blocks: (B:50:0x01e7, B:718:0x01fe), top: B:49:0x01e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:754:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0308 A[Catch: Exception -> 0x0335, TryCatch #30 {Exception -> 0x0335, blocks: (B:81:0x02f9, B:83:0x0308, B:85:0x032d, B:678:0x0312, B:680:0x0321, B:681:0x0329), top: B:80:0x02f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0354  */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r4v76 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v56 */
    /* JADX WARN: Type inference failed for: r8v88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 3927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fg.e():void");
    }
}
