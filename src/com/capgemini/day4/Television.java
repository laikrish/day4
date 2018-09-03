package com.capgemini.day4;

public class Television {
	private static String state="on";
private static double currentChannel=100;
private static double currentVolume=20;
public Television() {		
}


public Television(String state, double currentChannel, double currentVolume) {
}	

public static String changeState()
{
	if(state=="on")
	{
		return "off";
	}
	else
		return "on";
}
public static double changeChannel()
{
	double newChannel=currentChannel+1;
	return newChannel;
}
public static double increaseVolume()
{
	double newVolume=currentVolume+1;
	return newVolume;
}
public static double decreaseVolume()
{
	double newVolume=currentVolume-1;
	return newVolume;
}
}