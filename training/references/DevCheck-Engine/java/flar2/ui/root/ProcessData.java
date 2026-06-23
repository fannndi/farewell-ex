package flar2.devcheck.ui.root;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.i11;

/* loaded from: classes.dex */
public class ProcessData implements Parcelable {
    public static final Parcelable.Creator<ProcessData> CREATOR = new i11(7);
    private String packageName;
    private int pid;
    private int totalPss;

    public ProcessData() {
    }

    public ProcessData(int i, String str, int i2) {
        this.pid = i;
        this.packageName = str;
        this.totalPss = i2;
    }

    public ProcessData(Parcel parcel) {
        readFromParcel(parcel);
    }

    private void readFromParcel(Parcel parcel) {
        this.pid = parcel.readInt();
        this.packageName = parcel.readString();
        this.totalPss = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getPid() {
        return this.pid;
    }

    public int getTotalPss() {
        return this.totalPss;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPid(int i) {
        this.pid = i;
    }

    public void setTotalPss(int i) {
        this.totalPss = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.pid);
        parcel.writeString(this.packageName);
        parcel.writeInt(this.totalPss);
    }
}
