package flar2.devcheck;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.text.util.Linkify;
import android.util.AndroidRuntimeException;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.c3;
import defpackage.i51;
import defpackage.n3;
import defpackage.op0;
import defpackage.pr;
import flar2.devcheck.AboutActivity;
import flar2.devcheck.R;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class AboutActivity extends a5 {
    public static final /* synthetic */ int G = 0;
    public n3 F;

    public static class AboutFragment extends PreferenceFragment {
        public static final /* synthetic */ int h = 0;
        public int g = 0;

        @Override // android.preference.PreferenceFragment, android.app.Fragment
        public final void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            final AboutActivity aboutActivity = (AboutActivity) getActivity();
            addPreferencesFromResource(R.xml.about);
            Preference findPreference = findPreference("prefAbout");
            if (i51.b("prefHardwareDB").booleanValue()) {
                findPreference.setTitle(R.string.app_name_pro);
            }
            final int i = 0;
            findPreference("openSourceLicenses").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: g
                @Override // android.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    int i2 = i;
                    AboutActivity aboutActivity2 = aboutActivity;
                    switch (i2) {
                        case 0:
                            int i3 = AboutActivity.AboutFragment.h;
                            int i4 = AboutActivity.G;
                            aboutActivity2.getClass();
                            try {
                                TypedValue typedValue = new TypedValue();
                                aboutActivity2.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                                int i5 = typedValue.data;
                                View inflate = aboutActivity2.getLayoutInflater().inflate(R.layout.opensourcelicenses, (ViewGroup) null);
                                th2 th2Var = new th2(aboutActivity2);
                                j3 j3Var = (j3) th2Var.h;
                                j3Var.s = inflate;
                                j3Var.e = aboutActivity2.getString(R.string.licenses);
                                th2Var.j(aboutActivity2.getString(R.string.okay), null);
                                TextView textView = (TextView) inflate.findViewById(R.id.opensource_tv2);
                                textView.setLinkTextColor(i5);
                                Linkify.addLinks(textView, 1);
                                TextView textView2 = (TextView) inflate.findViewById(R.id.opensource_tv3);
                                textView2.setLinkTextColor(i5);
                                Linkify.addLinks(textView2, 1);
                                TextView textView3 = (TextView) inflate.findViewById(R.id.opensource_tv16);
                                textView3.setLinkTextColor(i5);
                                Linkify.addLinks(textView3, 1);
                                TextView textView4 = (TextView) inflate.findViewById(R.id.opensource_tv40);
                                textView4.setLinkTextColor(i5);
                                Linkify.addLinks(textView4, 1);
                                TextView textView5 = (TextView) inflate.findViewById(R.id.opensource_tv26);
                                textView5.setLinkTextColor(i5);
                                Linkify.addLinks(textView5, 1);
                                TextView textView6 = (TextView) inflate.findViewById(R.id.opensource_tv8);
                                textView6.setLinkTextColor(i5);
                                Linkify.addLinks(textView6, 1);
                                TextView textView7 = (TextView) inflate.findViewById(R.id.opensource_tv105);
                                textView7.setLinkTextColor(i5);
                                Linkify.addLinks(textView7, 1);
                                TextView textView8 = (TextView) inflate.findViewById(R.id.opensource_tv110);
                                textView8.setLinkTextColor(i5);
                                Linkify.addLinks(textView8, 1);
                                TextView textView9 = (TextView) inflate.findViewById(R.id.opensource_tv112);
                                textView9.setLinkTextColor(i5);
                                Linkify.addLinks(textView9, 1);
                                TextView textView10 = (TextView) inflate.findViewById(R.id.opensource_tv113);
                                textView10.setLinkTextColor(i5);
                                Linkify.addLinks(textView10, 1);
                                n3 a2 = th2Var.a();
                                aboutActivity2.F = a2;
                                a2.show();
                                aboutActivity2.B(aboutActivity2.F);
                                break;
                            } catch (AndroidRuntimeException unused) {
                                break;
                            }
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i6 = AboutActivity.AboutFragment.h;
                            try {
                                aboutActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=flar2.devcheck")));
                                break;
                            } catch (Exception unused2) {
                                break;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i7 = AboutActivity.AboutFragment.h;
                            int i8 = AboutActivity.G;
                            View inflate2 = aboutActivity2.getLayoutInflater().inflate(R.layout.terms, (ViewGroup) null);
                            th2 th2Var2 = new th2(aboutActivity2);
                            j3 j3Var2 = (j3) th2Var2.h;
                            j3Var2.s = inflate2;
                            j3Var2.e = aboutActivity2.getString(R.string.terms_of_use);
                            th2Var2.j(aboutActivity2.getString(R.string.okay), null);
                            n3 a3 = th2Var2.a();
                            aboutActivity2.F = a3;
                            a3.show();
                            aboutActivity2.B(aboutActivity2.F);
                            break;
                        default:
                            int i9 = AboutActivity.AboutFragment.h;
                            try {
                                aboutActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/dev?id=5838978596909628585")));
                                break;
                            } catch (Exception unused3) {
                                break;
                            }
                    }
                    return true;
                    return true;
                    return true;
                }
            });
            final int i2 = 1;
            findPreference("rate").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: g
                @Override // android.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    int i22 = i2;
                    AboutActivity aboutActivity2 = aboutActivity;
                    switch (i22) {
                        case 0:
                            int i3 = AboutActivity.AboutFragment.h;
                            int i4 = AboutActivity.G;
                            aboutActivity2.getClass();
                            try {
                                TypedValue typedValue = new TypedValue();
                                aboutActivity2.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                                int i5 = typedValue.data;
                                View inflate = aboutActivity2.getLayoutInflater().inflate(R.layout.opensourcelicenses, (ViewGroup) null);
                                th2 th2Var = new th2(aboutActivity2);
                                j3 j3Var = (j3) th2Var.h;
                                j3Var.s = inflate;
                                j3Var.e = aboutActivity2.getString(R.string.licenses);
                                th2Var.j(aboutActivity2.getString(R.string.okay), null);
                                TextView textView = (TextView) inflate.findViewById(R.id.opensource_tv2);
                                textView.setLinkTextColor(i5);
                                Linkify.addLinks(textView, 1);
                                TextView textView2 = (TextView) inflate.findViewById(R.id.opensource_tv3);
                                textView2.setLinkTextColor(i5);
                                Linkify.addLinks(textView2, 1);
                                TextView textView3 = (TextView) inflate.findViewById(R.id.opensource_tv16);
                                textView3.setLinkTextColor(i5);
                                Linkify.addLinks(textView3, 1);
                                TextView textView4 = (TextView) inflate.findViewById(R.id.opensource_tv40);
                                textView4.setLinkTextColor(i5);
                                Linkify.addLinks(textView4, 1);
                                TextView textView5 = (TextView) inflate.findViewById(R.id.opensource_tv26);
                                textView5.setLinkTextColor(i5);
                                Linkify.addLinks(textView5, 1);
                                TextView textView6 = (TextView) inflate.findViewById(R.id.opensource_tv8);
                                textView6.setLinkTextColor(i5);
                                Linkify.addLinks(textView6, 1);
                                TextView textView7 = (TextView) inflate.findViewById(R.id.opensource_tv105);
                                textView7.setLinkTextColor(i5);
                                Linkify.addLinks(textView7, 1);
                                TextView textView8 = (TextView) inflate.findViewById(R.id.opensource_tv110);
                                textView8.setLinkTextColor(i5);
                                Linkify.addLinks(textView8, 1);
                                TextView textView9 = (TextView) inflate.findViewById(R.id.opensource_tv112);
                                textView9.setLinkTextColor(i5);
                                Linkify.addLinks(textView9, 1);
                                TextView textView10 = (TextView) inflate.findViewById(R.id.opensource_tv113);
                                textView10.setLinkTextColor(i5);
                                Linkify.addLinks(textView10, 1);
                                n3 a2 = th2Var.a();
                                aboutActivity2.F = a2;
                                a2.show();
                                aboutActivity2.B(aboutActivity2.F);
                                break;
                            } catch (AndroidRuntimeException unused) {
                                break;
                            }
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i6 = AboutActivity.AboutFragment.h;
                            try {
                                aboutActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=flar2.devcheck")));
                                break;
                            } catch (Exception unused2) {
                                break;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i7 = AboutActivity.AboutFragment.h;
                            int i8 = AboutActivity.G;
                            View inflate2 = aboutActivity2.getLayoutInflater().inflate(R.layout.terms, (ViewGroup) null);
                            th2 th2Var2 = new th2(aboutActivity2);
                            j3 j3Var2 = (j3) th2Var2.h;
                            j3Var2.s = inflate2;
                            j3Var2.e = aboutActivity2.getString(R.string.terms_of_use);
                            th2Var2.j(aboutActivity2.getString(R.string.okay), null);
                            n3 a3 = th2Var2.a();
                            aboutActivity2.F = a3;
                            a3.show();
                            aboutActivity2.B(aboutActivity2.F);
                            break;
                        default:
                            int i9 = AboutActivity.AboutFragment.h;
                            try {
                                aboutActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/dev?id=5838978596909628585")));
                                break;
                            } catch (Exception unused3) {
                                break;
                            }
                    }
                    return true;
                    return true;
                    return true;
                }
            });
            final int i3 = 2;
            findPreference("terms").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: g
                @Override // android.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    int i22 = i3;
                    AboutActivity aboutActivity2 = aboutActivity;
                    switch (i22) {
                        case 0:
                            int i32 = AboutActivity.AboutFragment.h;
                            int i4 = AboutActivity.G;
                            aboutActivity2.getClass();
                            try {
                                TypedValue typedValue = new TypedValue();
                                aboutActivity2.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                                int i5 = typedValue.data;
                                View inflate = aboutActivity2.getLayoutInflater().inflate(R.layout.opensourcelicenses, (ViewGroup) null);
                                th2 th2Var = new th2(aboutActivity2);
                                j3 j3Var = (j3) th2Var.h;
                                j3Var.s = inflate;
                                j3Var.e = aboutActivity2.getString(R.string.licenses);
                                th2Var.j(aboutActivity2.getString(R.string.okay), null);
                                TextView textView = (TextView) inflate.findViewById(R.id.opensource_tv2);
                                textView.setLinkTextColor(i5);
                                Linkify.addLinks(textView, 1);
                                TextView textView2 = (TextView) inflate.findViewById(R.id.opensource_tv3);
                                textView2.setLinkTextColor(i5);
                                Linkify.addLinks(textView2, 1);
                                TextView textView3 = (TextView) inflate.findViewById(R.id.opensource_tv16);
                                textView3.setLinkTextColor(i5);
                                Linkify.addLinks(textView3, 1);
                                TextView textView4 = (TextView) inflate.findViewById(R.id.opensource_tv40);
                                textView4.setLinkTextColor(i5);
                                Linkify.addLinks(textView4, 1);
                                TextView textView5 = (TextView) inflate.findViewById(R.id.opensource_tv26);
                                textView5.setLinkTextColor(i5);
                                Linkify.addLinks(textView5, 1);
                                TextView textView6 = (TextView) inflate.findViewById(R.id.opensource_tv8);
                                textView6.setLinkTextColor(i5);
                                Linkify.addLinks(textView6, 1);
                                TextView textView7 = (TextView) inflate.findViewById(R.id.opensource_tv105);
                                textView7.setLinkTextColor(i5);
                                Linkify.addLinks(textView7, 1);
                                TextView textView8 = (TextView) inflate.findViewById(R.id.opensource_tv110);
                                textView8.setLinkTextColor(i5);
                                Linkify.addLinks(textView8, 1);
                                TextView textView9 = (TextView) inflate.findViewById(R.id.opensource_tv112);
                                textView9.setLinkTextColor(i5);
                                Linkify.addLinks(textView9, 1);
                                TextView textView10 = (TextView) inflate.findViewById(R.id.opensource_tv113);
                                textView10.setLinkTextColor(i5);
                                Linkify.addLinks(textView10, 1);
                                n3 a2 = th2Var.a();
                                aboutActivity2.F = a2;
                                a2.show();
                                aboutActivity2.B(aboutActivity2.F);
                                break;
                            } catch (AndroidRuntimeException unused) {
                                break;
                            }
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i6 = AboutActivity.AboutFragment.h;
                            try {
                                aboutActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=flar2.devcheck")));
                                break;
                            } catch (Exception unused2) {
                                break;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i7 = AboutActivity.AboutFragment.h;
                            int i8 = AboutActivity.G;
                            View inflate2 = aboutActivity2.getLayoutInflater().inflate(R.layout.terms, (ViewGroup) null);
                            th2 th2Var2 = new th2(aboutActivity2);
                            j3 j3Var2 = (j3) th2Var2.h;
                            j3Var2.s = inflate2;
                            j3Var2.e = aboutActivity2.getString(R.string.terms_of_use);
                            th2Var2.j(aboutActivity2.getString(R.string.okay), null);
                            n3 a3 = th2Var2.a();
                            aboutActivity2.F = a3;
                            a3.show();
                            aboutActivity2.B(aboutActivity2.F);
                            break;
                        default:
                            int i9 = AboutActivity.AboutFragment.h;
                            try {
                                aboutActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/dev?id=5838978596909628585")));
                                break;
                            } catch (Exception unused3) {
                                break;
                            }
                    }
                    return true;
                    return true;
                    return true;
                }
            });
            final int i4 = 3;
            findPreference("flar2").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: g
                @Override // android.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    int i22 = i4;
                    AboutActivity aboutActivity2 = aboutActivity;
                    switch (i22) {
                        case 0:
                            int i32 = AboutActivity.AboutFragment.h;
                            int i42 = AboutActivity.G;
                            aboutActivity2.getClass();
                            try {
                                TypedValue typedValue = new TypedValue();
                                aboutActivity2.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                                int i5 = typedValue.data;
                                View inflate = aboutActivity2.getLayoutInflater().inflate(R.layout.opensourcelicenses, (ViewGroup) null);
                                th2 th2Var = new th2(aboutActivity2);
                                j3 j3Var = (j3) th2Var.h;
                                j3Var.s = inflate;
                                j3Var.e = aboutActivity2.getString(R.string.licenses);
                                th2Var.j(aboutActivity2.getString(R.string.okay), null);
                                TextView textView = (TextView) inflate.findViewById(R.id.opensource_tv2);
                                textView.setLinkTextColor(i5);
                                Linkify.addLinks(textView, 1);
                                TextView textView2 = (TextView) inflate.findViewById(R.id.opensource_tv3);
                                textView2.setLinkTextColor(i5);
                                Linkify.addLinks(textView2, 1);
                                TextView textView3 = (TextView) inflate.findViewById(R.id.opensource_tv16);
                                textView3.setLinkTextColor(i5);
                                Linkify.addLinks(textView3, 1);
                                TextView textView4 = (TextView) inflate.findViewById(R.id.opensource_tv40);
                                textView4.setLinkTextColor(i5);
                                Linkify.addLinks(textView4, 1);
                                TextView textView5 = (TextView) inflate.findViewById(R.id.opensource_tv26);
                                textView5.setLinkTextColor(i5);
                                Linkify.addLinks(textView5, 1);
                                TextView textView6 = (TextView) inflate.findViewById(R.id.opensource_tv8);
                                textView6.setLinkTextColor(i5);
                                Linkify.addLinks(textView6, 1);
                                TextView textView7 = (TextView) inflate.findViewById(R.id.opensource_tv105);
                                textView7.setLinkTextColor(i5);
                                Linkify.addLinks(textView7, 1);
                                TextView textView8 = (TextView) inflate.findViewById(R.id.opensource_tv110);
                                textView8.setLinkTextColor(i5);
                                Linkify.addLinks(textView8, 1);
                                TextView textView9 = (TextView) inflate.findViewById(R.id.opensource_tv112);
                                textView9.setLinkTextColor(i5);
                                Linkify.addLinks(textView9, 1);
                                TextView textView10 = (TextView) inflate.findViewById(R.id.opensource_tv113);
                                textView10.setLinkTextColor(i5);
                                Linkify.addLinks(textView10, 1);
                                n3 a2 = th2Var.a();
                                aboutActivity2.F = a2;
                                a2.show();
                                aboutActivity2.B(aboutActivity2.F);
                                break;
                            } catch (AndroidRuntimeException unused) {
                                break;
                            }
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i6 = AboutActivity.AboutFragment.h;
                            try {
                                aboutActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=flar2.devcheck")));
                                break;
                            } catch (Exception unused2) {
                                break;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i7 = AboutActivity.AboutFragment.h;
                            int i8 = AboutActivity.G;
                            View inflate2 = aboutActivity2.getLayoutInflater().inflate(R.layout.terms, (ViewGroup) null);
                            th2 th2Var2 = new th2(aboutActivity2);
                            j3 j3Var2 = (j3) th2Var2.h;
                            j3Var2.s = inflate2;
                            j3Var2.e = aboutActivity2.getString(R.string.terms_of_use);
                            th2Var2.j(aboutActivity2.getString(R.string.okay), null);
                            n3 a3 = th2Var2.a();
                            aboutActivity2.F = a3;
                            a3.show();
                            aboutActivity2.B(aboutActivity2.F);
                            break;
                        default:
                            int i9 = AboutActivity.AboutFragment.h;
                            try {
                                aboutActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/dev?id=5838978596909628585")));
                                break;
                            } catch (Exception unused3) {
                                break;
                            }
                    }
                    return true;
                    return true;
                    return true;
                }
            });
        }

        @Override // android.preference.PreferenceFragment
        public final boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
            Intent intent = preference.getIntent();
            if (intent != null && getActivity() != null) {
                try {
                    startActivity(intent);
                } catch (Throwable unused) {
                }
                return true;
            }
            if (preference.getKey() == null || !preference.getKey().equals("prefAbout")) {
                return super.onPreferenceTreeClick(preferenceScreen, preference);
            }
            int i = this.g + 1;
            this.g = i;
            if (i == 5) {
                this.g = 0;
            }
            return true;
        }

        @Override // android.app.Fragment
        public final void onResume() {
            super.onResume();
            ((ListView) getActivity().findViewById(android.R.id.list)).setDivider(null);
        }
    }

    public final void B(n3 n3Var) {
        try {
            int i = (getResources().getDisplayMetrics().widthPixels * 90) / 100;
            if (getResources().getConfiguration().orientation == 2 || getResources().getBoolean(R.bool.isTablet)) {
                i = (getResources().getDisplayMetrics().widthPixels * 60) / 100;
            }
            n3Var.getWindow().setLayout(i, -2);
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_about);
        View findViewById = findViewById(R.id.about_container);
        if (findViewById != null) {
            op0.a(findViewById, false, true, false, false, true, true);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        r().j0(true);
        r().m0(getResources().getString(R.string.about));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        super.onBackPressed();
        return true;
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        super.onPause();
        n3 n3Var = this.F;
        if (n3Var == null || !n3Var.isShowing()) {
            return;
        }
        this.F.dismiss();
    }
}
