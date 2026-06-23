package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.divider.MaterialDivider;
import flar2.devcheck.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes.dex */
public final class n8 extends td1 {
    public final ArrayList d;
    public final LayoutInflater e;
    public v8 f;
    public final a5 g;

    public n8(a5 a5Var, ArrayList arrayList) {
        this.e = LayoutInflater.from(a5Var);
        this.d = arrayList;
        this.g = a5Var;
        u(true);
    }

    @Override // defpackage.td1
    public final int c() {
        try {
            return this.d.size();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // defpackage.td1
    public final long d(int i) {
        try {
            return ((y61) this.d.get(i)).h.hashCode();
        } catch (NullPointerException unused) {
            return new Random().nextInt(1700) + 2800;
        }
    }

    @Override // defpackage.td1
    public final int e(int i) {
        try {
            return ((y61) this.d.get(i)).l;
        } catch (NullPointerException unused) {
            return -1;
        }
    }

    @Override // defpackage.td1
    public final void l(te1 te1Var, int i) {
        final m8 m8Var = (m8) te1Var;
        int i2 = m8Var.l;
        View view = m8Var.g;
        MaterialDivider materialDivider = m8Var.E;
        ImageView imageView = m8Var.D;
        TextView textView = m8Var.B;
        ImageView imageView2 = m8Var.C;
        TextView textView2 = m8Var.A;
        ArrayList arrayList = this.d;
        if (i2 == 0) {
            ((l8) m8Var).G.setText(((y61) arrayList.get(i)).g);
            return;
        }
        j61 j61Var = j61.g;
        a5 a5Var = this.g;
        if (i2 == 1) {
            final int b = m8Var.b();
            textView2.setText(((y61) arrayList.get(b)).g);
            imageView2.setImageDrawable(uz1.x(a5Var, ((y61) arrayList.get(b)).h));
            StringBuilder sb = new StringBuilder();
            if (((HashSet) ((y61) arrayList.get(b)).a()).isEmpty()) {
                sb = new StringBuilder(a5Var.getString(R.string.not_allowed));
                if (((y61) arrayList.get(b)).i == j61Var) {
                    sb = new StringBuilder(a5Var.getString(R.string.allowed));
                }
            } else {
                Iterator it = ((HashSet) ((y61) arrayList.get(b)).a()).iterator();
                while (it.hasNext()) {
                    sb.append(d10.y(a5Var, (String) it.next()));
                    sb.append("\n");
                }
            }
            textView.setText(sb.toString());
            imageView.setOnClickListener(new j8(this, b, m8Var, 1));
            if (((y61) arrayList.get(b)).j) {
                materialDivider.setVisibility(4);
            } else {
                materialDivider.setVisibility(0);
            }
            if (((y61) arrayList.get(b)).a() == null || !((HashSet) ((y61) arrayList.get(b)).a()).isEmpty()) {
                return;
            }
            final int i3 = 1;
            view.setOnLongClickListener(new View.OnLongClickListener(this, b, m8Var, i3) { // from class: k8
                public final /* synthetic */ int g;
                public final /* synthetic */ n8 h;
                public final /* synthetic */ int i;

                {
                    this.g = i3;
                    this.h = this;
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    int i4 = this.g;
                    int i5 = this.i;
                    n8 n8Var = this.h;
                    switch (i4) {
                        case 0:
                            n8Var.f.u0(((y61) n8Var.d.get(i5)).h);
                            break;
                        default:
                            n8Var.f.u0(((y61) n8Var.d.get(i5)).h);
                            break;
                    }
                    return true;
                }
            });
            return;
        }
        if (i2 != 5) {
            return;
        }
        final int b2 = m8Var.b();
        textView2.setText(((y61) arrayList.get(b2)).g);
        imageView2.setImageDrawable(uz1.x(a5Var, ((y61) arrayList.get(b2)).h));
        StringBuilder sb2 = new StringBuilder();
        if (((HashSet) ((y61) arrayList.get(b2)).a()).isEmpty()) {
            sb2 = new StringBuilder(a5Var.getString(R.string.not_allowed));
            if (((y61) arrayList.get(b2)).i == j61Var) {
                sb2 = new StringBuilder(a5Var.getString(R.string.allowed));
            } else if (((y61) arrayList.get(b2)).i == j61.i) {
                sb2 = new StringBuilder(a5Var.getString(R.string.special_access));
            }
        } else {
            Iterator it2 = ((HashSet) ((y61) arrayList.get(b2)).a()).iterator();
            while (it2.hasNext()) {
                sb2.append(d10.y(a5Var, (String) it2.next()));
                sb2.append("\n");
            }
        }
        textView.setText(sb2.toString());
        imageView.setOnClickListener(new j8(this, b2, m8Var, 0));
        if (((y61) arrayList.get(b2)).j) {
            materialDivider.setVisibility(4);
        } else {
            materialDivider.setVisibility(0);
        }
        if (((y61) arrayList.get(b2)).a() == null || !((HashSet) ((y61) arrayList.get(b2)).a()).isEmpty()) {
            return;
        }
        final int i4 = 0;
        view.setOnLongClickListener(new View.OnLongClickListener(this, b2, m8Var, i4) { // from class: k8
            public final /* synthetic */ int g;
            public final /* synthetic */ n8 h;
            public final /* synthetic */ int i;

            {
                this.g = i4;
                this.h = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                int i42 = this.g;
                int i5 = this.i;
                n8 n8Var = this.h;
                switch (i42) {
                    case 0:
                        n8Var.f.u0(((y61) n8Var.d.get(i5)).h);
                        break;
                    default:
                        n8Var.f.u0(((y61) n8Var.d.get(i5)).h);
                        break;
                }
                return true;
            }
        });
    }

    @Override // defpackage.td1
    public final te1 n(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.e;
        if (i != 0) {
            return new m8(this, layoutInflater.inflate(R.layout.permissions_app_item, viewGroup, false));
        }
        View inflate = layoutInflater.inflate(R.layout.permissions_summary_header, viewGroup, false);
        l8 l8Var = new l8(this, inflate);
        l8Var.G = (TextView) inflate.findViewById(R.id.title);
        return l8Var;
    }
}
