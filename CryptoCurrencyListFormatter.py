# A quick python script I wrote that goes through the JSON outputted by http://coincap.io/map,
#   and formats it nicely so that I could put it into the CryptoCurrencies.java enum

import json

f = open("CryptoCurrenciesList.json", "r")
data = json.load(f)

data = data["data"]

list = []

for coin in data:
    if coin.has_key("name"):
        list.append(coin["symbol"] + ",\t// " + coin["name"])
        #print(coin["symbol"] + ",\t// " + coin["name"])
    else:
        list.append(coin["symbol"] + ",")
        #print(coin["symbol"] + ",")

list.sort()

for coin in list:
    print(coin)
