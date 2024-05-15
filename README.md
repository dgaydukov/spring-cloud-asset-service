# Asset-service

### How to use
Below is example how you can call 2 API endpoints here
```shell
# add new asset
curl -H 'content-type: application/json' -d '{"symbol":"BTC","price":100}' http://localhost:8081/asset/price
# get asset price
curl -H 'content-type: application/json' http://localhost:8081/asset/price/BTC
```

