package flar2.devcheck.benchmarkSuite.backend;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class BenchmarkSubmission {
    public Map<String, Double> categoryScores;
    public DeviceProjection device;
    public long finishedAt;
    public String hardwareHash;
    public Health health;
    public Double overallScore;
    public String runId;
    public int schemaVersion;
    public long startedAt;
    public List<Subtest> subtests;

    public static final class DeviceProjection {
        public int androidSdk;
        public long[] cpuMaxFreqKHz;
        public int devcheckVersion;
        public String device;
        public Double diskGB;
        public String manufacturer;
        public String model;
        public String product;
        public Double ramGB;
        public String socManufacturer;
        public String socModel;
    }

    public static final class Health {
        public int batteryEndPct;
        public int batteryStartPct;
        public int cooldownSec;
        public int iterations;
        public Double stabilityCv;
        public int thermalEnd;
        public int thermalStart;
        public double thermalThrottlePct;
    }

    public static final class Subtest {
        public String displayName;
        public long elapsedMs;
        public boolean higherBetter;
        public Integer[] iterationCpus;
        public Double max;
        public Double median;
        public Double min;
        public Double[] rawValues;
        public Double score;
        public String sectionId;
        public String subtestId;
        public boolean throttled;
        public String unit;
    }
}
