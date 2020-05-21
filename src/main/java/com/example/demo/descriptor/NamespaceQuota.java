package com.example.demo.descriptor;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther jxy
 * @Date 2020-04-10
 */
@Data
public class NamespaceQuota {
    public static final String HBASE_NAMESPACE_QUOTA_MAXTABLES = "hbase.namespace.quota.maxtables";
    public static final String HBASE_NAMESPACE_QUOTA_MAXREGIONS = "hbase.namespace.quota.maxregions";

    private long maxTables;
    private long maxRegions;
    private boolean bypassGlobals;
    private List<QuotaLimit> quotaLimits = new ArrayList<>();
}
