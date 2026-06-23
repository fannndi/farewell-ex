package flar2.devcheck.hwData;

import defpackage.om1;
import java.util.List;

/* loaded from: classes.dex */
public class DeviceInfo {

    @om1("androidSDKVersion")
    public int androidSDKVersion;

    @om1("archMali")
    public String archMali;

    @om1("batteryCapacity")
    public int batteryCapacity;

    @om1("batteryMaxVoltageMv")
    public Integer batteryMaxVoltageMv;

    @om1("bluetoothVersion")
    public String bluetoothVersion;

    @om1("brand")
    public String brand;

    @om1("busWidthMali")
    public Integer busWidthMali;

    @om1("cameraInfoList")
    public List<CameraDBInfo> cameraInfoList;

    @om1("cellCountSysfs")
    public Integer cellCountSysfs;

    @om1("chipIdAdreno")
    public String chipIdAdreno;

    @om1("clusters")
    public String clusters;

    @om1("coresMali")
    public Integer coresMali;

    @om1("cpuArch")
    public String cpuArch;

    @om1("cpuInfoList")
    public List<CPUDBInfo> cpuInfoList;

    @om1("density")
    public Integer density;

    @om1("devcheckVersion")
    public int devcheckVersion;

    @om1("device")
    public String device;

    @om1("deviceName")
    public String deviceName;

    @om1("diskSizeEst")
    public Double diskSizeEst;

    @om1("diskSizeReal")
    public Long diskSizeReal;

    @om1("dualCell")
    public Boolean dualCell;

    @om1("dualSim")
    public Boolean dualSim;

    @om1("esim")
    public Boolean esim;

    @om1("expandableStorage")
    public Boolean expandableStorage;

    @om1("faceUnlock")
    public Boolean faceUnlock;

    @om1("fingerprint")
    public Boolean fingerprint;

    @om1("freqs")
    public String freqs;

    @om1("gmemSizeAdreno")
    public Integer gmemSizeAdreno;

    @om1("gpuMaxFreq")
    public String gpuMaxFreq;

    @om1("gpuModel")
    public String gpuModel;

    @om1("gpuVendor")
    public String gpuVendor;

    @om1("hardware")
    public String hardware;

    @om1("hardwareString")
    public String hardwareString;

    @om1("hasPerCellFiles")
    public Boolean hasPerCellFiles;

    @om1("hdrSupport")
    public String hdrSupport;

    @om1("hwVendor")
    public String hwVendor;

    @om1("irBlaster")
    public Boolean irBlaster;

    @om1("irisScanner")
    public Boolean irisScanner;

    @om1("isRooted")
    public Boolean isRooted;

    @om1("l2cacheMali")
    public Integer l2cacheMali;

    @om1("manufacturer")
    public String manufacturer;

    @om1("model")
    public String model;

    @om1("nfc")
    public Boolean nfc;

    @om1("process")
    public String process;

    @om1("product")
    public String product;

    @om1("propMarketName")
    public String propMarketName;

    @om1("propMarketNameProp")
    public String propMarketNameProp;

    @om1("propPartName")
    public String propPartName;

    @om1("propSoc")
    public String propSoc;

    @om1("propSocMan")
    public String propSocMan;

    @om1("ramSizeEst")
    public Double ramSizeEst;

    @om1("ramSizeReal")
    public Long ramSizeReal;

    @om1("refreshRates")
    public String refreshRates;

    @om1("screenHeight")
    public Integer screenHeight;

    @om1("screenSizeInch")
    public Double screenSizeInch;

    @om1("screenWidth")
    public Integer screenWidth;

    @om1("securityPatchLevel")
    public String securityPatchLevel;

    @om1("sensors")
    public List<String> sensors;

    @om1("soc")
    public String soc;

    public static class CPUDBInfo {

        @om1("cluster")
        public String cluster;

        @om1("freqMax")
        public long freqMax;

        @om1("freqMin")
        public long freqMin;

        @om1("id")
        public int id;

        @om1("midr")
        public int midr;

        @om1("type")
        public String type;

        @om1("vendor")
        public String vendor;
    }

    public static class CameraDBInfo {

        @om1("aperture")
        public String aperture;

        @om1("equivFocalLength")
        public String equivFocalLength;

        @om1("id")
        public String id;

        @om1("lensType")
        public String lensType;

        @om1("megapixelsEffective")
        public String megapixelsEffective;

        @om1("megapixelsEst")
        public String megapixelsEst;

        @om1("name")
        public String name;

        @om1("ois")
        public boolean ois;

        @om1("opticalZoom")
        public boolean opticalZoom;

        @om1("pixelSize")
        public String pixelSize;

        @om1("resolution")
        public String resolution;

        @om1("sensorName")
        public String sensorName;

        @om1("sensorSize")
        public String sensorSize;
    }
}
