package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import java.util.concurrent.ExecutorService;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class pt0 implements sw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f808a;

    public /* synthetic */ pt0(int i) {
        this.f808a = i;
    }

    @Override // defpackage.sw
    public final void accept(Object obj) {
        switch (this.f808a) {
            case 0:
                ExecutorService executorService = MainApp.h;
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                TextView textView = (TextView) obj;
                Resources resources = textView.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.afs_popup_min_size);
                textView.setMinimumWidth(dimensionPixelSize);
                textView.setMinimumHeight(dimensionPixelSize);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                layoutParams.gravity = 21;
                layoutParams.setMarginEnd(resources.getDimensionPixelOffset(R.dimen.afs_popup_margin_end));
                textView.setLayoutParams(layoutParams);
                Context context = textView.getContext();
                textView.setBackground(new na(k32.x(context, R.drawable.afs_popup_background)));
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setGravity(17);
                textView.setIncludeFontPadding(false);
                textView.setSingleLine(true);
                textView.setTextColor(bw0.j(context, android.R.attr.textColorPrimaryInverse));
                textView.setTextSize(0, resources.getDimensionPixelSize(R.dimen.afs_popup_text_size));
                break;
            default:
                TextView textView2 = (TextView) obj;
                Resources resources2 = textView2.getResources();
                textView2.setMinimumWidth(resources2.getDimensionPixelSize(R.dimen.afs_md2_popup_min_width));
                textView2.setMinimumHeight(resources2.getDimensionPixelSize(R.dimen.afs_md2_popup_min_height));
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
                layoutParams2.gravity = 49;
                layoutParams2.setMarginEnd(resources2.getDimensionPixelOffset(R.dimen.afs_md2_popup_margin_end));
                textView2.setLayoutParams(layoutParams2);
                Context context2 = textView2.getContext();
                textView2.setBackground(new aw0(context2));
                textView2.setElevation(resources2.getDimensionPixelOffset(R.dimen.afs_md2_popup_elevation));
                textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView2.setGravity(17);
                textView2.setIncludeFontPadding(false);
                textView2.setSingleLine(true);
                textView2.setTextColor(bw0.j(context2, android.R.attr.textColorPrimaryInverse));
                textView2.setTextSize(0, resources2.getDimensionPixelSize(R.dimen.afs_md2_popup_text_size));
                break;
        }
    }
}
