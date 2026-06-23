package flar2.devcheck;

import Cwd.ynLVXgis;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;
import defpackage.a5;
import defpackage.c3;
import defpackage.du;
import defpackage.h12;
import defpackage.j12;
import defpackage.j3;
import defpackage.kk;
import defpackage.n3;
import defpackage.op0;
import defpackage.th2;
import flar2.devcheck.permissionsSummary.xEua.bPnJ;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class TranslateActivity extends a5 {
    public ArrayList F;
    public n3 G;

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_translate);
        A((MaterialToolbar) findViewById(R.id.toolbar));
        r().j0(true);
        r().m0(getString(R.string.translation));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.translation_recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        ArrayList arrayList = new ArrayList();
        this.F = arrayList;
        arrayList.add(new j12(R.drawable.canada, getString(R.string.translation_editor), "Ms. flar2"));
        this.F.add(new j12(R.drawable.bangladesh, getString(R.string.bengali), "rezwan_shahad"));
        this.F.add(new j12(R.drawable.china, getString(R.string.chinese_simplified), "Gaber, haseoxth, hon92TWROC, yaxisvip, HJ_zht"));
        this.F.add(new j12(R.drawable.taiwan, getString(R.string.chinese_traditional), bPnJ.mVGCD));
        this.F.add(new j12(R.drawable.czech, getString(R.string.czech), "Lukas Novotny"));
        this.F.add(new j12(R.drawable.germany, getString(R.string.german), "urcel, Tylog, blackforest, pido70, Marlonyo, mokka187"));
        this.F.add(new j12(R.drawable.japan, getString(R.string.japanese), "Rintan, HJ_zht, lindwurm"));
        this.F.add(new j12(R.drawable.spain, getString(R.string.spanish), "Saratoga79"));
        this.F.add(new j12(R.drawable.france, getString(R.string.french), ynLVXgis.JGldW));
        this.F.add(new j12(R.drawable.italy, getString(R.string.italian), "Luca Moisio Corsello, cpiva16, luca.minotto, grillinicolavocal"));
        this.F.add(new j12(R.drawable.hungary, getString(R.string.hungarian), "Zityi's Translator Team, Paha Ákos"));
        this.F.add(new j12(R.drawable.india, getString(R.string.malayalam), "Vishnu M Bhatt, aadish.rahman"));
        this.F.add(new j12(R.drawable.netherlands, getString(R.string.dutch), "Thom Wortelboer, Yamani Mondt"));
        this.F.add(new j12(R.drawable.portugal, getString(R.string.portuguese), "David Taranta"));
        this.F.add(new j12(R.drawable.brazil, getString(R.string.portuguese_brazil), "marciozomb13"));
        this.F.add(new j12(R.drawable.poland, getString(R.string.polish), "Marcin Rek, Sominemo, jagoda.jonczy94"));
        this.F.add(new j12(R.drawable.russia, getString(R.string.russian), nTAZxGMqQtZZAQ.VuQHF));
        this.F.add(new j12(R.drawable.slovenia, getString(R.string.slovenian), "Alan Knap (1337jay)"));
        this.F.add(new j12(R.drawable.finland, getString(R.string.finnish), "Kupru, Lemon200"));
        this.F.add(new j12(R.drawable.turkey, getString(R.string.turkish), "onukomer, Mevlüt TOPÇU"));
        this.F.add(new j12(R.drawable.vietnam, getString(R.string.vietnamese), "Nguyễn Lam, Duc Nguyen"));
        this.F.add(new j12(R.drawable.india, getString(R.string.hindi), "gkhatri055, swapnil sathe, shivatheboss11"));
        this.F.add(new j12(R.drawable.indonesia, getString(R.string.indonesian), "BhianxKerox, Dicky Herlambang, Nezumi Foxclaw, gojek.jkti9276, gilinhthoa"));
        this.F.add(new j12(R.drawable.arabic, getString(R.string.arabic), "fowaz12nm, zoobkabeer1, amarben1000, nawwwaf86"));
        this.F.add(new j12(R.drawable.ukraine, getString(R.string.ukrainian), qJTtDWNCVUDjB.EKPCN));
        this.F.add(new j12(R.drawable.slovakia, getString(R.string.slovak), "dukelc, Lukas Novotny"));
        this.F.add(new j12(R.drawable.korea, getString(R.string.korean), "sjssjs1344, esder7709"));
        this.F.add(new j12(R.drawable.bulgaria, getString(R.string.bulgarian), "contact"));
        this.F.add(new j12(R.drawable.malaysia, getString(R.string.malay), "bobhasnul, loner1683"));
        this.F.add(new j12(R.drawable.azerbaijan, getString(R.string.azerbaijani), ILBLnlCHDVqsSN.iFgo));
        this.F.add(new j12(R.drawable.romania, getString(R.string.romanian), "Valeriu Fusu, Igor Sorocean"));
        this.F.add(new j12(R.drawable.greece, getString(R.string.greek), "fanisantonakakis, ptv7610"));
        this.F.add(new j12(R.drawable.sweden, getString(R.string.swedish), "dtkvn, kaskoscars, lillasolkatten, burghardt71"));
        this.F.add(new j12(R.drawable.thailand, getString(R.string.thai), "naeyhihihi, mamjabeetja231, mobilephoninternetwifi, s.pattinum9, starbankkiz2499"));
        this.F.add(new j12(R.drawable.denmark, getString(R.string.danish), "Thomas Kristensen, danieljegstrup, zakirshikhli, eipgto1x00"));
        ArrayList arrayList2 = this.F;
        du duVar = new du();
        duVar.e = arrayList2;
        recyclerView.setAdapter(duVar);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_translate, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            try {
                op0.E(this);
            } catch (Exception unused) {
            }
            return true;
        }
        if (itemId != R.id.action_help_translate) {
            return super.onOptionsItemSelected(menuItem);
        }
        th2 th2Var = new th2(this);
        String string = getString(R.string.translation);
        j3 j3Var = (j3) th2Var.h;
        j3Var.e = string;
        j3Var.c = R.drawable.ic_translate_white_24dp;
        j3Var.g = "If you would like to see DevCheck in your language, and are able to translate, please volunteer below";
        th2Var.h("No thanks", new h12());
        th2Var.j("Volunteer", new kk(2, this));
        n3 a2 = th2Var.a();
        this.G = a2;
        a2.show();
        return true;
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        super.onPause();
        n3 n3Var = this.G;
        if (n3Var == null || !n3Var.isShowing()) {
            return;
        }
        this.G.dismiss();
    }
}
