package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class n81 implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    public final Preference g;

    public n81(Preference preference) {
        this.g = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.g;
        CharSequence e = preference.e();
        if (!preference.H || TextUtils.isEmpty(e)) {
            return;
        }
        contextMenu.setHeaderTitle(e);
        contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.g;
        Context context = preference.g;
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        CharSequence e = preference.e();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", e));
        Toast.makeText(context, context.getString(R.string.preference_copied, e), 0).show();
        return true;
    }
}
