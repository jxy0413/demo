package com.example.demo.descriptor;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther jxy
 * @Date 2020-04-10
 */
@Data
public class HBaseCluster {
    private String cluster;
    private String resourcePath;

    private String keytab;
    private String principal;
    private String krb5File;
    private String password;
    private String coreSiteXml;
    private String hdfsSiteXml;
    private String hbaseSiteXml;

    private List<Namespace> namespaceList = new ArrayList<>();
}
