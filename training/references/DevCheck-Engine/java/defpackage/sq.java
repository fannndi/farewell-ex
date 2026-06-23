package defpackage;

import java.util.LinkedList;

/* loaded from: classes.dex */
public final class sq extends LinkedList {
    public final int g = 12;
    public int h = 0;
    public int i;

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean add(Integer num) {
        if ((this.i ^ num.intValue()) < 0) {
            this.h = 0;
            removeAll(this);
        }
        if (num.intValue() < 0) {
            this.h = 0;
            removeAll(this);
        }
        this.h = num.intValue() + this.h;
        if (size() >= this.g) {
            this.h -= ((Integer) removeFirst()).intValue();
        }
        this.i = num.intValue();
        return super.add(num);
    }

    public final int c() {
        if (size() > 0) {
            return this.h / size();
        }
        return 0;
    }
}
