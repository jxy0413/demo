package com.example.demo.Test;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.example.demo.descriptor.Namespace;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.List;
import java.util.logging.Logger;

/**
 * @Auther jxy
 * @Date 2020-04-12
 */
public class JDBCTest {
    @Test
    public void test() throws Exception{
        String res = "{\n" +
                "    \"code\": \"200\",\n" +
                "    \"msg\": \"success\",\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"cluster\": \"hadoop-video\",\n" +
                "            \"namespace\": \"DlinkName\",\n" +
                "            \"namespaceQuota\": {\n" +
                "                \"maxTables\": 10,\n" +
                "                \"maxRegions\": 10,\n" +
                "                \"bypassGlobals\": false,\n" +
                "                \"quotaLimits\": []\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"cluster\": \"hadoop-video\",\n" +
                "            \"namespace\": \"DlinkName001\",\n" +
                "            \"namespaceQuota\": {\n" +
                "                \"maxTables\": 10,\n" +
                "                \"maxRegions\": 10,\n" +
                "                \"bypassGlobals\": false,\n" +
                "                \"quotaLimits\": [\n" +
                "                    {\n" +
                "                        \"type\": \"SPACE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": null,\n" +
                "                        \"policy\": \"NO_INSERTS\",\n" +
                "                        \"limit\": \"5497558138880 bytes\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"cluster\": \"hadoop-video\",\n" +
                "            \"namespace\": \"DlinkName002\",\n" +
                "            \"namespaceQuota\": {\n" +
                "                \"maxTables\": 10,\n" +
                "                \"maxRegions\": 10,\n" +
                "                \"bypassGlobals\": false,\n" +
                "                \"quotaLimits\": [\n" +
                "                    {\n" +
                "                        \"type\": \"SPACE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": null,\n" +
                "                        \"policy\": \"NO_INSERTS\",\n" +
                "                        \"limit\": \"5497558138880 bytes\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"cluster\": \"hadoop-video\",\n" +
                "            \"namespace\": \"DlinkName003\",\n" +
                "            \"namespaceQuota\": {\n" +
                "                \"maxTables\": 10,\n" +
                "                \"maxRegions\": 10,\n" +
                "                \"bypassGlobals\": false,\n" +
                "                \"quotaLimits\": [\n" +
                "                    {\n" +
                "                        \"type\": \"SPACE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": null,\n" +
                "                        \"policy\": \"NO_INSERTS\",\n" +
                "                        \"limit\": \"5497558138880 bytes\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"cluster\": \"hadoop-video\",\n" +
                "            \"namespace\": \"DlinkName100\",\n" +
                "            \"namespaceQuota\": {\n" +
                "                \"maxTables\": 10,\n" +
                "                \"maxRegions\": 10,\n" +
                "                \"bypassGlobals\": false,\n" +
                "                \"quotaLimits\": [\n" +
                "                    {\n" +
                "                        \"type\": \"SPACE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": null,\n" +
                "                        \"policy\": \"NO_INSERTS\",\n" +
                "                        \"limit\": \"5497558138880 bytes\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"cluster\": \"hadoop-video\",\n" +
                "            \"namespace\": \"DlinkName200\",\n" +
                "            \"namespaceQuota\": {\n" +
                "                \"maxTables\": 10,\n" +
                "                \"maxRegions\": 10,\n" +
                "                \"bypassGlobals\": false,\n" +
                "                \"quotaLimits\": [\n" +
                "                    {\n" +
                "                        \"type\": \"SPACE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": null,\n" +
                "                        \"policy\": \"NO_INSERTS\",\n" +
                "                        \"limit\": \"5497558138880 bytes\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"cluster\": \"hadoop-video\",\n" +
                "            \"namespace\": \"DlinkName300\",\n" +
                "            \"namespaceQuota\": {\n" +
                "                \"maxTables\": 10,\n" +
                "                \"maxRegions\": 10,\n" +
                "                \"bypassGlobals\": false,\n" +
                "                \"quotaLimits\": [\n" +
                "                    {\n" +
                "                        \"type\": \"SPACE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": null,\n" +
                "                        \"policy\": \"NO_INSERTS\",\n" +
                "                        \"limit\": \"5497558138880 bytes\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"cluster\": \"hadoop-video\",\n" +
                "            \"namespace\": \"DlinkName500\",\n" +
                "            \"namespaceQuota\": {\n" +
                "                \"maxTables\": 10,\n" +
                "                \"maxRegions\": 10,\n" +
                "                \"bypassGlobals\": false,\n" +
                "                \"quotaLimits\": [\n" +
                "                    {\n" +
                "                        \"type\": \"SPACE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": null,\n" +
                "                        \"policy\": \"NO_INSERTS\",\n" +
                "                        \"limit\": \"5497558138880 bytes\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"THROTTLE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": \"READ_NUMBER\",\n" +
                "                        \"policy\": null,\n" +
                "                        \"limit\": \"100000 req/SECONDS\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"THROTTLE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": \"WRITE_NUMBER\",\n" +
                "                        \"policy\": null,\n" +
                "                        \"limit\": \"100000 req/SECONDS\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"cluster\": \"hadoop-video\",\n" +
                "            \"namespace\": \"DlinkName600\",\n" +
                "            \"namespaceQuota\": {\n" +
                "                \"maxTables\": 10,\n" +
                "                \"maxRegions\": 10,\n" +
                "                \"bypassGlobals\": false,\n" +
                "                \"quotaLimits\": [\n" +
                "                    {\n" +
                "                        \"type\": \"SPACE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": null,\n" +
                "                        \"policy\": \"NO_INSERTS\",\n" +
                "                        \"limit\": \"5497558138880 bytes\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"THROTTLE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": \"READ_NUMBER\",\n" +
                "                        \"policy\": null,\n" +
                "                        \"limit\": \"100000 req/SECONDS\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"THROTTLE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": \"WRITE_NUMBER\",\n" +
                "                        \"policy\": null,\n" +
                "                        \"limit\": \"100000 req/SECONDS\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"THROTTLE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": \"REQUEST_NUMBER\",\n" +
                "                        \"policy\": null,\n" +
                "                        \"limit\": \"10 req/HOURS\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"cluster\": \"hadoop-video\",\n" +
                "            \"namespace\": \"DlinkName700\",\n" +
                "            \"namespaceQuota\": {\n" +
                "                \"maxTables\": 10,\n" +
                "                \"maxRegions\": 10,\n" +
                "                \"bypassGlobals\": false,\n" +
                "                \"quotaLimits\": [\n" +
                "                    {\n" +
                "                        \"type\": \"SPACE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": null,\n" +
                "                        \"policy\": \"NO_INSERTS\",\n" +
                "                        \"limit\": \"5497558138880 bytes\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"THROTTLE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": \"READ_NUMBER\",\n" +
                "                        \"policy\": null,\n" +
                "                        \"limit\": \"100000 req/SECONDS\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"THROTTLE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": \"WRITE_NUMBER\",\n" +
                "                        \"policy\": null,\n" +
                "                        \"limit\": \"100000 req/SECONDS\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"THROTTLE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": \"REQUEST_NUMBER\",\n" +
                "                        \"policy\": null,\n" +
                "                        \"limit\": \"10 req/HOURS\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"cluster\": \"hadoop-video\",\n" +
                "            \"namespace\": \"DlinkName800\",\n" +
                "            \"namespaceQuota\": {\n" +
                "                \"maxTables\": 10,\n" +
                "                \"maxRegions\": 10,\n" +
                "                \"bypassGlobals\": false,\n" +
                "                \"quotaLimits\": [\n" +
                "                    {\n" +
                "                        \"type\": \"SPACE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": null,\n" +
                "                        \"policy\": \"NO_INSERTS\",\n" +
                "                        \"limit\": \"5497558138880 bytes\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"THROTTLE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": \"READ_NUMBER\",\n" +
                "                        \"policy\": null,\n" +
                "                        \"limit\": \"100000 req/SECONDS\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"THROTTLE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": \"WRITE_NUMBER\",\n" +
                "                        \"policy\": null,\n" +
                "                        \"limit\": \"100000 req/SECONDS\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"type\": \"THROTTLE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": \"REQUEST_NUMBER\",\n" +
                "                        \"policy\": null,\n" +
                "                        \"limit\": \"10 req/HOURS\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"cluster\": \"hadoop-video\",\n" +
                "            \"namespace\": \"default\",\n" +
                "            \"namespaceQuota\": {\n" +
                "                \"maxTables\": 0,\n" +
                "                \"maxRegions\": 0,\n" +
                "                \"bypassGlobals\": false,\n" +
                "                \"quotaLimits\": []\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"cluster\": \"hadoop-video\",\n" +
                "            \"namespace\": \"hbase\",\n" +
                "            \"namespaceQuota\": {\n" +
                "                \"maxTables\": 0,\n" +
                "                \"maxRegions\": 0,\n" +
                "                \"bypassGlobals\": false,\n" +
                "                \"quotaLimits\": []\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"cluster\": \"hadoop-video\",\n" +
                "            \"namespace\": \"jia01\",\n" +
                "            \"namespaceQuota\": {\n" +
                "                \"maxTables\": 10,\n" +
                "                \"maxRegions\": 10,\n" +
                "                \"bypassGlobals\": false,\n" +
                "                \"quotaLimits\": [\n" +
                "                    {\n" +
                "                        \"type\": \"SPACE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": null,\n" +
                "                        \"policy\": \"NO_INSERTS\",\n" +
                "                        \"limit\": \"1099511627776 bytes\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"cluster\": \"hadoop-video\",\n" +
                "            \"namespace\": \"lijingyu\",\n" +
                "            \"namespaceQuota\": {\n" +
                "                \"maxTables\": 0,\n" +
                "                \"maxRegions\": 0,\n" +
                "                \"bypassGlobals\": false,\n" +
                "                \"quotaLimits\": []\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"cluster\": \"hadoop-video\",\n" +
                "            \"namespace\": \"lijingyu001\",\n" +
                "            \"namespaceQuota\": {\n" +
                "                \"maxTables\": 10,\n" +
                "                \"maxRegions\": 10,\n" +
                "                \"bypassGlobals\": false,\n" +
                "                \"quotaLimits\": [\n" +
                "                    {\n" +
                "                        \"type\": \"SPACE\",\n" +
                "                        \"subject\": \"NAMESPACE\",\n" +
                "                        \"throttleType\": null,\n" +
                "                        \"policy\": \"NO_INSERTS\",\n" +
                "                        \"limit\": \"1099511627776 bytes\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"cluster\": \"hadoop-video\",\n" +
                "            \"namespace\": \"lijingyu002\",\n" +
                "            \"namespaceQuota\": {\n" +
                "                \"maxTables\": 10,\n" +
                "                \"maxRegions\": 10,\n" +
                "                \"bypassGlobals\": false,\n" +
                "                \"quotaLimits\": []\n" +
                "            }\n" +
                "        }\n" +
                "    ]\n" +
                "}";
//        JSONObject jsonObject = JSONObject.parseObject(res);
//        String data = jsonObject.getString("data");
//        data.replace("[","");
//        String replace = data.replace("]", "");
//        JSONObject jsonObject1 = JSONObject.parseObject(replace);
//        Namespace namespace = JSONObject.toJavaObject(jsonObject1, Namespace.class);
//        System.out.println(namespace);
//        res.replace("[","");
//        res.replace("]", "");
        JSONObject jsonObject = JSONObject.parseObject(res);
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        List<Namespace> namespaces = JSONObject.parseArray(jsonArray.toJSONString(), Namespace.class);
        JSONObject.parseArray(jsonArray.toJSONString(), Namespace.class);
        for(Namespace n :namespaces){
            System.out.println(n);
        }
    }

}
