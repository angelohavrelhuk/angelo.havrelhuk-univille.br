package com.bovespa;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

//import javax.swing.JOptionPane;

public class StockManager {
private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
private Stream<String> lines;

public Stock[] loadStocks(String fileName) throws IOException{
	lines = Files.lines(Paths.get(fileName));
	lines.forEach(line -> {
	if (line.startsWith("01")){
    Stock stock = new Stock();
    stock.setCode(line.substring(12,24).trim());
  
    stock.setDate(LocalDate.parse(line.substring(2,10),DATE_FORMATTER));
    
    stock.setOpen_price(new BigDecimal(line.substring(56,67)+"."+line.substring(67,69)));
    stock.setClose_price(new BigDecimal(line.substring(108,119)+"."+line.substring(119,121)));
    stock.setMax_price(new BigDecimal(line.substring(69,80)+"."+line.substring(80,82)));
    stock.setMin_price(new BigDecimal(line.substring(82,93)+"."+line.substring(93,95)));
   //BigDecimal test =  new BigDecimal();
   //JOptionPane.showMessageDialog(null,stock.getOpen_price());
   //System.out.println(line.substring(6,8)+"/"+line.substring(8,10)+"/"+line.substring(2,6));
    
	System.out.println(stock.getOpen_price());
	
	}	
	
});
	

return null;
}
}
