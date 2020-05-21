package com.example.demo.descriptor;

import lombok.Data;

/**
 * @Auther jxy
 * @Date 2020-04-10
 */
@Data
public class Namespace {
    private String cluster;
    private String namespace;
    private NamespaceQuota namespaceQuota = new NamespaceQuota();
}
