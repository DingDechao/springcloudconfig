1. Start application demo-springcloudconfig
2. add file https://github.com/DingDechao/springcloudconfig-repo/blob/main/demo-springcloud/application.properties
3. Access API : http://localhost:8888/demo-springcloud/default
```
{
  "name": "demo-springcloud",
  "profiles": [
    "default"
  ],
  "label": null,
  "version": "c6d354e7ba68a81c6e170e5fe543cf5224c3df1e",
  "state": null,
  "propertySources": [
    {
      "name": "https://github.com/DingDechao/springcloudconfig-repo/demo-springcloud/application.properties",
      "source": {
        "server.port": "8081",
        "example.property": "\"This is springcloudclient1 demo\""
      }
    }
  ]
}
```

