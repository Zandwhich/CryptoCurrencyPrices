# CryptoCurrencyPrices #
An app that displays the various prices of cryptocurrencies from multiple sources in one place.

## Notes: ##
I am using Java, as it has a built-in UI framework, as well as it's one of the languages I know best.

## API Usages: ##
This project makes use of multiple API calls from different websites which host cryptocurrency data. These include, but may not be limited to:
* Coinbase
    * https://api.coinbase.com/v2/prices/spot?currency=USD
* QuadricaCX
    * https://api.quadrigacx.com/v2/ticker?book=btc_cad
* CoinCap
    * http://coincap.io/page/ETH
* Liqui.io
    * https://api.liqui.io/api/3/ticker/eth_btc
* CryptoCompare
    * https://min-api.cryptocompare.com/data/price?fsym=BTC&tsyms=USD,JPY,EUR
* ShapeShift
    * shapeshift.io/rate/btc_eth
* CoinMarketCap
    * https://api.coinmarketcap.com/v2/ticker/2/?convert=EUR

## References: ##
This project makes use of the JSON Simple project, which can be found [here](https://github.com/fangyidong/json-simple). I do not own this work.
