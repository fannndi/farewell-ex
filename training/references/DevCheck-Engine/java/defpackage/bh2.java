package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.google.android.material.behavior.YqV.Gvyagftz;
import com.google.android.material.bottomappbar.HaCM.QCeVODiUkb;
import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.apache.commons.logging.impl.SimpleLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class bh2 implements Callable {
    public final /* synthetic */ int g;
    public final /* synthetic */ mj h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ bh2(mj mjVar, Object obj, Object obj2, int i) {
        this.g = i;
        this.h = mjVar;
        this.i = obj;
        this.j = obj2;
    }

    private final Object a() {
        Bundle h;
        ch2 ch2Var;
        mj mjVar = this.h;
        String str = (String) this.i;
        String str2 = (String) this.j;
        try {
            synchronized (mjVar.f636a) {
                ch2Var = mjVar.h;
            }
            if (ch2Var == null) {
                return bk2.h(li2.k, 119);
            }
            return ((zg2) ch2Var).j(mjVar.f.getPackageName(), str, str2);
        } catch (DeadObjectException e) {
            qj qjVar = li2.k;
            String a2 = hi2.a(e);
            h = bk2.h(qjVar, 5);
            if (a2 != null) {
                h.putString("ADDITIONAL_LOG_DETAILS", a2);
            }
            return h;
        } catch (Exception e2) {
            qj qjVar2 = li2.i;
            String a3 = hi2.a(e2);
            h = bk2.h(qjVar2, 5);
            if (a3 != null) {
                h.putString("ADDITIONAL_LOG_DETAILS", a3);
            }
            return h;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v39, types: [int] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        rg1 rg1Var;
        ch2 ch2Var;
        i8 r;
        ch2 ch2Var2;
        char c;
        u40 u40Var;
        Exception exc;
        ch2 ch2Var3;
        ch2 ch2Var4;
        char c2 = 5;
        int i = 119;
        Exception exc2 = null;
        boolean z = false;
        switch (this.g) {
            case 0:
                mj mjVar = this.h;
                kb1 kb1Var = (kb1) this.i;
                ArrayList arrayList = new ArrayList();
                String str = ((lb1) kb1Var.f526a.get(0)).b;
                qi2 qi2Var = kb1Var.f526a;
                int size = qi2Var.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        rg1Var = new rg1(0, nTAZxGMqQtZZAQ.tESBHZRl, arrayList);
                    } else {
                        int i3 = i2 + 20;
                        ArrayList arrayList2 = new ArrayList(qi2Var.subList(i2, i3 > size ? size : i3));
                        ArrayList<String> arrayList3 = new ArrayList<>();
                        int size2 = arrayList2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            arrayList3.add(((lb1) arrayList2.get(i4)).f580a);
                        }
                        Bundle bundle = new Bundle();
                        bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
                        bundle.putString("playBillingLibraryVersion", mjVar.c);
                        try {
                            synchronized (mjVar.f636a) {
                                ch2Var = mjVar.h;
                            }
                            if (ch2Var == null) {
                                rg1Var = mjVar.p(li2.k, 119, null);
                            } else {
                                int i5 = true != mjVar.s ? 17 : 20;
                                String packageName = mjVar.f.getPackageName();
                                if (mjVar.r) {
                                    mjVar.u.getClass();
                                }
                                String str2 = mjVar.c;
                                mjVar.j();
                                mjVar.j();
                                mjVar.j();
                                mjVar.j();
                                long longValue = mjVar.y.longValue();
                                Bundle bundle2 = new Bundle();
                                bk2.b(bundle2, str2, longValue);
                                bundle2.putBoolean("enablePendingPurchases", true);
                                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                                ArrayList<String> arrayList4 = new ArrayList<>();
                                ArrayList<String> arrayList5 = new ArrayList<>();
                                int size3 = arrayList2.size();
                                qi2 qi2Var2 = qi2Var;
                                int i6 = 0;
                                boolean z2 = false;
                                while (i6 < size3) {
                                    int i7 = i6;
                                    lb1 lb1Var = (lb1) arrayList2.get(i6);
                                    int i8 = size;
                                    arrayList4.add(null);
                                    z2 |= !TextUtils.isEmpty(null);
                                    if (lb1Var.b.equals("first_party")) {
                                        throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                                    }
                                    i6 = i7 + 1;
                                    size = i8;
                                }
                                int i9 = size;
                                if (z2) {
                                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                                }
                                if (!arrayList5.isEmpty()) {
                                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                                }
                                Bundle o = ((zg2) ch2Var).o(i5, packageName, str, bundle, bundle2);
                                if (o == null) {
                                    rg1Var = mjVar.p(li2.r, 44, null);
                                } else if (o.containsKey("DETAILS_LIST")) {
                                    ArrayList<String> stringArrayList = o.getStringArrayList("DETAILS_LIST");
                                    if (stringArrayList != null) {
                                        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                                            try {
                                                ra1 ra1Var = new ra1(stringArrayList.get(i10));
                                                bk2.f("BillingClient", Gvyagftz.uvg.concat(ra1Var.toString()));
                                                arrayList.add(ra1Var);
                                            } catch (JSONException e) {
                                                rg1Var = mjVar.p(li2.a(6, "Error trying to decode SkuDetails."), 47, e);
                                            }
                                        }
                                        i2 = i3;
                                        qi2Var = qi2Var2;
                                        size = i9;
                                    } else {
                                        rg1Var = mjVar.p(li2.r, 46, null);
                                    }
                                } else {
                                    int a2 = bk2.a("BillingClient", o);
                                    String e2 = bk2.e("BillingClient", o);
                                    rg1Var = a2 != 0 ? mjVar.p(li2.a(a2, e2), 23, null) : mjVar.p(li2.a(6, e2), 45, null);
                                }
                            }
                        } catch (DeadObjectException e3) {
                            rg1Var = mjVar.p(li2.k, 43, e3);
                        } catch (Exception e4) {
                            rg1Var = mjVar.p(li2.i, 43, e4);
                        }
                    }
                }
                ((wb) this.j).g(li2.a(rg1Var.b, (String) rg1Var.d), (ArrayList) rg1Var.c);
                return null;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                Exception exc3 = null;
                mj mjVar2 = this.h;
                String str3 = (String) this.i;
                mjVar2.getClass();
                bk2.f("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str3)));
                ArrayList arrayList6 = new ArrayList();
                boolean z3 = mjVar2.m;
                boolean z4 = mjVar2.r;
                mjVar2.u.getClass();
                mjVar2.u.getClass();
                Bundle c3 = bk2.c(z3, z4, mjVar2.c, mjVar2.y.longValue());
                String str4 = null;
                while (true) {
                    try {
                        synchronized (mjVar2.f636a) {
                            ch2Var2 = mjVar2.h;
                        }
                        if (ch2Var2 == null) {
                            r = mjVar2.r(li2.k, 119, exc3);
                        } else {
                            Bundle n = mjVar2.m ? ((zg2) ch2Var2).n(true != mjVar2.r ? 9 : 19, mjVar2.f.getPackageName(), str3, str4, c3) : ((zg2) ch2Var2).m(mjVar2.f.getPackageName(), str3, str4);
                            th2 O = d10.O("getPurchase()", n);
                            qj qjVar = (qj) O.h;
                            if (qjVar != li2.j) {
                                r = mjVar2.r(qjVar, O.g, null);
                            } else {
                                ArrayList<String> stringArrayList2 = n.getStringArrayList(GFUHKHDfiFuPm.sDkFdy);
                                ArrayList<String> stringArrayList3 = n.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                ArrayList<String> stringArrayList4 = n.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                boolean z5 = false;
                                int i11 = 0;
                                while (i11 < stringArrayList3.size()) {
                                    String str5 = stringArrayList3.get(i11);
                                    String str6 = stringArrayList4.get(i11);
                                    bk2.f("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList2.get(i11))));
                                    try {
                                        Purchase purchase = new Purchase(str5, str6);
                                        JSONObject jSONObject = purchase.c;
                                        if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                                            c = 5;
                                            Log.isLoggable("BillingClient", 5);
                                            z5 = true;
                                        } else {
                                            c = 5;
                                        }
                                        arrayList6.add(purchase);
                                        i11++;
                                        c2 = c;
                                    } catch (JSONException e5) {
                                        r = mjVar2.r(li2.i, 51, e5);
                                    }
                                }
                                char c4 = c2;
                                if (z5) {
                                    mjVar2.v(26, 9, li2.i);
                                }
                                str4 = n.getString("INAPP_CONTINUATION_TOKEN");
                                bk2.f("BillingClient", "Continuation token: ".concat(String.valueOf(str4)));
                                if (TextUtils.isEmpty(str4)) {
                                    r = new i8(li2.j, arrayList6);
                                } else {
                                    c2 = c4;
                                    exc3 = null;
                                }
                            }
                        }
                    } catch (DeadObjectException e6) {
                        r = mjVar2.r(li2.k, 52, e6);
                    } catch (Exception e7) {
                        r = mjVar2.r(li2.i, 52, e7);
                    }
                }
                List list = (List) r.g;
                sb sbVar = (sb) this.j;
                qj qjVar2 = (qj) r.h;
                if (list != null) {
                    sbVar.a(qjVar2, list);
                    return null;
                }
                ni2 ni2Var = qi2.h;
                sbVar.a(qjVar2, gj2.k);
                return null;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                mj mjVar3 = this.h;
                String str7 = (String) this.i;
                mjVar3.getClass();
                bk2.f("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str7)));
                ArrayList arrayList7 = new ArrayList();
                boolean z6 = mjVar3.m;
                boolean z7 = mjVar3.r;
                mjVar3.u.getClass();
                mjVar3.u.getClass();
                Bundle c5 = bk2.c(z6, z7, mjVar3.c, mjVar3.y.longValue());
                String str8 = null;
                while (true) {
                    int i12 = 14;
                    if (mjVar3.l) {
                        try {
                            synchronized (mjVar3.f636a) {
                                try {
                                    ch2Var3 = mjVar3.h;
                                } catch (Throwable th) {
                                    th = th;
                                    exc = exc2;
                                    while (true) {
                                        try {
                                            try {
                                                throw th;
                                            } catch (DeadObjectException e8) {
                                                e = e8;
                                                u40Var = mjVar3.q(li2.k, 59, e);
                                                ((hb1) this.j).c((qj) u40Var.i, (List) u40Var.h);
                                                return exc;
                                            } catch (Exception e9) {
                                                e = e9;
                                                u40Var = mjVar3.q(li2.i, 59, e);
                                                ((hb1) this.j).c((qj) u40Var.i, (List) u40Var.h);
                                                return exc;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            }
                            if (ch2Var3 == null) {
                                u40Var = mjVar3.q(li2.k, i, exc2);
                            } else {
                                Bundle l = ((zg2) ch2Var3).l(mjVar3.f.getPackageName(), str7, str8, c5);
                                th2 O2 = d10.O("getPurchaseHistory()", l);
                                qj qjVar3 = (qj) O2.h;
                                if (qjVar3 != li2.j) {
                                    mjVar3.v(O2.g, 11, qjVar3);
                                    u40Var = new u40(qjVar3, exc2, i12, z);
                                } else {
                                    ArrayList<String> stringArrayList5 = l.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                    ArrayList<String> stringArrayList6 = l.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                    ArrayList<String> stringArrayList7 = l.getStringArrayList(QCeVODiUkb.yAmr);
                                    boolean z8 = z;
                                    for (?? r5 = r5; r5 < stringArrayList6.size(); r5++) {
                                        String str9 = stringArrayList6.get(r5);
                                        exc = exc2;
                                        String str10 = stringArrayList7.get(r5);
                                        bk2.f("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList5.get(r5))));
                                        try {
                                            PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str9, str10);
                                            JSONObject jSONObject2 = purchaseHistoryRecord.c;
                                            if (TextUtils.isEmpty(jSONObject2.optString("token", jSONObject2.optString("purchaseToken")))) {
                                                Log.isLoggable("BillingClient", 5);
                                                z8 = true;
                                            }
                                            arrayList7.add(purchaseHistoryRecord);
                                            exc2 = exc;
                                        } catch (JSONException e10) {
                                            u40Var = mjVar3.q(li2.i, 51, e10);
                                        }
                                    }
                                    exc = exc2;
                                    if (z8) {
                                        mjVar3.v(26, 11, li2.i);
                                    }
                                    str8 = l.getString("INAPP_CONTINUATION_TOKEN");
                                    bk2.f("BillingClient", "Continuation token: ".concat(String.valueOf(str8)));
                                    if (TextUtils.isEmpty(str8)) {
                                        u40Var = new u40(li2.j, arrayList7, 14, false);
                                    } else {
                                        exc2 = exc;
                                        i = 119;
                                        z = false;
                                    }
                                }
                            }
                        } catch (DeadObjectException e11) {
                            e = e11;
                            exc = exc2;
                        } catch (Exception e12) {
                            e = e12;
                            exc = exc2;
                        }
                    } else {
                        Log.isLoggable("BillingClient", 5);
                        u40Var = new u40(li2.n, exc2, i12, z);
                    }
                }
                exc = exc2;
                ((hb1) this.j).c((qj) u40Var.i, (List) u40Var.h);
                return exc;
            case 3:
                return a();
            default:
                mj mjVar4 = this.h;
                tb tbVar = (tb) this.i;
                o1 o1Var = (o1) this.j;
                try {
                    synchronized (mjVar4.f636a) {
                        ch2Var4 = mjVar4.h;
                    }
                    if (ch2Var4 == null) {
                        mjVar4.s(tbVar, li2.k, 119, null);
                    } else {
                        String packageName2 = mjVar4.f.getPackageName();
                        String str11 = o1Var.h;
                        String str12 = mjVar4.c;
                        long longValue2 = mjVar4.y.longValue();
                        Bundle bundle3 = new Bundle();
                        bk2.b(bundle3, str12, longValue2);
                        Bundle i13 = ((zg2) ch2Var4).i(packageName2, str11, bundle3);
                        tbVar.d(li2.a(bk2.a("BillingClient", i13), bk2.e("BillingClient", i13)));
                    }
                } catch (DeadObjectException e13) {
                    mjVar4.s(tbVar, li2.k, 28, e13);
                } catch (Exception e14) {
                    mjVar4.s(tbVar, li2.i, 28, e14);
                }
                return null;
        }
    }
}
