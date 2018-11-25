package com.whz;

import java.util.HashMap;

public class Config {
	public static final int sPort = 8000;
	public static HashMap<Integer,String> peerIpAddress;
	public static int pieceNum = 70;
	public static int FileSize = 100000232;
	public static int PieceSize = 100;
	public static int bitFieldLength = (int) Math.ceil(((double)FileSize/(double)PieceSize));
	public static int k = 1;
	public static int optimistic_unchoking_interval = 2000;
	public static int unchoking_interval = 1000;//second
	
	public static void initiatePeerConfig() {
		peerIpAddress = new HashMap<>();
		peerIpAddress.put(1001, "192.168.1.1");
	}
}