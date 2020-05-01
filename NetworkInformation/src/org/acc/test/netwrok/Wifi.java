package org.acc.test.netwrok;

public class Wifi {
private void wifiName() {
System.out.println("Wifi Name: Test");
}
public static void main(String[] args) {
	Wifi wifi = new Wifi();
	wifi.wifiName();
	//method call from different class in same package
	MobileData data = new MobileData();
	data.dataName();
	Lan lan = new Lan();
	lan.lanName();
	Wireless modem = new Wireless();
	modem.modemName();
}
}
