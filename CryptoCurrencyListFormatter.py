# A quick python script I wrote that goes through the JSON outputted by http://coincap.io/map,
#   and formats it nicely so that I could put it into the CryptoCurrencies.java enum

import json

f = open("CryptoCurrenciesList.json", "r")
data = json.load(f)

data = data["data"]

currencyList = []

for coin in data:
    if coin.has_key("name"):
        currencyList.append(coin["symbol"] + ",\t// " + coin["name"])
        # print(coin["symbol"] + ",\t// " + coin["name"])
    else:
        currencyList.append(coin["symbol"] + ",")
        # print(coin["symbol"] + ",")

currencyList.sort()

for coin in currencyList:
    print(coin)
