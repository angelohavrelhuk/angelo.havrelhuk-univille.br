package com.bovespa;

import java.io.IOException;

import org.junit.Test;

public class StockManagerTest {
@Test

public void loadStocksTest() throws IOException{
	StockManager stockManager = new StockManager();
	stockManager.loadStocks("C:\\Users\\TEMP\\Desktop\\estd\\COTAHIST_A2016_TEST.txt");
}

}
