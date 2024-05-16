# Asset-service

### How to use

Below is example how you can call 2 API endpoints here

```shell
# add new asset
curl -H 'content-type: application/json' -d '{"symbol":"BTC","price":100}' http://localhost:8081/asset/price
# get asset price
curl -H 'content-type: application/json' http://localhost:8081/asset/price/BTC
```

### Nacos config

Make sure your nacos server is running and you pass it's IP into config variables. If you try to run
this app without nacos config then it won't start.

```
NACOS_SERVER_IP=127.0.0.1;
NACOS_SERVER_ID=31b66f4e-dbf4-4745-a359-2d9701f436e5;
```
